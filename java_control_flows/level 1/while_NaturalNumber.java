import java.util.*;
class while_NaturalNumber{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number:");	
int n1= sc.nextInt();
for(int i=0;i>=n1;i++){
System.out.println(" number is a natural number:");	
}
// else{
//System.out.println("the number is natural number:");
int sum = n1 * (n1+1) / 2 ;
System.out.println("Sum of first " + n1 + " natural numbers is: " + sum);
//}
}
}	