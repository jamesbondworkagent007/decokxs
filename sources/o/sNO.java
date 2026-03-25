package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNO {
    public final java.lang.Boolean AEQbTJ;
    public final int EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.Long djBIcL;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sNO EZpvd(@NotNull java.lang.String str, java.lang.Long l, long j, java.lang.Boolean bool, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new sNO(str, l, j, bool, z, i, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sNO)) {
            return false;
        }
        sNO sno = (sNO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) sno.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, sno.djBIcL) && this.valueOf == sno.valueOf && Intrinsics.EZpvd(this.AEQbTJ, sno.AEQbTJ) && this.copydefault == sno.copydefault && this.EZpvd == sno.EZpvd && this.KWHzl == sno.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.Long l = this.djBIcL;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        int iHashCode3 = java.lang.Long.hashCode(this.valueOf);
        java.lang.Boolean bool = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoadMessageRequest(channelId=" + this.OLrzqt + ", messageId=" + this.djBIcL + ", total=" + this.valueOf + ", asc=" + this.AEQbTJ + ", loadMoreOnTop=" + this.copydefault + ", loadCountIfNotEnoughMessage=" + this.EZpvd + ", loadMoreWithSchedule=" + this.KWHzl + ")";
    }

    public sNO(@NotNull java.lang.String str, java.lang.Long l, long j, java.lang.Boolean bool, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.djBIcL = l;
        this.valueOf = j;
        this.AEQbTJ = bool;
        this.copydefault = z;
        this.EZpvd = i;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.Long)
  (r13v0 long)
  (r15v0 java.lang.Boolean)
  (r16v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r17v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
 A[MD:(java.lang.String, java.lang.Long, long, java.lang.Boolean, boolean, int, boolean):void (m)] (LINE:3) call: o.sNO.<init>(java.lang.String, java.lang.Long, long, java.lang.Boolean, boolean, int, boolean):void type: THIS */
    public /* synthetic */ sNO(java.lang.String str, java.lang.Long l, long j, java.lang.Boolean bool, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, j, bool, z, (i2 & 32) != 0 ? 100 : i, (i2 & 64) != 0 ? false : z2);
    }
}
