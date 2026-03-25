package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXY {
    private float scaleX;
    private float scaleY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(float f, float f2) {
        return this.scaleX == f && this.scaleY == f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getScaleX() {
        return this.scaleX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getScaleY() {
        return this.scaleY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void set(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public ScaleXY(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }
}
