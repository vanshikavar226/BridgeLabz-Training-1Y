import java.util.Scanner;
class price{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter selling price");
int sp= sc.nextInt();
System.out.println("enter cost price");
int cp= sc.nextInt();
int profit = sp-cp;
double perpro = (profit/(double)cp)*100;
System.out.println("The Cost Price is INR " + cp +" and Selling Price is INR " + sp);
System.out.println("The Profit is INR " + profit +"  and the Profit Percentage is " + perpro+"%");
}
}