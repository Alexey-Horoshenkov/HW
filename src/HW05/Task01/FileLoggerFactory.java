package HW05.Task01;

public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
