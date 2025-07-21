package design_patterns;

public class PizzaOvenMain {
    public static void main(String[] args) {
        PizzaOven oven1 = PizzaOven.getInstance();
        PizzaOven oven2 = PizzaOven.getInstance();

        oven1.bakePizza("Margherita");
        oven2.bakePizza("Pepperoni");
        System.out.println(oven1 == oven2);
    }
}
