import java.util.Scanner;
class distance{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter distance in km");
float d= sc.nextFloat();
double m = d*(1.6);
System.out.println("distance in miles is:"+ m);
}
}