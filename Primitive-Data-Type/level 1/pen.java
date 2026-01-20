import java.util.Scanner;
class pen{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number of pens");
int p= sc.nextInt();
System.out.println("enter number of students");
int s= sc.nextInt();
int pps=p/s;
int rem=p%s;
System.out.println("The Pen Per Student is "+pps+" and the remaining pen not distributed is "+rem );
}
}