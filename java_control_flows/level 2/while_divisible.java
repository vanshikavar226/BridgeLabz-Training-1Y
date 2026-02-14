import java.util.*;
class while_divisible{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number:");	
int n1= sc.nextInt();
if(n1<=0){
System.out.println("the number is positive:");
}
else{
System.out.println("Factors are");
}
int i =1;
while(i<n1){
if(n1%i==0){
System.out.println(i);
}
i++;
}
}
}		
