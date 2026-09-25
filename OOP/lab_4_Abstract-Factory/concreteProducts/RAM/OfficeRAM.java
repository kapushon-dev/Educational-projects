package concreteProducts.RAM;

import products.IRAM;

public class OfficeRAM implements IRAM {
    @Override
    public void writeToMemory() {
        System.out.println("Download the working files...");
    }

    @Override 
    public void deleteFromMemory(){
        System.out.println("Deleting Working Files...");
    }
}