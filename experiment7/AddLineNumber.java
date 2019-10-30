import java.io.*;

public class AddLineNumber {
    public static void main(String[] args) {
        RandomAccessFile sourceFile = null, targetFile = null;
        long lineNumber = 1;
        String line = null;

        try {
            sourceFile = new RandomAccessFile("1.txt", "rw");
            targetFile = new RandomAccessFile("2.txt", "rw");
            while ((line = sourceFile.readLine()) != null) {
                line = new String(line.getBytes("iso-8859-1"));
                targetFile.write((lineNumber + " " + line + "\n").getBytes());
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}