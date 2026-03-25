package o;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26589jfF implements InterfaceC27436jvE {
    public final long AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final TokenInvestDetail EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Long OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInvestDetail KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26589jfF KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, java.lang.Long l, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C26589jfF(j, str, str2, str3, tokenInvestDetail, z, z2, l, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26589jfF)) {
            return false;
        }
        C26589jfF c26589jfF = (C26589jfF) obj;
        return this.AEQbTJ == c26589jfF.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c26589jfF.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c26589jfF.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26589jfF.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c26589jfF.EZpvd) && this.copydefault == c26589jfF.copydefault && this.AhwBna == c26589jfF.AhwBna && Intrinsics.EZpvd(this.OLrzqt, c26589jfF.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c26589jfF.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.AEQbTJ);
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        TokenInvestDetail tokenInvestDetail = this.EZpvd;
        int iHashCode5 = tokenInvestDetail == null ? 0 : tokenInvestDetail.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode7 = java.lang.Boolean.hashCode(this.AhwBna);
        java.lang.Long l = this.OLrzqt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DefiRecommendTokenInfo(investmentId=" + this.AEQbTJ + ", leftTitle=" + this.valueOf + ", rightTitle=" + this.djBIcL + ", investLogo=" + this.KWHzl + ", investDetail=" + this.EZpvd + ", hasMultipleProtocols=" + this.copydefault + ", isMoreOffer=" + this.AhwBna + ", chainId=" + this.OLrzqt + ", tvl=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C26589jfF(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, java.lang.Long l, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AEQbTJ = j;
        this.valueOf = str;
        this.djBIcL = str2;
        this.KWHzl = str3;
        this.EZpvd = tokenInvestDetail;
        this.copydefault = z;
        this.AhwBna = z2;
        this.OLrzqt = l;
        this.AYXKKw = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (r15v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.TokenInvestDetail:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.TokenInvestDetail) : (r20v0 com.okinc.business.invest_biz.data.bean.TokenInvestDetail))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.TokenInvestDetail, boolean, boolean, java.lang.Long, java.lang.String):void (m)] (LINE:30) call: o.jfF.<init>(long, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.TokenInvestDetail, boolean, boolean, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C26589jfF(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, java.lang.Long l, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : tokenInvestDetail, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : l, (i & 256) != 0 ? "" : str4);
    }
}
