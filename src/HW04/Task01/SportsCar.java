package HW04.Task01;

public class SportsCar extends Car {

    public int maxSpeed = 333;

    @Override
    public void start() {

        System.out.println("SportsCar поехал");

    }

    @Override
    public void stop() {

        System.out.println("SportsCar остановился");

    }

    @Override
    public void printInfo() {

        System.out.println("Тип: Спорткар");
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Вес: " + this.WEIGHT);
        System.out.println("Модель: " + this.MARK);
        System.out.println("Производитель мотора: " + this.MOTOR.MANUFACTURER);
        System.out.println("Мощность мотора: " + this.MOTOR.POWER);

    }

}
