package o;

import com.okinc.market.search.features.main.result.ui.model.CampaignPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39992qFi implements InterfaceC40516qYt {
    public final CampaignPo AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39992qFi copy$default(C39992qFi c39992qFi, CampaignPo campaignPo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            campaignPo = c39992qFi.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c39992qFi.OLrzqt;
        }
        return c39992qFi.copydefault(campaignPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignPo copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39992qFi copydefault(@NotNull CampaignPo campaignPo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(campaignPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C39992qFi(campaignPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39992qFi)) {
            return false;
        }
        C39992qFi c39992qFi = (C39992qFi) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c39992qFi.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39992qFi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultCampaignVo(po=" + this.AEQbTJ + ", formatTime=" + this.OLrzqt + ")";
    }

    public C39992qFi(@NotNull CampaignPo campaignPo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(campaignPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = campaignPo;
        this.OLrzqt = str;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39992qFi) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39992qFi) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
