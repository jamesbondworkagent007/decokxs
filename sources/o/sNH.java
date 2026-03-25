package o;

import com.okinc.okimcore.model.im.GetMessageDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNH {
    public final GetMessageDirection AEQbTJ;
    public final java.lang.Long AhwBna;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.Boolean copydefault;
    public final boolean djBIcL;
    public final long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetMessageDirection AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sNH AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, boolean z, long j, java.lang.Boolean bool, @NotNull GetMessageDirection getMessageDirection, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getMessageDirection, "");
        return new sNH(str, l, z, j, bool, getMessageDirection, i, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sNH)) {
            return false;
        }
        sNH snh = (sNH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) snh.KWHzl) && Intrinsics.EZpvd(this.AhwBna, snh.AhwBna) && this.djBIcL == snh.djBIcL && this.gEmmrt == snh.gEmmrt && Intrinsics.EZpvd(this.copydefault, snh.copydefault) && this.AEQbTJ == snh.AEQbTJ && this.OLrzqt == snh.OLrzqt && this.EZpvd == snh.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.Long l = this.AhwBna;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode4 = java.lang.Long.hashCode(this.gEmmrt);
        java.lang.Boolean bool = this.copydefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMessageRequest(channelId=" + this.KWHzl + ", messageId=" + this.AhwBna + ", needToGetNextUnread=" + this.djBIcL + ", total=" + this.gEmmrt + ", asc=" + this.copydefault + ", direction=" + this.AEQbTJ + ", loadCountIfNotEnoughMessage=" + this.OLrzqt + ", loadMoreWithSchedule=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.djBIcL;
    }

    public sNH(@NotNull java.lang.String str, java.lang.Long l, boolean z, long j, java.lang.Boolean bool, @NotNull GetMessageDirection getMessageDirection, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getMessageDirection, "");
        this.KWHzl = str;
        this.AhwBna = l;
        this.djBIcL = z;
        this.gEmmrt = j;
        this.copydefault = bool;
        this.AEQbTJ = getMessageDirection;
        this.OLrzqt = i;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.Long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (r17v0 long)
  (r19v0 java.lang.Boolean)
  (r20v0 com.okinc.okimcore.model.im.GetMessageDirection)
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r21v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
 A[MD:(java.lang.String, java.lang.Long, boolean, long, java.lang.Boolean, com.okinc.okimcore.model.im.GetMessageDirection, int, boolean):void (m)] (LINE:7) call: o.sNH.<init>(java.lang.String, java.lang.Long, boolean, long, java.lang.Boolean, com.okinc.okimcore.model.im.GetMessageDirection, int, boolean):void type: THIS */
    public /* synthetic */ sNH(java.lang.String str, java.lang.Long l, boolean z, long j, java.lang.Boolean bool, GetMessageDirection getMessageDirection, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i2 & 4) != 0 ? false : z, j, bool, getMessageDirection, (i2 & 64) != 0 ? 100 : i, (i2 & 128) != 0 ? false : z2);
    }

    public final sNO AYXKKw() {
        return new sNO(this.KWHzl, this.AhwBna, this.gEmmrt, this.copydefault, this.AEQbTJ == GetMessageDirection.TOP, this.OLrzqt, this.EZpvd);
    }
}
