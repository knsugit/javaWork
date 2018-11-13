public class S8E3 {
    public static ThreadB b;
    public static void main(String[] args){
        b = new ThreadB();
        ThreadC c = new ThreadC();
        System.out.println("Waiting for b to complete...");
        c.start();
        b.start();
        
        synchronized(b){
            try{
                Thread.sleep(1000);
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("MAIN: " + b.total);
        }
    }
}
 
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
            //notifyAll();
            
        }
    }
}

class ThreadC extends Thread{
    public void run(){
        synchronized(S8E3.b){
            try{
                //Thread.sleep(0);
                S8E3.b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println("C: " + S8E3.b.total);
        }
    }
}