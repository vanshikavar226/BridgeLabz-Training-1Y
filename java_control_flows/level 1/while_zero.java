import java.util.*;
class while_zero{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the numbers:");	
double n1= sc.nextDouble();
double sum=0;
while(n1!=0){
sum = sum +n1;
n1= sc.nextDouble();
}
System.out.println(" total sum is:"+ sum);
}
}	