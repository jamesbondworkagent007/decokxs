package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gTC {
    public final CopyTradingDefaultConfig AEQbTJ;
    public final java.util.List<DefiChainInfo> EZpvd;
    public final CopyTradeDetail KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gTC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gTC copy$default(gTC gtc, CopyTradingDefaultConfig copyTradingDefaultConfig, java.util.List list, CopyTradeDetail copyTradeDetail, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            copyTradingDefaultConfig = gtc.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = gtc.EZpvd;
        }
        if ((i & 4) != 0) {
            copyTradeDetail = gtc.KWHzl;
        }
        return gtc.EZpvd(copyTradingDefaultConfig, list, copyTradeDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeDetail EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gTC EZpvd(@NotNull CopyTradingDefaultConfig copyTradingDefaultConfig, @NotNull java.util.List<DefiChainInfo> list, CopyTradeDetail copyTradeDetail) {
        Intrinsics.checkNotNullParameter(copyTradingDefaultConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new gTC(copyTradingDefaultConfig, list, copyTradeDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingDefaultConfig KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gTC)) {
            return false;
        }
        gTC gtc = (gTC) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, gtc.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, gtc.EZpvd) && Intrinsics.EZpvd(this.KWHzl, gtc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        CopyTradeDetail copyTradeDetail = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (copyTradeDetail == null ? 0 : copyTradeDetail.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CopyTradingEditStrategyConfigs(defaultConfig=" + this.AEQbTJ + ", supportedChains=" + this.EZpvd + ", copyTradeDetail=" + this.KWHzl + ")";
    }

    public gTC(@NotNull CopyTradingDefaultConfig copyTradingDefaultConfig, @NotNull java.util.List<DefiChainInfo> list, CopyTradeDetail copyTradeDetail) {
        Intrinsics.checkNotNullParameter(copyTradingDefaultConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = copyTradingDefaultConfig;
        this.EZpvd = list;
        this.KWHzl = copyTradeDetail;
    }
}
