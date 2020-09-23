package HW05.Task02;

import HW05.Task02.Strategy.IHaveAllMoney;
import HW05.Task02.Strategy.IHaveSomeMoney;
import HW05.Task02.Strategy.IhaveNoMoney;
import HW05.Task02.Strategy.MoneyStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        MoneyStrategy strategy;

        System.out.println("Ваш бюджет на новый компьютер составляет? (от 100$ до 300$)");
        input = reader.readLine();
        System.out.println("Ваш НОВЫЙ компьютер собран!");

        if (Integer.parseInt(input) >= 250) {
            strategy = new IHaveAllMoney();
        } else if (Integer.parseInt(input) > 150 && Integer.parseInt(input) < 249) {
            strategy = new IHaveSomeMoney();
        } else {
            strategy = new IhaveNoMoney();
        }

        strategy.makeOrderPc();

    }

}
