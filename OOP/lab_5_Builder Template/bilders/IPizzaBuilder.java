package bilders;


public interface IPizzaBuilder {
    class Pizza{
        String dought = null;
        String sauce = null;
        String toping = null;
        
        @Override
        public String toString() {
            return "Pizza {" +
                    "\n  Dough: " + dought +
                    "\n  Sauce: " + sauce +
                    "\n  Topping: " + toping +
                    "\n}";
        }
    }

    void bildDought(String dought);
    void addSauce(String sauce);
    void addTopping(String topping);
    Pizza getResult();
}
