public class IsoscelesTriangle {
    public static void output(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = h; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    output(4);
    }
}
