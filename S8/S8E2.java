public class S8E2 {
    public static int var = 0;
    public static void main(String[] args) {
        new Thread(new PlusClass()).start();
        new Thread(new ReduceClass()).start();
        new Thread(new PlusClass()).start();
        new Thread(new ReduceClass()).start();
    }
}
class PlusClass implements Runnable {
    public void run() {
        synchronized(Thread.class) {
            for(int i = 0; i < 10; i++) {
                S8E2.var++;
                System.out.println(Thread.currentThread().getName() +" Plus, var= " + S8E2.var);
            }
        }
        
    }
}
class ReduceClass implements Runnable {
    public void run() {
        synchronized(Thread.class) {
            for(int i = 0; i < 10; i++) {
                S8E2.var--;
                System.out.println(Thread.currentThread().getName() + " Reduce, var= " + S8E2.var);
            }
        }
    }
}