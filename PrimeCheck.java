public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        if (n == 2) return true;  // 2 is the only even prime
        if (n % 2 == 0) return false; // Exclude other even numbers

        // Check odd factors up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 28;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
