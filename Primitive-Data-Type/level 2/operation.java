import java.util.Scanner;
class operation{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a:");
int a= sc.nextInt();
System.out.println("enter b :");
int b= sc.nextInt();
System.out.println("enter c :");
int c= sc.nextInt();
int op1=a + b *c;
int op2=a * b + c;
int op3=c + a / b;
int op4=a % b + c;
System.out.println(op1 +" " +op2 + " "+op3 + " "+op4);
}
}
