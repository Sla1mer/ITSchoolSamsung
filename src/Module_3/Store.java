package Module_3;

public class Store {
    private int product = 0;
    public synchronized void get(){
        while (product<1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            product--;
            System.out.println("Buyer bought one item");
            System.out.println("Quantity of goods in stock" + product);
    }

    public synchronized void put(){
        while (product>=3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            product++;
            System.out.println("Producer added one product");
            System.out.println("Quantity of goods in stock" + product);
            notify();
    }
}
