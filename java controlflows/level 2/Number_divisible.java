import java.util.*;
class Number_divisible{
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
for(int i=1;i<n1;i++){
if(n1%i==0){
System.out.println(i);
}
}
}
}		
