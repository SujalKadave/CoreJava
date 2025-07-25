package in.mindcraft;

public class Students {
		private int rollNo;
		private String name;
		private Datee dob;
		public Students() {
			int counter=0;
			rollNo=++counter;
			name="Sujal";
			dob=new Datee();
		}
		public void Students(int rollNo, String name, int dd,int mm,int yy) {
			int counter=0;
			this.rollNo = counter++;
			this.name = name;
			dob =new Datee(dd,mm,yy);
		}
		
		public void show() {
			System.out.println("Student RollNo:"+rollNo);
			System.out.println("Student Name:"+name);
			dob.show();
		}
	}
