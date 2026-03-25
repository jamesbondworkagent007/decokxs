package o;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.V3BonusStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23664iEt {
    public static final Application Companion = new Application(null);
    public static final C23664iEt KWHzl = new C23664iEt(0, null, 0, 0, null, null, 0, false, null, 0, 1023, null);
    public final InvestmentKind AEQbTJ;
    public final long AYXKKw;
    public final java.lang.String AhwBna;
    public final long EZpvd;
    public final long OLrzqt;
    public final long copydefault;
    public final ProductType djBIcL;
    public final boolean gEmmrt;
    public final V3BonusStatus isConnected;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23664iEt() {
        this(0L, null, 0L, 0L, null, null, 0L, false, null, 0L, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23664iEt EZpvd(long j, @NotNull java.lang.String str, long j2, long j3, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, long j4, boolean z, @NotNull V3BonusStatus v3BonusStatus, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(v3BonusStatus, "");
        return new C23664iEt(j, str, j2, j3, investmentKind, productType, j4, z, v3BonusStatus, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23664iEt)) {
            return false;
        }
        C23664iEt c23664iEt = (C23664iEt) obj;
        return this.AYXKKw == c23664iEt.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c23664iEt.AhwBna) && this.OLrzqt == c23664iEt.OLrzqt && this.valueOf == c23664iEt.valueOf && this.AEQbTJ == c23664iEt.AEQbTJ && this.djBIcL == c23664iEt.djBIcL && this.copydefault == c23664iEt.copydefault && this.gEmmrt == c23664iEt.gEmmrt && this.isConnected == c23664iEt.isConnected && this.EZpvd == c23664iEt.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((java.lang.Long.hashCode(this.AYXKKw) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.valueOf)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.isConnected.hashCode()) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestmentBasicInfo(investmentId=" + this.AYXKKw + ", specialPositionAssetKey=" + this.AhwBna + ", aggregateProductId=" + this.OLrzqt + ", sourceInvestmentId=" + this.valueOf + ", investmentCategory=" + this.AEQbTJ + ", productType=" + this.djBIcL + ", chainId=" + this.copydefault + ", supportInvest=" + this.gEmmrt + ", v3BonusStatus=" + this.isConnected + ", analysisPlatformId=" + this.EZpvd + ")";
    }

    public C23664iEt(long j, @NotNull java.lang.String str, long j2, long j3, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, long j4, boolean z, @NotNull V3BonusStatus v3BonusStatus, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(v3BonusStatus, "");
        this.AYXKKw = j;
        this.AhwBna = str;
        this.OLrzqt = j2;
        this.valueOf = j3;
        this.AEQbTJ = investmentKind;
        this.djBIcL = productType;
        this.copydefault = j4;
        this.gEmmrt = z;
        this.isConnected = v3BonusStatus;
        this.EZpvd = j5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] (LINE:39) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r24v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x002e: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: SGET  A[WRAPPED] (LINE:40) com.okinc.business.invest_biz.data.contants.ProductType.Unknown com.okinc.business.invest_biz.data.contants.ProductType) : (r25v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.contants.V3BonusStatus:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: SGET  A[WRAPPED] (LINE:43) com.okinc.business.invest_biz.data.contants.V3BonusStatus.None com.okinc.business.invest_biz.data.contants.V3BonusStatus) : (r29v0 com.okinc.business.invest_biz.data.contants.V3BonusStatus))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0050: ARITH (r32v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r30v0 long) : (0 long))
 A[MD:(long, java.lang.String, long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, long, boolean, com.okinc.business.invest_biz.data.contants.V3BonusStatus, long):void (m)] (LINE:34) call: o.iEt.<init>(long, java.lang.String, long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, long, boolean, com.okinc.business.invest_biz.data.contants.V3BonusStatus, long):void type: THIS */
    public /* synthetic */ C23664iEt(long j, java.lang.String str, long j2, long j3, InvestmentKind investmentKind, ProductType productType, long j4, boolean z, V3BonusStatus v3BonusStatus, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? InvestmentKind.Default : investmentKind, (i & 32) != 0 ? ProductType.Unknown : productType, (i & 64) != 0 ? 0L : j4, (i & 128) != 0 ? false : z, (i & 256) != 0 ? V3BonusStatus.None : v3BonusStatus, (i & 512) == 0 ? j5 : 0L);
    }

    /* JADX INFO: renamed from: o.iEt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C23664iEt AEQbTJ() {
            return C23664iEt.KWHzl;
        }
    }
}
