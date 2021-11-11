import java.util.Scanner;

public class Triangle {
    public static String Triangle(int a, int b, int c) {
        // Điều kiện của dữ liệu
        if ((a < 0 || b < 0 || c < 0) || (a > 32768 || b > 32768 || c > 32768)) {
            return "Lỗi dữ liệu!";
        }
            // Kiểm tra điều kiện lập thành tam giác
            if ((a + b > c) && (a + c > b) && (b + c > a) &&
                    (a > 0) && (b > 0) && (c > 0)) {
                // Kiểm tra điều các tam giác đặc biệt
                if ((a == b) && (b == c)) {
                    return "Tam giác đều!";
                } else if ((a == b) || (a == c) || (b == c)) {
                    return "Tam giác cân!";
                } else if ((a * a == b * b + c * c) ||
                        (b * b == a * a + c * c) ||
                        (c * c == a * a + b * b)) {
                    return "Tam giác vuông!";
                } else {
                    return "Tam giác thường!";
                }
            } else {
                return "Không phải là tam giác!";
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        int a, b, c;

        // Nhập dữ liệu
        System.out.print("Nhập vào cạnh thứ nhất: ");
        a = sc.nextInt();
        System.out.print("Nhập vào cạnh thứ hai: ");
        b = sc.nextInt();
        System.out.print("Nhập vào cạnh thứ ba: ");
        c = sc.nextInt();
        String m = Triangle(a,b,c);
        System.out.println(m);
        sc.close();
    }
}
