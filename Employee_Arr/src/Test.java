import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
	int empId;
	String name;
	double salary;

	public Employee() {	
		empId = 101;
		name = "Abc";
		salary = 80000;
	}
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empid:");
        empId = sc.nextInt();
        System.out.println("Enter emp name:");
        name = sc.next();
        System.out.println("Enter salary:");
        salary = sc.nextDouble();
    }
}
public class Test {

	public static void main(String[] args) {
		List<Employee> e1=new ArrayList<Employee>();
		int choice;
		Scanner sc = new Scanner(System.in);
		while (true) {
	            System.out.println("1. Add Employee details");
	            System.out.println("2. Display Employee details");
	            System.out.println("3. Update Employee Details");
	            System.out.println("4. Update Your Own Choice Employee Details");
	            System.out.println("5.Exit");
	            System.out.println("Enter your choice:");
	            choice=sc.nextInt();
	            switch(choice) {
	            case 1:
	            		Employee a1=new Employee();
	            		a1.accept();
	            		e1.add(a1);
	            		break;
	            case 2:
	            		System.out.println("Employee Details are");
	            		for(int i=0;i<e1.size();i++) {
	            			System.out.println(e1.get(i).empId+" "+e1.get(i).name+" "+e1.get(i).salary);
	            		}
	            		System.out.println();
	            		break;
	            case 3:
	            		System.out.println("Enter Emp Id to update:");
	            		int uemiId=sc.nextInt();
	            		double usalary;
	            		boolean found=false;
	            		for(int i=0;i<=e1.size();i++) {
	            			if(uemiId==e1.get(i).empId) {
	            				System.out.println("Enter salary to update:");
	            				usalary=sc.nextDouble();
	            				e1.get(i).salary=usalary;
	            				found=true;
	            				System.out.println("Salary is sucessfully updated");
	            				break;
	            			}
	            		}
	            		if(!found) {
	            			System.out.println("Employee ID"+uemiId+" Not found");
	            		}
	            		break;
	            	case 4:
	            		System.out.println("Update Your Own Choice Employee Details:");
	            		System.out.println("1.Update Employee empId");
	            		System.out.println("2.Update Employee ename");
	            		System.out.println("3.Update Employee salary");
	            		System.out.println("Enter your choice:");
	            	    int uChoice = sc.nextInt();

	            	    System.out.print("Enter Employee empId: ");
	            	    int id = sc.nextInt();

	            	    boolean found1 = false;
	            	    for (Employee e : e1) {
	            	        if (e.empId == id) {
	            	            found1 = true;
	            	            switch (uChoice) {
	            	                case 1:
	            	                    System.out.print("Enter new empId: ");
	            	                    e.empId = sc.nextInt();
	            	                    break;
	            	                    
	            	                case 2:
	            	                    System.out.print("Enter new ename: ");
	            	                    e.name = sc.next();
	            	                    break;
	            	                    
	            	                case 3:
	            	                    System.out.print("Enter new salary: ");
	            	                    e.salary = sc.nextDouble();
	            	                    break;
	            	            }
	            	            System.out.println("Employee details updated successfully.");
	            	            break;
	            	        }
	            	    }

	            	    if (!found1) {
	            	        System.out.println("Employee with empId " + id + " not found.");
	            	    }
	            	    break;
	            		
	            	
	            case 5: 
	            		System.exit(0);   	
	            }
		}
	}		
}






