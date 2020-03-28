import Module_2.Point;
import Module_2.Snake;
import Module_2.Tigre;
import Module_3.IThread;
import Module_3.JThread;
import Module_3.RThread;
import Module_3.UThread;

public class Main {
    public static void main(String[] args) {

        CommonResourse commonResourse = new CommonResourse();
        for (int i=1;i<6;i++){
            Thread t = new Thread(new CountThread(commonResourse));
            t.setName("Thread "+i);
            t.start();
        }

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.setName("Java");
//        System.out.println(t.getPriority());
//        System.out.println(t.isAlive());
//        System.out.println(t.isInterrupted());
//            Thread.sleep(3000);
//        System.out.println(t);
//        System.out.println("Main Thread start");
//        for (int i = 1; i<6;i++){
//            Thread th = new JThread("Fast" + i);
//            th.start();
//            th.join();
//        }
//        System.out.println("main Thread finished");
//
//        Thread myThread = new Thread(new RThread(), "MyRunThread");
//        myThread.start();

//        IThread thread = new IThread();
//        new Thread(thread, "MyThread").start();
//        try {
//            Thread.sleep(1000);
//            thread.disabled();
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.print("Thread interrapt");
//        }
//        UThread t = new UThread("MyThread");
//        t.start();
//        try {
//            Thread.sleep(1500);
//            t.interrupt();
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } }
    }
}
class CommonResourse{
    int x = 0;
}

class CountThread implements Runnable{
    CommonResourse res;

    public CountThread(CommonResourse res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}