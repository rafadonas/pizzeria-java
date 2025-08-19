import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    Costumer costumer;
    ArrayList<Pizza> pizzas;
    LocalDateTime orderTime;
    StatusOrder status;

    public Order(Costumer costumer) {
        this.costumer = costumer;
        this.orderTime = LocalDateTime.now();
        this.status = StatusOrder.IN_PROGRESS;
        this.pizzas = new ArrayList<Pizza>();
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public double orderPrice(){
        double value = 0;
        for(Pizza pizza : pizzas){
            value += pizza.getPrice();
        }
        return value;
    }

    public void printPizzas(){
        for (Pizza pizza : pizzas){
            System.out.printf("""
                ---------------------
                Flavor: %s
                Size: %s
                Price: %.2f
                """, pizza.getFlavor(), pizza.getSize(), pizza.getPrice());
        }
    }

    public void updateStatus(StatusOrder newStatus){
        this.status = newStatus;
        System.out.println("Order status update to: " + newStatus);
    }

    public void printOrder(){
        System.out.printf("""
                ====================
                Costumer: %s
                Qtd Pizzas: %d
                --------------------
                Billing
                Price: $ %.2f
                """, costumer.getName(), pizzas.toArray().length, orderPrice());
    }
}
