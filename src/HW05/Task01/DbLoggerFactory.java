package HW05.Task01;

public class DbLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DbLogger();
    }

}
