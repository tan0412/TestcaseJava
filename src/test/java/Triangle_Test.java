
import org.junit.Assert;
import org.junit.Test;
public class Triangle_Test {
    @Test
        public void testTriangle1() {
        final String expected = "Tam giác đều!";
        final String actual = Triangle.Triangle(16384,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle2() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(16384,16384, 1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle3() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(16384,16384, -1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle4() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(16384,16384, 0);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangle5() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(16384,16384, 32768);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangle6() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(16384,16384, 32769);
        Assert.assertEquals(expected, actual);
    }@Test
    public void testTriangle7() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(16384,16384, 32767);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle8() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(16384,1, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle9() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(16384,0, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle10() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(16384,-1, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle11() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(16384,32768, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle12() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(16384,32769, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle13() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(16384,32767, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle14() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(1,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle15() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(-1,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle16() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(0,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle17() {
        final String expected = "Không phải là tam giác!";
        final String actual = Triangle.Triangle(32768,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle18() {
        final String expected = "Lỗi dữ liệu!";
        final String actual = Triangle.Triangle(32769,16384, 16384);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTriangle19() {
        final String expected = "Tam giác cân!";
        final String actual = Triangle.Triangle(32767,16384, 16384);
        Assert.assertEquals(expected, actual);
    }

}
