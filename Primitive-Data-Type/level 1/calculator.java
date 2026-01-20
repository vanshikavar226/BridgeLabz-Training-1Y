import java.util.Scanner;
class calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter first number:");
int n1= sc.nextInt();
System.out.println("enter second number:");
int n2= sc.nextInt();
int add=n1+n2;
int sub=0;
if(n1>n2){
sub=n1-n2;
}
else{
sub=n2-n1;
}
int div=0;
if(n2==0){
System.out.print("invalid division");
}else{
div=n1/n2;
}
int mul=n1*n2;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+
" is "+add+" ,"+sub+" , "+mul+" and "+div);
} 
}