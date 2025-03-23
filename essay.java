import java.util.Scanner;

public class essay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your country: ");
        String country = scanner.nextLine();

        System.out.print("Enter your continent: ");
        String continent = scanner.nextLine();

        System.out.print("Enter the number of persons in your family: ");
        int famNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your religion: ");
        String religion = scanner.nextLine();

        System.out.print("Enter your emotion(adverb): ");
        String emotion = scanner.nextLine();

        System.out.print("Enter your gender(man/woman): ");
        String sex = scanner.nextLine();

        System.out.println();
        System.out.println("My name is " + name + ". I am " + age + " years old.");
        System.out.println("I am from " + country + " which is in " + continent + ".");
        System.out.println("We are a family of " + famNum + ". We are all " + religion + ".");
        System.out.println("I am a very " + emotion + " married " + sex + ".");
        scanner.close();
    }
}
