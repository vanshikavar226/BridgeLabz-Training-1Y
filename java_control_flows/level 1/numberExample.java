import java.util.*;
class numberExample{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n1= sc.nextInt();
if(n1>0){
System.out.println("number is positive:");
}
else if(n1==0){
System.out.println("number is zero:");
}
else{
System.out.println("number is negative:");
}
}
}