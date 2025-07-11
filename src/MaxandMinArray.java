public class MaxandMinArray {
    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,1,2,3,4};
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
    }
}