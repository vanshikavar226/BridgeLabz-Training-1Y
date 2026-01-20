import java.util.Scanner;
class totalprice{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter unit price");
int p= sc.nextInt();
System.out.println("enter quantity");
int q= sc.nextInt();
int tp=p*q;
System.out.println("The total purchase price is INR "+tp+" if the quantity "+q+" and unit price is INR "+p);
}
}