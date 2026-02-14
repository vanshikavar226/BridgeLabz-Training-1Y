import java.util.*;
class NaturalNumber{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number:");	
int n1= sc.nextInt();
if(n1<=0){
System.out.println(" number is not a natural number:");	
}
else{
System.out.println("the number is natural number:");
int sum = n1 * (n1+1) / 2 ;
System.out.println("Sum of first " + n1 + " natural numbers is: " + sum);
}
}
}	