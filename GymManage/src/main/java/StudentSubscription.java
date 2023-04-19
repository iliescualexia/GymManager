public class StudentSubscription implements Subscription {
    private final int numberOfEntrancesPerMonth = 15;
    private int id;

    @Override
    public double getPrice() {
        int price = 200;
        return 0.2 * price;
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
