package creators;

import products.*;

public class ConsoleLogProvider extends LogProvider{
    @Override 
    public Logger createLogger(){
        return new ConsoleLogger();
    }
}
