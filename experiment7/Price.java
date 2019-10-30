import java.io.*;
import java.util.regex.*;

public class Price {
    static int total = 0;
    public static void main(String[] args) {
        RandomAccessFile file = null;
        String line = "";

        try {
            file = new RandomAccessFile("data.txt", "rw");
            while ((line = file.readLine()) != null) {
                line = new String(line.getBytes("iso-8859-1"));
                System.out.println(line);
                match(line, "\\d{2,5}");
            }
            System.out.println("平均价格：" + total/3 + "元");
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public static void match(String line, String regEx) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(line);
        while(matcher.find()) {
            for(int i = 0; i <= matcher.groupCount(); i++) {
                total += Integer.parseInt(matcher.group(i));
            }
        }
    }
}