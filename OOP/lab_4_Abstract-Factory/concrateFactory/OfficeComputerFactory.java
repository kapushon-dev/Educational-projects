package concrateFactory;

import concreteProducts.CPU.OfficeCPU;
import concreteProducts.RAM.OfficeRAM;
import products.*;
import factory.ComputerFactory;

public class OfficeComputerFactory implements  ComputerFactory{
    public ICPU createCPU() {
        return new OfficeCPU();
    }
    public IRAM createRAM() {
        return new OfficeRAM();
    };
}