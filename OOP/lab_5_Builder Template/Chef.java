import bilders.*;
import bilders.IPizzaBuilder.Pizza;

public class Chef {

    IPizzaBuilder pizzaBuilder;

    Chef(IPizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    void changeBuilder(IPizzaBuilder newPizzaBuilder){
        this.pizzaBuilder = newPizzaBuilder;
    }

    Pizza makePepperonni(){
        pizzaBuilder.bildDought("Italian");
        pizzaBuilder.addSauce("Tomato");
        pizzaBuilder.addTopping("Mozzarella cheese, pepperoni sausage");
        return pizzaBuilder.getResult();
    }
}
