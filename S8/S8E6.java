import java.util.*;
import java.text.*;


public class S8E6 {
    public static void main(String[] args) {
        Timer t1 = new Timer();
        PekingTimerTask task1 = new PekingTimerTask();
        t1.schedule(task1, 1, 1000);

        Timer t2 = new Timer();
        TokyoTimerTask task2 = new TokyoTimerTask();
        t2.schedule(task2, 1, 1000);

        Timer t3 = new Timer();
        LondonTimerTask task3 = new LondonTimerTask();
        t3.schedule(task3, 1, 1000);
    }
}

class PekingTimerTask extends TimerTask {
    public synchronized void run() {
        Date date = new Date();
        SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.print("Peking:\t" + bjSdf.format(date) + "\r");
        //System.out.println("");
    }
}

class TokyoTimerTask extends TimerTask {
    public synchronized void run() {
        Date date = new Date();
        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.print("Tokyo:\t" + tokyoSdf.format(date) + "\r");
        //System.out.println("");
    }
}

class LondonTimerTask extends TimerTask {
    public synchronized void run() {
        Date date = new Date();
        SimpleDateFormat londonSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        londonSdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.print("London:\t" + londonSdf.format(date) + "\r");
        //System.out.println("");
    }
}