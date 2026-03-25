package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class oUI {
    public long AEQbTJ;
    public long EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oUI() {
        this(0, 0L, 0L, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oUI copy$default(oUI oui, int i, long j, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = oui.KWHzl;
        }
        if ((i2 & 2) != 0) {
            j = oui.AEQbTJ;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = oui.EZpvd;
        }
        return oui.KWHzl(i, j3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUI KWHzl(int i, long j, long j2) {
        return new oUI(i, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.EZpvd = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oUI)) {
            return false;
        }
        oUI oui = (oUI) obj;
        return this.KWHzl == oui.KWHzl && this.AEQbTJ == oui.AEQbTJ && this.EZpvd == oui.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FastKLineBean(index=" + this.KWHzl + ", selectTime=" + this.AEQbTJ + ", startTime=" + this.EZpvd + ")";
    }

    public oUI(int i, long j, long j2) {
        this.KWHzl = i;
        this.AEQbTJ = j;
        this.EZpvd = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r6v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000e: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r8v0 long))
 A[MD:(int, long, long):void (m)] (LINE:14) call: o.oUI.<init>(int, long, long):void type: THIS */
    public /* synthetic */ oUI(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? -1L : j, (i2 & 4) != 0 ? -1L : j2);
    }
}
