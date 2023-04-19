public class StaffSubscription implements Subscription{
    private final int numberOfEntrancesPerMonth=100;
    private int id;
    @Override
    public double getPrice() {
        int price = 200;
        return 0.5* price;
    }
    public int getNumberOfEntrancesPerMonth() {
        return numberOfEntrancesPerMonth;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
}
