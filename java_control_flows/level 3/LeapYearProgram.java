import java.util.Scanner;
class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Enter year >= 1582 only.");
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year (method 2)");
        } else {
            System.out.println("Not a Leap Year (method 2)");
        }
    }
}
