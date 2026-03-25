package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.common.constants.CategoryType;
import com.okinc.business.market.common.constants.DurationType;
import com.okinc.business.market.common.constants.SortingType;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ktA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29408ktA {
    public static final C29408ktA KWHzl = new C29408ktA();

    /* JADX INFO: renamed from: o.ktA$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalGemType.values().length];
            try {
                iArr[SignalGemType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalGemType.GOLD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalGemType.SILVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SignalGemType.BRONZE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    private C29408ktA() {
    }

    public final void AEQbTJ(boolean z) {
        C32866mlf.onEvent$default(z ? "DEXMarket_SmartMoney_Ranking_Filter_View" : "DEXMarket_SmartMoney_Signal_FilterRange_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static /* synthetic */ void trackSmartMoneyRankingSortClick$default(C29408ktA c29408ktA, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        c29408ktA.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoneyRanking_Sort_Click", (TrackChannel[]) null, new Function1() { // from class: o.kuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.EZpvd(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str.length() > 0) {
            eventParamsList.put("ranking", KWHzl.OLrzqt(str), true);
        }
        if (str2.length() > 0) {
            eventParamsList.put("duration", KWHzl.copydefault(str2), true);
        }
        if (str3.length() > 0) {
            eventParamsList.put("tag", KWHzl.AEQbTJ(str3), false);
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoneyRanking_Function_Click", (TrackChannel[]) null, new Function1() { // from class: o.ktX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("function_name", str, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoneySignal_Card_View", (TrackChannel[]) null, new Function1() { // from class: o.ktY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AYXKKw(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("signal_id", str, false);
        eventParamsList.put("position", str2, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final TxType txType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoneySignal_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.ktV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.OLrzqt(txType, str4, str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(TxType txType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "signal_type", KWHzl.KWHzl(txType.getValue()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain", str, false, 4, null);
        eventParamsList.put("token_symbol", str2, false);
        eventParamsList.put("signal_id", str3, false);
        eventParamsList.put("position", str4, false);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final TxType txType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoneySignal_Detail_Click", (TrackChannel[]) null, new Function1() { // from class: o.kuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.copydefault(str, txType, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, TxType txType, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("number_of_addresses", str, false);
        EventParamsList.put$default(eventParamsList, "signal_type", KWHzl.KWHzl(txType.getValue()), false, 4, null);
        eventParamsList.put("token_symbol", str2, false);
        eventParamsList.put("signal_id", str3, false);
        eventParamsList.put("position", str4, false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXToken_Btm_Trade_Click", (TrackChannel[]) null, new Function1() { // from class: o.kub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.djBIcL(str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("source", str, true);
        eventParamsList.put("token_symbol", str2, false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackSignalPageView$default(C29408ktA c29408ktA, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c29408ktA.OLrzqt(str, str2, z);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_SmartMoney_Signal_View", new TrackChannel[0], new Function1() { // from class: o.ktz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.EZpvd(str, str2, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(C29229kph.OLrzqt()), false, 4, null);
        eventParamsList.put("current_tab", str, true);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "chain", str2, false, 4, null);
        }
        if (z) {
            EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "module", "signal", false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "product_type", "signal", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "signal", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final boolean z, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_Signal_Details_View", (TrackChannel[]) null, new Function1() { // from class: o.ktG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.copydefault(z, str, i, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, java.lang.String str, int i, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, z ? "buy" : "sell", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "number_of_addresses", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        eventParamsList.put("signal_id", str2, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_InfoPage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void copydefault(final boolean z) {
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_GeneralAlert_Click", (TrackChannel[]) null, new Function1() { // from class: o.kua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.EZpvd(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", z ? "off_alert" : "on_alert", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_SignalDetailPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.ktZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.valueOf(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        eventParamsList.put("button_type", str2, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_TokenSummaryCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.kue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AhwBna(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        eventParamsList.put("button_type", str2, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_ChartTimeframe_Click", (TrackChannel[]) null, new Function1() { // from class: o.ktx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.gEmmrt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        eventParamsList.put("selected_timeframe", str2, true);
        return Unit.INSTANCE;
    }

    public final void AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_SignalDetailPage_View", (TrackChannel[]) null, new Function1() { // from class: o.ktS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackSignalActivityClick$default(C29408ktA c29408ktA, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        c29408ktA.copydefault(str, str2, num);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXMarket_SmartMoney_SignalActivity_Click", (TrackChannel[]) null, new Function1() { // from class: o.kui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.OLrzqt(str, str2, num, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Integer num, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        if (num != null) {
            EventParamsList.put$default(eventParamsList, "number_of_addresses", java.lang.String.valueOf(num.intValue()), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull SignalGemType signalGemType, boolean z) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(signalGemType, "");
        int i = Activity.KWHzl[signalGemType.ordinal()];
        if (i == 1) {
            str = "all";
        } else if (i == 2) {
            str = "gold";
        } else if (i == 3) {
            str = "silver";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "bronze";
        }
        SignalTab signalTab = SignalTab.GEMS;
        trackSignalPageClick$default(this, SignalButtonNameEvent.GEMS_RANKING_CATEGORY, (java.lang.String) null, str, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, z, signalTab, (java.lang.String) null, 314, (java.lang.Object) null);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.String str5, boolean z, SignalTab signalTab, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(EZpvd(str), str2, str3, str4, bool, str5, z, signalTab, str6);
    }

    public static /* synthetic */ void trackSignalPageClick$default(C29408ktA c29408ktA, SignalButtonNameEvent signalButtonNameEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, boolean z, SignalTab signalTab, java.lang.String str5, int i, java.lang.Object obj) {
        c29408ktA.EZpvd(signalButtonNameEvent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : signalTab, (i & 256) == 0 ? str5 : null);
    }

    public final void EZpvd(@NotNull final SignalButtonNameEvent signalButtonNameEvent, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.Boolean bool, final java.lang.String str4, final boolean z, final SignalTab signalTab, final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(signalButtonNameEvent, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_SmartMoney_SignalPage_Click", new TrackChannel[0], new Function1() { // from class: o.ktW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AEQbTJ(signalButtonNameEvent, z, str, str2, str3, bool, str4, signalTab, str5, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(SignalButtonNameEvent signalButtonNameEvent, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, SignalTab signalTab, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(C29229kph.OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, signalButtonNameEvent.getInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "signal", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "signal", false, 4, null);
        if (z) {
            EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "module", "signal", false, 4, null);
        }
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "ranking_gems", str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "chain", str3, false, 4, null);
        }
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, ProductMatrixRemoteConfig.ALERT, bool.booleanValue() ? DebugKt.DEBUG_PROPERTY_VALUE_OFF : DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 4, null);
        }
        if (str4 != null) {
            EventParamsList.put$default(eventParamsList, "page", str4, false, 4, null);
        }
        if (signalTab != null) {
            EventParamsList.put$default(eventParamsList, "tab_name", signalTab.getTabValue(), false, 4, null);
        }
        if (str5 != null) {
            EventParamsList.put$default(eventParamsList, "new_value", str5, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final boolean z, @NotNull final java.lang.String str, @NotNull final C29601kwi c29601kwi, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c29601kwi, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Signal_Filter_Click", new TrackChannel[0], new Function1() { // from class: o.kud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.KWHzl(z, str, c29601kwi, str2, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(boolean z, java.lang.String str, C29601kwi c29601kwi, java.lang.String str2, final EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(C29229kph.OLrzqt()), false, 4, null);
        if (z) {
            EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "module", "signal", false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "product_type", "signal", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "signal_" + str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "protocols", str2, false, 4, null);
        final SignalMetricsFilter signalMetricsFilterEZpvd = c29601kwi.EZpvd();
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.copydefault().AhwBna(), new Function1() { // from class: o.kug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.iwGUEr(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.copydefault().KWHzl(), new Function1() { // from class: o.ktK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.hDKMBd(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.AhwBna().AhwBna(), new Function1() { // from class: o.ktN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.getNewProxyInstance(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.AhwBna().KWHzl(), new Function1() { // from class: o.ktO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.zsXlph(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.OLrzqt().AhwBna(), new Function1() { // from class: o.ktL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AubY(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.OLrzqt().KWHzl(), new Function1() { // from class: o.ktP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.wlaJM(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.djBIcL(), new Function1() { // from class: o.ktQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AuCTelauCTel(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.EZpvd(), new Function1() { // from class: o.ktU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.zLjUOn(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.djBIcL() + signalMetricsFilterEZpvd.EZpvd(), new Function1() { // from class: o.ktR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.EZpvd(eventParamsList, signalMetricsFilterEZpvd, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.valueOf().AhwBna(), new Function1() { // from class: o.ktT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.gHZMYf(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.valueOf().KWHzl(), new Function1() { // from class: o.kuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AxsJAY(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.KWHzl().AhwBna(), new Function1() { // from class: o.kuf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.AwvSrB(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.KWHzl().KWHzl(), new Function1() { // from class: o.kty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.sSMYrx(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.AEQbTJ().AhwBna(), new Function1() { // from class: o.ktw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.zuBGHE(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalMetricsFilterEZpvd.AEQbTJ().KWHzl(), new Function1() { // from class: o.ktD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.DTwDnp(eventParamsList, (java.lang.String) obj);
            }
        });
        SignalsFilter signalsFilterAEQbTJ = c29601kwi.AEQbTJ();
        C31256lqb.EZpvd(signalsFilterAEQbTJ.EZpvd().AhwBna(), new Function1() { // from class: o.ktB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.QOLQEE(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.EZpvd().KWHzl(), new Function1() { // from class: o.ktE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.ORxRYg(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.KWHzl().AhwBna(), new Function1() { // from class: o.ktC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.QKVWgx(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.KWHzl().KWHzl(), new Function1() { // from class: o.ktF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.OcIXYQ(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.copydefault().AhwBna(), new Function1() { // from class: o.ktH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.RJOkX(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.copydefault().KWHzl(), new Function1() { // from class: o.ktI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.QbewEr(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.AEQbTJ().AhwBna(), new Function1() { // from class: o.ktJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.QUSxYX(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(signalsFilterAEQbTJ.AEQbTJ().KWHzl(), new Function1() { // from class: o.ktM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29408ktA.QVAiDq(eventParamsList, (java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AubY(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_holders_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_holders_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList, SignalMetricsFilter signalMetricsFilter, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_unit", TokenAgeType.Companion.KWHzl(signalMetricsFilter.gEmmrt()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_buy_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_buy_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_sell_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DTwDnp(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_sell_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_addresses_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_addresses_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_volume_min_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OcIXYQ(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_volume_max_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_market_cap_min_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QbewEr(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_market_cap_max_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QUSxYX(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_liquidity_min_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QVAiDq(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "signals_liquidity_max_usd", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [485=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final SignalButtonNameEvent EZpvd(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -1274492040:
                if (lowerCase.equals("filter")) {
                    return SignalButtonNameEvent.FILTER_BUTTON;
                }
                break;
            case 3619493:
                if (lowerCase.equals("view")) {
                    return SignalButtonNameEvent.TOKEN_DETAILS;
                }
                break;
            case 92899676:
                if (lowerCase.equals(ProductMatrixRemoteConfig.ALERT)) {
                    return SignalButtonNameEvent.ALERT_BUTTON;
                }
                break;
            case 110621028:
                if (lowerCase.equals(ExtJson.BRC20TYPE_TRADE)) {
                    return SignalButtonNameEvent.BUY_BUTTON;
                }
                break;
            case 1085444827:
                if (lowerCase.equals("refresh")) {
                    return SignalButtonNameEvent.FILTER_BUTTON;
                }
                break;
        }
        return SignalButtonNameEvent.FILTER_BUTTON;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TxType.BUY.getValue()) ? "buy" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TxType.SELL.getValue()) ? "sell" : "";
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        SortingType sortingType = SortingType.WinRate;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) sortingType.getValue())) {
            return C31256lqb.AEQbTJ(sortingType) + "_high_to_low";
        }
        SortingType sortingType2 = SortingType.ROI;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) sortingType2.getValue())) {
            return C31256lqb.AEQbTJ(sortingType2) + "_high_to_low";
        }
        SortingType sortingType3 = SortingType.Volume;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) sortingType3.getValue())) {
            return C31256lqb.AEQbTJ(sortingType3) + "_high_to_low";
        }
        SortingType sortingType4 = SortingType.Transaction;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) sortingType4.getValue())) {
            return C31256lqb.AEQbTJ(sortingType4) + "_high_to_low";
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SortingType.PnL.getValue())) {
            return "";
        }
        java.lang.String lowerCase = "PnL".toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase + "_high_to_low";
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.ONE_DAY.getValue()) ? DexTrackEventParameter.DurationAnalyticType.ONE_DAY.getAnalyticsValue() : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.THREE_DAYS.getValue()) ? DexTrackEventParameter.DurationAnalyticType.THREE_DAYS.getAnalyticsValue() : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.SEVEN_DAYS.getValue()) ? DexTrackEventParameter.DurationAnalyticType.SEVEN_DAYS.getAnalyticsValue() : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.ONE_MONTH.getValue()) ? DexTrackEventParameter.DurationAnalyticType.ONE_MONTH.getAnalyticsValue() : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.THREE_MONTH.getValue()) ? DexTrackEventParameter.DurationAnalyticType.THREE_MONTH.getAnalyticsValue() : "";
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        CategoryType categoryType = CategoryType.ALL;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType.getValue())) {
            return C31256lqb.AEQbTJ(categoryType);
        }
        CategoryType categoryType2 = CategoryType.Sniper;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType2.getValue())) {
            return C31256lqb.AEQbTJ(categoryType2);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) CategoryType.Developer.getValue())) {
            return "dev";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) CategoryType.Fresh.getValue())) {
            return "new_address";
        }
        CategoryType categoryType3 = CategoryType.PumpSmartMoney;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType3.getValue())) {
            return C31256lqb.AEQbTJ(categoryType3);
        }
        CategoryType categoryType4 = CategoryType.KOL;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType4.getValue())) {
            return C31256lqb.AEQbTJ(categoryType4);
        }
        CategoryType categoryType5 = CategoryType.GoldDogExpert;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType5.getValue())) {
            return C31256lqb.AEQbTJ(categoryType5);
        }
        CategoryType categoryType6 = CategoryType.Bot;
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) categoryType6.getValue()) ? C31256lqb.AEQbTJ(categoryType6) : "";
    }
}
