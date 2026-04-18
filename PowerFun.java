public class PowerFun {
    public static double mypow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currproduct = x;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= currproduct;

            }

            currproduct *= currproduct;
            N /= 2;
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(mypow(2, 10));
        System.out.println(mypow(2, -2));

    }
}
