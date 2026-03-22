public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1:");
        printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        double avg = (double) sum(arr, arr.length) / arr.length;
        System.out.println("Average: " + avg);

        // Task 3
        System.out.println("\nTask 3:");
        int n = 7;
        if (isPrime(n, n - 1)) {
            System.out.println(n + " Prime");
        } else {
            System.out.println(n + " Composite");
        }

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println("Factorial: " + factorial(5));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println("Fibonacci: " + fib(5));

        // Task 6
        System.out.println("\nTask 6:");
        System.out.println("Power: " + power(2, 10));

        // Task 7
        System.out.println("\nTask 7:");
        int[] arr2 = {1, 4, 6, 2};
        reversePrint(arr2, arr2.length);

        // Task 8
        System.out.println("\n\nTask 8:");
        if (isDigits("123456", 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Task 9
        System.out.println("\nTask 9:");
        System.out.println("Length: " + length("hello"));

        // Task 10
        System.out.println("\nTask 10:");
        System.out.println("GCD: " + gcd(32, 48));
    }

    // Task 1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    // Task 3
    public static boolean isPrime(int n, int i) {
        if (i == 1) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    // Task 4
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Task 6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    public static void reversePrint(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        reversePrint(arr, n - 1);
    }

    // Task 8
    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    // Task 9
    public static int length(String s) {
        if (s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }

    // Task 10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}