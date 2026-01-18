import java.util.Scanner;
class marks{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter maths marks");
int m1= sc.nextInt();
System.out.println("enter chemistry marks");
int m2= sc.nextInt();
System.out.println("enter physics marks");
int m3= sc.nextInt();
double avg= (m1+m2+m3)/3.0;
System.out.println(avg);
}
}