import java.util.*;

class Student {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    public Student(int rollno, String name, double percentage, Set<String> skillset) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    public String getName() {
        return name;
    }

    public Double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Percentage: " + percentage + ", Skills: " + skillset;
    }
}

class Utility {
    private List<Student> list = new ArrayList<>();

    public void createList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Roll No: ");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Percentage: ");
            double percentage = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of skills: ");
            int skillCount = Integer.parseInt(sc.nextLine());
            Set<String> skills = new HashSet<>();

            for (int j = 0; j < skillCount; j++) {
                System.out.print("Enter skill " + (j + 1) + ": ");
                skills.add(sc.nextLine());
            }

            Student s = new Student(roll, name, percentage, skills);
            list.add(s);
        }
    }

    public void printList() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public List<Student> getList() {
        return list;
    }
}

class UtilityReport {
    private Map<String, Double> report = new HashMap<>();

    public void showReport(List<Student> students) {
        for (Student s : students) {
            report.put(s.getName(), s.getPercentage());
        }

        System.out.println("Student Report (Name - Percentage)");
        for (Map.Entry<String, Double> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Utility ul = new Utility();
        ul.createList();
        ul.printList();

        UtilityReport ur = new UtilityReport();
        ur.showReport(ul.getList());
    }
}
