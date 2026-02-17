public class ConstructorDemo1{
int id;
String name;
int age;

public ConstructorDemo1(){
System.out.println("Default Constructor");
}
public ConstructorDemo1(int id,String name,int age){
this.name= name;
this.id=id;
this.age= age;
}
void display(){
System.out.println("Id : "+id);
System.out.println("Name : "+name);
System.out.println("Age : "+age);
}

public static void main(String[] args){
ConstructorDemo1 cd= new ConstructorDemo1();
ConstructorDemo1 cdd= new ConstructorDemo1(1,"vanshika",19);
cdd.display();
}
}