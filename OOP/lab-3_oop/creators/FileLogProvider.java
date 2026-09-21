package creators;

import products.*;

public class FileLogProvider extends LogProvider {
    @Override 
    public Logger createLogger(){
        return new FileLogger();
    }
}