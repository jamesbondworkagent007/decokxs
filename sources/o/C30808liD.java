package o;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30808liD {
    public final java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public SlippageMode AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean djBIcL;
    public final java.lang.String fARcdN;
    public java.lang.String fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public boolean valueOf;
    public java.lang.String values;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final C30808liD AEQbTJ = new C30808liD("", "", "0", AdvancedSlippageType.Auto.getValue(), "0", "", AdvancedPriorityFeeType.Market.getValue(), false, "", "", SlippageMode.Dynamic, "", "", false, "", 8192, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30808liD() {
        this(null, null, null, 0, null, null, 0, false, null, null, null, null, null, false, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30808liD copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i2, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7, SlippageMode slippageMode, java.lang.String str8, @NotNull java.lang.String str9, boolean z2, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new C30808liD(str, str2, str3, i, str4, str5, i2, z, str6, str7, slippageMode, str8, str9, z2, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30808liD)) {
            return false;
        }
        C30808liD c30808liD = (C30808liD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c30808liD.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c30808liD.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c30808liD.fetchVPNInfo) && this.isConnected == c30808liD.isConnected && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c30808liD.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c30808liD.DbNXlk) && this.gEmmrt == c30808liD.gEmmrt && this.djBIcL == c30808liD.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c30808liD.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c30808liD.values) && this.AkhnZx == c30808liD.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c30808liD.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c30808liD.AuCTel) && this.valueOf == c30808liD.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c30808liD.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fARcdN.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.String str = this.fetchVPNInfo;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = java.lang.Integer.hashCode(this.isConnected);
        int iHashCode5 = this.EZpvd.hashCode();
        int iHashCode6 = this.DbNXlk.hashCode();
        int iHashCode7 = java.lang.Integer.hashCode(this.gEmmrt);
        int iHashCode8 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode9 = this.KWHzl.hashCode();
        int iHashCode10 = this.values.hashCode();
        SlippageMode slippageMode = this.AkhnZx;
        int iHashCode11 = slippageMode == null ? 0 : slippageMode.hashCode();
        java.lang.String str2 = this.AhwBna;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AuCTel.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedSettingModel(toToken=" + this.fARcdN + ", chainId=" + this.OLrzqt + ", slippageValue=" + this.fetchVPNInfo + ", slippageFeeType=" + this.isConnected + ", autoSlippageValue=" + this.EZpvd + ", priorityValue=" + this.DbNXlk + ", priorityFeeType=" + this.gEmmrt + ", isOpenMev=" + this.djBIcL + ", estimateGasFee=" + this.KWHzl + ", routerModeType=" + this.values + ", slippageMode=" + this.AkhnZx + ", maxSlippage=" + this.AhwBna + ", totalFee=" + this.AuCTel + ", isPMM=" + this.valueOf + ", nativeTokenSymbol=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AuCTel;
    }

    public C30808liD(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i2, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7, SlippageMode slippageMode, java.lang.String str8, @NotNull java.lang.String str9, boolean z2, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.fARcdN = str;
        this.OLrzqt = str2;
        this.fetchVPNInfo = str3;
        this.isConnected = i;
        this.EZpvd = str4;
        this.DbNXlk = str5;
        this.gEmmrt = i2;
        this.djBIcL = z;
        this.KWHzl = str6;
        this.values = str7;
        this.AkhnZx = slippageMode;
        this.AhwBna = str8;
        this.AuCTel = str9;
        this.valueOf = z2;
        this.AYXKKw = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: INVOKE 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType:0x0021: SGET  A[WRAPPED] (LINE:19) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType.Auto com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType)
 VIRTUAL call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType.getValue():int A[MD:():int (m), WRAPPED] (LINE:19)) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType:0x003e: SGET  A[WRAPPED] (LINE:22) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType.Market com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType)
 VIRTUAL call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType.getValue():int A[MD:():int (m), WRAPPED] (LINE:22)) : (r23v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode) : (r27v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0076: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:15) call: o.liD.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C30808liD(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, int i2, boolean z, java.lang.String str6, java.lang.String str7, SlippageMode slippageMode, java.lang.String str8, java.lang.String str9, boolean z2, java.lang.String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? AdvancedSlippageType.Auto.getValue() : i, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? AdvancedPriorityFeeType.Market.getValue() : i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? null : slippageMode, (i3 & 2048) == 0 ? str8 : null, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? false : z2, (i3 & 16384) == 0 ? str10 : "");
    }

    /* JADX INFO: renamed from: o.liD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.liD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C30808liD copydefault() {
            return C30808liD.AEQbTJ;
        }
    }

    public final boolean isConnected() {
        return this.AkhnZx == SlippageMode.Dynamic;
    }

    public final java.lang.String gEmmrt() {
        if (isConnected()) {
            return null;
        }
        return this.fetchVPNInfo;
    }

    public final boolean fARcdN() {
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "501");
    }
}
