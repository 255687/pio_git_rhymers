package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MIN = -1;
    public static final int MAX = 11;
    private final int[] NUMBERS    = new int[12];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MIN;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return MIN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MIN;
        return NUMBERS[total--];
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
