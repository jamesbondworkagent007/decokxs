package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class rZP {
    public final float AEQbTJ;
    public final float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public rZP() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rZP copy$default(rZP rzp, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = rzp.AEQbTJ;
        }
        if ((i & 2) != 0) {
            f2 = rzp.KWHzl;
        }
        return rzp.EZpvd(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rZP EZpvd(float f, float f2) {
        return new rZP(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rZP)) {
            return false;
        }
        rZP rzp = (rZP) obj;
        return java.lang.Float.compare(this.AEQbTJ, rzp.AEQbTJ) == 0 && java.lang.Float.compare(this.KWHzl, rzp.KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.AEQbTJ) * 31) + java.lang.Float.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LifecycleRecyclerDivider(marginTop=" + this.AEQbTJ + ", marginBottom=" + this.KWHzl + ")";
    }

    public rZP(float f, float f2) {
        this.AEQbTJ = f;
        this.KWHzl = f2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r2v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r3v0 float))
 A[MD:(float, float):void (m)] (LINE:9) call: o.rZP.<init>(float, float):void type: THIS */
    public /* synthetic */ rZP(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 12.0f : f, (i & 2) != 0 ? 12.0f : f2);
    }
}
