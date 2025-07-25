package in.mindcraft;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	
	public WageEmployee() {
		setHours(8);
		setRate(500);
	}

	public WageEmployee(int eid,String ename,int dd,int mm,int yy,int hours, int rate) {
		super(eid,ename,dd,mm,yy);
		this.setHours(hours);
		this.setRate(rate);
	}
	
	public double calSalary() {
		return getHours()*getRate();
	}
	
	public void show() {
		super.show();
		System.out.println(getHours());
		System.out.println(getRate());
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	protected int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}