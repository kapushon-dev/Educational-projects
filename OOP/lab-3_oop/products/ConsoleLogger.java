package products;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("The logs are displayed in the console. \n>> " + message);
    }
}
