import java.util.Scanner;

public class MathClass {
    public static void main(String[] abra) {
        System.out.println(Math.PI);

        double result = Math.pow(6, 2);
        System.out.println(result);

        result = Math.sqrt(36);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        result = Math.ceil(4.99);
        System.out.println(result);

        System.out.println("Program to find the hypothenus of a right-angled triangle");

        double opposite, adjacent, hypothenus;

        System.out.print("Enter the length of the opposite side: ");
        opposite = scanner.nextDouble();
        System.out.print("Enter the length of the adjacent(base) side: ");
        adjacent = scanner.nextDouble();

        hypothenus = Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2));

        System.out.printf("The length of the hypothenus is %.1funits\n", hypothenus);
        System.out.println("Press Enter");
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("This program allows me to find the circumference, area, and volume of the circle");
        System.out.print("Input the radius of the circle(cm): ");
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The circumference of the circle is: %.1fcm\n", circumference);
        System.out.printf("The area of the circle is: %.2fcm^2\n", area);
        System.out.printf("The volume of the circle is: %.3fcm^3\n", volume);

        scanner.close();

    }
}
