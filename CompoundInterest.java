import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] mcken) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "This program calculates the total amount accumulated on a principal amount over a period of time");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        int timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The total amount accumalated in " + years + " years is $ %.3f", amount);

        scanner.close();
    }
}
