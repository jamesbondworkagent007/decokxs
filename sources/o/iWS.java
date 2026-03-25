package o;

import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iWS {
    public final long AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final int gEmmrt;
    public final java.lang.String isConnected;
    public final InvestmentLogoData valueOf;
    public final long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iWS() {
        this(null, null, null, null, null, null, 0L, 0L, null, null, null, false, null, 0, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWS AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InvestmentLogoData investmentLogoData, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j, long j2, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, @NotNull java.lang.String str9, int i, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investmentLogoData, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new iWS(str, str2, str3, investmentLogoData, str4, str5, j, j2, str6, str7, str8, z, str9, i, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentLogoData EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iWS)) {
            return false;
        }
        iWS iws = (iWS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) iws.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) iws.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) iws.isConnected) && Intrinsics.EZpvd(this.valueOf, iws.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) iws.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) iws.EZpvd) && this.values == iws.values && this.AEQbTJ == iws.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) iws.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) iws.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) iws.KWHzl) && this.copydefault == iws.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iws.AhwBna) && this.gEmmrt == iws.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) iws.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.fetchVPNInfo.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Long.hashCode(this.values)) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + this.AYXKKw.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BonusHeaderUiData(title=" + this.fetchVPNInfo + ", descriptionTitle=" + this.OLrzqt + ", total=" + this.isConnected + ", logos=" + this.valueOf + ", sponsorName=" + this.DbNXlk + ", helperInfo=" + this.EZpvd + ", startTime=" + this.values + ", endTime=" + this.AEQbTJ + ", platformLink=" + this.AYXKKw + ", tvl=" + this.AkhnZx + ", certikScore=" + this.KWHzl + ", displaySafeTag=" + this.copydefault + ", seoType=" + this.AhwBna + ", ratingTypeId=" + this.gEmmrt + ", ratingName=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.values;
    }

    public iWS(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InvestmentLogoData investmentLogoData, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j, long j2, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, @NotNull java.lang.String str9, int i, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investmentLogoData, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.fetchVPNInfo = str;
        this.OLrzqt = str2;
        this.isConnected = str3;
        this.valueOf = investmentLogoData;
        this.DbNXlk = str4;
        this.EZpvd = str5;
        this.values = j;
        this.AEQbTJ = j2;
        this.AYXKKw = str6;
        this.AkhnZx = str7;
        this.KWHzl = str8;
        this.copydefault = z;
        this.AhwBna = str9;
        this.gEmmrt = i;
        this.djBIcL = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestmentLogoData:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: CONSTRUCTOR 
  (wrap:java.util.List:0x0022: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED])
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (30 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:97) call: com.okinc.business.invest_biz.data.bean.InvestmentLogoData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.invest_biz.data.bean.InvestmentLogoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r25v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004e: ARITH (r36v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r27v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:0x0083: TERNARY null = ((wrap:int:0x007a: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0085: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r34v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestmentLogoData, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String):void (m)] (LINE:93) call: o.iWS.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestmentLogoData, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ iWS(java.lang.String str, java.lang.String str2, java.lang.String str3, InvestmentLogoData investmentLogoData, java.lang.String str4, java.lang.String str5, long j, long j2, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z, java.lang.String str9, int i, java.lang.String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new InvestmentLogoData(yDY.AhwBna(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null) : investmentLogoData, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? 0L : j, (i2 & 128) == 0 ? j2 : 0L, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) == 0 ? i : 0, (i2 & 16384) != 0 ? "" : str10);
    }
}
