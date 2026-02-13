import java.util.*;
class while_fizzbuzz{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number:");	
int n1= sc.nextInt();
if(n1<=0){
System.out.println("the number is positive:");
}
int i=1;
while(i<=n1){
if(i%3==0 && i%5==0){
System.out.println(" FizzBuzz:");
}
else if (i%3==0){
System.out.println(" Fizz:");
}
else if (i%5==0){
System.out.println(" Buzz:");	
}		
else{
System.out.println(i);
}
i++;
}
}
}	