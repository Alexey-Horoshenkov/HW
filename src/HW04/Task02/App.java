package HW04.Task02;

public class App {

    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new Lorry();
        cars[1] = new SportsCar();

        for (Car c : cars) {

            c.start();
            c.turnLeft();
            c.turnRight();
            c.stop();
            c.printInfo();

        }

    }

}
