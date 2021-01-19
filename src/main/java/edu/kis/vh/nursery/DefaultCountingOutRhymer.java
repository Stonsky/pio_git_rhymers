package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTAL = -1;
    private static final int NUMBERS = 12;
    private static final int CHECK = NUMBERS - 1;
    private int[] NUMBERS = new int[NUMBERS];

    private int total = TOTAL;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return numbers[total--];
    }

}
