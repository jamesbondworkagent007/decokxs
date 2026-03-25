package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gKZ {
    public static final gKZ EZpvd = new gKZ();
    public static final java.util.Set<java.lang.String> OLrzqt = yEE.AhwBna("dex/market", "dex/coin/detail", "dex/market/meme-factory", "dex/market/homecustomlist", "dex/market/smart-money", "dex/market/address-tracker", "dex/market/group-manager", "dex/market/analysis", "dex/scanner");
    public static final java.util.Set<java.lang.String> KWHzl = yEE.AhwBna("dex/limit-order/history/detail", "dex/swap", "dex/history", "dex/history/detail", "dex/limit-order", "dex/limit-order/history", "dex/meme/swap", "dex/advanced/buy", "dex/advanced/sell", "dex/transaction/dialog");
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> copydefault() {
        return OLrzqt;
    }

    private gKZ() {
    }

    public final java.util.Set<java.lang.String> EZpvd() {
        return yEE.AhwBna("dex/limit-order/history/detail", "dex/swap", "dex/history", "dex/history/detail", "dex/market", "dex/market/meme-factory", "dex/coin/detail", "dex/limit-order", "dex/limit-order/history", "dex/meme/swap", "dex/advanced/buy", "dex/advanced/sell", "dex/transaction/dialog", "dex/market/homecustomlist", "dex/market/smart-money", "dex/market/address-tracker", "dex/market/group-manager", "dex/market/analysis", "dex/copy-trade", "dex/copy-trade/create", "dex/scanner");
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "://", false, 2, (java.lang.Object) null)) {
            return str;
        }
        return ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).wlaJM() + DeeplinkMode.WALLET.getMode() + "/" + str;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).wlaJM() + "wallet/" + str;
    }

    public static final java.lang.CharSequence KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst() + ContainerUtils.KEY_VALUE_DELIMITER + pair.getSecond();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        java.lang.String strJoinToString$default = yDV.joinToString$default(pairArr, ContainerUtils.FIELD_DELIMITER, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.gLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gKZ.KWHzl((kotlin.Pair) obj);
            }
        }, 30, (java.lang.Object) null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "?", false, 2, (java.lang.Object) null)) {
            return str + ContainerUtils.FIELD_DELIMITER + strJoinToString$default;
        }
        return str + "?" + strJoinToString$default;
    }
}
