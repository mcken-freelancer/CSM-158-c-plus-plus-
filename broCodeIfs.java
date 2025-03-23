import java.util.Scanner;

public class broCodeIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        for (int i = 0; i > -1; i++) {
            if (name.isEmpty()) {
                System.out.println("This field is compulsury");
                System.out.println("Enter your name: ");
                name = scanner.nextLine();
            } else {
                System.out.println("Hello " + name);
                break;
            }
        }

        scanner.close();
    }
}
