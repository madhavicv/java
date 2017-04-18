
class Employee implements Comparable<Employee>{  
	int empno;  
	String empname;  
	int empage;  
	Employee(String empname,int empno,int empage){  
	this.empno=empno;  
	this.empname=empname;  
	this.empage=empage;  
	}  
	  
	public int compareTo(Employee ey){  
	if(empage==ey.empage)  
	return 0;  
	else if(empage>ey.empage)  
	return 1;  
	else  
	return -1;  
	}  
	}  
