import java.util.Arrays;
import java.util.Scanner;

public class divisorsNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số tự nhiên lớn hơn 0.");
        } else {
            System.out.println("Các ước số của " + n + " là:");
            int[] divisors = findDivisors(n);
            for (int divisor : divisors) {
                System.out.print(divisor + " ");
            }

            int count = count(divisors);
            System.out.println("\nSố lượng ước số của " + n + " là: " + count);
        }
    }


    public static int[] findDivisors(int n) {
        int[] listdiivisors = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                listdiivisors[count++] = i;
            }
        }
        int[] divisors = new int[count];
        for (int i = 0; i < count; i++) {
            divisors[i] = listdiivisors[i];
        }
        return divisors;
    }

    public static int count(int[] divisors) {
        return divisors.length;
    }
}
