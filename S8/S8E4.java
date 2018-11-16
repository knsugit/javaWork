import java.util.ArrayList;
import java.util.List;
public class S8E4 {
    public static final int MAX_SIZE = 10;
    public static Integer goods = 0;
    public static void main(String[] args) {
        new Thread(new ProducerThread()).start();
        new Thread(new ConsumerThread()).start();
    }
}

class ProducerThread implements Runnable {
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {}
            synchronized(S8E4.goods) {
                if(S8E4.goods == S8E4.MAX_SIZE) {
                    try {
                        System.out.println("Goods Full, waiting...");
                        S8E4.goods.wait();
                    }
                    catch(Exception e) {}
                }

                System.out.println("Produce goods, total:" + S8E4.goods.intValue());
                S8E4.goods.notifyAll();
            }
        }
    }
}
class ConsumerThread implements Runnable {
    public void run() {
        while(true) {
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}
            synchronized(S8E4.goods) {
                if(S8E4.goods == 0) {
                    try {
                        System.out.println("Goods Empty, waiting...");
                        S8E4.goods.wait();
                    }
                    catch(Exception e) {}
                }

                System.out.println("Consume goods, total:" + S8E4.goods.intValue());
                S8E4.goods.notifyAll();
            }
        }
    }
}