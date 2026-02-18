import java.util.Scanner;
class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return;
        }
        int i = 1;
        long fact = 1;   
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
