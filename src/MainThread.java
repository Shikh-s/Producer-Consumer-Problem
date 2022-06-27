public class MainThread {
    public static void main(String[] args) {
        Company comp = new Company();
        ProducerThread p = new ProducerThread(comp);
        ConsumerThread c= new ConsumerThread(comp);
        p.start();
        c.start();
        
    }
}
