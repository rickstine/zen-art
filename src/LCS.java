public class LCS {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = "loworldpeace";

        String longest = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String sub = str1.substring(i, j);
                if (str2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println("Longest Common Substring: " + longest);
    }
}
