package o;

import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55669xoM {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    public abstract void AEQbTJ(@NotNull java.util.List<FundingRateArbitrageData> list, @NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    public abstract void EZpvd(@NotNull java.lang.String str, java.lang.Exception exc);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.copydefault;
    }

    public final java.lang.String KWHzl() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str.hashCode();
        if (iHashCode != 84326) {
            if (iHashCode != 2614173) {
                if (iHashCode == 2614190 && str.equals("USDT")) {
                    return "linear-funding-rate-arbitrage";
                }
            } else if (str.equals("USDC")) {
                return "linear-margined-funding-rate-arbitrage";
            }
        } else if (str.equals("USD")) {
            return "inverse-funding-rate-arbitrage";
        }
        return "";
    }

    public static /* synthetic */ void onResult$default(AbstractC55669xoM abstractC55669xoM, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
        if ((i & 2) != 0) {
            str = "WebSocket";
        }
        abstractC55669xoM.AEQbTJ(list, str);
    }
}
