package o;

import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55741xpf {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    public abstract void AEQbTJ(@NotNull java.util.List<SpreadArbitrageData> list, @NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    public abstract void EZpvd(@NotNull java.lang.String str, java.lang.Exception exc);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.EZpvd;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String str = this.copydefault;
        int iHashCode = str.hashCode();
        if (iHashCode != 84326) {
            if (iHashCode != 2614173) {
                if (iHashCode == 2614190 && str.equals("USDT")) {
                    java.lang.String str2 = this.KWHzl;
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "futures_spot")) {
                        return "linear-futures-spot-arbitrage";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "futures_futures")) {
                        return "linear-futures-futures-arbitrage";
                    }
                }
            } else if (str.equals("USDC")) {
                java.lang.String str3 = this.KWHzl;
                if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "futures_spot")) {
                    return "linear-margined-futures-spot-arbitrage";
                }
                if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "futures_futures")) {
                    return "linear-margined-futures-futures-arbitrage";
                }
            }
        } else if (str.equals("USD")) {
            java.lang.String str4 = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "futures_spot")) {
                return "inverse-futures-spot-arbitrage";
            }
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "futures_futures")) {
                return "inverse-futures-futures-arbitrage";
            }
        }
        return "";
    }

    public static /* synthetic */ void onResult$default(AbstractC55741xpf abstractC55741xpf, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
        if ((i & 2) != 0) {
            str = "WebSocket";
        }
        abstractC55741xpf.AEQbTJ(list, str);
    }
}
