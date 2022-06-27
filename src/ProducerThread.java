
public class ProducerThread extends Thread{
        Company c;
        ProducerThread(Company c){
            this.c=c;
            
        }
    public void run() {
            int i=1;
            while(true){
                this.c.produce_item(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
    }
}
