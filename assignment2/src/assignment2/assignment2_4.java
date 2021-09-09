package assignment2;

final abstract class abstractclass {
public void mymethod() {
System.out.println("hello");
}
abstract public void anothermethod();
abstract private void id();

public class assignment2_4 extends abstractclass{

@Override
public void anothermethod() {
System.out.println("abstract method");
}
}
public static void main(String[] args) 
{
abstractclass obj=new abstractclass(); //we cannot instantiate an abstract class
obj.anothermethod();
}

}