import java.util.Scanner;
class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;   // default value
        if (number <= 1) {
            System.out.println("No greatest factor beside itself for this number.");
        } 
        else {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   // stop when first (largest) factor is found
                }
            }
            System.out.println("Greatest factor beside itself is: " + greatestFactor);
        }
    }
}
