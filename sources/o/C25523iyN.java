package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25523iyN {
    public final java.lang.Long AEQbTJ;
    public final int AYXKKw;
    public final C25477ixU EZpvd;
    public final java.util.List<java.lang.Long> KWHzl;
    public final long OLrzqt;
    public final boolean copydefault;
    public final java.lang.Long gEmmrt;
    public final java.util.List<InvestUserRewardElementInfo> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestUserRewardElementInfo> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25477ixU EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25523iyN copydefault(long j, int i, @NotNull java.util.List<InvestUserRewardElementInfo> list, boolean z, java.lang.Long l, java.lang.Long l2, @NotNull java.util.List<java.lang.Long> list2, C25477ixU c25477ixU) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C25523iyN(j, i, list, z, l, l2, list2, c25477ixU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25523iyN)) {
            return false;
        }
        C25523iyN c25523iyN = (C25523iyN) obj;
        return this.OLrzqt == c25523iyN.OLrzqt && this.AYXKKw == c25523iyN.AYXKKw && Intrinsics.EZpvd(this.valueOf, c25523iyN.valueOf) && this.copydefault == c25523iyN.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c25523iyN.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, c25523iyN.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c25523iyN.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c25523iyN.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.OLrzqt);
        int iHashCode2 = java.lang.Integer.hashCode(this.AYXKKw);
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.Long l = this.AEQbTJ;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.gEmmrt;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        int iHashCode7 = this.KWHzl.hashCode();
        C25477ixU c25477ixU = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c25477ixU != null ? c25477ixU.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClaimRequestParams(chainId=" + this.OLrzqt + ", orderType=" + this.AYXKKw + ", rewards=" + this.valueOf + ", isClaimAvailableRewards=" + this.copydefault + ", analysisPlatformId=" + this.AEQbTJ + ", sourceInvestmentId=" + this.gEmmrt + ", investmentIds=" + this.KWHzl + ", batchClaimParam=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.copydefault;
    }

    public C25523iyN(long j, int i, @NotNull java.util.List<InvestUserRewardElementInfo> list, boolean z, java.lang.Long l, java.lang.Long l2, @NotNull java.util.List<java.lang.Long> list2, C25477ixU c25477ixU) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = j;
        this.AYXKKw = i;
        this.valueOf = list;
        this.copydefault = z;
        this.AEQbTJ = l;
        this.gEmmrt = l2;
        this.KWHzl = list2;
        this.EZpvd = c25477ixU;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r13v0 long)
  (r15v0 int)
  (r16v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:119)) : (r20v0 java.util.List))
  (wrap:o.ixU:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null o.ixU) : (r21v0 o.ixU))
 A[MD:(long, int, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo>, boolean, java.lang.Long, java.lang.Long, java.util.List<java.lang.Long>, o.ixU):void (m)] (LINE:112) call: o.iyN.<init>(long, int, java.util.List, boolean, java.lang.Long, java.lang.Long, java.util.List, o.ixU):void type: THIS */
    public /* synthetic */ C25523iyN(long j, int i, java.util.List list, boolean z, java.lang.Long l, java.lang.Long l2, java.util.List list2, C25477ixU c25477ixU, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, list, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? yDY.AhwBna() : list2, (i2 & 128) != 0 ? null : c25477ixU);
    }
}
