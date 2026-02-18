import java.util.Scanner;
class distance2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter distance in feet");
double feet= sc.nextDouble();
double yards=feet/3;
double miles=feet/5280;
System.out.print("Distance in yards is "+yards+" and in miles is "+miles);
}
}


