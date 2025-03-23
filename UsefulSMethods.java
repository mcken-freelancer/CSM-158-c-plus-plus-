import java.util.Scanner;

public class UsefulSMethods {
    public static void main(String[] abra) {
        Scanner scanner = new Scanner(System.in);

        String name = "McKennedy Obeng";

        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("K"));
        System.out.println(name.lastIndexOf("n"));

        System.out.println(name.isEmpty());

        String password = "1234";
        /*
         * for (int i = 0; i < password.length(); i++) {
         * System.out.print("Enter your password: ");
         * String UserPassword=scanner.nextLine();
         * 
         * //TO IGNORE CASE SENSITIVITY use UserPassword.equalsIgnoreCase(password)
         * 
         * switch (UserPassword.equals(password)) {
         * case true:
         * System.out.println("Access granted");
         * break;
         * 
         * default:
         * System.out.println("Access denied. Incorrect password");
         * System.out.println("Try again");
         * break;
         * }
         * }
         */

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        switch (email.contains("@")) {
            case true:
                String username = email.substring(0, email.indexOf("@"));
                System.out.println("Username: " + username);

                String domain = email.substring(email.indexOf("@") + 1);
                System.out.print("Domain: " + domain);

                break;

            default:
                System.out.println("Please input a correct email in the format: username@gmail.com");
                break;
        }

        scanner.close();
    }
}
