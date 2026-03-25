package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27370jts extends AbstractC27371jtt {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final InvestedToken AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final boolean EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fIwbmz;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final int isConnected;
    public final long valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27370jts() {
        this(null, 0L, null, null, 0, null, null, null, null, false, null, null, null, null, 0L, null, false, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public long AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27370jts KWHzl(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, @NotNull java.lang.String str8, InvestedToken investedToken, @NotNull java.lang.String str9, @NotNull java.lang.String str10, long j2, @NotNull java.lang.String str11, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new C27370jts(str, j, str2, str3, i, str4, str5, str6, str7, z, str8, investedToken, str9, str10, j2, str11, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public InvestedToken djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27370jts)) {
            return false;
        }
        C27370jts c27370jts = (C27370jts) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27370jts.AYXKKw) && this.valueOf == c27370jts.valueOf && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27370jts.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c27370jts.fetchVPNInfo) && this.isConnected == c27370jts.isConnected && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c27370jts.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c27370jts.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c27370jts.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27370jts.AEQbTJ) && this.EZpvd == c27370jts.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27370jts.djBIcL) && Intrinsics.EZpvd(this.AhwBna, c27370jts.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c27370jts.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c27370jts.AkhnZx) && this.KWHzl == c27370jts.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27370jts.copydefault) && this.gEmmrt == c27370jts.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.valueOf);
        int iHashCode3 = this.DbNXlk.hashCode();
        int iHashCode4 = this.fetchVPNInfo.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.isConnected);
        int iHashCode6 = this.fIwbmz.hashCode();
        int iHashCode7 = this.AuCTel.hashCode();
        int iHashCode8 = this.OLrzqt.hashCode();
        int iHashCode9 = this.AEQbTJ.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode11 = this.djBIcL.hashCode();
        InvestedToken investedToken = this.AhwBna;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (investedToken == null ? 0 : investedToken.hashCode())) * 31) + this.values.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public java.lang.String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProtocolAssetItem(investmentName=" + this.AYXKKw + ", investmentId=" + this.valueOf + ", totalEarnings=" + this.DbNXlk + ", totalEarningsValue=" + this.fetchVPNInfo + ", itemType=" + this.isConnected + ", totalValue=" + this.fIwbmz + ", totalValueShow=" + this.AuCTel + ", coinAmount=" + this.OLrzqt + ", coinAmountValue=" + this.AEQbTJ + ", coinAmountShowEnable=" + this.EZpvd + ", investmentClassify=" + this.djBIcL + ", investedToken=" + this.AhwBna + ", protocolName=" + this.values + ", protocolUrl=" + this.AkhnZx + ", chainId=" + this.KWHzl + ", feeRate=" + this.copydefault + ", feeRateShowEnable=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27371jtt
    public int values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.response.InvestedToken:?: TERNARY null = ((wrap:int:0x005d: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.InvestedToken) : (r33v0 com.okinc.business.invest_biz.data.bean.response.InvestedToken))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x0078: TERNARY null = ((wrap:int:0x006f: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x007a: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r36v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (32768 int) & (r40v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0090: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.response.InvestedToken, java.lang.String, java.lang.String, long, java.lang.String, boolean):void (m)] (LINE:84) call: o.jts.<init>(java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.response.InvestedToken, java.lang.String, java.lang.String, long, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C27370jts(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, java.lang.String str8, InvestedToken investedToken, java.lang.String str9, java.lang.String str10, long j2, java.lang.String str11, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? null : investedToken, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? "" : str10, (i2 & 16384) != 0 ? 0L : j2, (32768 & i2) != 0 ? "" : str11, (i2 & 65536) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27370jts(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, @NotNull java.lang.String str8, InvestedToken investedToken, @NotNull java.lang.String str9, @NotNull java.lang.String str10, long j2, @NotNull java.lang.String str11, boolean z2) {
        super(str, j, str2, str3, i, str4, str5, str6, str7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15872, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.AYXKKw = str;
        this.valueOf = j;
        this.DbNXlk = str2;
        this.fetchVPNInfo = str3;
        this.isConnected = i;
        this.fIwbmz = str4;
        this.AuCTel = str5;
        this.OLrzqt = str6;
        this.AEQbTJ = str7;
        this.EZpvd = z;
        this.djBIcL = str8;
        this.AhwBna = investedToken;
        this.values = str9;
        this.AkhnZx = str10;
        this.KWHzl = j2;
        this.copydefault = str11;
        this.gEmmrt = z2;
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27370jts c27370jts = interfaceC27436jvE instanceof C27370jts ? (C27370jts) interfaceC27436jvE : null;
        return c27370jts != null && Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) c27370jts.gEmmrt()) && AYXKKw() == c27370jts.AYXKKw() && AEQbTJ() == c27370jts.AEQbTJ() && Intrinsics.EZpvd((java.lang.Object) AkhnZx(), (java.lang.Object) c27370jts.AkhnZx());
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27370jts c27370jts = interfaceC27436jvE instanceof C27370jts ? (C27370jts) interfaceC27436jvE : null;
        return c27370jts != null && Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) c27370jts.gEmmrt()) && AYXKKw() == c27370jts.AYXKKw() && Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) c27370jts.isConnected()) && Intrinsics.EZpvd((java.lang.Object) DbNXlk(), (java.lang.Object) c27370jts.DbNXlk()) && values() == c27370jts.values() && Intrinsics.EZpvd((java.lang.Object) fJNWhG(), (java.lang.Object) c27370jts.fJNWhG()) && Intrinsics.EZpvd((java.lang.Object) KWHzl(), (java.lang.Object) c27370jts.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27370jts.djBIcL) && Intrinsics.EZpvd(djBIcL(), c27370jts.djBIcL());
    }
}
