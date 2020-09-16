package HW04.Task01;

public class Lorry extends Car {

    public int capacity = 5000;

    @Override
    public void start() {

        System.out.println("Грузовик поехал");

    }

    @Override
    public void stop() {

        System.out.println("Грузовик остановился");

    }

    @Override
    public void printInfo() {

        System.out.println("Тип: Грузовик");
        System.out.println("Грузоподъемность: " + this.capacity);
        System.out.println("Вес: " + this.WEIGHT);
        System.out.println("Модель: " + this.MARK);
        System.out.println("Производитель мотора: " + this.MOTOR.MANUFACTURER);
        System.out.println("Мощность мотора: " + this.MOTOR.POWER);

    }

}
