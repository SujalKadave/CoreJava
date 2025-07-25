package in.mindcraft;

class Date{
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
public class Students {
       private int rollNo;
       private String name;
       private Date dob;
       
       public Students() {
    	   int counter=1;
		rollNo=++counter;
	    name="Sujal";
	    dob=new Date();
}
 
    public Students(int rollNo, String name, Date dob) {
	this.rollNo = rollNo;
	this.name = name;
	dob =new Date(dd,mm,yy) ;
}
public void show() {
	System.out.println("Student RollNo:"+rollNo);
	System.out.println("Student Name:"+name);
	dob.show();
}
}
}