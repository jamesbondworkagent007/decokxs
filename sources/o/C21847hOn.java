package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.dexlogic.track.enums.KlineType;
import com.okinc.business.dexlogic.track.enums.TradeType;
import com.okinc.business.dexui.main.market.base.ActionOnMarketDetail;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21847hOn {
    public static boolean EZpvd = true;

    /* JADX INFO: renamed from: o.hOn$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeIntervalType.values().length];
            try {
                iArr[TimeIntervalType.FIVE_MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimeIntervalType.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeIntervalType.FOUR_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeIntervalType.TWENTY_FOUR_HOUR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AhwBna() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AkhnZx() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String DbNXlk() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void KWHzl(boolean z) {
        EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(int i) {
        switch (i) {
            case 0:
                return "default";
            case 1:
                return FirebaseAnalytics.Param.PRICE;
            case 2:
                return "change";
            case 3:
                return "txns";
            case 4:
                return "traders";
            case 5:
                return "turnover";
            case 6:
                return "mcap";
            case 7:
                return "liquidity";
            case 8:
                return CrashHianalyticsData.TIME;
            case 9:
                return "searches";
            case 10:
                return "holders";
            default:
                return "unknown";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fetchVPNInfo() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean valueOf() {
        return EZpvd;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull TimeIntervalType timeIntervalType, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final java.lang.String str6, final java.lang.Boolean bool, final java.lang.String str7) {
        java.lang.String str8;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        int i = TaskDescription.KWHzl[timeIntervalType.ordinal()];
        if (i == 1) {
            str8 = "5m";
        } else if (i == 2) {
            str8 = "1h";
        } else if (i == 3) {
            str8 = "4h";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str8 = "24h";
        }
        final java.lang.String str9 = str8;
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Full_Page_View", new TrackChannel[0], new Function1() { // from class: o.hOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.copydefault(bool, str7, str, str2, str3, str9, str4, str5, str6, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, EventParamsList eventParamsList) {
        java.lang.String str9;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (bool != null) {
            bool.booleanValue();
            EventParamsList.put$default(eventParamsList, "module", bool.booleanValue() ? "scanner" : "explore", false, 4, null);
        }
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            EventParamsList.put$default(eventParamsList, "page_name", lowerCase, false, 4, null);
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        EventParamsList.put$default(eventParamsList, "list_key", lowerCase2, false, 4, null);
        java.lang.String lowerCase3 = str3.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        EventParamsList.put$default(eventParamsList, "chain_id", lowerCase3, false, 4, null);
        java.lang.String lowerCase4 = str4.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        EventParamsList.put$default(eventParamsList, "chain_name", lowerCase4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "time_dimension", str5, false, 4, null);
        java.lang.String str10 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        if (str10 == null) {
            str10 = "";
        }
        EventParamsList.put$default(eventParamsList, "channel_id", str10, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str6, (Function0<java.lang.String>) new Function0() { // from class: o.hOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.AhwBna();
            }
        }), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", str7, false, 4, null);
        if (str8 == null) {
            str9 = "none";
        } else {
            str9 = C33129mqd.OLrzqt((java.lang.CharSequence) str8) ? str8 : null;
            if (str9 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str9, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final TimeIntervalType timeIntervalType, final java.lang.String str4, final java.lang.Integer num, final java.lang.Boolean bool, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7, final boolean z, final java.lang.String str8) {
        java.lang.String str9 = "";
        Intrinsics.checkNotNullParameter(str, "");
        int i = timeIntervalType == null ? -1 : TaskDescription.KWHzl[timeIntervalType.ordinal()];
        if (i == 1) {
            str9 = "5m";
        } else if (i == 2) {
            str9 = "1h";
        } else if (i == 3) {
            str9 = "4h";
        } else if (i == 4) {
            str9 = "24h";
        }
        final java.lang.String str10 = str9;
        C32866mlf.onEvent$default("DEXMarket_Watchlist_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AEQbTJ(str3, timeIntervalType, str2, str4, str6, str7, str, num, bool, str5, z, str8, str10, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, TimeIntervalType timeIntervalType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str7, boolean z, java.lang.String str8, java.lang.String str9, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            EventParamsList.put$default(eventParamsList, "list_key", lowerCase, false, 4, null);
        }
        if (timeIntervalType != null) {
            EventParamsList.put$default(eventParamsList, "time_dimension", str9, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "card_name", str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "chain_name", str3, false, 4, null);
        }
        if (str4 != null) {
            EventParamsList.put$default(eventParamsList, "list_click", str4, false, 4, null);
        }
        if (str5 != null) {
            EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str6, (Function0<java.lang.String>) new Function0() { // from class: o.hOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.fetchVPNInfo();
            }
        }), false, 4, null);
        if (num != null) {
            EventParamsList.put$default(eventParamsList, "sort_name", copydefault(num.intValue()), false, 4, null);
        }
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, "sort_type", bool.booleanValue() ? "down" : "up", false, 4, null);
        }
        if (str7 != null) {
            EventParamsList.put$default(eventParamsList, "token_favourite", str7, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "module", z ? "scanner" : "token_watchlist", false, 4, null);
        if (str8 != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str8, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = new Regex("[.\\s-]").replace(str, "_").toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.Integer num, final TimeIntervalType timeIntervalType, final java.lang.String str4, final java.lang.Boolean bool, final java.lang.String str5, final java.lang.Boolean bool2, final java.lang.String str6, final java.lang.String str7, final java.lang.String str8, final java.lang.String str9, final java.lang.String str10, final java.lang.String str11, final java.lang.Boolean bool3, final java.lang.String str12) {
        java.lang.String str13 = "";
        Intrinsics.checkNotNullParameter(str, "");
        int i = timeIntervalType == null ? -1 : TaskDescription.KWHzl[timeIntervalType.ordinal()];
        if (i == 1) {
            str13 = "5m";
        } else if (i == 2) {
            str13 = "1h";
        } else if (i == 3) {
            str13 = "4h";
        } else if (i == 4) {
            str13 = "24h";
        }
        final java.lang.String str14 = str13;
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Full_Page_Click", new TrackChannel[0], new Function1() { // from class: o.hOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.copydefault(bool3, str12, str3, timeIntervalType, str2, str4, bool2, str6, str7, num, bool, str, str5, str11, str10, str8, str9, str14, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, TimeIntervalType timeIntervalType, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool2, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Boolean bool3, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, EventParamsList eventParamsList) {
        java.lang.String str14;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (bool != null) {
            bool.booleanValue();
            EventParamsList.put$default(eventParamsList, "module", bool.booleanValue() ? "scanner" : "explore", false, 4, null);
        }
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            EventParamsList.put$default(eventParamsList, "page_name", lowerCase, false, 4, null);
        }
        if (str2 != null) {
            java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            EventParamsList.put$default(eventParamsList, "list_key", lowerCase2, false, 4, null);
        }
        if (timeIntervalType != null) {
            EventParamsList.put$default(eventParamsList, "time_dimension", str13, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "card_name", OLrzqt(str3), false, 4, null);
        }
        if (str4 != null) {
            EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        }
        if (bool2 != null) {
            bool2.booleanValue();
            EventParamsList.put$default(eventParamsList, "search", "1", false, 4, null);
        }
        if (str5 != null) {
            EventParamsList.put$default(eventParamsList, "list_click", str5, false, 4, null);
        }
        if (str6 != null) {
            EventParamsList.put$default(eventParamsList, "chain_id", str6, false, 4, null);
        }
        if (num != null) {
            EventParamsList.put$default(eventParamsList, "sort_name", copydefault(num.intValue()), false, 4, null);
        }
        if (bool3 != null) {
            EventParamsList.put$default(eventParamsList, "sort_type", bool3.booleanValue() ? "down" : "up", false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str7, (Function0<java.lang.String>) new Function0() { // from class: o.hOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.djBIcL();
            }
        }), false, 4, null);
        if (str8 != null) {
            EventParamsList.put$default(eventParamsList, "token_favourite", str8, false, 4, null);
        }
        if (str9 == null) {
            str14 = "none";
        } else {
            str14 = C33129mqd.OLrzqt((java.lang.CharSequence) str9) ? str9 : null;
            if (str14 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str14, false, 4, null);
        if (str10 != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str10, false, 4, null);
        }
        if (str11 != null) {
            EventParamsList.put$default(eventParamsList, "token_address", str11, false, 4, null);
        }
        if (str12 != null) {
            EventParamsList.put$default(eventParamsList, "token_symbol", str12, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        C32866mlf.onEvent$default("DEXMarket_Token_TokenLabel_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.EZpvd(str4, str2, str5, str, str3, str6, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_Click", new TrackChannel[0], new Function1() { // from class: o.hON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AYXKKw(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AYXKKw(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str, (Function0<java.lang.String>) new Function0() { // from class: o.hOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.AYXKKw();
            }
        }), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "my_position_popup", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo, @NotNull TokenDetailClickLayer tokenDetailClickLayer, @NotNull TokenDetailButtonName tokenDetailButtonName, @NotNull CoinDetailTabType coinDetailTabType) {
        Intrinsics.checkNotNullParameter(tokenDetailEventTrackingInfo, "");
        Intrinsics.checkNotNullParameter(tokenDetailClickLayer, "");
        Intrinsics.checkNotNullParameter(tokenDetailButtonName, "");
        Intrinsics.checkNotNullParameter(coinDetailTabType, "");
        java.lang.String strAEQbTJ = tokenDetailEventTrackingInfo.AEQbTJ();
        java.lang.String strOLrzqt = tokenDetailEventTrackingInfo.OLrzqt();
        trackDexMarketTokenPageClick$default(tokenDetailEventTrackingInfo.copydefault(), tokenDetailEventTrackingInfo.KWHzl(), tokenDetailEventTrackingInfo.EZpvd(), strOLrzqt, coinDetailTabType, strAEQbTJ, null, null, null, null, null, null, null, null, null, tokenDetailButtonName, null, tokenDetailEventTrackingInfo.valueOf(), tokenDetailClickLayer, null, null, tokenDetailEventTrackingInfo.gEmmrt(), 1671104, null);
    }

    public static /* synthetic */ void trackDexMarketTokenPageClick$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, CoinDetailTabType coinDetailTabType, java.lang.String str5, java.lang.Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, java.lang.String str6, java.lang.Boolean bool2, java.lang.String str7, java.lang.Boolean bool3, java.lang.String str8, TokenDetailButtonName tokenDetailButtonName, java.lang.String str9, java.lang.String str10, TokenDetailClickLayer tokenDetailClickLayer, java.lang.Boolean bool4, ChartDetailFragment.Companion.SubChartTabType subChartTabType2, boolean z, int i, java.lang.Object obj) {
        copydefault(str, str2, str3, str4, coinDetailTabType, str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : tradeType, (i & 256) != 0 ? null : subChartTabType, (i & 512) != 0 ? null : klineType, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : tokenDetailButtonName, (65536 & i) != 0 ? null : str9, str10, (262144 & i) != 0 ? null : tokenDetailClickLayer, (524288 & i) != 0 ? null : bool4, (i & 1048576) != 0 ? null : subChartTabType2, z);
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final CoinDetailTabType coinDetailTabType, @NotNull final java.lang.String str5, final java.lang.Boolean bool, final TradeType tradeType, final ChartDetailFragment.Companion.SubChartTabType subChartTabType, final KlineType klineType, final java.lang.String str6, final java.lang.Boolean bool2, final java.lang.String str7, final java.lang.Boolean bool3, final java.lang.String str8, final TokenDetailButtonName tokenDetailButtonName, final java.lang.String str9, final java.lang.String str10, final TokenDetailClickLayer tokenDetailClickLayer, final java.lang.Boolean bool4, final ChartDetailFragment.Companion.SubChartTabType subChartTabType2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_Click", new TrackChannel[0], new Function1() { // from class: o.hOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.copydefault(str5, str, str2, coinDetailTabType, str3, str4, str10, bool, tradeType, subChartTabType, klineType, str6, bool2, str7, bool3, str8, tokenDetailButtonName, str9, tokenDetailClickLayer, bool4, subChartTabType2, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, CoinDetailTabType coinDetailTabType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, java.lang.String str7, java.lang.Boolean bool2, java.lang.String str8, java.lang.Boolean bool3, java.lang.String str9, TokenDetailButtonName tokenDetailButtonName, java.lang.String str10, TokenDetailClickLayer tokenDetailClickLayer, java.lang.Boolean bool4, ChartDetailFragment.Companion.SubChartTabType subChartTabType2, boolean z, EventParamsList eventParamsList) {
        java.lang.String str11;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str, (Function0<java.lang.String>) new Function0() { // from class: o.hOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.AkhnZx();
            }
        }), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        java.lang.String trackingValue = coinDetailTabType != null ? coinDetailTabType.getTrackingValue() : null;
        EventParamsList.put$default(eventParamsList, "tab_name", trackingValue == null ? "" : trackingValue, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str5, false, 4, null);
        if (str6 == null) {
            str11 = "none";
        } else {
            str11 = C33129mqd.OLrzqt((java.lang.CharSequence) str6) ? str6 : null;
            if (str11 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str11, false, 4, null);
        EventParamsList.put$default(eventParamsList, "timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false, 4, null);
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, "star_favourite", bool.booleanValue() ? "yes" : "no", false, 4, null);
        }
        if (tradeType != null) {
            EventParamsList.put$default(eventParamsList, "trade_type", tradeType.getValue(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "swap_type", tradeType == TradeType.DAPP ? "redirect_dapp" : "swap", false, 4, null);
        if (subChartTabType != null) {
            EventParamsList.put$default(eventParamsList, "history_tab_name", subChartTabType.getTrackingValue(), false, 4, null);
        }
        if (klineType != null) {
            EventParamsList.put$default(eventParamsList, "kline_type", klineType.getValue(), false, 4, null);
        }
        if (str7 != null) {
            EventParamsList.put$default(eventParamsList, "kline_time", str7, false, 4, null);
        }
        if (bool2 != null) {
            bool2.booleanValue();
            EventParamsList.put$default(eventParamsList, "share_click", "1", false, 4, null);
        }
        if (str8 != null) {
            EventParamsList.put$default(eventParamsList, "copy_address_click", "1", false, 4, null);
        }
        if (bool3 != null) {
            EventParamsList.put$default(eventParamsList, "token_alert", bool3.booleanValue() ? "yes" : "no", false, 4, null);
        }
        if (str9 != null) {
            EventParamsList.put$default(eventParamsList, "app_tab_name", str9, false, 4, null);
        }
        if (tokenDetailButtonName != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, tokenDetailButtonName.getTrackingValue(), false, 4, null);
        }
        if (str10 != null) {
            EventParamsList.put$default(eventParamsList, "button_value", str10, false, 4, null);
        }
        if (tokenDetailClickLayer != null) {
            EventParamsList.put$default(eventParamsList, "ui_layer", tokenDetailClickLayer.getTrackingValue(), false, 4, null);
        }
        if (bool4 != null) {
            EventParamsList.put$default(eventParamsList, "status", java.lang.String.valueOf(bool4.booleanValue()), false, 4, null);
        }
        if (subChartTabType2 != null) {
            EventParamsList.put$default(eventParamsList, "address_label_tab_name", subChartTabType2.getTrackingValue(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "token_type", EZpvd(z), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_Click", new TrackChannel[0], new Function1() { // from class: o.hOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.gEmmrt(str, str2, str3, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit gEmmrt(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, str, str2, false, 4, null);
        if (str3 == null) {
            str3 = "none";
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                str3 = null;
            }
            if (str3 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final CoinDetailTabType coinDetailTabType, @NotNull final java.lang.String str5, final java.lang.String str6, final java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_View", new TrackChannel[0], new Function1() { // from class: o.hOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.EZpvd(str, str2, str6, coinDetailTabType, str3, str4, str7, str5, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, CoinDetailTabType coinDetailTabType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, EventParamsList eventParamsList) {
        java.lang.String str8;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "source", str3, false, 4, null);
        }
        java.lang.String trackingValue = coinDetailTabType != null ? coinDetailTabType.getTrackingValue() : null;
        EventParamsList.put$default(eventParamsList, "tab_name", trackingValue == null ? "" : trackingValue, false, 4, null);
        java.lang.String str9 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        EventParamsList.put$default(eventParamsList, "channel_id", str9 == null ? "" : str9, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str5, false, 4, null);
        if (str6 == null) {
            str8 = "none";
        } else {
            str8 = C33129mqd.OLrzqt((java.lang.CharSequence) str6) ? str6 : null;
            if (str8 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str8, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_from", C31256lqb.KWHzl(str7, (Function0<java.lang.String>) new Function0() { // from class: o.hOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21847hOn.DbNXlk();
            }
        }), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Trade_Click", new TrackChannel[0], new Function1() { // from class: o.hOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AhwBna(str, str3, str2, str4, str5, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXMarket_Token_History_View", (TrackChannel[]) null, new Function1() { // from class: o.hOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.djBIcL(str2, str, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_name", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackDexMarketMarketTokenButtonClick$default(ActionOnMarketDetail actionOnMarketDetail, TokenDetailClickLayer tokenDetailClickLayer, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tokenDetailClickLayer = null;
        }
        AEQbTJ(actionOnMarketDetail, tokenDetailClickLayer);
    }

    public static final void AEQbTJ(@NotNull final ActionOnMarketDetail actionOnMarketDetail, final TokenDetailClickLayer tokenDetailClickLayer) {
        Intrinsics.checkNotNullParameter(actionOnMarketDetail, "");
        C32866mlf.onEvent$default("DEXMarket_Token_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.KWHzl(actionOnMarketDetail, tokenDetailClickLayer, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(ActionOnMarketDetail actionOnMarketDetail, TokenDetailClickLayer tokenDetailClickLayer, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, actionOnMarketDetail.getValue(), false, 4, null);
        if (tokenDetailClickLayer != null) {
            EventParamsList.put$default(eventParamsList, "ui_layer", tokenDetailClickLayer.getTrackingValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackTokenAlertButtonClick$default(java.lang.String str, java.lang.String str2, TokenDetailClickLayer tokenDetailClickLayer, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            tokenDetailClickLayer = null;
        }
        EZpvd(str, str2, tokenDetailClickLayer);
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final TokenDetailClickLayer tokenDetailClickLayer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_Token_AlertButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.KWHzl(str, str2, tokenDetailClickLayer, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, TokenDetailClickLayer tokenDetailClickLayer, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page", "detail", false, 4, null);
        if (tokenDetailClickLayer != null) {
            EventParamsList.put$default(eventParamsList, "ui_layer", tokenDetailClickLayer.getTrackingValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ CoinDetailTabType getMarketDetailTab$default(int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return EZpvd(i, z);
    }

    public static final CoinDetailTabType EZpvd(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return CoinDetailTabType.INFO;
            }
            if (i == 1) {
                return CoinDetailTabType.CHART;
            }
            if (i == 2) {
                return CoinDetailTabType.DATA;
            }
            if (i == 3) {
                return CoinDetailTabType.ASSESSMENT;
            }
            if (i == 4) {
                return CoinDetailTabType.FEEDS;
            }
            if (i == 5) {
                return CoinDetailTabType.EARN;
            }
        } else {
            if (i == 0) {
                return CoinDetailTabType.CHART;
            }
            if (i == 1) {
                return CoinDetailTabType.INFO;
            }
            if (i == 2) {
                return CoinDetailTabType.DATA;
            }
            if (i == 3) {
                return CoinDetailTabType.ASSESSMENT;
            }
            if (i == 4) {
                return CoinDetailTabType.FEEDS;
            }
            if (i == 5) {
                return CoinDetailTabType.EARN;
            }
        }
        return null;
    }

    public static final ChartDetailFragment.Companion.SubChartTabType KWHzl(@NotNull java.util.List<jOH> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        jOH joh = (jOH) CollectionsKt___CollectionsKt.AkhnZx(list, i);
        if (joh != null) {
            return joh.AEQbTJ();
        }
        return null;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Memefactory_FullPage_View", new TrackChannel[0], new Function1() { // from class: o.hOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, str, OLrzqt(str2), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_Token_Overview_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (str.length() == 0) {
            return;
        }
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.hOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.gEmmrt(str2, str3, str4, str5, str6, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXMarket_Token_PoolFilter_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.valueOf(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Search_Dex_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AYXKKw(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "click_item", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Search_Dex_CreateWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.EZpvd(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "click_item", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Search_Dex_TokenDetails_Click", (TrackChannel[]) null, new Function1() { // from class: o.hOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.valueOf(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "click_item", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.hOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.AEQbTJ(str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_TokenPage_RiskStatusToken_View", new TrackChannel[0], new Function1() { // from class: o.hOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.copydefault(str, str2, str3, str4, str5, str6, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, VerifyDAppDomainResponse.LEVEL_RISK, str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(boolean z) {
        if (z) {
            return "rwa";
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return "non_rwa";
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_TokenPage_TokenType_View", new TrackChannel[0], new Function1() { // from class: o.hOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21847hOn.KWHzl(str, str2, str3, str4, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_type", EZpvd(z), false, 4, null);
        return Unit.INSTANCE;
    }
}
