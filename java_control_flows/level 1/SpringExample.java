import java.util.Scanner;
class SpringExample {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 1 to 12: ");
int MonthsNumber = input.nextInt();
switch (MonthsNumber) {
case 1:
System.out.println("january");
break;
case 2:
System.out.println("feburay");
break;
case 3:
System.out.println("march");
break;
case 4:
System.out.println("april");
break;
case 5:
System.out.println("May");
break;
case 6:
System.out.println("June");
break;
case 7:
System.out.println("July");
break;
case 8:
System.out.println("August");
break;
case 9:
System.out.println("September");
break;
case 10:
System.out.println("october");
break;
case 11:
System.out.println("November");
break;
case 12:
System.out.println("December");
break;
default:
System.out.println("Invalid Number");
}
switch(MonthsNumber) {
case 3:
case 4:
case 5:
case 6:
System.out.println("Spring Season");
break;
case 1:
case 2:
case 7:
case 8:
case 9:
case 10:
case 11:
case 12:
System.out.println("Not A Spring Season");
break;
}
}
}