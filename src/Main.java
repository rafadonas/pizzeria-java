public class Main {
    public static void main(String[] args) {
        Costumer costumer01 = new Costumer("Rafael", "(12)1234-1234", "123 Main St, Apt 4B, Springfield, IL 62704");

        Pizza pizzaCheese = new Pizza("Cheese", "Medium", 34.59);
        Pizza pizzaPortuguese = new Pizza("Portuguesa", "Large", 30.59);
        Pizza pizzaPepperoni = new Pizza("Pepperoni", "Medium", 32.59);

        Order order01 = new Order(costumer01);

        order01.addPizza(pizzaCheese);
        order01.addPizza(pizzaPepperoni);
        order01.addPizza(pizzaPortuguese);

        Menu menu = new Menu();
        menu.listAvailablePizzas();

        Long startTime = System.currentTimeMillis();

        Pizza chosenPizza = menu.searchPizza("Pepperoni");
        if (chosenPizza != null) {
            System.out.println("You chose: " + chosenPizza.getFlavor());
        } else {
            System.out.println("Pizza not found!");
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime)+ "ms");
    }
}