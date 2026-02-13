import java.util.*;
class LargestNumber{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number1");
int n1= sc.nextInt();
System.out.println("enter the number2");
int n2= sc.nextInt();
System.out.println("enter the number3");
int n3= sc.nextInt();
if(n1<n2 && n1<n3){
System.out.println("1st number is smallest");
}
else if(n2<n2 && n2<n3){
System.out.println("2nd number is smallest");
}
else{
System.out.println("3rd number is smallest");
}
}
}