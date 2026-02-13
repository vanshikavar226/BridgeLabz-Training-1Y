import java.util.Scanner;
class handshake{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number of students");
int n= sc.nextInt();
int h=(n * (n - 1)) / 2;
System.out.println("number of handshakes is: "+h);
}
}