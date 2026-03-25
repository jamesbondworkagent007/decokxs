package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import o.lAG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lxV implements InterfaceC43234rlT {
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // o.InterfaceC43234rlT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String lowerCase;
        TargetTab targetTab;
        java.lang.Object obj;
        java.lang.String string;
        java.lang.String string2 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj2 = map.get("tab");
        if (obj2 == null || (string = obj2.toString()) == null) {
            lowerCase = "convert";
        } else {
            lowerCase = string.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase == null) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "buy")) {
            targetTab = TargetTab.BUY;
        } else {
            targetTab = Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "sell") ? TargetTab.SELL : TargetTab.CONVERT;
        }
        TargetTab targetTab2 = targetTab;
        if ((targetTab2 == TargetTab.BUY || targetTab2 == TargetTab.SELL) && ((obj = map.get(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK)) == null || (string2 = obj.toString()) == null)) {
            string2 = "BTC";
        }
        lAG.TaskDescription.goToBSCLevel2$default(lAG.Companion, context, new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, targetTab2, string2, null, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null), false, 4, null);
    }
}
