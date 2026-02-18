import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        if (number <= 1) {
            System.out.println("No greatest factor beside itself for this number.");
        } 
        else {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;   // stop when first greatest factor found
                }
                counter--;
            }
            System.out.println("Greatest factor beside itself is: " + greatestFactor);
        }
    }
}
