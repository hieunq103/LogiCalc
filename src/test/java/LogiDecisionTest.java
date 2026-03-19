import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LogiDecisionTest {

    private int calc(double d, double t, String m) {
        return LogiCalc.calculateFee(d, t, m);
    }

    @Test
    public void LogiDecisionTest1() {
        assertEquals(-1, calc(35, 10, "Gold"));
    }

    @Test
    public void LogiDecisionTest2() {
        assertEquals(30000, calc(1.0, 12.0, "Gold"));
    }

    @Test
    public void LogiDecisionTest3() {
        assertEquals(15000, calc(1.0, 9.0, "Silver"));
    }

    @Test
    public void LogiDecisionTest4() {
        assertEquals(12500, calc(4.0, 9.0, "Gold"));
    }

    @Test
    public void LogiDecisionTest5() {
        assertEquals(20000, calc(4.0, 9.0, "Silver"));
    }

    @Test
    public void LogiDecisionTest6() {
        assertEquals(25000, calc(4.0, 9.0, "Standard"));
    }

    @Test
    public void LogiDecisionTest7() {
        assertEquals(20000, calc(4.0, 12.0, "Gold"));
    }

    @Test
    public void LogiDecisionTest8() {
        assertEquals(32000, calc(4.0, 12.0, "Silver"));
    }

    @Test
    public void LogiDecisionTest9() {
        assertEquals(40000, calc(4.0, 12.0, "Standard"));
    }

    @Test
    public void LogiDecisionTest10() {
        assertEquals(40000, calc(10.0, 9.0, "Gold"));
    }

    @Test
    public void LogiDecisionTest11() {
        assertEquals(64000, calc(10.0, 9.0, "Silver"));
    }

    @Test
    public void LogiDecisionTest12() {
        assertEquals(80000, calc(10.0, 9.0, "Standard"));
    }

    @Test
    public void LogiDecisionTest13() {
        assertEquals(47500, calc(10.0, 18.0, "Gold"));
    }

    @Test
    public void LogiDecisionTest14() {
        assertEquals(76000, calc(10.0, 18.0, "Silver"));
    }

    @Test
    public void LogiDecisionTest15() {
        assertEquals(95000, calc(10.0, 18.0, "Standard"));
    }
}