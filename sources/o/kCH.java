package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.TimeIntervalType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kCH {
    public final boolean AEQbTJ;
    public final MarketChainBean EZpvd;
    public final TimeIntervalType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ kCH copy$default(kCH kch, TimeIntervalType timeIntervalType, MarketChainBean marketChainBean, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeIntervalType = kch.OLrzqt;
        }
        if ((i & 2) != 0) {
            marketChainBean = kch.EZpvd;
        }
        if ((i & 4) != 0) {
            z = kch.AEQbTJ;
        }
        return kch.AEQbTJ(timeIntervalType, marketChainBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kCH AEQbTJ(@NotNull TimeIntervalType timeIntervalType, @NotNull MarketChainBean marketChainBean, boolean z) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        return new kCH(timeIntervalType, marketChainBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketChainBean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kCH)) {
            return false;
        }
        kCH kch = (kCH) obj;
        return this.OLrzqt == kch.OLrzqt && Intrinsics.EZpvd(this.EZpvd, kch.EZpvd) && this.AEQbTJ == kch.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WatchListFilterUiState(selectedInterval=" + this.OLrzqt + ", selectedChain=" + this.EZpvd + ", canReset=" + this.AEQbTJ + ")";
    }

    public kCH(@NotNull TimeIntervalType timeIntervalType, @NotNull MarketChainBean marketChainBean, boolean z) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        this.OLrzqt = timeIntervalType;
        this.EZpvd = marketChainBean;
        this.AEQbTJ = z;
    }
}
