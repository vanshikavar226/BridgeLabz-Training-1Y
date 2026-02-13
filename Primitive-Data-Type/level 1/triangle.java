import java.util.Scanner;
class triangle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the height in cms:");
double h= sc.nextDouble();
System.out.println("enter the base in cms:");
double b= sc.nextDouble();
double area=0.5*h*b;
double inche= area/ 6.4516 ;
double feet=inche/144;
System.out.println("Your Height in cm is "+h+" while in feet is "+feet+" and inches is "+inche);
}
}