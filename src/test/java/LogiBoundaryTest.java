import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LogiBoundaryTest {

    private int getFee(double d, double t, String m) {
        return LogiCalc.calculateFee(d, t, m);
    }

    @Test
    public void LogiBoundaryTest1() {
        assertEquals(-1, getFee(0.0, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest2() {
        assertEquals(15000, getFee(0.1, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest3() {
        assertEquals(15000, getFee(0.2, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest4() {
        assertEquals(104000, getFee(15.0, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest5() {
        assertEquals(223200, getFee(29.9, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest6() {
        assertEquals(224000, getFee(30.0, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest7() {
        assertEquals(-1, getFee(30.1, 10.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest8() {
        assertEquals(-1, getFee(15.0, -0.1, "Silver"));
    }

    @Test
    public void LogiBoundaryTest9() {
        assertEquals(104000, getFee(15.0, 0.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest10() {
        assertEquals(104000, getFee(15.0, 0.1, "Silver"));
    }

    @Test
    public void LogiBoundaryTest11() {
        assertEquals(104000, getFee(15.0, 23.8, "Silver"));
    }

    @Test
    public void LogiBoundaryTest12() {
        assertEquals(104000, getFee(15.0, 23.9, "Silver"));
    }

    @Test
    public void LogiBoundaryTest13() {
        assertEquals(-1, getFee(15.0, 24.0, "Silver"));
    }

    @Test
    public void LogiBoundaryTest14() {
        assertEquals(-1, getFee(15.0, 10.0, ""));
    }

    @Test
    public void LogiBoundaryTest15() {
        assertEquals(130000, getFee(15.0, 10.0, "Standard"));
    }

    @Test
    public void LogiBoundaryTest16() {
        assertEquals(65000, getFee(15.0, 10.0, "Gold"));
    }

    @Test
    public void LogiBoundaryTest17() {
        assertEquals(-1, getFee(15.0, 10.0, "Diamond"));
    }
}