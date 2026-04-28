package com.logisticsroutetracker;
public class Main {
        public static void main(String[] args) {
            Driver d = new Driver("D1204", "Kavita Nair");
            d.routeHistory.addCheckpoint(
                    new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
            d.routeHistory.addCheckpoint(
                    new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));

            d.routeHistory.addCheckpoint(
                    new RestCheckpoint("C3", "Motel X", 10, 20, 25));

            d.routeHistory.addCheckpoint(
                    new DeliveryCheckpoint("C4", "Client Hub", 60, 50, 65));

            d.printSummary();
        }
    }
  /*  // ================= ABSTRACT CLASS =================
    abstract class Checkpoint {
        String checkpointId;
        String locationName;
        double distanceFromLast;
        int expectedDuration;
        int actualDuration;

        public Checkpoint(String id, String loc, double dist, int exp, int act) {
            this.checkpointId = id;
            this.locationName = loc;
            this.distanceFromLast = dist;
            this.expectedDuration = exp;
            this.actualDuration = act;
        }
        boolean isDelayed() {
            return actualDuration > expectedDuration;
        }
        abstract boolean isCritical();
        abstract String getType();
        abstract double calculatePenalty();
    }

    // ================= DELIVERY =================
    class DeliveryCheckpoint extends Checkpoint {

        public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() {
            return true;
        }

        String getType() {
            return "DeliveryCheckpoint";
        }

        double calculatePenalty() {
            if (!isDelayed()) return 0;
            return (actualDuration - expectedDuration) * 2;
        }
    }

    // ================= FUEL =================
    class FuelCheckpoint extends Checkpoint {

        public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() {
            return true;
        }
        String getType() {
            return "FuelCheckpoint";
        }
        double calculatePenalty() {
            return isDelayed() ? 10 : 0;
        }
    }
    // ================= REST =================
    class RestCheckpoint extends Checkpoint {
        public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }
        boolean isCritical() {
            return false;
        }

        String getType() {
            return "RestCheckpoint";
        }

        double calculatePenalty() {
            if (!isDelayed()) return 0;

            int delay = actualDuration - expectedDuration;
            return delay > 30 ? delay * 0.5 : 0;
        }
    }

    // ================= LINKED LIST =================
    class RouteLinkedList<T extends Checkpoint> {

        class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
            }
        }

        private Node head;

        void addCheckpoint(T checkpoint) {
            Node newNode = new Node(checkpoint);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        boolean removeCheckpoint(String id) {
            if (head == null) return false;

            if (head.data.checkpointId.equals(id)) {
                head = head.next;
                return true;
            }

            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.checkpointId.equals(id)) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        T findCheckpoint(String id) {
            Node temp = head;
            while (temp != null) {
                if (temp.data.checkpointId.equals(id)) {
                    return temp.data;
                }
                temp = temp.next;
            }
            return null;
        }

        double computeTotalDistance() {
            double sum = 0;
            Node temp = head;
            while (temp != null) {
                sum += temp.data.distanceFromLast;
                temp = temp.next;
            }
            return sum;
        }

        double computeTotalPenalty() {
            double sum = 0;
            Node temp = head;
            while (temp != null) {
                sum += temp.data.calculatePenalty();
                temp = temp.next;
            }
            return sum;
        }

        void printRoute() {
            Node temp = head;
            int i = 1;

            while (temp != null) {
                Checkpoint c = temp.data;

                System.out.println(i + ". " + c.getType() + " – " +
                        c.locationName + " – " +
                        (c.isDelayed() ? "Delayed" : "On Time") +
                        " – Penalty: " + c.calculatePenalty());

                temp = temp.next;
                i++;
            }
        }

        boolean checkCritical() {
            boolean hasDelivery = false;
            boolean hasFuel = false;

            Node temp = head;
            while (temp != null) {
                if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
                if (temp.data instanceof FuelCheckpoint) hasFuel = true;
                temp = temp.next;
            }

            return hasDelivery && hasFuel;
        }
    }

    // ================= DRIVER =================
    class Driver {
        String driverId;
        String name;
        RouteLinkedList<Checkpoint> routeHistory;

        public Driver(String id, String name) {
            this.driverId = id;
            this.name = name;
            this.routeHistory = new RouteLinkedList<>();
        }

        void printSummary() {
            System.out.println("Driver: " + driverId + " – " + name);
            System.out.println("Route Summary:");
            routeHistory.printRoute();
            double distance = routeHistory.computeTotalDistance();
            double penalty = routeHistory.computeTotalPenalty();
            double score = distance - penalty;

            System.out.println("Total Distance: " + distance + " km");
            System.out.println("Total Penalty: " + penalty);
            System.out.println("Route Score: " + score);

            System.out.println("Critical Route Check: " +
                    (routeHistory.checkCritical() ?
                            "All required checkpoints present" :
                            "Missing critical checkpoints"));
        }
    }*/