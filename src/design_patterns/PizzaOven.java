package design_patterns;

public class PizzaOven {
    private static PizzaOven oven;

    private PizzaOven() {
        System.out.println("🔥 Pizza Oven is now ON!");
    }
    public static PizzaOven getInstance() {
        if (oven == null) {
            oven = new PizzaOven();
        }
        return oven;
    }
    public void bakePizza(String type) {
        System.out.println("🍕 Baking " + type + " pizza...");
    }
}