public class LogiCalc {
    public static int calculateFee(double d, double t, String m) {
        if (d <= 0 || d > 30 || t < 0 || t >= 24) {
            return -1; 
        }
        
        if (m == null || (!m.equals("Standard") && !m.equals("Silver") && !m.equals("Gold"))) {
            return -1;
        }

        double baseFee = 0;

        if (d <= 2) {
            baseFee = 15000;
        } else if (d <= 5) {
            baseFee = 15000 + (d - 2) * 5000;
        } else {
            baseFee = 30000 + (d - 5) * 10000;
        }

        int surcharge = 0;
        if ((t >= 11 && t <= 13) || (t >= 17 && t <= 20)) {
            surcharge = 15000;
        }

        double totalBeforeDiscount = baseFee + surcharge;
        double finalFee = totalBeforeDiscount;

        if (d > 2) {
            if (m.equals("Silver")) {
                finalFee = totalBeforeDiscount * 0.8;
            } else if (m.equals("Gold")) {
                finalFee = totalBeforeDiscount * 0.5;
            }
        }

        return (int) Math.round(finalFee);
    }
}