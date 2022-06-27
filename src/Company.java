
//user synchronization using synchronized keyword and inter-thread communication using wait() and notify() methods
public class Company {
    int n;
    // when producer have chance : false
    //when consumer have chance : true
    boolean chance=false;
    synchronized public void produce_item(int n){
        if(chance){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("Produced : " + this.n);
        chance=true;
        notify();
    }
    synchronized public int consume_item(){
        if(!chance){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : " + this.n);
        chance=false;
        notify();
        return this.n;

    }
}
