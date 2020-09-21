package HW05.Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConControl {

    public void mainLoop() throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String input;
        Calculator calc = new Calculator();

        while (true) {

            System.out.print("Введите выражение и нажмите [Enter]: ");
            input = reader.readLine();

            if (input.equals("exit")) {
                break;
            }

            calc.calculate(input);

        }

        System.out.println("До свидания!");
    }

}
