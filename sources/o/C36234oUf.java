package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36234oUf {
    public static java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public static java.util.Map<java.lang.String, java.lang.String> copydefault;
    public static final C36234oUf EZpvd = new C36234oUf();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(boolean z) {
        return z ? TtmlNode.RIGHT : TtmlNode.LEFT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        return i == 0 ? "filled_candle" : "empty_candle";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(boolean z) {
        return z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(boolean z) {
        return z ? "absolute" : "percentage";
    }

    private C36234oUf() {
    }

    public final void djBIcL() {
        final java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = AEQbTJ();
        if (!copydefault() || !Intrinsics.EZpvd(copydefault, mapAEQbTJ)) {
            C32866mlf.onEvent$default("Chart_Settings_Toggle_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36234oUf.OLrzqt(mapAEQbTJ, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        AYXKKw();
    }

    public static final Unit OLrzqt(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Chart_Settings_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36234oUf.EZpvd(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, str, str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "version_type", EZpvd.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_cedefi", C36246oUr.copydefault().RKDWNf() ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        final java.util.Map<java.lang.String, java.lang.String> mapEZpvd = EZpvd();
        if (!KWHzl() || !Intrinsics.EZpvd(OLrzqt, mapEZpvd)) {
            C32866mlf.onEvent$default("AdvancedSettings_ChartSetting_Toggle_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36234oUf.copydefault(mapEZpvd, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        valueOf();
    }

    public static final Unit copydefault(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("AdvancedSettings_ChartSetting_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36234oUf.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, str, str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "version_type", EZpvd.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final boolean z) {
        C32866mlf.onEvent$default("KLine_TopNews_Display_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36234oUf.KWHzl(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "Display", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AhwBna(final boolean z) {
        C32866mlf.onEvent$default("KLineSettings_TimeAnchor_Toggle_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36234oUf.djBIcL(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "toggle_status", EZpvd.OLrzqt(z), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final boolean z) {
        C32866mlf.onEvent$default("KLineSettings_PairTimeAnchor_Toggle_Click", (TrackChannel[]) null, new Function1() { // from class: o.oUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36234oUf.AEQbTJ(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "toggle_status", EZpvd.OLrzqt(z), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = c36246oUrCopydefault.zLjUOn();
        kotlin.Pair[] pairArr = new kotlin.Pair[19];
        boolean z = false;
        pairArr[0] = C56390yDp.OLrzqt("open_order", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowCurrentOrder()));
        pairArr[1] = C56390yDp.OLrzqt("historical_order", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowHistoryOrder()));
        pairArr[2] = C56390yDp.OLrzqt("cost_of_position", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowCostLine()));
        pairArr[3] = C56390yDp.OLrzqt("breakeven_price", OLrzqt(chartViewOutSideConfigZLjUOn.isShowBe()));
        pairArr[4] = C56390yDp.OLrzqt("liquidation_price", OLrzqt(chartViewOutSideConfigZLjUOn.isShowLiq()));
        pairArr[5] = C56390yDp.OLrzqt("y_axis", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowAxis()));
        pairArr[6] = C56390yDp.OLrzqt("countdown", OLrzqt(chartViewOutSideConfigZLjUOn.isShowCountdown()));
        pairArr[7] = C56390yDp.OLrzqt(ProductMatrixRemoteConfig.ALERT, OLrzqt(chartViewOutSideConfigZLjUOn.getMShowPriceWarning()));
        pairArr[8] = C56390yDp.OLrzqt("economic_event", OLrzqt(c36246oUrCopydefault.call()));
        pairArr[9] = C56390yDp.OLrzqt("open_orders_tutorial_extended_price_line", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowOpenOrderExtendedLine()));
        pairArr[10] = C56390yDp.OLrzqt("open_orders_tutorial_position", AEQbTJ(chartViewOutSideConfigZLjUOn.getMOpenOrderShowRight()));
        pairArr[11] = C56390yDp.OLrzqt("average_cost_price_extended_price_line", OLrzqt(chartViewOutSideConfigZLjUOn.getMShowTradePosExtendedLine()));
        pairArr[12] = C56390yDp.OLrzqt("average_cost_price_pnl", copydefault(chartViewOutSideConfigZLjUOn.getMTradePosShowPnl()));
        pairArr[13] = C56390yDp.OLrzqt("average_cost_price_position", AEQbTJ(chartViewOutSideConfigZLjUOn.getMTradePosShowRight()));
        pairArr[14] = C56390yDp.OLrzqt("y_axis_show_y_axis", OLrzqt(SPUtils.getBoolean("chart_axis", true)));
        java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        if (num != null && num.intValue() == 0) {
            z = true;
        }
        pairArr[15] = C56390yDp.OLrzqt("y_axis_y_axis_type", copydefault(z));
        pairArr[16] = C56390yDp.OLrzqt("economic_calendar_past", OLrzqt(c36246oUrCopydefault.DcqEDu()));
        pairArr[17] = C56390yDp.OLrzqt("economic_calendar_future", OLrzqt(c36246oUrCopydefault.DNMMPQ()));
        pairArr[18] = C56390yDp.OLrzqt("version_type", OLrzqt());
        return C56424yEw.gEmmrt(pairArr);
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.Pair[] pairArr = new kotlin.Pair[17];
        pairArr[0] = C56390yDp.OLrzqt("chart_view", pEI.EZpvd.AEQbTJ() ? "tradingview" : "original");
        pairArr[1] = C56390yDp.OLrzqt("full_screen_mode", OLrzqt(!SPUtils.getBoolean("kline_layout_style_default", true)));
        java.lang.String string = SPUtils.getString("kline_theme_type", "kline_dark");
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "kline_white")) {
            str = "light";
        } else {
            str = Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "kline_dark") ? "dark" : "follow_app";
        }
        pairArr[2] = C56390yDp.OLrzqt("theme", str);
        pairArr[3] = C56390yDp.OLrzqt("zoom_style", SPUtils.getBoolean("kline_zoom_type_column_chart", true) ? "bar" : "line");
        pairArr[4] = C56390yDp.OLrzqt("trade_button", AEQbTJ(!SPUtils.getBoolean("trade_button_left", true)));
        java.lang.Integer num = SPUtils.getInt("chart_model_rise", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        pairArr[5] = C56390yDp.OLrzqt("bullish", KWHzl(num.intValue()));
        java.lang.Integer num2 = SPUtils.getInt("chart_model_down", 0);
        Intrinsics.checkNotNullExpressionValue(num2, "");
        pairArr[6] = C56390yDp.OLrzqt("bearish", KWHzl(num2.intValue()));
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.Integer numValueOf = interfaceC46557tYt != null ? java.lang.Integer.valueOf(interfaceC46557tYt.EZpvd()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            str2 = "utc_eight";
        } else {
            str2 = (numValueOf != null && numValueOf.intValue() == 1) ? "utc" : "twenty_four_hours";
        }
        pairArr[7] = C56390yDp.OLrzqt("chart_time", str2);
        java.lang.Integer num3 = SPUtils.getInt("kline_abstract_type", 1);
        pairArr[8] = C56390yDp.OLrzqt("abstract_on_chart", (num3 != null && num3.intValue() == 0) ? "top_panel" : "floating_panel");
        java.lang.Integer num4 = SPUtils.getInt("chart_position", 1);
        if (num4 != null && num4.intValue() == 0) {
            str3 = TtmlNode.LEFT;
        } else {
            str3 = (num4 != null && num4.intValue() == 1) ? "middle" : TtmlNode.RIGHT;
        }
        pairArr[9] = C56390yDp.OLrzqt("drag_position", str3);
        pairArr[10] = C56390yDp.OLrzqt("quick_trading", OLrzqt(SPUtils.getBoolean("chart_quick_order", true)));
        pairArr[11] = C56390yDp.OLrzqt("keep_screen_on", OLrzqt(SPUtils.getBoolean("key_screen_on", false)));
        pairArr[12] = C56390yDp.OLrzqt("double_tap_for_fullscreen", OLrzqt(SPUtils.getBoolean("kline_double_click", true)));
        pairArr[13] = C56390yDp.OLrzqt("cancel_order_confirmation", OLrzqt(SPUtils.getBoolean("kline_order_cancel_confirm", true)));
        pairArr[14] = C56390yDp.OLrzqt("sync_drawings", OLrzqt(SPUtils.getBoolean("kline_drawing_data", true)));
        pairArr[15] = C56390yDp.OLrzqt("remove_drawings", OLrzqt(SPUtils.getBoolean("kline_drawing_data_clear", true)));
        pairArr[16] = C56390yDp.OLrzqt("version_type", OLrzqt());
        return C56424yEw.gEmmrt(pairArr);
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("upload_main_setting_before", false);
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("upload_sub_setting_before", false);
    }

    public final void gEmmrt() {
        copydefault = AEQbTJ();
    }

    public final void AYXKKw() {
        SPUtils.put("upload_main_setting_before", java.lang.Boolean.TRUE);
        copydefault = null;
    }

    public final void AhwBna() {
        OLrzqt = EZpvd();
    }

    public final void valueOf() {
        SPUtils.put("upload_sub_setting_before", java.lang.Boolean.TRUE);
        OLrzqt = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt() {
        java.lang.String mode = C36246oUr.copydefault().zLjUOn().getMode();
        int iHashCode = mode.hashCode();
        if (iHashCode != -1470940708) {
            if (iHashCode != -1008606219) {
                if (iHashCode == -766214508 && mode.equals("lite_mode")) {
                    return "cr";
                }
            } else if (mode.equals("pro_mode")) {
                return "global";
            }
            return "dex";
        }
        if (!mode.equals("cedefi_mode")) {
            return "dex";
        }
    }
}
