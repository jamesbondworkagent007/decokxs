package o;

import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.wPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52536wPa {
    public static final int AEQbTJ = StrategyConfigInfo.$stable;
    public final StrategyConfigInfo EZpvd;
    public final StrategyDetailsResponse OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C52536wPa copy$default(C52536wPa c52536wPa, StrategyDetailsResponse strategyDetailsResponse, StrategyConfigInfo strategyConfigInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyDetailsResponse = c52536wPa.OLrzqt;
        }
        if ((i & 2) != 0) {
            strategyConfigInfo = c52536wPa.EZpvd;
        }
        return c52536wPa.KWHzl(strategyDetailsResponse, strategyConfigInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52536wPa KWHzl(StrategyDetailsResponse strategyDetailsResponse, StrategyConfigInfo strategyConfigInfo) {
        return new C52536wPa(strategyDetailsResponse, strategyConfigInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52536wPa)) {
            return false;
        }
        C52536wPa c52536wPa = (C52536wPa) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c52536wPa.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c52536wPa.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        StrategyDetailsResponse strategyDetailsResponse = this.OLrzqt;
        int iHashCode = strategyDetailsResponse == null ? 0 : strategyDetailsResponse.hashCode();
        StrategyConfigInfo strategyConfigInfo = this.EZpvd;
        return (iHashCode * 31) + (strategyConfigInfo != null ? strategyConfigInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DcaHistoryTopModel(resp=" + this.OLrzqt + ", config=" + this.EZpvd + ")";
    }

    public C52536wPa(StrategyDetailsResponse strategyDetailsResponse, StrategyConfigInfo strategyConfigInfo) {
        this.OLrzqt = strategyDetailsResponse;
        this.EZpvd = strategyConfigInfo;
    }
}
