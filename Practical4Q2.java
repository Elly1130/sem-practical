import java.util.Scanner;

public class Practical4Q2 {
    public static void main(String[] args) {
        StringBuilder combineText = new StringBuilder();
        boolean flag = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (flag) {
                System.out.print("Enter the word to combine: ");
                String st = sc.nextLine();
                combineText.append(st);

                if (st.equalsIgnoreCase("stop"))
                    flag = false;
            }
        }

        System.out.println("The combined text is: " + combineText.toString());
    }
}
