package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27294jsV {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.Long EZpvd;
    public final ButtonType KWHzl;
    public final ButtonAction OLrzqt;
    public final AssetRawData copydefault;
    public final boolean djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRawData KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27294jsV OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull ButtonType buttonType, ButtonAction buttonAction, AssetRawData assetRawData, java.lang.Long l, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        return new C27294jsV(list, str, str2, str3, z, buttonType, buttonAction, assetRawData, l, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonAction copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27294jsV)) {
            return false;
        }
        C27294jsV c27294jsV = (C27294jsV) obj;
        return Intrinsics.EZpvd(this.valueOf, c27294jsV.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27294jsV.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27294jsV.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27294jsV.AEQbTJ) && this.djBIcL == c27294jsV.djBIcL && this.KWHzl == c27294jsV.KWHzl && this.OLrzqt == c27294jsV.OLrzqt && Intrinsics.EZpvd(this.copydefault, c27294jsV.copydefault) && Intrinsics.EZpvd(this.EZpvd, c27294jsV.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27294jsV.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode6 = this.KWHzl.hashCode();
        ButtonAction buttonAction = this.OLrzqt;
        int iHashCode7 = buttonAction == null ? 0 : buttonAction.hashCode();
        AssetRawData assetRawData = this.copydefault;
        int iHashCode8 = assetRawData == null ? 0 : assetRawData.hashCode();
        java.lang.Long l = this.EZpvd;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        java.lang.String str = this.AhwBna;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiAssetDetails(icons=" + this.valueOf + ", name=" + this.gEmmrt + ", tokenValue=" + this.AYXKKw + ", currencyAmount=" + this.AEQbTJ + ", hasBonus=" + this.djBIcL + ", buttonType=" + this.KWHzl + ", buttonAction=" + this.OLrzqt + ", clickParams=" + this.copydefault + ", chainId=" + this.EZpvd + ", tokenAddress=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> valueOf() {
        return this.valueOf;
    }

    public C27294jsV(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull ButtonType buttonType, ButtonAction buttonAction, AssetRawData assetRawData, java.lang.Long l, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        this.valueOf = list;
        this.gEmmrt = str;
        this.AYXKKw = str2;
        this.AEQbTJ = str3;
        this.djBIcL = z;
        this.KWHzl = buttonType;
        this.OLrzqt = buttonAction;
        this.copydefault = assetRawData;
        this.EZpvd = l;
        this.AhwBna = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (r14v0 java.util.List)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:62) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r19v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction:?: TERNARY null = ((wrap:int:0x0015: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction) : (r20v0 com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData:?: TERNARY null = ((wrap:int:0x001e: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData) : (r21v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, java.lang.Long, java.lang.String):void (m)] (LINE:56) call: o.jsV.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C27294jsV(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, ButtonType buttonType, ButtonAction buttonAction, AssetRawData assetRawData, java.lang.Long l, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i & 64) != 0 ? null : buttonAction, (i & 128) != 0 ? null : assetRawData, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str4);
    }
}
