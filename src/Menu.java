import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> availablePizzas;

    public Menu(){
        this.availablePizzas = new ArrayList<>();
        inicializeMenu();
    }

    private void inicializeMenu() {
        availablePizzas.add(new Pizza("Pepperoni", "Large", 45.0));
        availablePizzas.add(new Pizza("Cheese", "Medium", 35.0));
        availablePizzas.add(new Pizza("Margherita", "Small", 25.0));
        availablePizzas.add(new Pizza("Hawaiian", "Large", 50.0));
    }

    public void listAvailablePizzas(){
        for (Pizza pizza : availablePizzas){
            System.out.printf("""
                    __ __ __ __ __ __ __
                    Flavor: %s
                    Price: %.2f
                    """, pizza.getFlavor(), pizza.getPrice());
        }
    }

    public Pizza searchPizza(String flavor){
        for (Pizza pizza : availablePizzas){
            if (pizza.getFlavor().equalsIgnoreCase(flavor)){
                return pizza;
            }
        }
        return null;
    }
}
