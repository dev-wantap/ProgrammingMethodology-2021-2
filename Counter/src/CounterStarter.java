public class CounterStarter {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        new CounterFrame(counter, new Drawing(counter));
    }
}
