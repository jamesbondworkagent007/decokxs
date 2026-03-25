package com.github.mikephil.charting.highlight;

/* JADX INFO: loaded from: classes2.dex */
public final class Range {
    public float from;
    public float to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean contains(float f) {
        return f > this.from && f <= this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLarger(float f) {
        return f > this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSmaller(float f) {
        return f < this.from;
    }

    public Range(float f, float f2) {
        this.from = f;
        this.to = f2;
    }
}
