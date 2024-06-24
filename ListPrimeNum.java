import java.util.Scanner;

public class ListPrimeNum {
    public static boolean isPrime(int n){
        if (n <= 0){
            return false;
        }
        double m = Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("nhap tri cua so: " );
        int n = new Scanner(System.in).nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
