package com.okinc.liveness.lca.data;

/* JADX INFO: loaded from: classes19.dex */
public final class RgbColor {
    public static final int $stable = 0;
    private final int alpha;
    private final int blue;
    private final int green;
    private final int red;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RgbColor copy$default(RgbColor rgbColor, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = rgbColor.red;
        }
        if ((i5 & 2) != 0) {
            i2 = rgbColor.green;
        }
        if ((i5 & 4) != 0) {
            i3 = rgbColor.blue;
        }
        if ((i5 & 8) != 0) {
            i4 = rgbColor.alpha;
        }
        return rgbColor.copy(i, i2, i3, i4);
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
    public final int component4() {
        return this.alpha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor copy(int i, int i2, int i3, int i4) {
        return new RgbColor(i, i2, i3, i4);
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
        return this.red == rgbColor.red && this.green == rgbColor.green && this.blue == rgbColor.blue && this.alpha == rgbColor.alpha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAlpha() {
        return this.alpha;
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
        return (((((Integer.hashCode(this.red) * 31) + Integer.hashCode(this.green)) * 31) + Integer.hashCode(this.blue)) * 31) + Integer.hashCode(this.alpha);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RgbColor(red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ", alpha=" + this.alpha + ")";
    }

    public RgbColor(int i, int i2, int i3, int i4) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
        this.alpha = i4;
    }
}
