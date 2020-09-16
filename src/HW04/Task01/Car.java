package HW04.Task01;

public abstract class Car {

    public final int WEIGHT = 1500;
    public final String MARK = "Rio";
    public final Engine MOTOR = new Engine();

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {

        System.out.println("Поворто направо");

    }

    public void turnLeft() {

        System.out.println("Поворто налево");

    }


}
