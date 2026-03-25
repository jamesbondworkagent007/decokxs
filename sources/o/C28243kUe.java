package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28243kUe {
    public final boolean AEQbTJ;
    public final TradeMode EZpvd;
    public final ChainBizType KWHzl;
    public final java.lang.String OLrzqt;
    public final DefiChainInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28243kUe copy$default(C28243kUe c28243kUe, ChainBizType chainBizType, DefiChainInfo defiChainInfo, boolean z, java.lang.String str, TradeMode tradeMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chainBizType = c28243kUe.KWHzl;
        }
        if ((i & 2) != 0) {
            defiChainInfo = c28243kUe.copydefault;
        }
        DefiChainInfo defiChainInfo2 = defiChainInfo;
        if ((i & 4) != 0) {
            z = c28243kUe.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = c28243kUe.OLrzqt;
        }
        java.lang.String str2 = str;
        if ((i & 16) != 0) {
            tradeMode = c28243kUe.EZpvd;
        }
        return c28243kUe.OLrzqt(chainBizType, defiChainInfo2, z2, str2, tradeMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMode KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainBizType OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28243kUe OLrzqt(@NotNull ChainBizType chainBizType, @NotNull DefiChainInfo defiChainInfo, boolean z, @NotNull java.lang.String str, TradeMode tradeMode) {
        Intrinsics.checkNotNullParameter(chainBizType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C28243kUe(chainBizType, defiChainInfo, z, str, tradeMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28243kUe)) {
            return false;
        }
        C28243kUe c28243kUe = (C28243kUe) obj;
        return this.KWHzl == c28243kUe.KWHzl && Intrinsics.EZpvd(this.copydefault, c28243kUe.copydefault) && this.AEQbTJ == c28243kUe.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c28243kUe.OLrzqt) && this.EZpvd == c28243kUe.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = this.OLrzqt.hashCode();
        TradeMode tradeMode = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tradeMode == null ? 0 : tradeMode.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckChainStateData(chainBizType=" + this.KWHzl + ", chainInfo=" + this.copydefault + ", isFrom=" + this.AEQbTJ + ", fromChainId=" + this.OLrzqt + ", tradeMode=" + this.EZpvd + ")";
    }

    public C28243kUe(@NotNull ChainBizType chainBizType, @NotNull DefiChainInfo defiChainInfo, boolean z, @NotNull java.lang.String str, TradeMode tradeMode) {
        Intrinsics.checkNotNullParameter(chainBizType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = chainBizType;
        this.copydefault = defiChainInfo;
        this.AEQbTJ = z;
        this.OLrzqt = str;
        this.EZpvd = tradeMode;
    }
}
