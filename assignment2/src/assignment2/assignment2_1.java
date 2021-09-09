package assignment2;
public class assignment2_1 {
public static void main(String[] args) {
singel x= singel.getInstance();
singel y= singel.getInstance();
singel z= singel.getInstance();
System.out.println("hashcode x id "+x.hashCode());
System.out.println("hashcode y id "+y.hashCode());
System.out.println("hashcode z id "+z.hashCode());
if(x==y && y==z) {
System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
}
else {
System.out.println("Three objects DO NOT point to the same memory location on the heap");
}
}
}
class singel
{
private static singel singleton=null;
public String text;
private singel()
{
text="iam singletone class";
}
public static singel getInstance(){
if (singleton==null) {
singleton=new singel();
}
return singleton;
}
}