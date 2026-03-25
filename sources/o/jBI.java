package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class jBI {
    public int EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public jBI() {
        int i = 0;
        this(i, i, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jBI copy$default(jBI jbi, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = jbi.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i2 = jbi.EZpvd;
        }
        return jbi.OLrzqt(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBI OLrzqt(int i, int i2) {
        return new jBI(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl == 0 && this.EZpvd == 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBI)) {
            return false;
        }
        jBI jbi = (jBI) obj;
        return this.KWHzl == jbi.KWHzl && this.EZpvd == jbi.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardPaginationData(startRank=" + this.KWHzl + ", endRank=" + this.EZpvd + ")";
    }

    public jBI(int i, int i2) {
        this.KWHzl = i;
        this.EZpvd = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:3) call: o.jBI.<init>(int, int):void type: THIS */
    public /* synthetic */ jBI(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 10 : i2);
    }
}
