import java.util.*;
import java.text.*;

public class S8E6s {
    public static String timeString1;
    public static String timeString2;
    public static String timeString3;
    public static void main(String[] args) {
        Thread t1 = new Thread(new PekingTime());
        Thread t2 = new Thread(new TokyoTime());
        Thread t3 = new Thread(new LondonTime());
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {}
        while(true) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            System.out.print("Peking: "+timeString1+"\t"+"Tokyo: "+timeString2+"\t"+"London: "+timeString3 + "\r");
        }
    }
}

class PekingTime implements Runnable {
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            Date date = new Date();
            SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            //System.out.println("Peking:\t" + bjSdf.format(date) + "\r");
            S8E6s.timeString1 = bjSdf.format(date).toString();
        }
    }
}

class TokyoTime implements Runnable {
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            Date date = new Date();
            SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
            //System.out.println("Tokyo:\t" + tokyoSdf.format(date) + "\r");
            S8E6s.timeString2 = tokyoSdf.format(date).toString();
        }
    }
}

class LondonTime implements Runnable {
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            Date date = new Date();
            SimpleDateFormat londonSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            londonSdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
            //System.out.println("London:\t" + londonSdf.format(date) + "\r");
            S8E6s.timeString3 = londonSdf.format(date).toString();
        }
    }
}