
class MyException extends Exception {
	   String s1;
	   MyException(String s2) {
	      s1 = s2;
	   } 
	   @Override
	   public String toString() { 
	      return ("Output String = "+s1);
	   }
	}
	public class UserdefinedPrograms{ 
	   public static void main(String args[]) { 
	      try {
	         throw new MyException("user defined message");
	      } catch(MyException exp) {
	         System.out.println(exp);
	      }
	   }
	}
