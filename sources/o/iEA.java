package o;

import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEA {
    public final NetworkLogoUrl AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.util.List<InvestPositionDetailExtraFieldData> KWHzl;
    public final InvestmentAssetDetails OLrzqt;
    public final java.lang.String copydefault;
    public final Perpetual djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final InvestLogo valueOf;
    public final InvestUserAssetDetailPromptInformation values;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final iEA AEQbTJ = new iEA(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEA() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestPositionDetailExtraFieldData> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Perpetual AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkLogoUrl OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEA copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull java.util.List<InvestPositionDetailExtraFieldData> list, @NotNull InvestmentAssetDetails investmentAssetDetails, Perpetual perpetual) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investmentAssetDetails, "");
        return new iEA(str, str2, str3, str4, investLogo, networkLogoUrl, str5, str6, investUserAssetDetailPromptInformation, list, investmentAssetDetails, perpetual);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEA)) {
            return false;
        }
        iEA iea = (iEA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iea.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) iea.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iea.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) iea.DbNXlk) && Intrinsics.EZpvd(this.valueOf, iea.valueOf) && Intrinsics.EZpvd(this.AYXKKw, iea.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) iea.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) iea.AkhnZx) && Intrinsics.EZpvd(this.values, iea.values) && Intrinsics.EZpvd(this.KWHzl, iea.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, iea.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, iea.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.DbNXlk.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        int iHashCode7 = this.fetchVPNInfo.hashCode();
        int iHashCode8 = this.AkhnZx.hashCode();
        int iHashCode9 = this.values.hashCode();
        int iHashCode10 = this.KWHzl.hashCode();
        int iHashCode11 = this.OLrzqt.hashCode();
        Perpetual perpetual = this.djBIcL;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (perpetual == null ? 0 : perpetual.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailPromptInformation isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestmentDisplayInfo(protocolName=" + this.AhwBna + ", protocolUrl=" + this.gEmmrt + ", investmentName=" + this.copydefault + ", type=" + this.DbNXlk + ", logos=" + this.valueOf + ", networkNetLogo=" + this.AYXKKw + ", totalAmount=" + this.fetchVPNInfo + ", totalEarnings=" + this.AkhnZx + ", warnings=" + this.values + ", additionalInfos=" + this.KWHzl + ", assetDetails=" + this.OLrzqt + ", perpetual=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.DbNXlk;
    }

    public iEA(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull java.util.List<InvestPositionDetailExtraFieldData> list, @NotNull InvestmentAssetDetails investmentAssetDetails, Perpetual perpetual) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investmentAssetDetails, "");
        this.AhwBna = str;
        this.gEmmrt = str2;
        this.copydefault = str3;
        this.DbNXlk = str4;
        this.valueOf = investLogo;
        this.AYXKKw = networkLogoUrl;
        this.fetchVPNInfo = str5;
        this.AkhnZx = str6;
        this.values = investUserAssetDetailPromptInformation;
        this.KWHzl = list;
        this.OLrzqt = investmentAssetDetails;
        this.djBIcL = perpetual;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x0024: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:56) call: com.okinc.business.invest_biz.data.bean.InvestLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r23v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkLogoUrl:?: TERNARY null = ((wrap:int:0x0038: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:57) call: com.okinc.business.invest_biz.data.bean.NetworkLogoUrl.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.invest_biz.data.bean.NetworkLogoUrl))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r31v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation:?: TERNARY null = ((wrap:int:0x0056: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0075: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:60) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007b: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:61)) : (r28v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails:?: TERNARY null = ((wrap:int:0x0086: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: INVOKE 
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails$Activity:0x008a: SGET  A[WRAPPED] (LINE:62) com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.Companion com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails$Activity)
 VIRTUAL call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.Activity.OLrzqt():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails A[MD:():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails (m), WRAPPED] (LINE:62)) : (r29v0 com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails))
  (wrap:com.okinc.business.invest_biz.data.bean.Perpetual:?: TERNARY null = ((wrap:int:0x0093: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 com.okinc.business.invest_biz.data.bean.Perpetual) : (null com.okinc.business.invest_biz.data.bean.Perpetual))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List<com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData>, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails, com.okinc.business.invest_biz.data.bean.Perpetual):void (m)] (LINE:51) call: o.iEA.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails, com.okinc.business.invest_biz.data.bean.Perpetual):void type: THIS */
    public /* synthetic */ iEA(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, java.lang.String str5, java.lang.String str6, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, java.util.List list, InvestmentAssetDetails investmentAssetDetails, Perpetual perpetual, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new InvestLogo((java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 15, (DefaultConstructorMarker) null) : investLogo, (i & 32) != 0 ? new NetworkLogoUrl((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null) : networkLogoUrl, (i & 64) != 0 ? "0" : str5, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? new InvestUserAssetDetailPromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null) : investUserAssetDetailPromptInformation, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? InvestmentAssetDetails.Companion.OLrzqt() : investmentAssetDetails, (i & 2048) == 0 ? perpetual : null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final iEA EZpvd() {
            return iEA.AEQbTJ;
        }
    }
}
