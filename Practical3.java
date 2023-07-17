import java.util.Scanner;

class Practical3 {
    public static void main(String args[]) {
        double income_tax = 0.0, income;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your yearly gross income ");
            income = sc.nextDouble();
        }

        if (income <= 39999)
            income_tax = 0;
        else if (income < 60000)
            income_tax = 40000 * 0.03 + ((0.01 * 5000) * Math.floor((income - 40000) / 5000));
        else if (income < 90000)
            income_tax = 60000 * 0.04 + ((0.01 * 5000) * Math.floor((income - 60000) / 5000));
        else if (income < 120000)
            income_tax = 90000 * 0.03 + ((0.0125 * 5000) * Math.floor((income - 90000) / 5000));
        else
            income_tax = 120000 * 0.03 + ((0.013 * 5000) * Math.floor((income - 120000) / 5000));

        System.out.println("Total tax to pay is " + income_tax);
    }
}
