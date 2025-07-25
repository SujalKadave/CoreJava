import in.mindcraft.Manager;
import in.mindcraft.MarketExecutive;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Sujal", 50000);
        m.display();

        MarketExecutive me = new MarketExecutive(102, "Shivam", 40000, 120);
        me.display();
    }
}

