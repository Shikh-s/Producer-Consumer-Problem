
public class ConsumerThread extends Thread{
    Company c;
    ConsumerThread(Company c){
        this.c=c;
    }

    public void run() {
        while(true) {
            this.c.consume_item();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
