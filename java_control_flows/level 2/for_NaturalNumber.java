import java.util.*;
class for_NaturalNumber{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number:");	
int n1= sc.nextInt();
if(n1<=0){
	System.out.println(" enter the number:");	
}
else{
for(int i=1;i<=n1;i++){
if(i%2==0){
System.out.println(" Even Numbers is:"+ i);
}
else{
System.out.println(" Odd Numbers is:"+ i);
}
}
}
}
}