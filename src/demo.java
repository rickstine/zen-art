import java.util.*;

public class demo{
    public static void main(String[] args) {
        String str1 = "He ran quickly, but he couldn't catch the bus. It was too late! What should he do now.";
        String cleanText = str1.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        String[] words = cleanText.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word Frequency Count:");
        Set<String> printed = new LinkedHashSet<>();
        for (String word : words) {
            if (!word.isEmpty() && printed.add(word)) {
                System.out.println(word + " : " + wordCount.get(word));
            }
        }

    }
}

