import java.util.Calendar;

public class DayDifference {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(Calendar.YEAR, Integer.parseInt(args[0]));
        c1.set(Calendar.MONTH, Integer.parseInt(args[1]));
        c1.set(Calendar.DATE, Integer.parseInt(args[2]));
        c2.set(Calendar.YEAR, Integer.parseInt(args[3]));
        c2.set(Calendar.MONTH, Integer.parseInt(args[4]));
        c2.set(Calendar.DATE, Integer.parseInt(args[5]));
        System.out.println(getDays(c1, c2) + " days.");
    }

    public static int getDays(Calendar c1,Calendar c2) {
        long l = c1.getTimeInMillis()-c2.getTimeInMillis();
        int i =(int)( l/1000/60/60/24);

        return i;
    }
}