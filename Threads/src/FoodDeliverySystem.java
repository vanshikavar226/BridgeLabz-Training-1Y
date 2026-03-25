class Order implements Runnable {

    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long startTime = System.currentTimeMillis();

        System.out.println("Order " + orderId + " from " + restaurant +
                " picked up by " + t.getName());

        try {
            Thread.sleep(1000);
            System.out.println("Order " + orderId + " is In Transit by " + t.getName());

            Thread.sleep(deliveryTime * 1000);
            System.out.println("Order " + orderId + " Delivered by " + t.getName());

        } catch (InterruptedException e) {
            System.out.println("Order interrupted");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total delivery time for Order " + orderId + ": " +
                (endTime - startTime) / 1000 + " seconds");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Thread o1 = new Thread(new Order(101, "Dominos", 3), "Agent-1");
        Thread o2 = new Thread(new Order(102, "KFC", 5), "Agent-2");
        Thread o3 = new Thread(new Order(103, "McDonalds", 2), "Agent-3");
        Thread o4 = new Thread(new Order(104, "Pizza Hut", 4), "Agent-4");
        Thread o5 = new Thread(new Order(105, "Burger King", 6), "Agent-5");

        // Set priorities
        o1.setPriority(10); // Express
        o2.setPriority(5);  // Standard
        o3.setPriority(3);  // Economy
        o4.setPriority(5);
        o5.setPriority(3);

        // Start threads
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}