package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes21.dex */
public final class AgeRange {
    private final int high;
    private final int low;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean contains(int i) {
        return i >= this.low && i <= this.high;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getHigh() {
        return this.high;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLow() {
        return this.low;
    }

    public AgeRange(int i, int i2) {
        if (i2 < i) {
            throw new IllegalArgumentException("Low cannot be higher than High.");
        }
        this.low = i;
        this.high = i2;
    }
}
