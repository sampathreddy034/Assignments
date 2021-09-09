package assignment5;

import java.util.HashSet;
import java.util.Set;

class assignment5_1{
private int id;
private String name;
private double salary;
private String department;
public assignment5_1(int id, String name, double salary, String department) {
super();
this.id = id;
this.name = name;
this.salary = salary;
this.department = department;
}

public String toString() {
return "id: "+id +" name: "+name+" salary: "+salary+" department: "+department;
}
}
class maain {

public static void main(String[] args) {
assignment5_1 e1=new assignment5_1(01,"ben ",1001,"CN");
assignment5_1 e2=new assignment5_1(02,"gwen ",1002,"CN1");
assignment5_1 e3=new assignment5_1(03,"max ",1003,"CN2");
assignment5_1 e4=new assignment5_1(04,"kevin ",1004,"CN3");
assignment5_1 e5=new assignment5_1(05,"jullie ",1005,"CN4");
assignment5_1 e6=new assignment5_1(06,"auntmey ",1006,"CN5");

Set<assignment5_1> employees=new HashSet<>();
employees.add(e1);
employees.add(e2);
employees.add(e3);
employees.add(e4);
employees.add(e5);
employees.add(e6);
System.out.println(employees);
}

}

