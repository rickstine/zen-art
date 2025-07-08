public class Stringrev {
    public static void main(String[] args) {
        String input = "Hi i am gowrav";
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println("Reversed string: " + reversed.toString());
    }
}
