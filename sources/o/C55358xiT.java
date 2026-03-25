package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55358xiT {
    public final int AEQbTJ;
    public final long EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55358xiT() {
        this(0L, 0, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55358xiT copy$default(C55358xiT c55358xiT, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = c55358xiT.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i = c55358xiT.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            i2 = c55358xiT.KWHzl;
        }
        return c55358xiT.copydefault(j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55358xiT copydefault(long j, @androidx.annotation.ColorRes int i, @androidx.annotation.ColorRes int i2) {
        return new C55358xiT(j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55358xiT)) {
            return false;
        }
        C55358xiT c55358xiT = (C55358xiT) obj;
        return this.EZpvd == c55358xiT.EZpvd && this.AEQbTJ == c55358xiT.AEQbTJ && this.KWHzl == c55358xiT.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKShimmerConfig(duration=" + this.EZpvd + ", baseColor=" + this.AEQbTJ + ", highlightColor=" + this.KWHzl + ")";
    }

    public C55358xiT(long j, @androidx.annotation.ColorRes int i, @androidx.annotation.ColorRes int i2) {
        this.EZpvd = j;
        this.AEQbTJ = i;
        this.KWHzl = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2000 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[MD:():int (m), WRAPPED] (LINE:37) o.xjc.KWHzl int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0012: SGET  A[MD:():int (m), WRAPPED] (LINE:38) o.xjc.OLrzqt int) : (r4v0 int))
 A[MD:(long, int, int):void (m)] (LINE:35) call: o.xiT.<init>(long, int, int):void type: THIS */
    /* JADX DEBUG: Class process forced to load method for inline: o.xjc.EZpvd():int */
    public /* synthetic */ C55358xiT(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2000L : j, (i3 & 2) != 0 ? C55420xjc.KWHzl : i, (i3 & 4) != 0 ? C55420xjc.OLrzqt : i2);
    }
}
