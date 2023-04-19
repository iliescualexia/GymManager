import java.util.ArrayList;
import java.util.List;

public class Gym {
    private final String name;
    private final String address;
    private int numberOfSubscriptions;
    private List<Subscription> subscriptionList=new ArrayList<>();

    public Gym(String name, String address, int numberOfSubscriptions) {
        this.name = name;
        this.address = address;
        this.numberOfSubscriptions = numberOfSubscriptions;
    }

    private static Gym instance;
    public static Gym getInstance(){
        if(instance==null){
            instance = new Gym("Revo Fitness Club","Strada Augustin Presecan 2, Cluj-Napoca",0);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfSubscriptions() {
        return numberOfSubscriptions;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }
    public void addSubscription(Subscription subscription) {
        subscription.setId(numberOfSubscriptions);
        subscriptionList.add(subscription);
        numberOfSubscriptions++;
    }

    public void removeSubscription(Subscription subscription) {
        subscriptionList.remove(subscription);
        numberOfSubscriptions--;
    }
}
