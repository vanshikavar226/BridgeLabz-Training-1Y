
import java.time.LocalTime;

class Device implements Runnable {

    private String deviceName;
    private int interval;

    public Device(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    LocalTime.now() + " | Device: " + deviceName +
                            " | Thread: " + t.getName() +
                            " | Priority: " + t.getPriority() +
                            " | Cycle: " + i
            );

            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted");
            }
        }
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thread temp = new Thread(new Device("Temperature Sensor", 5), "TempThread");
        Thread camera = new Thread(new Device("Security Camera", 3), "CameraThread");
        Thread light = new Thread(new Device("Light Controller", 4), "LightThread");
        Thread door = new Thread(new Device("Door Lock", 6), "DoorThread");

        // Set priorities
        camera.setPriority(10); // Highest
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        camera.start();
        light.start();
        door.start();
    }
}
