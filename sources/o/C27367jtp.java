package o;

import com.okinc.business.invest_biz.data.bean.HealthFactor;
import com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27367jtp extends AbstractC27363jtl {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final UiDashboardTokenItemType AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final long EZpvd;
    public final java.util.List<DashboardAssetToken> KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;
    public final HealthFactor djBIcL;
    public final java.lang.String fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final java.util.List<DashboardInvestmentInfo> gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.util.List<DashboardInvestmentInfo> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27367jtp EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<DashboardAssetToken> list, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<DashboardInvestmentInfo> list2, @NotNull java.lang.String str9, HealthFactor healthFactor, @NotNull UiDashboardTokenItemType uiDashboardTokenItemType, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(uiDashboardTokenItemType, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new C27367jtp(j, str, str2, str3, str4, j2, str5, str6, list, str7, str8, list2, str9, healthFactor, uiDashboardTokenItemType, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27367jtp)) {
            return false;
        }
        C27367jtp c27367jtp = (C27367jtp) obj;
        return this.EZpvd == c27367jtp.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c27367jtp.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c27367jtp.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27367jtp.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c27367jtp.AkhnZx) && this.OLrzqt == c27367jtp.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27367jtp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27367jtp.valueOf) && Intrinsics.EZpvd(this.KWHzl, c27367jtp.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27367jtp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27367jtp.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, c27367jtp.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c27367jtp.fJNWhG) && Intrinsics.EZpvd(this.djBIcL, c27367jtp.djBIcL) && this.AhwBna == c27367jtp.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c27367jtp.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c27367jtp.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthFactor gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode2 = this.values.hashCode();
        int iHashCode3 = this.isConnected.hashCode();
        int iHashCode4 = this.DbNXlk.hashCode();
        int iHashCode5 = this.AkhnZx.hashCode();
        int iHashCode6 = java.lang.Long.hashCode(this.OLrzqt);
        int iHashCode7 = this.AEQbTJ.hashCode();
        int iHashCode8 = this.valueOf.hashCode();
        int iHashCode9 = this.KWHzl.hashCode();
        int iHashCode10 = this.copydefault.hashCode();
        int iHashCode11 = this.AYXKKw.hashCode();
        int iHashCode12 = this.gEmmrt.hashCode();
        int iHashCode13 = this.fJNWhG.hashCode();
        HealthFactor healthFactor = this.djBIcL;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (healthFactor == null ? 0 : healthFactor.hashCode())) * 31) + this.AhwBna.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AuCTel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiBorrowTokenItem(analysisPlatformId=" + this.EZpvd + ", platformName=" + this.values + ", platformUrl=" + this.isConnected + ", network=" + this.DbNXlk + ", networkLogo=" + this.AkhnZx + ", chainId=" + this.OLrzqt + ", assetsTokenInvestName=" + this.AEQbTJ + ", currencyAmount=" + this.valueOf + ", assetsTokens=" + this.KWHzl + ", containAvailableReward=" + this.copydefault + ", containMarketReward=" + this.AYXKKw + ", dashboardInvestmentInfos=" + this.gEmmrt + ", tokenUrl=" + this.fJNWhG + ", healthFactorInfo=" + this.djBIcL + ", itemType=" + this.AhwBna + ", pnl=" + this.fetchVPNInfo + ", pnlCompareValue=" + this.AuCTel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27363jtl
    public UiDashboardTokenItemType valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.fJNWhG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27367jtp(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<DashboardAssetToken> list, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<DashboardInvestmentInfo> list2, @NotNull java.lang.String str9, HealthFactor healthFactor, @NotNull UiDashboardTokenItemType uiDashboardTokenItemType, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
        super(j, j2, str, str2, str7, str8, list2, uiDashboardTokenItemType, null, null, 768, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(uiDashboardTokenItemType, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.EZpvd = j;
        this.values = str;
        this.isConnected = str2;
        this.DbNXlk = str3;
        this.AkhnZx = str4;
        this.OLrzqt = j2;
        this.AEQbTJ = str5;
        this.valueOf = str6;
        this.KWHzl = list;
        this.copydefault = str7;
        this.AYXKKw = str8;
        this.gEmmrt = list2;
        this.fJNWhG = str9;
        this.djBIcL = healthFactor;
        this.AhwBna = uiDashboardTokenItemType;
        this.fetchVPNInfo = str10;
        this.AuCTel = str11;
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27367jtp c27367jtp = interfaceC27436jvE instanceof C27367jtp ? (C27367jtp) interfaceC27436jvE : null;
        return c27367jtp != null && AEQbTJ() == c27367jtp.AEQbTJ() && OLrzqt() == c27367jtp.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) DbNXlk(), (java.lang.Object) c27367jtp.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) AkhnZx(), (java.lang.Object) c27367jtp.AkhnZx()) && valueOf() == c27367jtp.valueOf() && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27367jtp.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27367jtp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27367jtp.valueOf) && Intrinsics.EZpvd(this.KWHzl, c27367jtp.KWHzl) && Intrinsics.EZpvd(AYXKKw(), c27367jtp.AYXKKw()) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c27367jtp.fJNWhG) && Intrinsics.EZpvd(this.djBIcL, c27367jtp.djBIcL) && valueOf() == c27367jtp.valueOf();
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27367jtp c27367jtp = interfaceC27436jvE instanceof C27367jtp ? (C27367jtp) interfaceC27436jvE : null;
        return c27367jtp != null && AEQbTJ() == c27367jtp.AEQbTJ() && OLrzqt() == c27367jtp.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) DbNXlk(), (java.lang.Object) c27367jtp.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) AkhnZx(), (java.lang.Object) c27367jtp.AkhnZx()) && valueOf() == c27367jtp.valueOf() && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c27367jtp.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27367jtp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27367jtp.valueOf) && Intrinsics.EZpvd(this.KWHzl, c27367jtp.KWHzl) && Intrinsics.EZpvd(AYXKKw(), c27367jtp.AYXKKw()) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c27367jtp.fJNWhG) && Intrinsics.EZpvd(this.djBIcL, c27367jtp.djBIcL) && valueOf() == c27367jtp.valueOf();
    }
}
