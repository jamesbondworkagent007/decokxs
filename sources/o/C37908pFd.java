package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37908pFd {
    public static /* synthetic */ void changeTimeEvent$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        OLrzqt(str, z);
    }

    public static final void OLrzqt(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.copydefault(str, z, (EventParamsList) obj);
            }
        });
        pXB pxb = pXB.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            str = "line";
        }
        pxb.AEQbTJ("Kline_Time_Select", C56423yEv.EZpvd(C56390yDp.OLrzqt("timeframe_type", str)));
    }

    public static final Unit copydefault(java.lang.String str, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            str = "line";
        }
        eventParamsList.put("timeframe_type", str, true);
        eventParamsList.put("chart_layout", z ? "fullscreen" : "classic", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void moreTimeEvent$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        EZpvd(z);
    }

    public static final void EZpvd(final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AEQbTJ(z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("timeframe_dropdown_entry", "timeframe_dropdown_entry", false);
        eventParamsList.put("chart_layout", z ? "fullscreen" : "classic", true);
        return Unit.INSTANCE;
    }

    public static final void KWHzl() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AYXKKw((EventParamsList) obj);
            }
        });
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("indicator_dropdown_entry", "indicator_dropdown_entry", false);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    public static final void EZpvd() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.EZpvd((EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chart_top_setting", "chart_top_setting", false);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pFd$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Character chWlaJM = C59454zhO.wlaJM((java.lang.String) t);
            java.lang.Character chValueOf = chWlaJM != null ? java.lang.Character.valueOf(java.lang.Character.toUpperCase(chWlaJM.charValue())) : null;
            java.lang.Character chWlaJM2 = C59454zhO.wlaJM((java.lang.String) t2);
            return yET.KWHzl(chValueOf, chWlaJM2 != null ? java.lang.Character.valueOf(java.lang.Character.toUpperCase(chWlaJM2.charValue())) : null);
        }
    }

    public static final void copydefault(@NotNull java.lang.String str, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strKWHzl = KWHzl(str, z2);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.KWHzl(strKWHzl, z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("indicator_type", lowerCase, true);
        eventParamsList.put("status", z ? "turn_on" : "turn_off", true);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -1757553894) {
            if (iHashCode != 81860) {
                if (iHashCode == 2044557 && str.equals("BOLL")) {
                    return z ? "BOLL_MAIN" : "BOLL_SUB";
                }
            } else if (str.equals("SAR")) {
                return z ? "SAR_MAIN" : "SAR_SUB";
            }
        } else if (str.equals("VOLUME")) {
            return z ? "VOLUME_MAIN" : "VOLUME_SUB";
        }
        return C39215poB.OLrzqt.OLrzqt(str);
    }

    public static /* synthetic */ void indicatorSelectFragmentEvent$default(java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        EZpvd(str, z, z2, z3, bool);
    }

    public static final void EZpvd(@NotNull java.lang.String str, final boolean z, boolean z2, final boolean z3, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strKWHzl = KWHzl(str, z2);
        C32866mlf.onEvent$default("KLine_IndicatorPop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.OLrzqt(strKWHzl, z, z3, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        pXB.EZpvd.AEQbTJ("Kline_Indicator_Select", C56423yEv.EZpvd(C56390yDp.OLrzqt("indicator", strKWHzl)));
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, boolean z2, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("app_indicator_type", lowerCase, true);
        eventParamsList.put("status", z ? "turn_on" : "turn_off", true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_layout", z2 ? "fullscreen" : "classic", true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("IndicatorSettings_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.gEmmrt(str, z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(java.lang.String str, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("indicator_type", str, true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", z ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void klineSettingTrackEvent$default(java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        EZpvd(str, z, z2);
    }

    public static final void EZpvd(@NotNull final java.lang.String str, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_SettingPop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.OLrzqt(str, z, z2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, boolean z2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("function_switch", str, true);
        eventParamsList.put("switch_status", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        eventParamsList.put("chart_layout", z2 ? "fullscreen" : "classic", true);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.fetchVPNInfo(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "order_line", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "long_press_popup", true);
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AYXKKw(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AYXKKw(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "position_line", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "long_press_popup", true);
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final void copydefault() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.OLrzqt((EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "countdown", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Chart_Header_CoinSwitch_Swipe", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.DbNXlk(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit DbNXlk(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("swipe_direction", str, true);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Chart_AdvancedFunctions_EntryButton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.valueOf(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit valueOf(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("advanced_functions", str, true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Chart_Comparison_Setting_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public static final void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Chart_Comparison_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AhwBna(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AhwBna(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("account_type", str, true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.Map<java.lang.String, java.lang.Integer> mapOLrzqt = OLrzqt(str);
        C32866mlf.onEvent$default("Chart_CustomFormula_OperationStatus_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AEQbTJ(mapOLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final void valueOf(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("PlaceOrder_PriceDrag_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.gEmmrt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("biz_type", lowerCase, true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Landscape_Search_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public static final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt(java.lang.String str) {
        java.util.Map mapIsConnected = C56424yEw.isConnected(C56424yEw.djBIcL(C56390yDp.OLrzqt(Marker.ANY_NON_NULL_MARKER, 0), C56390yDp.OLrzqt("-", 0), C56390yDp.OLrzqt("*", 0), C56390yDp.OLrzqt("/", 0)));
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '(') {
                i++;
            } else if (cCharAt == '-' || cCharAt == '/' || cCharAt == '*' || cCharAt == '+') {
                mapIsConnected.put(java.lang.String.valueOf(cCharAt), java.lang.Integer.valueOf(((java.lang.Number) mapIsConnected.getOrDefault(java.lang.String.valueOf(cCharAt), 0)).intValue() + 1));
            }
        }
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("plus", mapIsConnected.getOrDefault(Marker.ANY_NON_NULL_MARKER, 0)), C56390yDp.OLrzqt("minus", mapIsConnected.getOrDefault("-", 0)), C56390yDp.OLrzqt("multiply", mapIsConnected.getOrDefault("*", 0)), C56390yDp.OLrzqt("divide", mapIsConnected.getOrDefault("/", 0)), C56390yDp.OLrzqt("pair", java.lang.Integer.valueOf(i)));
    }

    public static final java.lang.CharSequence EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final void KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.String> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        final java.lang.String strCopydefault = copydefault(arrayList, arrayList2);
        final java.lang.String str = pEI.EZpvd.AEQbTJ() ? "tradingview" : "original";
        C32866mlf.onEvent$default("KLine_Mid_IndicatorAll_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.OLrzqt(strCopydefault, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_indicator_type", str, true);
        eventParamsList.put("chart_type", str2, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final void copydefault(boolean z) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        try {
            TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl("ds0");
            if (templateSettingKWHzl == null || (arrayList = templateSettingKWHzl.getMainIndicatorNames()) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            if (templateSettingKWHzl == null || (arrayList2 = templateSettingKWHzl.getSideIndicatorNames()) == null) {
                arrayList2 = new java.util.ArrayList<>();
            }
            OLrzqt(copydefault(arrayList, arrayList2), pEI.EZpvd.AEQbTJ() ? "tradingview" : "original", z ? "kline_order" : "trade_page");
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default("KLine_Indicator_Trade_Click", (TrackChannel[]) null, new Function1() { // from class: o.pFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.AEQbTJ(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_indicator_type", str, true);
        eventParamsList.put("chart_type", str2, true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("trade_type", str3, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.String> arrayList2) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (java.lang.String str : arrayList) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1757553894) {
                if (iHashCode != 81860) {
                    if (iHashCode == 2044557 && str.equals("BOLL")) {
                        str = "BOLL_MAIN";
                    }
                } else if (str.equals("SAR")) {
                    str = "SAR_MAIN";
                }
            } else if (str.equals("VOLUME")) {
                str = "VOLUME_MAIN";
            }
            arrayList3.add(str);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (java.lang.String str2 : arrayList2) {
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1757553894) {
                if (iHashCode2 != 81860) {
                    strOLrzqt = (iHashCode2 == 2044557 && str2.equals("BOLL")) ? "BOLL_SUB" : C39215poB.OLrzqt.OLrzqt(str2);
                } else if (str2.equals("SAR")) {
                    strOLrzqt = "SAR_SUB";
                }
            } else if (str2.equals("VOLUME")) {
                strOLrzqt = "VOLUME_SUB";
            }
            arrayList4.add(strOLrzqt);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList3, (java.lang.Iterable) arrayList4), new Activity()), ",", null, null, 0, null, new Function1() { // from class: o.pFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37908pFd.EZpvd((java.lang.String) obj);
            }
        }, 30, null);
    }

    public static final Unit AEQbTJ(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), java.lang.String.valueOf(((java.lang.Number) entry.getValue()).intValue()), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
