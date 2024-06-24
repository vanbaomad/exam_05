import java.util.Scanner;

public class PrimeNum {
    public  static  boolean isPrime(int num){

        if(num<=1){
            return false;
        }
        if(num == 2||num == 3||num == 5||num == 7||num == 11){
            return true;
        }
        double m = Math.sqrt(num);
        for (int i = 2; i <= m ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (isPrime(n)){
            System.out.println("day la so nguyen  to");
        }else {
            System.out.println("khong la so nguyen to");
        }
    }
}
