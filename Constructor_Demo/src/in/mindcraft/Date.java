package in.mindcraft;

public class Date {
	private int dd,mm,yy;
	public Date() {
		dd=10;
		mm=8;
		yy=2004;
	}
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void show() {
		System.out.println("Date:");
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}