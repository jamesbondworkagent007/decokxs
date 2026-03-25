package o;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.unify_trade.biz.TradeHistoryOrderData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49499uph extends InterfaceC43217rlC {
    java.lang.String AEQbTJ();

    void EZpvd(@NotNull android.content.Context context, SettingType settingType);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, TradeHistoryOrderData tradeHistoryOrderData);

    java.lang.String KWHzl();

    void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0);

    java.lang.String OLrzqt();

    void OLrzqt(@NotNull android.content.Context context, java.lang.Long l, java.lang.String str);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

    void OLrzqt(yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yho);

    void OLrzqt(yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull java.lang.String str);

    void copydefault(@NotNull android.content.Context context, java.lang.Boolean bool);

    void copydefault(@NotNull android.content.Context context, java.lang.Long l, java.lang.String str, java.lang.String str2);

    void copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num, yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yho);

    /* JADX INFO: renamed from: o.uph$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void routeSmallCoinConvert$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.Long l, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeSmallCoinConvert");
            }
            if ((i & 2) != 0) {
                l = -1L;
            }
            if ((i & 4) != 0) {
                str = ExtJson.BRC20TYPE_TRADE;
            }
            interfaceC49499uph.OLrzqt(context, l, str);
        }

        public static /* synthetic */ void routeTradeSetting$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, SettingType settingType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeTradeSetting");
            }
            if ((i & 2) != 0) {
                settingType = null;
            }
            interfaceC49499uph.EZpvd(context, settingType);
        }

        public static /* synthetic */ void routeUrlForTradeBills$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeUrlForTradeBills");
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            interfaceC49499uph.copydefault(context, bool);
        }

        public static /* synthetic */ void routeOneKeyExchangeCoinKey$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.Long l, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeOneKeyExchangeCoinKey");
            }
            if ((i & 2) != 0) {
                l = -1L;
            }
            if ((i & 4) != 0) {
                str = "trading";
            }
            if ((i & 8) != 0) {
                str2 = ExtJson.BRC20TYPE_TRADE;
            }
            interfaceC49499uph.copydefault(context, l, str, str2);
        }

        public static /* synthetic */ void routeMoreActivity$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, TradeHistoryOrderData tradeHistoryOrderData, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeMoreActivity");
            }
            interfaceC49499uph.EZpvd(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? str4 : "", (i & 256) == 0 ? tradeHistoryOrderData : null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.uph */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeAccountModeActivity$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeAccountModeActivity");
            }
            interfaceC49499uph.copydefault(context, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : num, (i & 32) == 0 ? yho : null);
        }

        public static /* synthetic */ void startBorrowManagement$default(InterfaceC49499uph interfaceC49499uph, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startBorrowManagement");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC49499uph.OLrzqt(context, str, str2, str3);
        }
    }
}
