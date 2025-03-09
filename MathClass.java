import java.util.Scanner;

public class MathClass {
    public static void main(String[] abra) {
        System.out.println(Math.PI);
        
        double result=Math.pow(6,2);
        System.out.println(result);

        result=Math.sqrt(36);
        System.out.println(result);

        Scanner scanner=new Scanner(System.in);

        result = Math.ceil(4.99);
        System.out.println(result);

        System.out.println("Program to find the hypothenus of a right-angled triangle");

        double opposite,adjacent,hypothenus;

        System.out.print("Enter the length of the opposite side: ");
        opposite=scanner.nextDouble();
        System.out.print("Enter the length of the adjacent(base) side: ");
        adjacent=scanner.nextDouble();
       
        hypothenus=Math.sqrt(Math.pow(adjacent,2) + Math.pow(opposite,2));

        System.out.println("The length of the hypothenus is "+hypothenus+" units");

        scanner.close();

    }
}
