


import java.util.*;  
import java.io.*;  
public class ComparableSort{  
public static void main(String args[]){  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee("Rahul",213,45));  
al.add(new Employee("Rohan",427,48));  
al.add(new Employee("Roshan",659,47));  
  
Collections.sort(al);  
for(Employee ey:al){  
System.out.println(ey.empname+" "+ey.empno+" "+ey.empage);  
}  
}  
}  
