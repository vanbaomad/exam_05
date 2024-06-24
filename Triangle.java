public class Triangle {
    public static void main(String[] args) {
        output(4);
    }
    public static void output(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
