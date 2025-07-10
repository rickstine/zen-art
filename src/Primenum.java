import java.util.Scanner;

public class Primenum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num+ " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

    }
}