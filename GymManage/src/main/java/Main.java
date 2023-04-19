public class Main {
    public static void main(String[] args) {
        Gym gym = Gym.getInstance();
        Subscription subscription1 = SubscriptionFactory.createSubscription(SubscriptionType.STUDENT);
        gym.addSubscription(subscription1);
        Subscription subscription2 = SubscriptionFactory.createSubscription(SubscriptionType.NORMAL);
        gym.addSubscription(subscription2);
        Subscription subscription3 = SubscriptionFactory.createSubscription(SubscriptionType.STAFF);
        gym.addSubscription(subscription3);
        gym.removeSubscription(subscription2);
        for(Subscription subscription: gym.getSubscriptionList()){
            System.out.println(subscription.getId()+" "+ subscription.getPrice());
        }
    }
}
