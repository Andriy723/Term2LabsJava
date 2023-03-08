package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Trolleybus {
    private static int id = 100;
    private int routeNumber;
    private int currentStop;
    private double maxSpeed;
    private int passengers;
    private static Trolleybus defaultTrolleybus = new Trolleybus();

    public static Trolleybus getInstance() {
        return defaultTrolleybus;
    }

    public double stop() {
        return maxSpeed * 0;
    }

    public double start() {
        return maxSpeed = 20;
    }

    public double addPassenger() {

        for (int i = 0; i < passengers; i++) {
            passengers++;
        }
        for (int i = 0; i >= passengers; i++) {
            System.out.println("  The trolley bus is crowded \n");
            break;
        }
        return 0;
    }

    public double removePassenger() {

        if (passengers > 0) {
            passengers--;
        } else if (passengers == 0) {
            System.out.println("  The trolleybus is not crowded \n");
        } else {
            System.out.println("  Error! \n");
        }

        return 0;
    }

    public static void main(String[] args) {

        Trolleybus[] object = new Trolleybus[4];
        object[0] = new Trolleybus();
        object[1] = new Trolleybus(100, 50, 40, 45);
        object[2] = getInstance();
        object[3] = getInstance();

        object[1].stop();
        object[0].start();
        object[2].addPassenger();
        object[1].removePassenger();

        System.out.println("The trolley 1:\t");
        System.out.println(object[0]);

        System.out.println("\nThe trolley 2:");
        System.out.println(object[1]);

        System.out.println("\nThe trolley 3:");
        System.out.println(object[2]);

        System.out.println("\nThe trolley 4:");
        System.out.println(object[3]);

        System.out.println("\n\n");

        for (int k = 0; k < object.length; k++) {
            System.out.println(object.toString());
        }
    }
}