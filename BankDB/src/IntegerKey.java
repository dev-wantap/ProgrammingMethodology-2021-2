public class IntegerKey implements Key {

    private int k;

    public IntegerKey(int i) {
        k = i;
    }

    public boolean equals(Key c) {
        return k == ((IntegerKey)c).getInt();
    }

    public int getInt() {
        return k;
    }
}
