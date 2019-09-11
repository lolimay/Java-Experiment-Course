public class DynamicParameters {
    public static void main(String[] args) {
        DynamicParameters dynamicParameters = new DynamicParameters();
        int sum = dynamicParameters.getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public int getSum(int ...x) {
        int sum = 0;

        for (int i=0; i < x.length; i++) {
            sum += x[i];
        }

        return sum;
    }
}

