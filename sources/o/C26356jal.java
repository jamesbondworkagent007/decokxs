package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26356jal implements InterfaceC27436jvE {
    public final InvestAction AEQbTJ;
    public final RewardType AYXKKw;
    public final InvestUserAssetDetailClaimPromptInformation AhwBna;
    public final java.util.List<InvestUserRewardElementInfo> AkhnZx;
    public final boolean DbNXlk;
    public final java.lang.String EZpvd;
    public final InvestUserRewardsAction KWHzl;
    public final long OLrzqt;
    public final ButtonType copydefault;
    public final long djBIcL;
    public final InvestmentKind gEmmrt;
    public final boolean isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardType AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAction OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26356jal OLrzqt(@NotNull RewardType rewardType, @NotNull java.util.List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestAction investAction, @NotNull InvestUserRewardsAction investUserRewardsAction, java.lang.String str, boolean z, boolean z2, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, long j, long j2, @NotNull java.lang.String str2, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investAction, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        return new C26356jal(rewardType, list, buttonType, investAction, investUserRewardsAction, str, z, z2, investUserAssetDetailClaimPromptInformation, j, j2, str2, investmentKind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardsAction copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof C26356jal)) {
            return false;
        }
        C26356jal c26356jal = (C26356jal) obj;
        return this.AYXKKw == c26356jal.AYXKKw && Intrinsics.EZpvd(this.AkhnZx, c26356jal.AkhnZx) && this.copydefault == c26356jal.copydefault && this.AEQbTJ == c26356jal.AEQbTJ && this.KWHzl == c26356jal.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c26356jal.EZpvd) && this.DbNXlk == c26356jal.DbNXlk && this.isConnected == c26356jal.isConnected && Intrinsics.EZpvd(this.AhwBna, c26356jal.AhwBna) && this.OLrzqt == c26356jal.OLrzqt && this.djBIcL == c26356jal.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c26356jal.valueOf) && this.gEmmrt == c26356jal.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestUserRewardElementInfo> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailClaimPromptInformation gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.AkhnZx.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.DbNXlk);
        int iHashCode8 = java.lang.Boolean.hashCode(this.isConnected);
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation = this.AhwBna;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (investUserAssetDetailClaimPromptInformation != null ? investUserAssetDetailClaimPromptInformation.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.djBIcL)) * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeFiRewardSectionItem(sectionType=" + this.AYXKKw + ", tokens=" + this.AkhnZx + ", buttonType=" + this.copydefault + ", action=" + this.AEQbTJ + ", claimMode=" + this.KWHzl + ", callDataExtJson=" + this.EZpvd + ", showOuterButton=" + this.DbNXlk + ", showFooterButton=" + this.isConnected + ", extraData=" + this.AhwBna + ", chainId=" + this.OLrzqt + ", investmentId=" + this.djBIcL + ", network=" + this.valueOf + ", kind=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.isConnected;
    }

    public C26356jal(@NotNull RewardType rewardType, @NotNull java.util.List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestAction investAction, @NotNull InvestUserRewardsAction investUserRewardsAction, java.lang.String str, boolean z, boolean z2, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, long j, long j2, @NotNull java.lang.String str2, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investAction, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        this.AYXKKw = rewardType;
        this.AkhnZx = list;
        this.copydefault = buttonType;
        this.AEQbTJ = investAction;
        this.KWHzl = investUserRewardsAction;
        this.EZpvd = str;
        this.DbNXlk = z;
        this.isConnected = z2;
        this.AhwBna = investUserAssetDetailClaimPromptInformation;
        this.OLrzqt = j;
        this.djBIcL = j2;
        this.valueOf = str2;
        this.gEmmrt = investmentKind;
    }
}
