package collections;
import java.util.ArrayList;

public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Biryani");
        foods.add("idli");
        foods.add("dosa");

        System.out.println("My favorite foods:");
        for(String food : foods) {
            System.out.println("- " + food);
        }
        if(foods.contains("dosa")) {
            System.out.println("dosa is one of my favorites!");
        }
    }
}