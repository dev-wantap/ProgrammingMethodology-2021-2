public class Counter {
    private int count;

    public Counter(int initial) {
        count = initial;
    }

    public void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
