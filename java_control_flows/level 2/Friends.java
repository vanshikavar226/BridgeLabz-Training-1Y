import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Age of Amar: ");
        int a1 = sc.nextInt();
		
        System.out.print("Age of Akbar: ");
        int a2 = sc.nextInt();
		
        System.out.print("Age of Anthony: ");
        int a3 = sc.nextInt();

        System.out.print("Height of Amar: ");
        int h1 = sc.nextInt();

        System.out.print("Height of Akbar: ");
        int h2 = sc.nextInt();

        System.out.print("Height of Anthony: ");
        int h3 = sc.nextInt();

        if (a1 < a2 && a1 < a3)
            System.out.println("Youngest: Amar");
        else if (a2 < a1 && a2 < a3)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (h1 > h2 && h1 > h3)
            System.out.println("Tallest: Amar");
        else if (h2 > h1 && h2 > h3)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}