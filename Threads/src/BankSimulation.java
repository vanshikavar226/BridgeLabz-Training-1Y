
class BankAccount implements Runnable {

    private String userName;
    private String accountType;

    public BankAccount(String userName, String accountType) {
        this.userName = userName;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    "User: " + userName +
                            " | Account Type: " + accountType +
                            " | Priority: " + t.getPriority() +
                            " | Checking Balance (" + i + ")"
            );

            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        // Creating users
        BankAccount premiumUser = new BankAccount("Vanshika", "Premium");
        BankAccount regularUser = new BankAccount("Rahul", "Regular");
        BankAccount basicUser = new BankAccount("Amit", "Basic");

        // Creating threads
        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);

        // Setting priorities
        t1.setPriority(10); // Premium
        t2.setPriority(5);  // Regular
        t3.setPriority(1);  // Basic

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
