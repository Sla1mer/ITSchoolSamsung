package Module_3;

public class UThread extends Thread {

    public UThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started \n", Thread.currentThread().getName());
        int count = 1;
        while (!isInterrupted()){
            System.out.println(count++);
        }
        System.out.printf("%s finished \n", Thread.currentThread().getName());

    }
}
