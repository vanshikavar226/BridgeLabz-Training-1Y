import java.util.Scanner;
class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // check positive and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100.");
        } 
        else {
            System.out.println("Multiples of " + number + " below 100 are:");
            // loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
