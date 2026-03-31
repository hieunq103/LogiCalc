import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LogiBranchTest {

    private int calc(double d, double t, String m) {
        return LogiCalc.calculateFee(d, t, m);
    }

    @Test
    public void LogiBranchTest1() {
        assertEquals(-1, calc(35, 10, "Gold"));
    }

    @Test
    public void LogiBranchTest2() {
        assertEquals(-1, calc(5, 10, "VIP"));
    }

    @Test
    public void LogiBranchTest3() {
        assertEquals(15000, calc(1.5, 9, "Standard"));
    }

    @Test
    public void LogiBranchTest4() {
        assertEquals(32000, calc(4.0, 12.0, "Silver"));
    }

    @Test
    public void LogiBranchTest5() {
        assertEquals(47500, calc(10.0, 18.0, "Gold"));
    }

    @Test
    public void LogiBranchTest6() {
        assertEquals(80000, calc(10.0, 22.0, "Standard"));
    }
}