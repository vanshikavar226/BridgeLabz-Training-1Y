import java.util.Scanner;
class GradeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        if (physics < 0 || physics > 100 ||
            chemistry < 0 || chemistry > 100 ||
            maths < 0 || maths > 100) {
            System.out.println("Marks should be between 0 and 100.");
            return;
        }

        double total = physics + chemistry + maths;
        double average = total / 3;
        double percentage = (total / 300) * 100;

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
