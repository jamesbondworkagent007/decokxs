package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class rXZ {
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public rXZ() {
        int i = 0;
        this(i, i, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rXZ copy$default(rXZ rxz, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = rxz.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            i2 = rxz.copydefault;
        }
        return rxz.OLrzqt(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rXZ OLrzqt(int i, int i2) {
        return new rXZ(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rXZ)) {
            return false;
        }
        rXZ rxz = (rXZ) obj;
        return this.OLrzqt == rxz.OLrzqt && this.copydefault == rxz.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnreadMessageCount(count=" + this.OLrzqt + ", notUsed=" + this.copydefault + ")";
    }

    public rXZ(int i, int i2) {
        this.OLrzqt = i;
        this.copydefault = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:21) call: o.rXZ.<init>(int, int):void type: THIS */
    public /* synthetic */ rXZ(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final java.lang.String OLrzqt() {
        int i = this.OLrzqt;
        return i > 99 ? "99+" : java.lang.String.valueOf(i);
    }
}
