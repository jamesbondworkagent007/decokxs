package o;

import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.api.bean.KlineSettingType;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.PendingOrderLine;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface oKA extends InterfaceC43217rlC {
    android.view.View AEQbTJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    androidx.fragment.app.Fragment AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    oKE AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, Function0<Unit> function0, Function1<? super java.lang.Boolean, Unit> function1, Function0<Unit> function02, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, Function1<? super java.lang.String, Unit> function12, Function2<? super java.lang.String, ? super TradeAllOrderApi, Unit> function22, Function1<? super TradeAllOrderApi, Unit> function13, boolean z);

    InterfaceC35979oKu AEQbTJ(boolean z);

    void AEQbTJ(@NotNull android.content.Context context, MarketArbCoinInfo marketArbCoinInfo, java.lang.String str, java.lang.Integer num);

    void AEQbTJ(@NotNull android.content.Context context, MarketCoinInfo marketCoinInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str4, C35968oKj c35968oKj, java.lang.String str5);

    void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment);

    void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull IBotOrdersDataBean iBotOrdersDataBean);

    void AEQbTJ(@NotNull PendingOrderLine pendingOrderLine);

    InterfaceC35974oKp AYXKKw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    android.view.View EZpvd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    InterfaceC35971oKm EZpvd(int i);

    android.view.View KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    InterfaceC35976oKr OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull KlineSettingType klineSettingType, @NotNull EntryType entryType);

    InterfaceC35978oKt OLrzqt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    android.view.View copydefault(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    InterfaceC35973oKo copydefault();

    android.view.View djBIcL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    InterfaceC35977oKs gEmmrt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i);

    public static final class TaskDescription {
        public static /* synthetic */ void gotoNewKlinePage$default(oKA oka, android.content.Context context, MarketCoinInfo marketCoinInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str4, C35968oKj c35968oKj, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoNewKlinePage");
            }
            oka.AEQbTJ(context, (i & 2) != 0 ? null : marketCoinInfo, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? java.lang.Boolean.TRUE : bool, (i & 128) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? null : c35968oKj, (i & 1024) == 0 ? str5 : null);
        }

        public static /* synthetic */ void gotoArbitrageKline$default(oKA oka, android.content.Context context, MarketArbCoinInfo marketArbCoinInfo, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoArbitrageKline");
            }
            if ((i & 2) != 0) {
                marketArbCoinInfo = null;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                num = 0;
            }
            oka.AEQbTJ(context, marketArbCoinInfo, str, num);
        }

        public static /* synthetic */ android.view.View getIndexView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndexView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.KWHzl(context, attributeSet, i);
        }

        public static /* synthetic */ android.view.View getMarketTitleSelectView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketTitleSelectView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.djBIcL(context, attributeSet, i);
        }

        public static /* synthetic */ android.view.View getMapDepthView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapDepthView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.EZpvd(context, attributeSet, i);
        }

        public static /* synthetic */ android.view.View getDrawLineToolsView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDrawLineToolsView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.copydefault(context, attributeSet, i);
        }

        public static /* synthetic */ android.view.View getDrawLineToolBoxView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDrawLineToolBoxView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.AEQbTJ(context, attributeSet, i);
        }

        public static /* synthetic */ InterfaceC35976oKr getKlineSettingFragment$default(oKA oka, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, KlineSettingType klineSettingType, EntryType entryType, int i, java.lang.Object obj) {
            if (obj == null) {
                return oka.OLrzqt(str, z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? true : z8, (i & 512) != 0 ? true : z9, (i & 1024) != 0 ? true : z10, (i & 2048) != 0 ? true : z11, (i & 4096) != 0 ? false : z12, (i & 8192) != 0 ? false : z13, (i & 16384) != 0 ? KlineSettingType.CHART_CLASSIC : klineSettingType, (i & 32768) != 0 ? EntryType.OTHERS : entryType);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineSettingFragment");
        }

        public static /* synthetic */ InterfaceC35979oKu getKlineTimeSelectFragment$default(oKA oka, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineTimeSelectFragment");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return oka.AEQbTJ(z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.oKA */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ oKE getStandardKLineFragment$default(oKA oka, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Function0 function0, Function1 function1, Function0 function02, Function2 function2, Function1 function12, Function2 function22, Function1 function13, boolean z, int i, java.lang.Object obj) {
            if (obj == null) {
                return oka.AEQbTJ(str, str2, str3, str4, str5, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : function1, function02, (i & 256) != 0 ? null : function2, (i & 512) != 0 ? null : function12, (i & 1024) != 0 ? null : function22, (i & 2048) != 0 ? null : function13, (i & 4096) != 0 ? false : z);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStandardKLineFragment");
        }

        public static /* synthetic */ void gotoCoinTabInfoActivity$default(oKA oka, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoCoinTabInfoActivity");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            oka.AEQbTJ(context, str, str2, str3);
        }

        public static /* synthetic */ InterfaceC35977oKs getMultiChartView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultiChartView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.gEmmrt(context, attributeSet, i);
        }

        public static /* synthetic */ InterfaceC35974oKp getMarketReferralView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketReferralView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.AYXKKw(context, attributeSet, i);
        }

        public static /* synthetic */ InterfaceC35978oKt getKlineUnlockScheduleView$default(oKA oka, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineUnlockScheduleView");
            }
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return oka.OLrzqt(context, attributeSet, i);
        }
    }
}
