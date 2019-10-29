import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
        String score = "数学87分，物理76分，英语96分";
        Scanner scanner=new java.util.Scanner(score);
        double sum=0;

        scanner.useDelimiter("[^0123456789.]+");

        while (scanner.hasNext()) {
            try {double scores=scanner.nextDouble();
            sum=sum+scores;
                
            } catch (Exception e) {
                String t=scanner.next();
            }
        }
        double average = sum/3;
        System.out.println(average);
    }
}