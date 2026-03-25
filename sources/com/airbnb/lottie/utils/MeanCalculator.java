package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes2.dex */
public class MeanCalculator {
    private int n;
    private float sum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getMean() {
        int i = this.n;
        if (i == 0) {
            return 0.0f;
        }
        return this.sum / i;
    }

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int i = this.n + 1;
        this.n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.n = i / 2;
        }
    }
}
