public class BasicOutput {
    public static void main(String[] args) {
        char x='你', y='e', z='吃';
        if (x > 'A') {
            y='苹';
            z='果';
        } else
            y='酸';
        z='甜';
        System.out.println(x + "," + y + "," + z);
    }
}