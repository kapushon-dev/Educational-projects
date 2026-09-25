package concreteProducts.CPU;

import products.ICPU;

public class OfficeCPU implements ICPU{
    @Override 
    public  void Data_Processing(){
        System.out.println("Launch Word...");
    }
}
