public class SubscriptionFactory {
    public static Subscription createSubscription(SubscriptionType type) {
        switch (type) {
            case STUDENT:
                return new StudentSubscription();
            case NORMAL:
                return new NormalSubscription();
            case STAFF:
                return new StaffSubscription();
            default:
                throw new IllegalArgumentException("Invalid subscription type: " + type);
        }
    }
}