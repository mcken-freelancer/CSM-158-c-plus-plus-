import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

         //determine the area of a rectangle
         System.out.print("Enter the length of the rectangle: ");
         double length=scanner.nextDouble();
         System.out.print("Enter the width of the rectangle: ");
         double width=scanner.nextDouble();

         double area=length*width;
         System.out.print("The area of the rectangle is: "+ area+" square units");

        scanner.close();
    }
}
