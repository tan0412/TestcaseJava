
import org.junit.Assert;
import org.junit.Test;
public class Triangle_Test_Table {
    @Test
    public void testTriangleTable1() {
        final String expected = "Tam giác thường!";
        final String actual = Triangle.Triangle(2,3, 4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleTable2() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(4,3, 3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleTable3() {
        final String expected = "Tam giác đều!";
        final String actual = Triangle.Triangle(3,3, 3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleTable4() {
        final String expected = "Tam giác vuông!";
        final String actual = Triangle.Triangle(3,4, 5);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleTable5() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(1,2, 4);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleTable6() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(-1,4, 5);
        Assert.assertEquals(expected, actual);
    }
}
