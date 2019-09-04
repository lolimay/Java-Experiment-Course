public class While {
    public static void main(String[] args) {
        int x = 1, y = 6;

        while (y-- > 0) {
            x--;
        }
        System.out.print("x=" + x + ",y=" + y);
    }
}