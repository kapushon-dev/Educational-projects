package concreteProducts.RAM;

import products.IRAM;

public class GamingRAM implements IRAM {
    @Override
    public void writeToMemory() {
        System.out.println("Downloading game files...");
    }

    @Override 
    public void deleteFromMemory(){
        System.out.println("Deleting game data...");
    }
}
