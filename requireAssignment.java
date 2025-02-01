import java.util.Scanner;

public class requireAssignment {
    public static void main(String[] abra) {
        Scanner scanner = new Scanner(System.in);
 
        double assessment,examScore,fees;
        
        System.out.print("Enter your examScore: ");
        examScore=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your assessment: ");
        assessment=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the percentage of fees paid(full payment=100%): ");
        fees=scanner.nextDouble();
        System.out.println("Total grade: "+ (examScore+assessment));
        System.out.println();                       

        if (examScore>=25 && assessment>=15) {
            if (fees==100) {
                System.out.println("Congrats! You have passed and will be awarded a certificate.");
            }
            else{
                System.out.println("You have passed but will not be awarded a cerificate. Pay fees in full! Stingy child!!!");
            }
        }

        if (examScore>=25 && assessment<15) {
            if (fees==100) {
                System.out.println("Sorry! You have failed the assessment. No certificate for you.");
                }
                else{
                    System.out.println("You have failed the assessment and also not made full payment. No so you why??...Tell us!");
             }
        }

        if (examScore<25 && assessment>=15) {
            if (fees==100) {
                System.out.println("You have failed the exam. How do you think you have a relation with certificate?");
                }
                else{
                    System.out.println("Exam failed. Fees too no complete. Ah!!");
            }
        }

        if (examScore<25 && assessment<15) {
            System.out.println("You have failed both and will be repeated!");
            }

        scanner.close();
 }
}                                                                  