package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27296jsX implements InterfaceC27436jvE {
    public final AssetRawData AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.util.List<C27294jsV> EZpvd;
    public final ButtonAction KWHzl;
    public final ButtonType OLrzqt;
    public final java.util.List<InvestUserRewardElementInfo> copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final boolean isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonAction EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27294jsV> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27296jsX OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C27294jsV> list, java.util.List<InvestUserRewardElementInfo> list2, @NotNull ButtonType buttonType, @NotNull ButtonAction buttonAction, boolean z, boolean z2, boolean z3, boolean z4, AssetRawData assetRawData, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(buttonAction, "");
        return new C27296jsX(str, str2, list, list2, buttonType, buttonAction, z, z2, z3, z4, assetRawData, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRawData copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27296jsX)) {
            return false;
        }
        C27296jsX c27296jsX = (C27296jsX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27296jsX.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27296jsX.DbNXlk) && Intrinsics.EZpvd(this.EZpvd, c27296jsX.EZpvd) && Intrinsics.EZpvd(this.copydefault, c27296jsX.copydefault) && this.OLrzqt == c27296jsX.OLrzqt && this.KWHzl == c27296jsX.KWHzl && this.djBIcL == c27296jsX.djBIcL && this.gEmmrt == c27296jsX.gEmmrt && this.isConnected == c27296jsX.isConnected && this.AkhnZx == c27296jsX.AkhnZx && Intrinsics.EZpvd(this.AEQbTJ, c27296jsX.AEQbTJ) && this.AYXKKw == c27296jsX.AYXKKw && this.AhwBna == c27296jsX.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        java.lang.String str = this.DbNXlk;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        java.util.List<InvestUserRewardElementInfo> list = this.copydefault;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = this.KWHzl.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode8 = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode9 = java.lang.Boolean.hashCode(this.isConnected);
        int iHashCode10 = java.lang.Boolean.hashCode(this.AkhnZx);
        AssetRawData assetRawData = this.AEQbTJ;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (assetRawData != null ? assetRawData.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProtocolDetailsAssetBreakdown(label=" + this.valueOf + ", tagText=" + this.DbNXlk + ", assets=" + this.EZpvd + ", baseDefiTokenInfos=" + this.copydefault + ", buttonType=" + this.OLrzqt + ", buttonAction=" + this.KWHzl + ", isSingleItem=" + this.djBIcL + ", isBouns=" + this.gEmmrt + ", needHeader=" + this.isConnected + ", needShowNetWork=" + this.AkhnZx + ", assetRawData=" + this.AEQbTJ + ", isRewards=" + this.AYXKKw + ", isFeeRewards=" + this.AhwBna + ")";
    }

    public C27296jsX(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C27294jsV> list, java.util.List<InvestUserRewardElementInfo> list2, @NotNull ButtonType buttonType, @NotNull ButtonAction buttonAction, boolean z, boolean z2, boolean z3, boolean z4, AssetRawData assetRawData, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(buttonAction, "");
        this.valueOf = str;
        this.DbNXlk = str2;
        this.EZpvd = list;
        this.copydefault = list2;
        this.OLrzqt = buttonType;
        this.KWHzl = buttonAction;
        this.djBIcL = z;
        this.gEmmrt = z2;
        this.isConnected = z3;
        this.AkhnZx = z4;
        this.AEQbTJ = assetRawData;
        this.AYXKKw = z5;
        this.AhwBna = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] (LINE:36) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r21v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction:?: TERNARY null = ((wrap:int:0x0027: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] (LINE:37) com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction.CLAIM com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction) : (r22v0 com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData) : (r27v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.util.List<o.jsV>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo>, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, boolean, boolean):void (m)] (LINE:31) call: o.jsX.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, boolean, boolean):void type: THIS */
    public /* synthetic */ C27296jsX(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, ButtonType buttonType, ButtonAction buttonAction, boolean z, boolean z2, boolean z3, boolean z4, AssetRawData assetRawData, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i & 32) != 0 ? ButtonAction.CLAIM : buttonAction, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? true : z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? null : assetRawData, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? false : z6);
    }
}
