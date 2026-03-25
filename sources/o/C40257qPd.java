package o;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40257qPd implements qPT {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C40081qIq valueOf;
    public java.lang.String EZpvd = "";
    public java.lang.String copydefault = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull C40081qIq c40081qIq) {
        Intrinsics.checkNotNullParameter(c40081qIq, "");
        this.valueOf = c40081qIq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX INFO: renamed from: o.qPd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qPd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("from_token_pair", str));
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
            str2 = "perpetuals";
        }
        arrayList.add(C56390yDp.OLrzqt("from_biz_type", str2));
        arrayList.add(C56390yDp.OLrzqt("to_page_id", str3));
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            c40081qIq.copydefault(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") ? "coin" : "biz");
        }
    }

    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            c40081qIq.EZpvd(str);
        }
    }

    @Override // o.qPT
    public void fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, C56402yEa.EZpvd(C56390yDp.OLrzqt("rank_order", str)), null, 2, null);
        }
    }

    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            c40081qIq.OLrzqt(str);
        }
    }

    @Override // o.qPT
    public void iwGUEr() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("to_page_id", Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "trade_page") ? "page_trade" : "page_k"));
        arrayList.add(C56390yDp.OLrzqt("end_session_type", "NavNoResult"));
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.valueOf;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
    }

    @Override // o.qPT
    public void KWHzl(@NotNull C48915ueg c48915ueg, @NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("from_token_pair", this.EZpvd));
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "SWAP")) {
            arrayList.add(C56390yDp.OLrzqt("from_biz_type", "perpetual"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("from_biz_type", this.copydefault));
        }
        arrayList.add(C56390yDp.OLrzqt("click_item", c48915ueg.OLrzqt()));
        java.lang.String strAEQbTJ = c48915ueg.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "SWAP")) {
            arrayList.add(C56390yDp.OLrzqt("biz_type", "perpetual"));
        } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "FUTURES")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            arrayList.add(C56390yDp.OLrzqt("biz_type", (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("FUTURES")) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(c48915ueg.OLrzqt())) == null || !bizInstrumentValueOf.isPreMarketPair()) ? c48915ueg.AEQbTJ() : "pre_market"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("biz_type", c48915ueg.AEQbTJ()));
        }
        if (c48915ueg.copydefault() != null) {
            java.lang.Integer numCopydefault = c48915ueg.copydefault();
            Intrinsics.copydefault(numCopydefault);
            arrayList.add(C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(numCopydefault.intValue() + 1)));
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "trade_page")) {
            arrayList.add(C56390yDp.OLrzqt("to_page_id", "page_trade"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("to_page_id", "page_k"));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav")) {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "NavClickItemCoin"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "NavClickItemBiz"));
        }
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.valueOf;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
    }

    public void fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("button_type", Web3SecurityTrackEvent.VALUE_CLEAR));
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav")) {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "clearCoinNav"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "clearBizNav"));
        }
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.valueOf;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
    }

    public void AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") ? "coin" : "biz";
        C32866mlf.onEvent$default("TradeBizNav_List_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.AEQbTJ(str2, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("terminal", "app", true);
        if (Intrinsics.EZpvd((java.lang.Object) c40257qPd.AEQbTJ, (java.lang.Object) "trade_page")) {
            eventParamsList.put("from_page", "page_trade", true);
        } else {
            eventParamsList.put("from_page", "page_k", true);
        }
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void KWHzl(@NotNull NavSearchMode navSearchMode) {
        Intrinsics.checkNotNullParameter(navSearchMode, "");
        final java.lang.String str = navSearchMode == NavSearchMode.COIN_MODE ? "CRYPTO" : "biz";
        C32866mlf.onEvent$default("NavGuidance_Pop_SwitchGuide_View", (TrackChannel[]) null, new Function1() { // from class: o.qPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.getFieldNames(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit getFieldNames(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "nav_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tooltip_type", "switch_tip", false, 4, null);
        return Unit.INSTANCE;
    }

    public void valueOf(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_navigate_page_alter", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.qPr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.DbNXlk(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit DbNXlk(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") ? "coin" : "biz", true);
        return Unit.INSTANCE;
    }

    public void ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") ? "coin" : "biz";
        C32866mlf.onEvent$default("TradeBizNav_Header_SearchInputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.copydefault(str2, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("terminal", "app", true);
        if (Intrinsics.EZpvd((java.lang.Object) c40257qPd.AEQbTJ, (java.lang.Object) "trade_page")) {
            eventParamsList.put("from_page", "page_trade", true);
        } else {
            eventParamsList.put("from_page", "page_k", true);
        }
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("button_type", EopTrackEvent.CLOSE));
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav")) {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "closeCoinNav"));
        } else {
            arrayList.add(C56390yDp.OLrzqt("end_session_type", "closeBizNav"));
        }
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.valueOf;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
    }

    public void fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Watchlist")) {
            str = "WATCH_LIST";
        }
        final java.lang.String strCopydefault = C27993kKy.copydefault(str);
        C32866mlf.onEvent$default("TradeBizNav_NavFunction_Biz_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.iwGUEr(strCopydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit iwGUEr(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bizType", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("TradeBizNav_NavFunction_Category_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.copydefault(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bizType", str, true);
        eventParamsList.put("tab", str2, true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Markets_Category_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.fIwbmz(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fIwbmz(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, "navigation_panel", false, 4, null);
        EventParamsList.put$default(eventParamsList, "category_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("BizNav_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.fJNWhG(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", C27993kKy.copydefault(str), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void OLrzqt(android.view.View view, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        qPP qppCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default(((view == null || (qppCopydefault = qPM.copydefault(view)) == null) ? null : qppCopydefault.AwvSrB()) == NavSearchMode.BIZ_MODE ? "BizNav_Full_Page_View" : "TokenNav_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", C27993kKy.copydefault(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void copydefault(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        SortBy sortBy2 = SortBy.CHANGE;
        if (sortBy == sortBy2 && sortOrder == SortOrder.ASC) {
            str = "changeascend";
        } else if (sortBy == sortBy2 && sortOrder == SortOrder.DESC) {
            str = "changedescend";
        } else {
            SortBy sortBy3 = SortBy.PRICE;
            if (sortBy == sortBy3 && sortOrder == SortOrder.ASC) {
                str = "priceascend";
            } else if (sortBy == sortBy3 && sortOrder == SortOrder.DESC) {
                str = "pricedescend";
            } else {
                SortBy sortBy4 = SortBy.TURNOVER;
                if (sortBy == sortBy4 && sortOrder == SortOrder.ASC) {
                    str = "turnoverascend";
                } else {
                    str = (sortBy == sortBy4 && sortOrder == SortOrder.DESC) ? "turnoverdescend" : "none";
                }
            }
        }
        arrayList.add(C56390yDp.OLrzqt("sort_type", str));
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
    }

    @Override // o.qPT
    public void djBIcL(final java.lang.String str) {
        C32866mlf.onEvent$default("TradeOptionsTokenList_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.getNewProxyInstance(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit getNewProxyInstance(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Markets_Category_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.fARcdN(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fARcdN(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "more_button", "1", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Markets_Category_Popup_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.KWHzl(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "category_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "search_keyword", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void hDKMBd() {
        C32866mlf.onEvent$default("PreMarket_Options_OptionsMode_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab_name", C27989kKu.Companion.gEmmrt(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void DbNXlk(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("trade_options_discovery_click", (TrackChannel[]) null, new Function1() { // from class: o.qPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.hDKMBd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit hDKMBd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str, false);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void values(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("trade_options_discovery_list_enter", (TrackChannel[]) null, new Function1() { // from class: o.qPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.AubY(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AubY(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("uly", str, false);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void AEQbTJ(final boolean z) {
        C32866mlf.onEvent$default("app_page_navigation_optionmode_click", (TrackChannel[]) null, new Function1() { // from class: o.qPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.copydefault(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "action_type", "Click", false, 4, null);
        EventParamsList.put$default(eventParamsList, "element_type", "Text", false, 4, null);
        eventParamsList.put("isPro", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(z)), false);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TradeTokenNav_NavFunction_Category_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.fetchVPNInfo(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tab", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void isConnected(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("TokenNav_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.uzCIH(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit uzCIH(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void fJNWhG() {
        C32866mlf.onEvent$default("app_coin_navigateresult_page_more_click", (TrackChannel[]) null, new Function1() { // from class: o.qPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.KWHzl(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from", c40257qPd.OLrzqt, true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BizInstrument bizInstrumentEZpvd = new xLY(BizInfoConfig.DefaultBizConfig.copydefault).EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        arrayList.add(new Triple("token_pair", str, bool));
        arrayList.add(new Triple("biz_type", str2, bool));
        if (bizInstrumentEZpvd != null && (instId = bizInstrumentEZpvd.getInstId()) != null) {
            arrayList.add(new Triple("from_token_pair", instId, bool));
        }
        if (bizInstrumentEZpvd != null && (instType = bizInstrumentEZpvd.getInstType()) != null) {
            arrayList.add(new Triple("from_biz_type", instType, bool));
        }
        arrayList.add(new Triple("to_page_id", C40383qTv.AEQbTJ(), bool));
        arrayList.add(new Triple("from", this.OLrzqt, bool));
        C40081qIq c40081qIq = this.valueOf;
        if (c40081qIq != null) {
            c40081qIq.copydefault(yDY.AhwBna(), arrayList);
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void getFieldNames() {
        C32866mlf.onEvent$default("BizNav_Favorite_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    @Override // o.qPT
    public void copydefault(@NotNull android.view.View view, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        qPP qppCopydefault = qPM.copydefault(view);
        if ((qppCopydefault != null ? qppCopydefault.AwvSrB() : null) == NavSearchMode.BIZ_MODE) {
            C32866mlf.onEvent$default("BizNav_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.ejfBZ(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("TokenNav_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qPp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.AuCTel(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit ejfBZ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), C27993kKy.copydefault(str), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), C27993kKy.copydefault(str), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void KWHzl(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        qPP qppCopydefault = qPM.copydefault(view);
        if ((qppCopydefault != null ? qppCopydefault.AwvSrB() : null) == NavSearchMode.BIZ_MODE) {
            C40383qTv.AEQbTJ(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ(), str, str2);
        } else {
            C40383qTv.AEQbTJ(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ(), str, str2);
        }
    }

    public void AEQbTJ() {
        C32866mlf.onEvent$default("BizNav_Search_InputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.AhwBna(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40257qPd.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    public void copydefault() {
        C32866mlf.onEvent$default("BizNav_PreSearch_Cancel_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.djBIcL(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40257qPd.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    public void KWHzl() {
        C32866mlf.onEvent$default("BizNav_PreSearch_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.qPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.gEmmrt(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40257qPd.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("BizNav_PreSearch_SearchHistoryItem_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.OLrzqt(str, str2, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, RemoteMessageConst.Notification.TICKER, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "ticker_type", str2, false, 4, null);
        eventParamsList.put("from_page", c40257qPd.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void copydefault(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("BizNav_PreSearch_PopularSearchItem_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.djBIcL(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(java.lang.String str, C40257qPd c40257qPd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, RemoteMessageConst.Notification.TICKER, str, false, 4, null);
        eventParamsList.put("from_page", c40257qPd.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void OLrzqt(@NotNull final DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        C32866mlf.onEvent$default("Cedefi_Tag_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40257qPd.djBIcL(dexInstrument, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(DexInstrument dexInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", NotificationCompat.CATEGORY_NAVIGATION, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void copydefault(@NotNull android.view.View view, @NotNull final DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        qPP qppCopydefault = qPM.copydefault(view);
        if ((qppCopydefault != null ? qppCopydefault.AwvSrB() : null) == NavSearchMode.BIZ_MODE) {
            C32866mlf.onEvent$default("BizNav_List_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.OLrzqt(dexInstrument, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("TokenNav_List_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.copydefault(dexInstrument, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit OLrzqt(DexInstrument dexInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DexInstrument dexInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qPT
    public void OLrzqt(@NotNull android.view.View view, @NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        qPP qppCopydefault = qPM.copydefault(view);
        if ((qppCopydefault != null ? qppCopydefault.AwvSrB() : null) == NavSearchMode.BIZ_MODE) {
            C32866mlf.onEvent$default("BizNav_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.EZpvd(str, str2, dexInstrument, bool, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("TokenNav_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.qPq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40257qPd.copydefault(str, str2, dexInstrument, bool, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, DexInstrument dexInstrument, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_biz_type", str, true);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), str2, true);
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put("bizType", str, true);
        eventParamsList.put("token_pair", dexInstrument.getTokenSymbol(), true);
        eventParamsList.put("token_contract_address", dexInstrument.getTokenContractAddress(), false);
        EventParamsList.put$default(eventParamsList, "is_boost", C33129mqd.gEmmrt(bool), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, DexInstrument dexInstrument, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), str2, true);
        eventParamsList.put("token_pair", dexInstrument.getTokenSymbol(), true);
        eventParamsList.put("token_contract_address", dexInstrument.getTokenContractAddress(), false);
        EventParamsList.put$default(eventParamsList, "is_boost", C33129mqd.gEmmrt(bool), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "trade_page") ? "page_trade" : "page_k";
    }
}
