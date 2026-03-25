import java.util.Random;

class Ticket extends Thread {

    private int ticketId;
    private String type;
    private int priority;

    public Ticket(int ticketId, String type, int priority) {
        this.ticketId = ticketId;
        this.type = type;
        this.priority = priority;
        this.setPriority(priority);
    }

    @Override
    public void run() {
        Random rand = new Random();
        int processingTime = rand.nextInt(5) + 1; // 1–5 seconds

        long start = System.currentTimeMillis();

        System.out.println("START -> Ticket: " + ticketId +
                " | Type: " + type +
                " | Agent: " + getName() +
                " | Priority: " + getPriority());

        try {
            Thread.sleep(processingTime * 1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        long end = System.currentTimeMillis();

        System.out.println("END -> Ticket: " + ticketId +
                " | Time Taken: " + (end - start) / 1000 + " sec");
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[10];

        // Creating mixed tickets
        tickets[0] = new Ticket(1, "Critical Bug", 10);
        tickets[1] = new Ticket(2, "Feature Request", 4);
        tickets[2] = new Ticket(3, "General Query", 2);
        tickets[3] = new Ticket(4, "Feedback", 1);
        tickets[4] = new Ticket(5, "Critical Bug", 10);
        tickets[5] = new Ticket(6, "Feature Request", 4);
        tickets[6] = new Ticket(7, "General Query", 2);
        tickets[7] = new Ticket(8, "Feedback", 1);
        tickets[8] = new Ticket(9, "Critical Bug", 10);
        tickets[9] = new Ticket(10, "Feature Request", 4);

        // Assign thread names (agents)
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].setName("Agent-" + (i + 1));
        }

        // Start all tickets
        for (Ticket t : tickets) {
            t.start();
        }
    }
}