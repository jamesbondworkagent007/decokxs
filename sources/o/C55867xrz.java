package o;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55867xrz {
    public static final C55867xrz KWHzl = new C55867xrz();

    /* JADX INFO: renamed from: o.xrz$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HomeSignalSortConfig.values().length];
            try {
                iArr[HomeSignalSortConfig.FOLLOWER_ASSETS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HomeSignalSortConfig.TOTAL_FOLLOWER_COUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    private C55867xrz() {
    }

    public final void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("SignalDetails_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xrV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AuCTel(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AuCTel(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void gEmmrt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("SignalDetails_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.values(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit values(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void djBIcL(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("SignalDetails_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AuCTel(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AuCTel(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, "filter_sort", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("SignalDetails_Sheet_SubscriptionModel_View", (TrackChannel[]) null, new Function1() { // from class: o.xrT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AkhnZx((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("SignalDetails_Sheet_SubscriptionModel_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fIwbmz(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fIwbmz(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription") ? "SignalDetails_Sheet_SubscriptionConfirm_View" : "SignalDetails_Sheet_ShareSubscriptionConfirm_View", (TrackChannel[]) null, new Function1() { // from class: o.xrX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fetchVPNInfo((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void valueOf(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription") ? "SignalDetails_Sheet_SubscriptionConfirm_Click" : "SignalDetails_Sheet_ShareSubscriptionConfirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.xry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fJNWhG(str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C32866mlf.onEvent$default("SignalDetails_Pop_SubscriptionSuccess_View", (TrackChannel[]) null, new Function1() { // from class: o.xsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("SignalDetails_Pop_SubscriptionSuccess_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.ejfBZ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit ejfBZ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void signalMarketPlaceClickEvent$default(C55867xrz c55867xrz, java.lang.String str, HomeSignalSortConfig homeSignalSortConfig, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        c55867xrz.EZpvd(str, homeSignalSortConfig, str2);
    }

    public final void EZpvd(@NotNull final java.lang.String str, final HomeSignalSortConfig homeSignalSortConfig, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("SignalMarketplace_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.KWHzl(str, homeSignalSortConfig, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, HomeSignalSortConfig homeSignalSortConfig, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        int i = homeSignalSortConfig == null ? -1 : Application.KWHzl[homeSignalSortConfig.ordinal()];
        EventParamsList.put$default(eventParamsList, "filter_sort", i != 1 ? i != 2 ? "backtest" : "subscribers" : "signal_size", false, 4, null);
        if (str2 != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            EventParamsList.put$default(eventParamsList, AppsFlyerProperties.CHANNEL, lowerCase, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56058xve.ActionBar actionBar = C56058xve.Companion;
        C56058xve.Activity activityEZpvd = actionBar.copydefault().EZpvd();
        final java.lang.String strCopydefault = activityEZpvd != null ? activityEZpvd.copydefault() : null;
        C56058xve.Activity activityEZpvd2 = actionBar.copydefault().EZpvd();
        final java.lang.String strDjBIcL = activityEZpvd2 != null ? activityEZpvd2.djBIcL() : null;
        C56058xve.Activity activityEZpvd3 = actionBar.copydefault().EZpvd();
        final java.lang.String strAYXKKw = activityEZpvd3 != null ? activityEZpvd3.AYXKKw() : null;
        C56058xve.Activity activityEZpvd4 = actionBar.copydefault().EZpvd();
        final java.lang.String strValueOf = activityEZpvd4 != null ? activityEZpvd4.valueOf() : null;
        C32866mlf.onEvent$default("BotPlaceOrder_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.copydefault(str, str2, strCopydefault, strDjBIcL, strAYXKKw, strValueOf, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        EventParamsList.put$default(eventParamsList, "instrument_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, AppsFlyerProperties.CHANNEL, str3 == null ? "" : str3, false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            EventParamsList.put$default(eventParamsList, "utm_medium", str4 == null ? "" : str4, false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str5)) {
            EventParamsList.put$default(eventParamsList, "utm_source", str5 == null ? "" : str5, false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str6)) {
            EventParamsList.put$default(eventParamsList, "utm_term", str6 != null ? str6 : "", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("GridSimpleMode_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xrK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AYXKKw(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "instrument_name", str2, false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            Intrinsics.copydefault((java.lang.Object) str3);
            EventParamsList.put$default(eventParamsList, "source", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void gridGuideButtonClick$default(C55867xrz c55867xrz, GridReq gridReq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        c55867xrz.AEQbTJ(gridReq, str, str2);
    }

    public final void AEQbTJ(@NotNull final GridReq gridReq, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("GridSimpleMode_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.OLrzqt(gridReq, str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(GridReq gridReq, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", gridReq.getOrdType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "instrument_name", gridReq.getInstId(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "investccy", gridReq.getInvestSymbol(), false, 4, null);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            EventParamsList.put$default(eventParamsList, "invest_amount", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("TradingBot_MyBot_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AYXKKw((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_MyBot_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.DbNXlk(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit DbNXlk(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("TradingBot_Mid_BotCard_View", (TrackChannel[]) null, new Function1() { // from class: o.xrE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ void botCreateCardClick$default(C55867xrz c55867xrz, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c55867xrz.EZpvd(str, str2);
    }

    public final void EZpvd(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_Mid_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.djBIcL(str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.util.Map<java.lang.String, java.lang.String> map) {
        C32866mlf.onEvent$default("MarketplaceBotManualParam_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.copydefault(map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.util.Map map, EventParamsList eventParamsList) {
        java.util.Set<Map.Entry> setEntrySet;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onGridBotAdvancedSettingsClick$default(C55867xrz c55867xrz, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c55867xrz.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("GridPlaceOrder_Mid_AdvancedSettings_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.KWHzl(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bot_type", str);
        if (str2 != null) {
        }
        if (str3 != null) {
            linkedHashMap.put("grid_mode", str3);
        }
        C56028xvA.OLrzqt("GridPlaceOrder_Mid_AdvancedSettings_Click", linkedHashMap);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "grid_mode", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.util.Map<java.lang.String, java.lang.String> map) {
        C32866mlf.onEvent$default("MarketplaceBotPlaceOrder_Mid_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AEQbTJ(map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.util.Map map, EventParamsList eventParamsList) {
        java.util.Set<Map.Entry> setEntrySet;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, "Manual", false, 4, null);
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.values(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit values(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "tab", false, 4, null);
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void clickMyGridBotCard$default(C55867xrz c55867xrz, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c55867xrz.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Mygridbot_Full_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.copydefault(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "more_click", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Gridbotdetails_full_Botpage_click", (TrackChannel[]) null, new Function1() { // from class: o.xrW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.valueOf(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Creatbot_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.isConnected(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit isConnected(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("TradingBot_Full_Homepage_View", (TrackChannel[]) null, new Function1() { // from class: o.xsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.DbNXlk((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_Top_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.isConnected(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit isConnected(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("TradingBot_Mid_ManualBot_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fetchVPNInfo(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_Mid_Ongoing_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AkhnZx(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AkhnZx(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("TradingBot_Mid_Banner_View", (TrackChannel[]) null, new Function1() { // from class: o.xrH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.AkhnZx(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AkhnZx(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "card_id", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final int i, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradingBot_Top_Banner_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.EZpvd(i, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(int i, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "position_type", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "card_id", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C32866mlf.onEvent$default("TradingBot_Mid_Smarttrading_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ void clickForNewNmpRecommend$default(C55867xrz c55867xrz, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c55867xrz.copydefault(str);
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_Mid_Smarttrading_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fetchVPNInfo(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (str != null) {
                EventParamsList.put$default(eventParamsList, "underlying_id", str, false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, "button", "computing", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "button", "card", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void clickForOngoingNmpRecommend$default(C55867xrz c55867xrz, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c55867xrz.KWHzl(z, str);
    }

    public final void KWHzl(final boolean z, final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_Ongoing_Recommend_Click", (TrackChannel[]) null, new Function1() { // from class: o.xsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.OLrzqt(str, z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (str != null) {
                EventParamsList.put$default(eventParamsList, "underlying_id", str, false, 4, null);
                EventParamsList.put$default(eventParamsList, "button", "card", false, 4, null);
            } else {
                EventParamsList.put$default(eventParamsList, "button", "more", false, 4, null);
            }
        }
        EventParamsList.put$default(eventParamsList, "page", z ? "bot_ongoing" : "nmp_ongoing", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull BotGrafanaInfo botGrafanaInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(botGrafanaInfo, "");
        EventData eventData = new EventData();
        eventData.setAct("bot_create_page_end");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page", str3);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str);
        linkedHashMap.put("unified_amount", botGrafanaInfo.getCreateCount());
        linkedHashMap.put("pauseTime", str2);
        linkedHashMap.put("totalTime", str4);
        linkedHashMap.put("application_attach", str5);
        linkedHashMap.put("start_mode", botGrafanaInfo.getSecondaryConfirm() ? "1" : "0");
        C56058xve.Activity activityEZpvd = C56058xve.Companion.copydefault().EZpvd();
        java.lang.String strCopydefault = activityEZpvd != null ? activityEZpvd.copydefault() : null;
        java.lang.String str6 = strCopydefault != null ? strCopydefault : "";
        if (str6.length() == 0) {
            str6 = "trade_bot_main_page";
        }
        linkedHashMap.put("pic_size", str6);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("BotEventTrack", "BotEventTrack reportTradeInit: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull BotGrafanaInfo botGrafanaInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(botGrafanaInfo, "");
        EventData eventData = new EventData();
        eventData.setAct("bot_create_confirm_page_end");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page", str3);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str);
        linkedHashMap.put("unified_amount", botGrafanaInfo.getCreateCount());
        linkedHashMap.put("pauseTime", str2);
        linkedHashMap.put("application_attach", str4);
        linkedHashMap.put("trade_type", str5);
        linkedHashMap.put("start_mode", botGrafanaInfo.getSecondaryConfirm() ? "1" : "0");
        linkedHashMap.put("walletType", botGrafanaInfo.getErrorMsg());
        if (botGrafanaInfo.getCreateStateCode().length() > 0) {
            linkedHashMap.put("payment_channel", botGrafanaInfo.getCreateStateCode());
        }
        C56058xve.Activity activityEZpvd = C56058xve.Companion.copydefault().EZpvd();
        java.lang.String strCopydefault = activityEZpvd != null ? activityEZpvd.copydefault() : null;
        java.lang.String str6 = strCopydefault != null ? strCopydefault : "";
        if (str6.length() == 0) {
            str6 = "trade_bot_main_page";
        }
        linkedHashMap.put("pic_size", str6);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("BotEventTrack", "BotEventTrack reportTradeInit: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void djBIcL(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("RunningBot_OrderDisplay_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.xrY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.fARcdN(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fARcdN(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_source", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AhwBna(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("RunningBot_OrderDisplay_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.xrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55867xrz.DbNXlk(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit DbNXlk(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "create_bot", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackOrderPlacementEvent$default(C55867xrz c55867xrz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            th = null;
        }
        c55867xrz.OLrzqt(str, str2, str3, th);
    }

    public final void OLrzqt(final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, java.lang.Throwable th) {
        java.lang.Object objM7377constructorimpl;
        JsonObject response;
        JsonArray asJsonArray;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C56058xve.ActionBar actionBar = C56058xve.Companion;
        final C56058xve.Activity activityEZpvd = actionBar.copydefault().EZpvd();
        boolean z = str == null || str.length() == 0;
        final java.util.HashMap<java.lang.String, java.lang.String> mapOLrzqt = actionBar.copydefault().OLrzqt();
        try {
            Result.Application application = Result.Companion;
            OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
            objM7377constructorimpl = Result.m7377constructorimpl(C33129mqd.gEmmrt((oKServerException == null || (response = oKServerException.getResponse()) == null || (asJsonArray = response.getAsJsonArray("data")) == null || (jsonElement = (JsonElement) CollectionsKt___CollectionsKt.RcXXUw(asJsonArray)) == null || (asJsonObject = jsonElement.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get("sCode")) == null) ? null : jsonElement2.getAsString()));
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        final java.lang.Object obj = objM7377constructorimpl;
        java.lang.String strDjBIcL = activityEZpvd != null ? activityEZpvd.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        final java.lang.String lowerCase = strDjBIcL.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String strAYXKKw = activityEZpvd != null ? activityEZpvd.AYXKKw() : null;
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        final java.lang.String lowerCase2 = strAYXKKw.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.String strValueOf = activityEZpvd != null ? activityEZpvd.valueOf() : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        final java.lang.String lowerCase3 = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        final boolean z2 = !z;
        C32866mlf.onEvent$default("TradingBotPlaceOrder_Result_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.xrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C55867xrz.KWHzl(activityEZpvd, str, z2, obj, str2, str3, lowerCase, lowerCase2, lowerCase3, mapOLrzqt, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C56058xve.Activity activity, java.lang.String str, boolean z, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.HashMap map, EventParamsList eventParamsList) {
        java.lang.String str7;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strCopydefault = activity != null ? activity.copydefault() : null;
        if (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            strCopydefault = "trade_bot_main_page";
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        EventParamsList.put$default(eventParamsList, AppsFlyerProperties.CHANNEL, lowerCase, false, 4, null);
        java.lang.String strKWHzl = activity != null ? activity.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        java.lang.String lowerCase2 = strKWHzl.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        EventParamsList.put$default(eventParamsList, "channel_details", lowerCase2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "strategy_id", str == null ? "" : str, false, 4, null);
        java.lang.String strAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        EventParamsList.put$default(eventParamsList, "activity_id", strAEQbTJ == null ? "" : strAEQbTJ, false, 4, null);
        eventParamsList.put("is_success", z ? "yes" : "no", true);
        if (!z) {
            java.lang.String str8 = (java.lang.String) (Result.m7383isFailureimpl(obj) ? null : obj);
            str7 = str8 == null ? "" : str8;
        }
        EventParamsList.put$default(eventParamsList, "error_code", str7, false, 4, null);
        java.lang.String strOLrzqt = activity != null ? activity.OLrzqt() : null;
        EventParamsList.put$default(eventParamsList, "card_id", strOLrzqt == null ? "" : strOLrzqt, false, 4, null);
        java.lang.String strOLrzqt2 = activity != null ? activity.OLrzqt() : null;
        EventParamsList.put$default(eventParamsList, "card_position", strOLrzqt2 == null ? "" : strOLrzqt2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "instrument_name", str3, false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            EventParamsList.put$default(eventParamsList, "utm_medium", str4, false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str5)) {
            EventParamsList.put$default(eventParamsList, "utm_source", str5, false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str6)) {
            EventParamsList.put$default(eventParamsList, "utm_term", str6, false, 4, null);
        }
        if (map != null) {
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, "Manual", false, 4, null);
            java.util.Set<Map.Entry> setEntrySet = map.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            for (Map.Entry entry : setEntrySet) {
                java.lang.Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                EventParamsList.put$default(eventParamsList, (java.lang.String) key, (java.lang.String) value, false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
