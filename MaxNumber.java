public class MaxNumber {
    public static int max(int a, int b, int c, int d){
        int max_1 = Math.max(a,b);
        int max_2 = Math.max(c,d);
        return Math.max(max_1,max_2);
    }
    public static void main(String[] args) {
        int max = max(1,5,7,2);
        System.out.println(max);
    }
}
