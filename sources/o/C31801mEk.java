package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.mEk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31801mEk {
    public final int EZpvd;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31801mEk() {
        this(0.0f, 0, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31801mEk copy$default(C31801mEk c31801mEk, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            f = c31801mEk.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = c31801mEk.EZpvd;
        }
        return c31801mEk.OLrzqt(f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.copydefault + this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31801mEk OLrzqt(float f, int i) {
        return new C31801mEk(f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31801mEk)) {
            return false;
        }
        C31801mEk c31801mEk = (C31801mEk) obj;
        return java.lang.Float.compare(this.copydefault, c31801mEk.copydefault) == 0 && this.EZpvd == c31801mEk.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ItemInterval(start=" + this.copydefault + ", size=" + this.EZpvd + ")";
    }

    public C31801mEk(float f, int i) {
        this.copydefault = f;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r1v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(float, int):void (m)] (LINE:45) call: o.mEk.<init>(float, int):void type: THIS */
    public /* synthetic */ C31801mEk(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i);
    }

    public final float EZpvd() {
        return this.copydefault + (this.EZpvd / 2);
    }
}
