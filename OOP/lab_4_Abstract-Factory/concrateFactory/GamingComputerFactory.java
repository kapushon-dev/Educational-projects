package concrateFactory;

import concreteProducts.CPU.*;
import concreteProducts.RAM.*;
import products.*;
import factory.ComputerFactory;

public class GamingComputerFactory  implements  ComputerFactory{
    public ICPU createCPU() {
        return new GamingCPU();
    }
    public IRAM createRAM() {
        return new GamingRAM();
    };
}