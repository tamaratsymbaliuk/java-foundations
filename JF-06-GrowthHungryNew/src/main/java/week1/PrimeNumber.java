package week1;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // Divisible by 2 or 3, not prime
        }

        // Check for divisors from 5 to √n, skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false; // Divisible by i or i + 2, not prime
            }
        }
        return true; // Passed all checks, it's prime
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPrime(n));
    }

}
