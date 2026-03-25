package com.github.mikephil.charting.model;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColor {
    private int endColor;
    private int startColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getEndColor() {
        return this.endColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStartColor() {
        return this.startColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEndColor(int i) {
        this.endColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setStartColor(int i) {
        this.startColor = i;
    }

    public GradientColor(int i, int i2) {
        this.startColor = i;
        this.endColor = i2;
    }
}
