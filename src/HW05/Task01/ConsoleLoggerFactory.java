package HW05.Task01;

public class ConsoleLoggerFactory extends LoggerFactory{

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
