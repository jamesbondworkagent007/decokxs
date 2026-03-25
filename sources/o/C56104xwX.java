package o;

import com.okinc.biz.StrategyType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56104xwX {
    public static java.lang.String EZpvd;
    public static java.lang.String OLrzqt;
    public static final C56104xwX AEQbTJ = new C56104xwX();
    public static final int KWHzl = 8;

    private C56104xwX() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OLrzqt, "route_new_trade_other");
        bundle.putString("chainIndex", str);
        bundle.putString("tokenAddress", str2);
        bundle.putString("bizTypeStr", "CEDEFI");
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("from", str3);
        if (str4 == null) {
            str4 = "";
        }
        bundle.putString(RouteData.FROM_PAGE_SOURCE, str4);
        ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ(context, "trade/main/dex", bundle);
    }

    public static /* synthetic */ void navigateToTrade$default(C56104xwX c56104xwX, android.content.Context context, java.lang.String str, java.lang.String str2, StrategyType strategyType, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            strategyType = null;
        }
        c56104xwX.copydefault(context, str, str2, strategyType, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, StrategyType strategyType, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strCopydefault = EZpvd;
        if (strCopydefault == null) {
            strCopydefault = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).copydefault();
        }
        if (Intrinsics.EZpvd((java.lang.Object) "OPTION", (java.lang.Object) str2)) {
            strCopydefault = "trade/main/option";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OLrzqt, "route_new_trade_other");
        bundle.putString("id", str);
        bundle.putString("type", str2);
        bundle.putParcelable(OtcExtraKeys.SUB_TYPE, strategyType);
        bundle.putString("from", str3);
        bundle.putString("tokenName", str4);
        ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ(context, strCopydefault, bundle);
    }
}
