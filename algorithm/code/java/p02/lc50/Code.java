package algorithm.code.java.p02.lc50;

public class Code {
    public double myPow(double x, int n) {
        long t = n;

        if (n >= 0) {
            // 幂大于等于 0
            return abs(x, t);
        } else {
            // 幂小于 0
            return 1.0 / abs(x, -t);
        }
    }

    public double abs(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double res = abs(x, n / 2);
        // 会出现奇数次幂, 需要将丢失的乘回来
        return n % 2 > 0 ? res * res * x : res * res;
    }
}
