import java.math.BigDecimal;

public class Practical4Q1 {
    public static void main(String[] args) {
        BigDecimal total = new BigDecimal("0.4");

        for (int n = 0; n < 100; n++) {
            total = total.add(new BigDecimal("0.4"));
        }

        System.out.println("total = " + total);
    }
}
