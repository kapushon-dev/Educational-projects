package products;

public class FileLogger implements Logger{
    @Override 
    public void log(String message){
        System.out.println("The logs are written to a file \nLogs: " + message);
    }
}
