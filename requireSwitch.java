import java.util.Scanner;

public class RequireSwitch {
    public static void main(String[] ObengMCKennedy) {
        Scanner scanner=new Scanner(System.in); 
      
        while (true) {
            System.out.print("Enter your name(-1 to stop): ");
            String name=scanner.nextLine();

            if (name.equals("-1")) {
                break;
            }else{
                System.out.print("Enter your exam score(<=70): ");
                int examScore=scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter you assessment score(<=30): ");
                int assessmentScore=scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter your fees paid(in % i.e. full=100): ");
                int feesPaid=scanner.nextInt();
                scanner.nextLine();
                if (examScore>70||assessmentScore>30||feesPaid>100) {
                    System.out.println("Invalid input");
                    break;
                }

                int totalScore= examScore + assessmentScore;
                String grade= getGrade(totalScore);

               // if ((examScore==25&&assessmentScore==14)||(examScore==24&&assessmentScore==15)&& feesPaid==100) {
               //      condoned=true;
                //}
                boolean condoned=(examScore==25&&assessmentScore==14)||(examScore==24&&assessmentScore==15)&& feesPaid==100;
                boolean passedExam=examScore>=25;
                boolean passedAssessment=assessmentScore>=15;
                boolean passedBoth=passedExam&&passedAssessment;
                boolean fullpayment=feesPaid==100;

                System.out.println("Name: "+name+"\nTotal Score: "+totalScore+"\nGrade: "+grade);
                switch (getResult(condoned,passedExam,passedAssessment,passedBoth,fullpayment)) {
                    case 0:
                        System.out.println("You have been condoned.");
                        break;
                    case 1:
                        System.out.println("You have passed. Certificate issued.");
                        break;
                    case 2:
                    System.out.println("Assessment passed but Exam failed.");
                        break;
                    case 3:
                    System.out.println("Exam passed but Assessment failed.");
                        break;
                    
                    default:
                    System.out.println("You will be repeated.");
                        break;
                }

            }
            
        }

        scanner.close();
    }

    private static String getGrade(int totalScore){
String grade;
if (totalScore>=70) {
    return grade="A";
}else if (totalScore>=60) {
    return grade="B";
}else if (totalScore>=50) {
    return grade="C";
}else if (totalScore>=40) {
    return grade="D";
}else{
    return grade="F";
}
    }

    private static int getResult(boolean condoned,boolean passedExam, boolean passedAssessment, boolean passedBoth, boolean fullpayment){
if (condoned) {
    return 0;
}else if (passedBoth&&fullpayment) {
    return 1;
}else if (!passedExam&&passedAssessment) {
    return 2;
}else if (passedExam&&!passedAssessment) {
    return 3;
}
return 0;
    }
}
