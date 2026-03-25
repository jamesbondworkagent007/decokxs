package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.common.constants.DurationType;
import com.okinc.business.market.common.constants.SortingType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBN {
    public static final jBN copydefault = new jBN();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jBX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jBN.AEQbTJ();
        }
    });
    public static final int EZpvd = 8;

    private jBN() {
    }

    public final InterfaceC9847bdM copydefault() {
        return (InterfaceC9847bdM) AEQbTJ.getValue();
    }

    public static final InterfaceC9847bdM AEQbTJ() {
        return (InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class);
    }

    public static /* synthetic */ void addCommonParams$default(jBN jbn, EventParamsList eventParamsList, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jbn.OLrzqt(eventParamsList, z);
    }

    public final void OLrzqt(EventParamsList eventParamsList, boolean z) {
        boolean z2 = false;
        java.lang.Integer num = SPUtils.getInt("sp_key_tracker_tab_position", 0);
        if (num != null && num.intValue() == 0) {
            z2 = true;
        }
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "tracker", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", z2 != z ? "leaderboard" : "tracker", false, 4, null);
    }

    public final boolean OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        return interfaceC9738bbJ != null && interfaceC9738bbJ.RJOkX();
    }

    public final void KWHzl() {
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Full_Page_Click", new TrackChannel[0], new Function1() { // from class: o.jBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.copydefault((EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "card_name", "tracker", false, 4, null);
        addCommonParams$default(copydefault, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.ONE_DAY.getValue()) ? "1d" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.THREE_DAYS.getValue()) ? "3d" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.SEVEN_DAYS.getValue()) ? "7d" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.ONE_MONTH.getValue()) ? "1m" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DurationType.THREE_MONTH.getValue()) ? "3m" : str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                }
                break;
            case 50:
                if (!str.equals("2")) {
                }
                break;
            case 51:
                if (!str.equals("3")) {
                }
                break;
            case 52:
                if (!str.equals("4")) {
                }
                break;
            case 53:
                if (!str.equals("5")) {
                }
                break;
        }
        return str;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SortingType.PnL.getValue()) ? "pnl_high_to_low" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SortingType.ROI.getValue()) ? "profit_high_to_low" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SortingType.WinRate.getValue()) ? "win_rate_high_to_low" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SortingType.Transaction.getValue()) ? "txn_no_high_to_low" : str;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_SmartMoney_Ranking_View", new TrackChannel[0], new Function1() { // from class: o.jBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.KWHzl(str3, str, str2, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "leaderboard", false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            EventParamsList.put$default(eventParamsList, "page_from", str, false, 4, null);
        }
        jBN jbn = copydefault;
        EventParamsList.put$default(eventParamsList, "sort_by_filter_state_loaded", jbn.AEQbTJ(str2), false, 4, null);
        EventParamsList.put$default(eventParamsList, "time_window_filter_state_loaded", jbn.copydefault(str3), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency_mode_filter_is_token_state_loaded", java.lang.String.valueOf(z), false, 4, null);
        addCommonParams$default(jbn, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorPageView$default(jBN jbn, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jbn.OLrzqt(str, z);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer num = SPUtils.getInt("SELECTED_TAB", 0);
        final boolean z2 = num != null && num.intValue() == 0;
        final java.lang.String string = SPUtils.getString("SELECTED_PERIOD", "5");
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Tracker_Page_View", new TrackChannel[0], new Function1() { // from class: o.jBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.OLrzqt(z2, z, str, string, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit OLrzqt(boolean z, boolean z2, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", z != z2 ? "monitor_activity" : "monitor_trends", false, 4, null);
        if (str.length() > 0) {
            EventParamsList.put$default(eventParamsList, "page_from", str, false, 4, null);
        }
        jBN jbn = copydefault;
        Intrinsics.copydefault((java.lang.Object) str2);
        EventParamsList.put$default(eventParamsList, "time_window_filter_state_loaded", jbn.KWHzl(str2), false, 4, null);
        addCommonParams$default(jbn, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Tracker_Page_View", new TrackChannel[0], new Function1() { // from class: o.jBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.OLrzqt(str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "following", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sort_by_loaded_state", "added_time_desc", false, 4, null);
        addCommonParams$default(copydefault, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackLeaderboardPageClick$default(jBN jbn, DexTrackEventParameter.LeaderBoardButtonName leaderBoardButtonName, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        jbn.copydefault(leaderBoardButtonName, str, str2, z);
    }

    public final void copydefault(@NotNull final DexTrackEventParameter.LeaderBoardButtonName leaderBoardButtonName, final java.lang.String str, final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(leaderBoardButtonName, "");
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_LeaderBoard_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.jBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.AEQbTJ(leaderBoardButtonName, str, str2, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(DexTrackEventParameter.LeaderBoardButtonName leaderBoardButtonName, java.lang.String str, java.lang.String str2, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "leaderboard", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, leaderBoardButtonName.getValue(), false, 4, null);
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "previous_value", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "new_value", str2, false, 4, null);
        }
        copydefault.OLrzqt(eventParamsList, z);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackMonitorPageClick$default(jBN jbn, DexTrackEventParameter.MonitorButtonName monitorButtonName, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        jbn.EZpvd(monitorButtonName, str, str2, z);
    }

    public final void EZpvd(@NotNull final DexTrackEventParameter.MonitorButtonName monitorButtonName, final java.lang.String str, final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(monitorButtonName, "");
        java.lang.Integer num = SPUtils.getInt("SELECTED_TAB", 0);
        final boolean z2 = num != null && num.intValue() == 0;
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Tracker_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.jBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.AEQbTJ(z2, monitorButtonName, str, str2, z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(boolean z, DexTrackEventParameter.MonitorButtonName monitorButtonName, java.lang.String str, java.lang.String str2, boolean z2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", z ? "monitor_activity" : "monitor_trends", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, monitorButtonName.getValue(), false, 4, null);
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "previous_value", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "new_value", str2, false, 4, null);
        }
        copydefault.OLrzqt(eventParamsList, z2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bdM.StateListAnimator.event$default(o.bdM, java.lang.String, com.okinc.components.track.TrackChannel[], kotlin.jvm.functions.Function1, boolean, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull final TrackerTxnListFilter trackerTxnListFilter, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer num = SPUtils.getInt("SELECTED_TAB", 0);
        final boolean z = num != null && num.intValue() == 0;
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Tracker_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.jBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.AEQbTJ(z, str, trackerTxnListFilter, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(boolean z, java.lang.String str, TrackerTxnListFilter trackerTxnListFilter, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", z ? "monitor_activity" : "monitor_trends", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.MonitorButtonName.FILTER_APPLY.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "network", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_type_selected", trackerTxnListFilter.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "txn_value_min_usd", trackerTxnListFilter.AhwBna().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "txn_value_max_usd", trackerTxnListFilter.AhwBna().AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "holders_min", trackerTxnListFilter.KWHzl().AhwBna(), false, 4, null);
        java.lang.String strOLrzqt = trackerTxnListFilter.EZpvd().OLrzqt();
        EventParamsList.put$default(eventParamsList, "market_cap_min_usd_k", C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) ? C33129mqd.mulS$default(strOLrzqt, 1000, null, null, null, 14, null) : "", false, 4, null);
        java.lang.String strAEQbTJ = trackerTxnListFilter.EZpvd().AEQbTJ();
        EventParamsList.put$default(eventParamsList, "market_cap_max_usd_k", C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) ? C33129mqd.mulS$default(strAEQbTJ, 1000, null, null, null, 14, null) : "", false, 4, null);
        java.lang.String strOLrzqt2 = trackerTxnListFilter.copydefault().OLrzqt();
        EventParamsList.put$default(eventParamsList, "liquidity_min_usd_k", C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt2) ? C33129mqd.mulS$default(strOLrzqt2, 1000, null, null, null, 14, null) : "", false, 4, null);
        java.lang.String strAEQbTJ2 = trackerTxnListFilter.copydefault().AEQbTJ();
        EventParamsList.put$default(eventParamsList, "liquidity_max_usd_k", C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ2) ? C33129mqd.mulS$default(strAEQbTJ2, 1000, null, null, null, 14, null) : "", false, 4, null);
        addCommonParams$default(copydefault, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final DexTrackEventParameter.AddressManagementButtonName addressManagementButtonName) {
        Intrinsics.checkNotNullParameter(addressManagementButtonName, "");
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_Tracker_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.jBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.KWHzl(addressManagementButtonName, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(DexTrackEventParameter.AddressManagementButtonName addressManagementButtonName, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "following", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, addressManagementButtonName.getValue(), false, 4, null);
        addCommonParams$default(copydefault, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final LeaderBoardFilterModel leaderBoardFilterModel) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(leaderBoardFilterModel, "");
        java.util.Iterator<T> it = leaderBoardFilterModel.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((MarketChainBean) next).getChainId(), (java.lang.Object) leaderBoardFilterModel.gEmmrt())) {
                    break;
                }
            }
        }
        MarketChainBean marketChainBean = (MarketChainBean) next;
        java.lang.String chainName = marketChainBean != null ? marketChainBean.getChainName() : null;
        final java.lang.String str = chainName != null ? chainName : "";
        InterfaceC9847bdM.StateListAnimator.event$default(copydefault(), "DEXMarket_LeaderBoard_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.jBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jBN.KWHzl(str, leaderBoardFilterModel, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(java.lang.String str, LeaderBoardFilterModel leaderBoardFilterModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "leaderboard", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.LeaderBoardButtonName.FILTER_APPLY.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "filter_page_name", "leaderboard", false, 4, null);
        EventParamsList.put$default(eventParamsList, "network", str, false, 4, null);
        java.lang.String strOLrzqt = leaderBoardFilterModel.OLrzqt();
        EventParamsList.put$default(eventParamsList, "pnl_min_pct", strOLrzqt == null ? "" : strOLrzqt, false, 4, null);
        java.lang.String strAEQbTJ = leaderBoardFilterModel.AEQbTJ();
        EventParamsList.put$default(eventParamsList, "pnl_max_pct", strAEQbTJ == null ? "" : strAEQbTJ, false, 4, null);
        java.lang.String strAhwBna = leaderBoardFilterModel.AhwBna();
        EventParamsList.put$default(eventParamsList, "win_rate_min_pct", strAhwBna == null ? "" : strAhwBna, false, 4, null);
        java.lang.String strValueOf = leaderBoardFilterModel.valueOf();
        EventParamsList.put$default(eventParamsList, "win_rate_max_pct", strValueOf == null ? "" : strValueOf, false, 4, null);
        java.lang.String strDjBIcL = leaderBoardFilterModel.djBIcL();
        EventParamsList.put$default(eventParamsList, "txn_count_min", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
        java.lang.String strAYXKKw = leaderBoardFilterModel.AYXKKw();
        EventParamsList.put$default(eventParamsList, "txn_count_max", strAYXKKw == null ? "" : strAYXKKw, false, 4, null);
        addCommonParams$default(copydefault, eventParamsList, false, 2, null);
        return Unit.INSTANCE;
    }
}
