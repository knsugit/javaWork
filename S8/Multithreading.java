public class Multithreading {
    public static void main(String[] args) {
        Test he = new Test();
        try{
            Thread t1 = new Thread(he);
            t1.start();
            t1.join();
            Thread t2 = new Thread(he);
            t2.start();
            t2.join();
            Thread t3 = new Thread(he);
            t3.start();
            t3.join();
        }
        catch(Exception e){}

        /*new Thread(he).start();
        new Thread(he).start();
        new Thread(he).start();
        new Thread(he).start();
        new Thread(he).start();*/
    }
}

class Test implements Runnable {
    int top = 1;
    public void run() {
        /*while(top > 0) {
            try {
                Thread.sleep(1);
            }
            catch(Exception e){}
            
        }*/
        System.out.println(Thread.currentThread().getName().toString()
                                 + " is running: top= " + top);
    }
}