public class LargestElement {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 91, 33, 67, 5};

        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
