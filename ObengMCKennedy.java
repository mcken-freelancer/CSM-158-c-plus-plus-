import java.util.Scanner;

public class ObengMCKennedy {
    public static void main(String[] Kennedy) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
           
            System.out.print("Enter exam score (-1 to stop): ");
            int examScore = scanner.nextInt();
            
            
            if (examScore == -1) {
                break;
            }

            System.out.print("Enter assessment score: ");
            int assessmentScore = scanner.nextInt();
            
            System.out.print("Enter fees paid (100 for full payment): ");
            int feesPaid = scanner.nextInt();
            
           
            int totalScore = examScore + assessmentScore;
            
          
            String grade = getGrade(totalScore);
            
           
            boolean passedExam = examScore >= 25;
            boolean passedAssessment = assessmentScore >= 15;
            boolean passedBoth = passedExam && passedAssessment;
            boolean condoned = totalScore == 39;
            boolean feesPaidInFull = feesPaid == 100;

            
            switch (getResult(passedBoth, condoned, feesPaidInFull, passedExam, passedAssessment)) {
                case 1:
                    System.out.println("Student Passed the Exam and Assessment. Certificate Issued.");
                    System.out.println("Grade: " + grade);
                    break;
                case 2:
                    System.out.println("Student is Condoned. Certificate Issued.");
                    System.out.println("Grade: " + grade);
                    break;
                case 3:
                    System.out.println("Student Failed both Exam and Assessment. Student will be Repeated.");
                    break;
                case 4:
                    System.out.println("Student Failed Exam but Passed Assessment.");
                    break;
                case 5: 
                    System.out.println("Student Passed Exam but Failed Assessment.");
                    break;
                default: 
                    System.out.println("Student Failed both Exam and Assessment. Student will be Repeated.");
                    break;
            }
        }
        
        scanner.close();
    }

   
    private static String getGrade(int totalScore) {
        if (totalScore >= 70) {
            return "A";
        } else if (totalScore >= 60) {
            return "B";
        } else if (totalScore >= 50) {
            return "C";
        } else if (totalScore >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

   
    private static int getResult(boolean passedBoth, boolean condoned, boolean feesPaidInFull, 
                                 boolean passedExam, boolean passedAssessment) {
        if (condoned && feesPaidInFull) {
            return 2;  
        }
        if (passedBoth && feesPaidInFull) {
            return 1; 
        }
        if (!passedExam && !passedAssessment) {
            return 3; 
        }
        if (!passedExam && passedAssessment) {
            return 4; 
        }
        if (passedExam && !passedAssessment) {
            return 5; 
        }
        return 0;
    }
}

    