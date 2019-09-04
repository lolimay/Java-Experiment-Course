public class FactorialSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=10; i>0; i--) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    private static int factorial(int num) {
        for (int i=num-1; i>0; i--) {
            num *= i;
        }
        return num;
    }
}