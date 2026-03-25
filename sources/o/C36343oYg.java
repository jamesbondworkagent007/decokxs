package o;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.oYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36343oYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final int AEQbTJ = new java.security.SecureRandom().nextInt(620);
    public final int AYXKKw;
    public final RectF AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public final RectF copydefault;
    public final float djBIcL;
    public final float gEmmrt;
    public final int isConnected;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36343oYg copy$default(C36343oYg c36343oYg, float f, float f2, int i, int i2, float f3, float f4, float f5, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            f = c36343oYg.valueOf;
        }
        if ((i3 & 2) != 0) {
            f2 = c36343oYg.gEmmrt;
        }
        float f6 = f2;
        if ((i3 & 4) != 0) {
            i = c36343oYg.AYXKKw;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c36343oYg.isConnected;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f3 = c36343oYg.djBIcL;
        }
        float f7 = f3;
        if ((i3 & 32) != 0) {
            f4 = c36343oYg.EZpvd;
        }
        float f8 = f4;
        if ((i3 & 64) != 0) {
            f5 = c36343oYg.KWHzl;
        }
        return c36343oYg.AEQbTJ(f, f6, i4, i5, f7, f8, f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36343oYg AEQbTJ(float f, float f2, int i, int i2, float f3, float f4, float f5) {
        return new C36343oYg(f, f2, i, i2, f3, f4, f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AYXKKw * 310) + this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PixelPoint(x=" + this.valueOf + ", y=" + this.gEmmrt + ", xIndex=" + this.AYXKKw + ", yIndex=" + this.isConnected + ", width=" + this.djBIcL + ", pixelWidth=" + this.EZpvd + ", dividerWidth=" + this.KWHzl + ")";
    }

    public C36343oYg(float f, float f2, int i, int i2, float f3, float f4, float f5) {
        this.valueOf = f;
        this.gEmmrt = f2;
        this.AYXKKw = i;
        this.isConnected = i2;
        this.djBIcL = f3;
        this.EZpvd = f4;
        this.KWHzl = f5;
        float f6 = f + f3;
        float f7 = f3 + f2;
        this.copydefault = new RectF(f + f5, f5 + f2, f6, f7);
        this.AhwBna = new RectF(f, f2, f6, f7);
    }

    /* JADX INFO: renamed from: o.oYg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oYg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C36343oYg) {
            C36343oYg c36343oYg = (C36343oYg) obj;
            if (c36343oYg.AYXKKw == this.AYXKKw && c36343oYg.isConnected == this.isConnected) {
                return true;
            }
        }
        return false;
    }

    public final int copydefault(java.lang.Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            int i = this.AEQbTJ;
            int i2 = iIntValue - i;
            if (i2 < 0) {
                return 0;
            }
            if (i2 > i + 80) {
                return oXN.KWHzl.copydefault();
            }
            float f = (i2 % 80) / 80;
            double d = f;
            if (d < 0.25d) {
                return oXN.KWHzl.KWHzl();
            }
            if (d < 0.5d) {
                return 0;
            }
            if (d < 0.75d) {
                return oXN.KWHzl.AEQbTJ();
            }
            if (f < 1.0f) {
                return 0;
            }
            return oXN.KWHzl.copydefault();
        }
        return oXN.KWHzl.copydefault();
    }
}
