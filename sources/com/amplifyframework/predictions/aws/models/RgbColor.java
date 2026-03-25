package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class RgbColor {
    private final int blue;
    private final int green;
    private final int red;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RgbColor copy$default(RgbColor rgbColor, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rgbColor.red;
        }
        if ((i4 & 2) != 0) {
            i2 = rgbColor.green;
        }
        if ((i4 & 4) != 0) {
            i3 = rgbColor.blue;
        }
        return rgbColor.copy(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.red;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.green;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.blue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor copy(int i, int i2, int i3) {
        return new RgbColor(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RgbColor)) {
            return false;
        }
        RgbColor rgbColor = (RgbColor) obj;
        return this.red == rgbColor.red && this.green == rgbColor.green && this.blue == rgbColor.blue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBlue() {
        return this.blue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGreen() {
        return this.green;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRed() {
        return this.red;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.red) * 31) + Integer.hashCode(this.green)) * 31) + Integer.hashCode(this.blue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RgbColor(red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ")";
    }

    public RgbColor(int i, int i2, int i3) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
    }
}
