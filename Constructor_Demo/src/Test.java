import in.mindcraft.SalesPerson;
import in.mindcraft.WageEmployee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmployee w1=new WageEmployee();
		System.out.println(w1.calSalary());
		w1.show();
		SalesPerson s1=new SalesPerson();
		System.out.println(s1.calSalarySalesPerson());
		s1.show();
	}

}