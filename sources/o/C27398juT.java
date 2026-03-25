package o;

import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.RateType;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27398juT {
    public final C23949iPh AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final RateType AkhnZx;
    public final java.lang.String EZpvd;
    public final java.util.List<InvestKLineDataPoint> KWHzl;
    public final boolean OLrzqt;
    public final ChartInterval copydefault;
    public final java.lang.String djBIcL;
    public final int fetchVPNInfo;
    public final int gEmmrt;
    public final int isConnected;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartInterval AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateType AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23949iPh EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestKLineDataPoint> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27398juT copydefault(@NotNull ChartInterval chartInterval, @NotNull C23949iPh c23949iPh, boolean z, @NotNull java.util.List<InvestKLineDataPoint> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, int i2, int i3, boolean z2, boolean z3, @NotNull RateType rateType) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        Intrinsics.checkNotNullParameter(c23949iPh, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        return new C27398juT(chartInterval, c23949iPh, z, list, str, str2, i, str3, i2, i3, z2, z3, rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27398juT)) {
            return false;
        }
        C27398juT c27398juT = (C27398juT) obj;
        return this.copydefault == c27398juT.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c27398juT.AEQbTJ) && this.AhwBna == c27398juT.AhwBna && Intrinsics.EZpvd(this.KWHzl, c27398juT.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27398juT.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27398juT.AYXKKw) && this.gEmmrt == c27398juT.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27398juT.djBIcL) && this.isConnected == c27398juT.isConnected && this.fetchVPNInfo == c27398juT.fetchVPNInfo && this.valueOf == c27398juT.valueOf && this.OLrzqt == c27398juT.OLrzqt && this.AkhnZx == c27398juT.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Integer.hashCode(this.isConnected)) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.AkhnZx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProductDetailsChart(chartInterval=" + this.copydefault + ", dataSet=" + this.AEQbTJ + ", isV3Type=" + this.AhwBna + ", barChartDataSet=" + this.KWHzl + ", curBarValue=" + this.EZpvd + ", maxValue=" + this.AYXKKw + ", maxValuePosition=" + this.gEmmrt + ", minValue=" + this.djBIcL + ", minValuePosition=" + this.isConnected + ", totalPoint=" + this.fetchVPNInfo + ", isLoading=" + this.valueOf + ", hasError=" + this.OLrzqt + ", rateType=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C27398juT(@NotNull ChartInterval chartInterval, @NotNull C23949iPh c23949iPh, boolean z, @NotNull java.util.List<InvestKLineDataPoint> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, int i2, int i3, boolean z2, boolean z3, @NotNull RateType rateType) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        Intrinsics.checkNotNullParameter(c23949iPh, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        this.copydefault = chartInterval;
        this.AEQbTJ = c23949iPh;
        this.AhwBna = z;
        this.KWHzl = list;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.gEmmrt = i;
        this.djBIcL = str3;
        this.isConnected = i2;
        this.fetchVPNInfo = i3;
        this.valueOf = z2;
        this.OLrzqt = z3;
        this.AkhnZx = rateType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006b: CONSTRUCTOR 
  (r18v0 com.okinc.business.invest_biz.data.contants.ChartInterval)
  (r19v0 o.iPh)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.contants.RateType:?: TERNARY null = ((wrap:int:0x005a: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: SGET  A[WRAPPED] (LINE:50) com.okinc.business.invest_biz.data.contants.RateType.Unknown com.okinc.business.invest_biz.data.contants.RateType) : (r30v0 com.okinc.business.invest_biz.data.contants.RateType))
 A[MD:(com.okinc.business.invest_biz.data.contants.ChartInterval, o.iPh, boolean, java.util.List<com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint>, java.lang.String, java.lang.String, int, java.lang.String, int, int, boolean, boolean, com.okinc.business.invest_biz.data.contants.RateType):void (m)] (LINE:37) call: o.juT.<init>(com.okinc.business.invest_biz.data.contants.ChartInterval, o.iPh, boolean, java.util.List, java.lang.String, java.lang.String, int, java.lang.String, int, int, boolean, boolean, com.okinc.business.invest_biz.data.contants.RateType):void type: THIS */
    public /* synthetic */ C27398juT(ChartInterval chartInterval, C23949iPh c23949iPh, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, int i3, boolean z2, boolean z3, RateType rateType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(chartInterval, c23949iPh, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? yDY.AhwBna() : list, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? -1 : i, (i4 & 128) != 0 ? "" : str3, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) != 0 ? 0 : i3, (i4 & 1024) != 0 ? false : z2, (i4 & 2048) != 0 ? false : z3, (i4 & 4096) != 0 ? RateType.Unknown : rateType);
    }
}
