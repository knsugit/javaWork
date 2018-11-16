import java.util.*;
import java.security.Principal;
import java.text.*;

public class S8E6s {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PekingTime());
        Thread t2 = new Thread(new TokyoTime());
        Thread t3 = new Thread(new LondonTime());
        t1.start();
        t2.start();
        t3.start();
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
            System.out.print("Peking:\t" + bjSdf.format(date) + "\r");
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
            System.out.print("Tokyo:\t" + tokyoSdf.format(date) + "\r");
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
            System.out.print("London:\t" + londonSdf.format(date) + "\r");
        }
    }
}