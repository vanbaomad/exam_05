import java.util.Scanner;

public class Sumcalculation {
    public static int sum(int n){
        int S = 0;
        for (int i = 0; i <= n; i++) {
            S += i;
        }
        return S;
    }
    public static int sum_1(int n){
        int S = 0;
        for (int i = 1; i <= n; i+=2) {
            S += i;
        }
        return S;
    }
    public static int sum_2(int n){
        int S = 0;
        for (int i = 2; i <= n; i+=2) {
            S += i;
        }
        return S;
    }
    public static void main(String[] args) {
        System.out.print("Nhap gia tri cua n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(sum(n));
        System.out.println(sum_1(n));
        System.out.println(sum_2(n));
    }
}
