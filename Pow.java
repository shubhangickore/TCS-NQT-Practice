public class Pow {
    public double myPow(double x, int n) {
        // Handle negative powers
        long N = n; // use long to avoid overflow when n = Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0)
            return 1.0;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00000, 10)); // Output: 1024.00000
    }
}
