package concreteProducts.CPU;

import products.ICPU;

public class GamingCPU implements ICPU{
    @Override 
    public  void Data_Processing(){
        System.out.println("Launching the game...");
    }
}