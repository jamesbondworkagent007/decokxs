package o;

import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27372jtu extends AbstractC27363jtl {
    public final java.lang.String AEQbTJ;
    public final java.util.List<DashboardInvestmentInfo> AYXKKw;
    public final java.lang.String AhwBna;
    public final UiDashboardTokenItemType AkhnZx;
    public final java.util.List<InvestLogoBaseVo> AuCTel;
    public final java.lang.String DbNXlk;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final java.util.List<DashboardAssetToken> copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.util.List<InvestLogoBaseVo> isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27372jtu AEQbTJ(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<InvestLogoBaseVo> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<DashboardAssetToken> list2, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<DashboardInvestmentInfo> list3, @NotNull java.util.List<InvestLogoBaseVo> list4, @NotNull UiDashboardTokenItemType uiDashboardTokenItemType, @NotNull java.lang.String str9, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(uiDashboardTokenItemType, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new C27372jtu(j, j2, str, str2, list, str3, str4, str5, str6, list2, str7, str8, list3, list4, uiDashboardTokenItemType, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.util.List<DashboardInvestmentInfo> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestLogoBaseVo> AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27372jtu)) {
            return false;
        }
        C27372jtu c27372jtu = (C27372jtu) obj;
        return this.EZpvd == c27372jtu.EZpvd && this.OLrzqt == c27372jtu.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27372jtu.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c27372jtu.values) && Intrinsics.EZpvd(this.isConnected, c27372jtu.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27372jtu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27372jtu.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27372jtu.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27372jtu.djBIcL) && Intrinsics.EZpvd(this.copydefault, c27372jtu.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27372jtu.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27372jtu.valueOf) && Intrinsics.EZpvd(this.AYXKKw, c27372jtu.AYXKKw) && Intrinsics.EZpvd(this.AuCTel, c27372jtu.AuCTel) && this.AkhnZx == c27372jtu.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c27372jtu.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c27372jtu.fJNWhG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.DbNXlk.hashCode()) * 31) + this.values.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.fJNWhG.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiDualTokenItem(chainId=" + this.EZpvd + ", analysisPlatformId=" + this.OLrzqt + ", platformName=" + this.DbNXlk + ", platformUrl=" + this.values + ", networkLogos=" + this.isConnected + ", assetsTokenInvestName=" + this.KWHzl + ", feeRate=" + this.gEmmrt + ", feeRateValue=" + this.AhwBna + ", currencyAmount=" + this.djBIcL + ", assetsTokens=" + this.copydefault + ", containAvailableReward=" + this.AEQbTJ + ", containMarketReward=" + this.valueOf + ", dashboardInvestmentInfos=" + this.AYXKKw + ", tokenIcons=" + this.AuCTel + ", itemType=" + this.AkhnZx + ", pnl=" + this.fetchVPNInfo + ", pnlCompareValue=" + this.fJNWhG + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public UiDashboardTokenItemType valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestLogoBaseVo> values() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27372jtu(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<InvestLogoBaseVo> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<DashboardAssetToken> list2, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<DashboardInvestmentInfo> list3, @NotNull java.util.List<InvestLogoBaseVo> list4, @NotNull UiDashboardTokenItemType uiDashboardTokenItemType, @NotNull java.lang.String str9, @NotNull java.lang.String str10) {
        super(j, j2, str, str2, str7, str8, list3, uiDashboardTokenItemType, null, null, 768, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(uiDashboardTokenItemType, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.EZpvd = j;
        this.OLrzqt = j2;
        this.DbNXlk = str;
        this.values = str2;
        this.isConnected = list;
        this.KWHzl = str3;
        this.gEmmrt = str4;
        this.AhwBna = str5;
        this.djBIcL = str6;
        this.copydefault = list2;
        this.AEQbTJ = str7;
        this.valueOf = str8;
        this.AYXKKw = list3;
        this.AuCTel = list4;
        this.AkhnZx = uiDashboardTokenItemType;
        this.fetchVPNInfo = str9;
        this.fJNWhG = str10;
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27372jtu c27372jtu = interfaceC27436jvE instanceof C27372jtu ? (C27372jtu) interfaceC27436jvE : null;
        return c27372jtu != null && Intrinsics.EZpvd((java.lang.Object) DbNXlk(), (java.lang.Object) c27372jtu.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27372jtu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27372jtu.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27372jtu.djBIcL) && OLrzqt() == c27372jtu.OLrzqt() && AEQbTJ() == c27372jtu.AEQbTJ() && Intrinsics.EZpvd((java.lang.Object) AkhnZx(), (java.lang.Object) c27372jtu.AkhnZx()) && valueOf() == c27372jtu.valueOf() && Intrinsics.EZpvd(AYXKKw(), c27372jtu.AYXKKw());
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27372jtu c27372jtu = interfaceC27436jvE instanceof C27372jtu ? (C27372jtu) interfaceC27436jvE : null;
        return c27372jtu != null && Intrinsics.EZpvd((java.lang.Object) DbNXlk(), (java.lang.Object) c27372jtu.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27372jtu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27372jtu.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c27372jtu.djBIcL) && OLrzqt() == c27372jtu.OLrzqt() && AEQbTJ() == c27372jtu.AEQbTJ() && Intrinsics.EZpvd((java.lang.Object) AkhnZx(), (java.lang.Object) c27372jtu.AkhnZx()) && valueOf() == c27372jtu.valueOf() && Intrinsics.EZpvd(AYXKKw(), c27372jtu.AYXKKw());
    }
}
