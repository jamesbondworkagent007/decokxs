package o;

import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.PendingOrderLine;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface uBU extends InterfaceC43217rlC {
    AbstractC32996moC AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2);

    AbstractC32996moC AEQbTJ(boolean z, boolean z2, android.os.Bundle bundle, boolean z3);

    InterfaceC49420uoH AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(Function1<? super MarketArbCoinInfo, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12, androidx.fragment.app.FragmentManager fragmentManager, boolean z);

    AbstractC32996moC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC54505xKx<?, ?> EZpvd(int i, @NotNull java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.Integer num);

    AbstractC32996moC KWHzl(boolean z, @NotNull java.lang.String str);

    void KWHzl(AbstractC32996moC abstractC32996moC, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation);

    PendingOrderLine copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    wXX copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10);

    void copydefault(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num, java.lang.String str2);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public static /* synthetic */ AbstractC32996moC getBotLeadUserFragment$default(uBU ubu, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBotLeadUserFragment");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return ubu.KWHzl(z, str);
        }

        public static /* synthetic */ AbstractC32996moC getSignalBotLeadUserFragment$default(uBU ubu, java.lang.String str, boolean z, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSignalBotLeadUserFragment");
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return ubu.AEQbTJ(str, z, str2, z2);
        }

        public static /* synthetic */ AbstractC32996moC getMarketPlaceFragment$default(uBU ubu, boolean z, boolean z2, android.os.Bundle bundle, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketPlaceFragment");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return ubu.AEQbTJ(z, z2, bundle, z3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uBU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startBotNmpTradeActivity$default(uBU ubu, android.content.Context context, BotTradeData botTradeData, java.util.HashMap map, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startBotNmpTradeActivity");
            }
            if ((i & 4) != 0) {
                map = new java.util.HashMap();
            }
            if ((i & 8) != 0) {
                num = null;
            }
            ubu.EZpvd(context, botTradeData, map, num);
        }

        public static /* synthetic */ PendingOrderLine getPendingOrderLine$default(uBU ubu, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i, java.lang.Object obj) {
            if (obj == null) {
                return ubu.copydefault(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPendingOrderLine");
        }

        public static /* synthetic */ AbstractC54505xKx createTacticsAllContainerFragment$default(uBU ubu, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTacticsAllContainerFragment");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return ubu.EZpvd(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.uBU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startBotTradeActivity$default(uBU ubu, android.content.Context context, BotTradeData botTradeData, java.util.HashMap map, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startBotTradeActivity");
            }
            ubu.copydefault(context, botTradeData, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2);
        }

        public static /* synthetic */ wXX getSmartArbitrageOpenPositionConditionDialog$default(uBU ubu, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSmartArbitrageOpenPositionConditionDialog");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            if ((i & 16) != 0) {
                str5 = "";
            }
            if ((i & 32) != 0) {
                z = false;
            }
            if ((i & 64) != 0) {
                str6 = null;
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            if ((i & 256) != 0) {
                str8 = null;
            }
            if ((i & 512) != 0) {
                str9 = null;
            }
            if ((i & 1024) != 0) {
                str10 = null;
            }
            return ubu.copydefault(str, str2, str3, str4, str5, z, str6, str7, str8, str9, str10);
        }
    }
}
