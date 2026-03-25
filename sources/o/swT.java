package o;

import com.okinc.okex.lite.onboarding.api.TradingModeSwitchRemoteBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class swT {
    public static final int $stable = 0;
    public final int type;
    public final TradingModeSwitchRemoteBean value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ swT copy$default(swT swt, int i, TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = swt.type;
        }
        if ((i2 & 2) != 0) {
            tradingModeSwitchRemoteBean = swt.value;
        }
        return swt.copydefault(i, tradingModeSwitchRemoteBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final swT copydefault(int i, @NotNull TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean) {
        Intrinsics.checkNotNullParameter(tradingModeSwitchRemoteBean, "");
        return new swT(i, tradingModeSwitchRemoteBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swT)) {
            return false;
        }
        swT swt = (swT) obj;
        return this.type == swt.type && this.value == swt.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.type) * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserModeSwitchUpdatedConfig(type=" + this.type + ", value=" + this.value + ")";
    }

    public swT(int i, @NotNull TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean) {
        Intrinsics.checkNotNullParameter(tradingModeSwitchRemoteBean, "");
        this.type = i;
        this.value = tradingModeSwitchRemoteBean;
    }
}
