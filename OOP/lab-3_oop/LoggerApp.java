import creators.*;
import products.*;

public class LoggerApp{
    public static void main(String[] args){
        ConsoleLogProvider consoleLogProvider1 = new ConsoleLogProvider();
        Logger consoleLogger = consoleLogProvider1.createLogger();
        consoleLogger.log("Epshtain was died");
    }
}