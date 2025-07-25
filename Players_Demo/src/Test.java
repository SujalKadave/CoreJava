
interface printable {
    public void printDetails();
}


class CktPlayer implements printable {
    String name;
    int runs;

    public CktPlayer(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    @Override
    public void printDetails() {
        System.out.println("Cricket Player: " + name + " Runs: " + runs);
    }
}


class FtPlayer implements printable {
    String name;
    int goals;

    public FtPlayer(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    @Override
    public void printDetails() {
        System.out.println("Football Player: " + name + " Goals: " + goals);
    }
}

public class Test {
    public static void main(String[] args) {
        CktPlayer cktPlayer = new CktPlayer("Sachin" , 100);
        cktPlayer.printDetails();

        FtPlayer ftPlayer = new FtPlayer("Shivam" , 2);
        ftPlayer.printDetails();
    }
}
