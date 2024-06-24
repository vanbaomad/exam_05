import java.util.Scanner;

public class gcd_lcm {
    public static int gcd(int a,int b){
        while (b!= 0){
            int temp = b;
             b = a % b;
             a = temp;
        }
        return a;
    }
    public static int lcm(int a,int b, int gcd){
        return a*b/gcd;
    }

    public static void main(String[] args) {
        System.out.print("nhap gt cua so thu nhat: " );
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap gt cua so thu hai: " );
        int b = new Scanner(System.in).nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b,gcd(a,b)));
    }
}
