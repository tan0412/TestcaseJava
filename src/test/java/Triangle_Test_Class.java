
import org.junit.Assert;
import org.junit.Test;
public class Triangle_Test_Class {
    @Test
    public void testTriangleClass1() {
        final String expected = "Tam giác đều!";
        final String actual = Triangle.Triangle(5,5, 5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClass2() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(4,4, 3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClass3() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(3,4, 3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClass4() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(5,3, 3);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleClass5() {
        final String expected = "Tam giác vuông!";
        final String actual = Triangle.Triangle(3,4, 5);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleClass6() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(4,1, 5);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleClass7() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(4,6, 2);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangleClass8() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(1,6, 8);
        Assert.assertEquals(expected, actual);
    }
}
