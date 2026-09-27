import bilders.*;
import bilders.IPizzaBuilder.Pizza;

public class AppPizzeria {
    public static void main(String[] args) {
        Chef dmitryNazarov = new Chef(new PizzaBilder());
        Pizza pepperoniPizza = dmitryNazarov.makePepperonni();
        System.out.println(pepperoniPizza);

    }

}