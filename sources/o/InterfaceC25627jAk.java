package o;

import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC25627jAk {

    /* JADX INFO: renamed from: o.jAk$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application implements InterfaceC25627jAk {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jAk$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements InterfaceC25627jAk {
        public final CoinDetailTradeJumpBean AEQbTJ;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, CoinDetailTradeJumpBean coinDetailTradeJumpBean, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                coinDetailTradeJumpBean = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = actionBar.OLrzqt;
            }
            return actionBar.KWHzl(coinDetailTradeJumpBean, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinDetailTradeJumpBean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull CoinDetailTradeJumpBean coinDetailTradeJumpBean, boolean z) {
            Intrinsics.checkNotNullParameter(coinDetailTradeJumpBean, "");
            return new ActionBar(coinDetailTradeJumpBean, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenTrade(tradingPair=" + this.AEQbTJ + ", tokensAdded=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull CoinDetailTradeJumpBean coinDetailTradeJumpBean, boolean z) {
            Intrinsics.checkNotNullParameter(coinDetailTradeJumpBean, "");
            this.AEQbTJ = coinDetailTradeJumpBean;
            this.OLrzqt = z;
        }
    }
}
