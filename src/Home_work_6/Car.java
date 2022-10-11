package Home_work_6;

public class Car {

    public void start() {

        startCommand();
        startElectricity();
        startFuelSystem();

    }

    private static void startElectricity() {
        System.out.println("Start electricity");

    }

    private static void startCommand() {
        System.out.println("Start command");

    }

    private static void startFuelSystem() {
        System.out.println("Start fuel system");

    }
}

