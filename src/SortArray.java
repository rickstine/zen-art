public class SortArray {
    public static void main(String[] args) {
        int[] arr = {9,5,8,6,7,4,2,1,3};
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
        for (int n : arr) System.out.print(n + " ");
    }
}
