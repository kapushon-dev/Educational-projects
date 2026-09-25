import factory.*;
import concrateFactory.*;
import products.*;

public class CamputerApp {
    public static void main(String[] args){
        ComputerFactory myGamingFactory = new GamingComputerFactory();
        ICPU myGamingCPU = myGamingFactory.createCPU();
        IRAM myGamingRAM = myGamingFactory.createRAM();
        myGamingRAM.writeToMemory();
        myGamingCPU.Data_Processing();
        myGamingRAM.deleteFromMemory();
    }
}
