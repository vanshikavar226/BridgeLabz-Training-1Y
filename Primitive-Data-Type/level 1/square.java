import java.util.Scanner;
class square{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the side of square:");
int s= sc.nextInt();
int per=4*s;
System.out.println("The length of the side is "+s+" whose perimeter is "+per);
}
}