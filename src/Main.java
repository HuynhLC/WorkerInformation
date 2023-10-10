
import controller.Manager;



public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Add worker.", "Increase salary for worker.", "Decrease for worker.", "Show adjusted salary worker information."};
        Manager w = new Manager("====== WORKER MANAGEMENT =======", mChon,"Exit.");
        w.run();
        }
}
