package in.mindcraft;

class PrintData{
	String name="Sujal";
	int age=21;
	void displayData() {
		System.out.println("Name:"+name+" Age:"+age);
	}
	void displayDataUsingParameter(String name,	int age) {
		this.name=name;
		this.age=age;
		displayData();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintData pd1=new PrintData();
		pd1.displayData();
		PrintData pd2=new PrintData();
		pd2.displayDataUsingParameter("Amit",98);

	}
}
