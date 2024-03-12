package lezione7.liste;

public abstract class List {

    private int value;
    private List next;

    public abstract void add( int n);
    public abstract int get(int n);
    public abstract int length();



}
