package factory;

import products.*;

public interface ComputerFactory {
    ICPU createCPU();
    IRAM createRAM();
}
