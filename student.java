class Student {
String name;
int id;
int age;
void display(){
System.out.println("your id is: "+ id);
System.out.println("your name is: "+ name);
System.out.println("your age is: "+ age);
}
public static void main(String args[]){
Student s1= new Student();
s1.id = 1061;
s1.name = "vanshika";
s1.age = 19;
s1.display();
}
}
