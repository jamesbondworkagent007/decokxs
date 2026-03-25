package o;

import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jAZ {
    public final long AEQbTJ;
    public final boolean AYXKKw;
    public final long AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<TagWrapper> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jAZ() {
        this(null, false, null, null, false, 0L, 0L, null, null, null, false, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jAZ copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, long j, long j2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z3, @NotNull java.util.List<TagWrapper> list, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new jAZ(str, z, str2, str3, z2, j, j2, str4, str5, str6, z3, list, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jAZ)) {
            return false;
        }
        jAZ jaz = (jAZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jaz.copydefault) && this.EZpvd == jaz.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) jaz.values) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) jaz.DbNXlk) && this.AYXKKw == jaz.AYXKKw && this.AEQbTJ == jaz.AEQbTJ && this.AhwBna == jaz.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) jaz.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) jaz.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) jaz.AkhnZx) && this.OLrzqt == jaz.OLrzqt && Intrinsics.EZpvd(this.djBIcL, jaz.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) jaz.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.values.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.AhwBna)) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.djBIcL.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackingAddress(alias=" + this.copydefault + ", hasAlias=" + this.EZpvd + ", targetAddress=" + this.values + ", walletAddress=" + this.DbNXlk + ", isFollowing=" + this.AYXKKw + ", collectTime=" + this.AEQbTJ + ", lastTxTime=" + this.AhwBna + ", sevenDayPnl=" + this.gEmmrt + ", sevenDayPnlPercentage=" + this.valueOf + ", sevenDayTxs=" + this.AkhnZx + ", hasAlert=" + this.OLrzqt + ", newTagList=" + this.djBIcL + ", emoji=" + this.KWHzl + ")";
    }

    public jAZ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, long j, long j2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z3, @NotNull java.util.List<TagWrapper> list, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.copydefault = str;
        this.EZpvd = z;
        this.values = str2;
        this.DbNXlk = str3;
        this.AYXKKw = z2;
        this.AEQbTJ = j;
        this.AhwBna = j2;
        this.gEmmrt = str4;
        this.valueOf = str5;
        this.AkhnZx = str6;
        this.OLrzqt = z3;
        this.djBIcL = list;
        this.KWHzl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : false)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r30v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, boolean, long, long, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>, java.lang.String):void (m)] (LINE:5) call: o.jAZ.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, boolean, long, long, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ jAZ(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, boolean z2, long j, long j2, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z3, java.util.List list, java.lang.String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) == 0 ? z3 : false, (i & 2048) != 0 ? yDY.AhwBna() : list, (i & 4096) == 0 ? str7 : "");
    }
}
