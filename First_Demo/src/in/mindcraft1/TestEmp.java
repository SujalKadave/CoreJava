package in.mindcraft1;

class Employee{
      String empName="Sujal";
      int empId=21;
      double salary=1234;
      
      void displayInfo() {
	  System.out.println("empName:"+empName+"empId:"+ empId+"salary:"+salary);
      }
      
      void displayInfoUsingParameter(String empName,int empId,double salary) {
  		this.empName=empName;
  		this.empId=empId;
  		this.salary=salary;
  		displayInfo();
  	}
}
public class TestEmp{
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.displayInfo();
	    Employee emp2=new Employee();
		emp2.displayInfoUsingParameter("Amit",98,12355);
	}
}
