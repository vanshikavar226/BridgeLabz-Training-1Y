public class Vehicle{
int enginenumber;
String modelname;

public Vehicle(){
System.out.println("Default Vehicle");
}
public Vehicle(int enginenumber,String modelname){
this.enginenumber= enginenumber;
this.modelname= modelname;
}
void display(){
System.out.println("ENGINE_NUMBER : "+enginenumber);
System.out.println(" MODEL_Name : "+modelname);
}

public static void main(String[] args){
Vehicle cd= new Vehicle();
Vehicle cdd= new Vehicle(1234 , "FIZZ");
cdd.display();
}
}