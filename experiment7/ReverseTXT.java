import java.io.*;

public class ReverseTXT {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        String line = null;
        String content = "";

        try {
            file = new RandomAccessFile("E21714049.txt", "rw");
            while ((line = file.readLine()) != null) {
                line = new String(line.getBytes("iso-8859-1"));
                content += line;
                System.out.println(new StringBuffer(content).reverse().toString());
            }
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}