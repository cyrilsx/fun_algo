package dynamics;

public class FibonacciSeries {
    int[] meno = new int[50];

    public int fib(int n) {
        if(meno[n] != 0) {
            return meno[n];
        }

        if(n < 2) {
            return n;
        }

        meno[n] = fib(n - 1) + fib(n - 2);
        return meno[n];
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.println(fibonacciSeries.fib(10));
    }
}
