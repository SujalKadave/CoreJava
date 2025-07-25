package in.mindcraft;

import java.util.Scanner;

public class Datee {
			private int dd,mm,yy;
			public Datee() {
				dd=10;
				mm=8;
				yy=2004;
			}
			public Datee(int dd, int mm, int yy) {
				super();
				this.dd = dd;
				this.mm = mm;
				this.yy = yy;
			}
		    public void accept() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter day: ");
		        dd = sc.nextInt();
		        System.out.print("Enter month: ");
		        mm = sc.nextInt();
		        System.out.print("Enter year: ");
		        yy = sc.nextInt();
		    }

			public void show() {
				System.out.println("Date of Birth: " + dd + "/" + mm + "/" + yy);
			}

	}
