package HW05.Task01;

public class Calculator {

    public static LoggerFactory log = null;

    public static void calculate(String input) {

        String tempStr = input.replaceAll("\\s+", ""); //чистим от непечатаемых символов

        if (tempStr.isEmpty()) {

            System.out.println("Ошибка: Пустая строка.");

        } else {

            int j = 0;
            String dig = "";
            String gar = "";
            String[] tempFor = new String[2];
            tempFor[0] = "";
            tempFor[1] = "";

            for (int i = 0; i < tempStr.length(); i++) {

                if (tempStr.substring(i, i + 1).matches("[-+]?\\d+")) { //только 0-9

                    tempFor[j] = tempFor[j] + tempStr.charAt(i);

                } else {

                    switch (tempStr.substring(i, i + 1)) {
                        case "." -> tempFor[j] = tempFor[j] + tempStr.substring(i, i + 1);
                        case "+", "-", "*", "/" -> {
                            j = 1;
                            dig = dig + tempStr.substring(i, i + 1);
                        }
                        default -> gar = gar + tempStr.substring(i, i + 1); //переменная для мусора
                    }

                }

            }

            //если есть мусор то сообщаем
            if (gar.isEmpty()) {

                //если операторов больше 1
                if (dig.length() != 1) {

                    System.out.println("Ошибка: Не корректное число операторов. ");

                } else {

                    //если перволе число пустое
                    if (tempFor[0].isEmpty()) {

                        System.out.println("Ошибка: Отсутсвует первое число. ");

                    } else {

                        if (tempFor[1].isEmpty()) {

                            System.out.println("Ошибка: Отсутсвует второе число. ");

                        } else {


                            switch (dig) {
                                case "+":
                                    OperatorSum(tempFor[0], tempFor[1]);
                                    break;
                                case "-":
                                    OperatorSub(tempFor[0], tempFor[1]);
                                    break;
                                case "*":
                                    OperatorMul(tempFor[0], tempFor[1]);
                                    break;
                                case "/":
                                    OperatorDiv(tempFor[0], tempFor[1]);
                                    break;

                                default:
                                    throw new IllegalStateException("Unexpected value: " + dig);
                            }

                        }


                    }

                }

            } else {

                System.out.println("Ошибка: Введены некорректные данные. ");

            }

        }

    }

    private static void OperatorSum (String firstNumb, String secondNumb) {

        log = new FileLoggerFactory();
        Logger lg = log.createLogger();
        System.out.println(lg.log(String.valueOf(Double.parseDouble(firstNumb) + Double.parseDouble(secondNumb))));

    }

    private static void OperatorSub (String firstNumb, String secondNumb) {

        log = new DbLoggerFactory();
        Logger lg = log.createLogger();
        System.out.println(lg.log(String.valueOf(Double.parseDouble(firstNumb) - Double.parseDouble(secondNumb))));

    }

    private static void OperatorMul (String firstNumb, String secondNumb) {

        log = new ConsoleLoggerFactory();
        Logger lg = log.createLogger();
        System.out.println(lg.log(String.valueOf(Double.parseDouble(firstNumb) * Double.parseDouble(secondNumb))));

    }

    private static void OperatorDiv (String firstNumb, String secondNumb) {

        log = new ConsoleLoggerFactory();
        Logger lg = log.createLogger();
        System.out.println(lg.log(String.valueOf(Double.parseDouble(firstNumb) / Double.parseDouble(secondNumb))));

    }

}
