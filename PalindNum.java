import java.util.Scanner;

public class PalindNum {
    public static boolean isPalindNum(int n){
        int start = n;
        int end = 0;
        while (n != 0){
            int digit = n % 10;
            end = end *10 +digit;
            n /=10;
        }
        return start == end;
    }
    public static void main(String[] args) {
        System.out.print("nhap gia tri:" );
        int n = new Scanner(System.in).nextInt();
        if (isPalindNum(n)){
            System.out.println("day la so nghich dao");
        }else {
            System.out.println("day khong la so nghich dao");
        }

    }
}
