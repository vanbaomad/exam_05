import java.util.Scanner;

public class Rectangle_matrix {
    public static void output(){
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("nhap m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        output();
    }
}
