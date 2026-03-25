package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26502jdY {
    public final java.util.List<InterfaceC27436jvE> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final java.lang.String AkhnZx;
    public final long EZpvd;
    public final java.util.List<C27390juL> KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;
    public final InvestTipInfoVo djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26502jdY() {
        this(0L, 0L, null, null, null, 0L, 0L, null, null, false, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26502jdY AEQbTJ(long j, long j2, @NotNull java.lang.String str, @NotNull java.util.List<C27390juL> list, @NotNull java.util.List<? extends InterfaceC27436jvE> list2, long j3, long j4, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C26502jdY(j, j2, str, list, list2, j3, j4, str2, str3, z, investTipInfoVo, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC27436jvE> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27390juL> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26502jdY)) {
            return false;
        }
        C26502jdY c26502jdY = (C26502jdY) obj;
        return this.EZpvd == c26502jdY.EZpvd && this.OLrzqt == c26502jdY.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c26502jdY.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, c26502jdY.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c26502jdY.AEQbTJ) && this.valueOf == c26502jdY.valueOf && this.AhwBna == c26502jdY.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c26502jdY.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c26502jdY.copydefault) && this.gEmmrt == c26502jdY.gEmmrt && Intrinsics.EZpvd(this.djBIcL, c26502jdY.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c26502jdY.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Long.hashCode(this.OLrzqt);
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = java.lang.Long.hashCode(this.valueOf);
        int iHashCode7 = java.lang.Long.hashCode(this.AhwBna);
        int iHashCode8 = this.AkhnZx.hashCode();
        int iHashCode9 = this.copydefault.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.gEmmrt);
        InvestTipInfoVo investTipInfoVo = this.djBIcL;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode())) * 31) + this.fetchVPNInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProductDetailsBonusInfo(bonusStartTime=" + this.EZpvd + ", bonusEndTime=" + this.OLrzqt + ", description=" + this.AYXKKw + ", apyInfos=" + this.KWHzl + ", bonusInfos=" + this.AEQbTJ + ", expiry=" + this.valueOf + ", startTime=" + this.AhwBna + ", totalRewards=" + this.AkhnZx + ", dailyCoinAmount=" + this.copydefault + ", hasStarted=" + this.gEmmrt + ", tipInfo=" + this.djBIcL + ", totalTitle=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends o.jvE> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26502jdY(long j, long j2, @NotNull java.lang.String str, @NotNull java.util.List<C27390juL> list, @NotNull java.util.List<? extends InterfaceC27436jvE> list2, long j3, long j4, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = j;
        this.OLrzqt = j2;
        this.AYXKKw = str;
        this.KWHzl = list;
        this.AEQbTJ = list2;
        this.valueOf = j3;
        this.AhwBna = j4;
        this.AkhnZx = str2;
        this.copydefault = str3;
        this.gEmmrt = z;
        this.djBIcL = investTipInfoVo;
        this.fetchVPNInfo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001e: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:237)) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0029: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:238)) : (r23v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0034: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r33v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r26v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r30v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r31v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
 A[MD:(long, long, java.lang.String, java.util.List<o.juL>, java.util.List<? extends o.jvE>, long, long, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void (m)] (LINE:233) call: o.jdY.<init>(long, long, java.lang.String, java.util.List, java.util.List, long, long, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void type: THIS */
    public /* synthetic */ C26502jdY(long j, long j2, java.lang.String str, java.util.List list, java.util.List list2, long j3, long j4, java.lang.String str2, java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? 0L : j3, (i & 64) == 0 ? j4 : 0L, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? null : investTipInfoVo, (i & 2048) != 0 ? "" : str4);
    }
}
