package in.mindcraft;

public class SalesPerson extends WageEmployee{
    private int numberOfItemsSold;
    private double commissionPerItem;

    public SalesPerson() {
        super();
        numberOfItemsSold = 2;
        commissionPerItem = 10;
    }

    public SalesPerson(int eid, String ename, int dd, int mm, int yy,
                       int hours, int rate, int numberOfItemsSold, double commissionPerItem) {
        super(eid, ename, dd, mm, yy, hours, rate);
        this.numberOfItemsSold = numberOfItemsSold;
        this.commissionPerItem = commissionPerItem;
    }
    public double calSalarySalesPerson() {
        return getHours() * getRate() + numberOfItemsSold * commissionPerItem;
    }
    public void show() {
        super.show();
    }
}