class students{
// instance variable
string name;
int id;

// method to display
void display(){
	System.out.println("your name: "+ name);
	Ststem.out.println("your id: "+id);
}
}
public class students{
	public static void main(String args){
		// object creation
		student s1=new Student();
		s1.name="Vanshika";
		s1.id= 68;
		// method calling
		s1.display();
	}
}