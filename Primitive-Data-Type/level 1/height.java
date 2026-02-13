import java.util.Scanner;
class height{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the height in cms:");
double h1= sc.nextDouble();
double inches = h1 / 2.54;
int feet=(int)(inches/12);
double inche= inches% 12 ;
System.out.println("Your Height in cm is "+h1+" while in feet is "+feet+" and inches is "+inche);
}
}