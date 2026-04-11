import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class javaAllUsesTest {

    private int getFee(double d, double t, String m) {
        return LogiCalc.calculateFee(d, t, m);
    }

    @Test
    public void javaAllUsesTest1() {
        assertEquals(-1, getFee(-1.0, 10.0, "Gold"));
    }

    @Test
    public void javaAllUsesTest2() {
        assertEquals(15000, getFee(1.0, 10.0, "Gold"));
    }

    @Test
    public void javaAllUsesTest3() {
        assertEquals(15000, getFee(1.0, 10.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest4() {
        assertEquals(20000, getFee(3.0, 10.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest5() {
        assertEquals(40000, getFee(6.0, 10.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest6() {
        assertEquals(-1, getFee(5.0, 25.0, "Gold"));
    }

    @Test
    public void javaAllUsesTest7() {
        assertEquals(30000, getFee(1.0, 12.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest8() {
        assertEquals(15000, getFee(1.0, 15.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest9() {
        assertEquals(-1, getFee(5.0, 10.0, "Bronze"));
    }

    @Test
    public void javaAllUsesTest10() {
        assertEquals(16000, getFee(3.0, 10.0, "Silver"));
    }

    @Test
    public void javaAllUsesTest11() {
        assertEquals(10000, getFee(3.0, 10.0, "Gold"));
    }

    @Test
    public void javaAllUsesTest12() {
        assertEquals(20000, getFee(3.0, 15.0, "Standard"));
    }

    @Test
    public void javaAllUsesTest13() {
        assertEquals(40000, getFee(6.0, 15.0, "Standard"));
    }
}