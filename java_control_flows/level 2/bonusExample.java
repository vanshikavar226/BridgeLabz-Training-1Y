import java.util.*;
class bonusExample{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the salary:");	
float sl= sc.nextInt();
System.out.println(" enter the service year:");	
int yr= sc.nextInt();
float bonus=0;
if(yr>5){
bonus=0.05f*sl;
float total_salary = sl+bonus;
System.out.println(" Total Salary is:"+total_salary);	
}
else{
System.out.println(" Only Salary is provided:");	
}
}
}
