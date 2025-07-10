import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}