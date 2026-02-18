import java.util.Scanner;
class operation1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a:");
double a= sc.nextInt();
System.out.println("enter b :");
double b= sc.nextInt();
System.out.println("enter c :");
double c= sc.nextInt();
double op1=a + b *c;
double op2=a * b + c;
double op3=c + a / b;
double op4=a % b + c;
System.out.println(op1 +" " +op2 + " "+op3 + " "+op4);
}
}
