
class Activity implements Runnable {

    private String name;
    private int startDelay;   // when activity starts (in seconds)
    private int interval;     // repeat interval
    private int cycles;

    public Activity(String name, int startDelay, int interval, int cycles) {
        this.name = name;
        this.startDelay = startDelay;
        this.interval = interval;
        this.cycles = cycles;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        try {
            System.out.println(name + " -> State: " + t.getState());

            Thread.sleep(startDelay * 1000); // delay before starting

            for (int i = 1; i <= cycles; i++) {
                System.out.println(
                        name + " | Thread: " + t.getName() +
                                " | Priority: " + t.getPriority() +
                                " | State: " + t.getState() +
                                " | Cycle: " + i
                );

                Thread.sleep(interval * 1000);
            }

        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
    }
}

public class ExamHallSystem {
    public static void main(String[] args) {

        Thread entry = new Thread(new Activity("Student Entry", 0, 2, 5), "EntryThread");
        Thread question = new Thread(new Activity("Question Paper Distribution", 5, 2, 3), "QPThread");
        Thread attendance = new Thread(new Activity("Attendance Marking", 10, 2, 3), "AttendanceThread");
        Thread collection = new Thread(new Activity("Answer Sheet Collection", 15, 2, 3), "CollectionThread");

        // Set priorities
        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        // Before start (NEW state)
        System.out.println("Before Start:");
        System.out.println("Entry State: " + entry.getState());
        System.out.println("QP State: " + question.getState());

        // Start threads
        entry.start();
        question.start();
        attendance.start();
        collection.start();

        System.out.println("After Start:");
        System.out.println("Entry State: " + entry.getState());
    }
}
