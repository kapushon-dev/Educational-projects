package bilders;
public class PizzaBilder implements IPizzaBuilder{

    Pizza pizza = new Pizza();;

    @Override
    public void bildDought(String dought) {
        pizza.dought = dought;
    }

    @Override
    public void addSauce(String sause) {
        pizza.sauce = sause;
    }

    @Override
    public void addTopping(String topping) {
        pizza.toping = topping;
    }

    @Override 
    public Pizza getResult() {
        Pizza myPizza = this.pizza;
        this.pizza = new Pizza();
        return myPizza;
    }
}
