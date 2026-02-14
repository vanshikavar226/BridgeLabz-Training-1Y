import java.util.Scanner;
class LeapYearProgramLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
		
        if (year < 1582) {
            System.out.println("Enter year >= 1582 only.");
            return;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year (method 1)");
                } else {
                    System.out.println("Not a Leap Year (method 1)");
                }
            } else {
                System.out.println("Leap Year (method 1)");
            }
        } else {
            System.out.println("Not a Leap Year (method 1)");
        }
    }
}
