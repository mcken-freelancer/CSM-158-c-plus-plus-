import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter your age:  ");
    int age=scanner.nextInt(); //IF THE INT IS INPUT BEFORE A STRING THEN YOU SHOULD ADD "scanner.nextLine()"
    scanner.nextLine();  //As you can see here

    System.out.println("Input your name: ");
    String name=scanner.nextLine();

    //System.out.print("Enter your age:  ");  BUT IF THE INT COMES AFTER THE STRING THEN NOTHING WILL HAPPEN
   // int age=scanner.nextInt();

    System.out.println("Are you a student? (true/false)");
    boolean isStudent=scanner.nextBoolean();

    System.out.println("Hey there! "+age+" year old "+name);
    if (isStudent) {
        System.out.println("You are enrolled in KNUST");
    } else{ System.out.println("You are NOT enrolled");}
    scanner.close();
}
    
}
