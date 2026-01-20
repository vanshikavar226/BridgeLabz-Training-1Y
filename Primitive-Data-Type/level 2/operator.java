import java.util.Scanner;
class operator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter first number:");
int n1= sc.nextInt();
System.out.println("enter second number:");
int n2= sc.nextInt();
int qu = n1/n2;
int rem = n1%n2;
System.out.println("The Quotient is "+qu +" and Reminder is "+ rem+ " of two number" + n1 + " and "+ n2 );
}
}
