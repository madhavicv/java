
import java.util.*;

class Student implements Comparator<Student>, Comparable<Student> {
   private String name;
   private int rollno;
   Student() {
   }

    Student(String name, int rollno) {
      this.name = name;
      this.rollno = rollno;
   }

   public String getName() {
      return name;
   }

   public int getRollno() {
      return rollno;
   }
      public int compareTo(Student s) {
      return (this.name).compareTo(s.name);
   }

      public int compare(Student s, Student s1) {
      return s.rollno - s1.rollno;
   }
}

public class ComparatorDemo
 {

   public static void main(String args[]) {
   List<Student> list = new ArrayList<Student>();

      list.add(new Student("Cherry",20));
      list.add(new Student("Sahasra",25));
      
     Collections.sort(list);   
      for(Student s3: list)   
         System.out.print(s3.getName() + ", ");

      Collections.sort(list, new Student());
      System.out.println(" ");
      
      for(Student s3: list)   
         System.out.print(s3.getName() +"  : "+ s3.getRollno() + ", ");
   }
}
