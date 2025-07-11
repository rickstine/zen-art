package collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
        public static void main(String[] args) {
            LinkedHashSet<String> movies = new LinkedHashSet<>();
            movies.add("spiderman");
            movies.add("batman");
            movies.add("ironman");
            movies.add("spiderman");
            movies.add("superman");

            System.out.println("my movies: " + movies);
            System.out.println("total movies: " + movies.size());

            if(movies.contains("batman")) {
                System.out.println("yes, i watched batman!");
            }
            movies.add("hulk");
            movies.add("thor");

            System.out.println("after adding more: " + movies);
            System.out.println("movies in order i added them:");
            for(String movie : movies) {
                System.out.println("- " + movie);
            }
            movies.remove("batman");
            System.out.println("after removing batman: " + movies);

            System.out.println("is my list empty? " + movies.isEmpty());

            movies.clear();
            System.out.println("after clearing: " + movies);
        }
    }
