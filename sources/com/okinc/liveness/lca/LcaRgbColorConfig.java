package com.okinc.liveness.lca;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaRgbColorConfig {
    public static final int $stable = 0;
    public final int alpha;
    public final int blue;
    public final int green;
    public final int red;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaRgbColorConfig copy$default(LcaRgbColorConfig lcaRgbColorConfig, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = lcaRgbColorConfig.red;
        }
        if ((i5 & 2) != 0) {
            i2 = lcaRgbColorConfig.green;
        }
        if ((i5 & 4) != 0) {
            i3 = lcaRgbColorConfig.blue;
        }
        if ((i5 & 8) != 0) {
            i4 = lcaRgbColorConfig.alpha;
        }
        return lcaRgbColorConfig.copy(i, i2, i3, i4);
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
    public final LcaRgbColorConfig copy(int i, int i2, int i3, int i4) {
        return new LcaRgbColorConfig(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaRgbColorConfig)) {
            return false;
        }
        LcaRgbColorConfig lcaRgbColorConfig = (LcaRgbColorConfig) obj;
        return this.red == lcaRgbColorConfig.red && this.green == lcaRgbColorConfig.green && this.blue == lcaRgbColorConfig.blue && this.alpha == lcaRgbColorConfig.alpha;
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
        return "LcaRgbColorConfig(red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ", alpha=" + this.alpha + ")";
    }

    public LcaRgbColorConfig(int i, int i2, int i3, int i4) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
        this.alpha = i4;
    }
}
