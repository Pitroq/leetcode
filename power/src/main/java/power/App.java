package power;

public class App {
    public double pow(double x, int n) {
        if (n == 0) return 1;

        double result = x;

        if (n > 0) { 
            for (int i = 0; i < n - 1; i++) {
                result *= x;
            }
            return result;
        }

        for (int i = 0; i <= -n; i++) {
            result /= x;
        }
        return result;
    }
}
