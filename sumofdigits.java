public class sumofdigits {
    public static int sumofDigits(int n){
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofDigits(200));
    }
}
