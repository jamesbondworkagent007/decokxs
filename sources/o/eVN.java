package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eVN {
    public static final eVN AEQbTJ = new eVN();

    private eVN() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(str, "", "Web3Checker");
        pUU.KWHzl("Web3Checker", "getExchangeUID: " + str + ", hasMpcWallet: " + string);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, java.lang.String.valueOf(z), "Web3Checker");
        pUU.KWHzl("Web3Checker", "setExchangeUID: " + str + ", hasMpcWallet: " + z);
    }

    public final boolean KWHzl() {
        boolean z = SPUtils.getBoolean("show_web3_mode", true, "Web3Checker");
        pUU.KWHzl("Web3Checker", "getShowWeb3Mode: " + z);
        return z;
    }

    public final void OLrzqt(boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        pUU.KWHzl("Web3Checker", "setShowWeb3Mode: " + boolValueOf.booleanValue());
        SPUtils.put("show_web3_mode", boolValueOf, "Web3Checker");
    }

    public final void copydefault(boolean z) {
        SPUtils.put("show_web3_mode_debug", java.lang.Boolean.FALSE, "Web3Checker");
    }
}
