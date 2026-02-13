import java.util.Scanner;
class fee{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the fees:");
int fee= sc.nextInt();
int discountpercentage= 10;
int discount= (fee - 10)/100;
int disfee = fee - discount;
System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR " +disfee  );
}
}