import java.util.Scanner;

public class sumCalculation16 {
    public static double piCalculation(double c){
        double pi = 0;
        int n = 0;
        double term = 1;

        while (term > c) {
            pi += 4 * term;
            n++;
            term = 1.0 / (2 * n + 1);
            if (n % 2 != 0) {
                term *= -1;
            }
        }
        return pi;
    }

}
