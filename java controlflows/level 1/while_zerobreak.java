import java.util.*;
class while_zerobreak{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the numbers:");	
double n1= sc.nextDouble();
double sum=0;
while(n1!=0 && n1<0){
sum = sum +n1;
n1= sc.nextDouble();
break;
}
System.out.println(" total sum is:"+ sum);
}
}	