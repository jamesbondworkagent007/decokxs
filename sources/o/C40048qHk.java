package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.SearchResultData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import com.okinc.market.search.features.main.recommend.history.data.model.InvestCurrency;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.recommend.history.data.model.ProductType;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40048qHk implements qHN {
    private static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ = "";
    public java.lang.String KWHzl = "";
    public C40081qIq OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.qHk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qHk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.qHN
    public void copydefault(@NotNull C40081qIq c40081qIq, @NotNull java.lang.String str, boolean z) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(c40081qIq, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "shortcuts")) {
            C32866mlf.onEvent$default("QuickAction_App_Action_click", (TrackChannel[]) null, new Function1() { // from class: o.qHy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40048qHk.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        this.KWHzl = pWO.KWHzl().EZpvd() ? "demo_trading" : "real_trading";
        java.lang.String str3 = "homepage";
        switch (str.hashCode()) {
            case -1377166945:
                str2 = "planet_chat";
                if (!str.equals("planet_chat")) {
                    str2 = "";
                }
                break;
            case -1377080347:
                str2 = "planet_feed";
                if (!str.equals("planet_feed")) {
                    str2 = "";
                }
                break;
            case -516193147:
                str2 = "discover_cr";
                if (!str.equals("discover_cr")) {
                    str2 = "";
                }
                break;
            case 429969749:
                str2 = !str.equals("find_page") ? "" : WalletSearchRequest.SEARCH_SOURCE_DISCOVER;
                break;
            case 839250871:
                str2 = !str.equals("markets") ? "" : "markets";
                break;
            case 1440051808:
                str2 = "homepage_cr";
                if (!str.equals("homepage_cr")) {
                    str2 = "";
                }
                break;
            case 2118081007:
                str2 = !str.equals("home_page") ? "" : "homepage";
                break;
            default:
                str2 = "";
                break;
        }
        this.AEQbTJ = str2;
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "find_page")) {
            C32866mlf.onEvent$default("DiscoverPage_Top_SearchInputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40048qHk.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            str3 = WalletSearchRequest.SEARCH_SOURCE_DISCOVER;
        } else if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "home_page")) {
            str3 = str;
        } else if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "markets")) {
            C32866mlf.onEvent$default("Homepage_Top_SearchInputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40048qHk.AhwBna((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        c40081qIq.KWHzl(str3);
        c40081qIq.EZpvd(z);
        this.OLrzqt = c40081qIq;
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "attachTrackViewModel invoked: [from: " + str + ", fromPageTrack: " + this.AEQbTJ + ", tradingMode: " + this.KWHzl + "]");
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "search", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void m_(java.lang.String str) {
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            c40081qIq.EZpvd(str == null ? "" : str);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "setParamKeyword invoked: [keyword: " + str + "]");
    }

    @Override // o.qHN
    public void DbNXlk() {
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("button_type", Web3SecurityTrackEvent.VALUE_CLEAR), C56390yDp.OLrzqt("end_session_type", Web3SecurityTrackEvent.VALUE_CLEAR));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickClearSearchBar invoked");
    }

    @Override // o.qHN
    public void gEmmrt() {
        this.copydefault = true;
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("button_type", OtpEventTracker.OTP_EVENT_VALUE_CANCEL), C56390yDp.OLrzqt("end_session_type", OtpEventTracker.OTP_EVENT_VALUE_CANCEL));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickCancelBtn invoked");
    }

    @Override // o.qHN
    public void AhwBna() {
        if (!this.copydefault) {
            java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("button_type", EopTrackEvent.CLOSE), C56390yDp.OLrzqt("end_session_type", EopTrackEvent.CLOSE));
            C40081qIq c40081qIq = this.OLrzqt;
            if (c40081qIq != null) {
                C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
            }
            C40081qIq c40081qIq2 = this.OLrzqt;
            if (c40081qIq2 != null) {
                c40081qIq2.KWHzl();
            }
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackBackPressed invoked");
    }

    @Override // o.qHN
    public void fIwbmz() {
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, C56402yEa.EZpvd(C56390yDp.OLrzqt("end_session_type", "tradeNoResult")), null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackSearchResultEmpty invoked");
    }

    @Override // o.qHN
    public void AEQbTJ(@NotNull qID qid) {
        Intrinsics.checkNotNullParameter(qid, "");
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            c40081qIq.AEQbTJ(qid);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "setSortTypeProvider invoked");
    }

    @Override // o.qHN
    public void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull SubPage subPage, int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(subPage, "");
        C40382qTu c40382qTu = C40382qTu.AEQbTJ;
        C40081qIq c40081qIq = this.OLrzqt;
        java.lang.String strOLrzqt = c40081qIq != null ? c40081qIq.OLrzqt() : null;
        java.lang.String trackSubType = subPage == SubPage.ALL ? "ANY" : subPage.getTrackSubType();
        C40081qIq c40081qIq2 = this.OLrzqt;
        java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = c40382qTu.AEQbTJ(strOLrzqt, "result", trackSubType, c40081qIq2 != null ? c40081qIq2.AEQbTJ() : null, bizInstrument);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapAEQbTJ.size());
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapAEQbTJ.entrySet()) {
            arrayList.add(new Triple(entry.getKey(), entry.getValue(), java.lang.Boolean.FALSE));
        }
        java.util.List<Triple<java.lang.String, java.lang.String, java.lang.Boolean>> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(new Triple<>("deal_name", bizInstrument.getInstId(), java.lang.Boolean.TRUE));
        C40081qIq c40081qIq3 = this.OLrzqt;
        if (c40081qIq3 != null) {
            c40081qIq3.copydefault(yDY.AhwBna(), listFJNWhG);
        }
        FuzzySearchEventTracker fuzzySearchEventTracker = FuzzySearchEventTracker.EZpvd;
        java.lang.String source = FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource();
        C40081qIq c40081qIq4 = this.OLrzqt;
        fuzzySearchEventTracker.KWHzl(source, c40081qIq4 != null ? c40081qIq4.AEQbTJ() : null, C33129mqd.gEmmrt(bizInstrument.getTradeSymbol()), C33129mqd.gEmmrt(bizInstrument.fullCoinName()), "", "", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i + 1)));
        C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentCoinClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("click_item", bizInstrument.getInstId())));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickCoinItem invoked: [instrument: " + bizInstrument + ", subPageType: " + subPage + "]");
    }

    @Override // o.qHN
    public void fetchVPNInfo() {
        java.lang.String strOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null || (strOLrzqt = c40081qIq.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        arrayList.add(C56390yDp.OLrzqt("search_from", strOLrzqt));
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            C40081qIq.process$default(c40081qIq2, arrayList, null, 2, null);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackResultPageInit invoked");
    }

    @Override // o.qHN
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Search_SearchResult_TopUp_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.KWHzl(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickScrollUp invoked: [trackSubType: " + str + "]");
    }

    public static final Unit KWHzl(C40048qHk c40048qHk, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        eventParamsList.put("tab", C40383qTv.EZpvd(str), true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AEQbTJ(@NotNull TradingStrategy tradingStrategy, int i) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("click_item", qGH.AEQbTJ(tradingStrategy)), C56390yDp.OLrzqt("click_item_type", "bots"), C56390yDp.OLrzqt("end_session_type", "clickItem"), C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1)));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentBotClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("click_item", qGH.AEQbTJ(tradingStrategy))));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackNavToBotDetail invoked: [strategy: " + tradingStrategy + ", position: " + i + "]");
    }

    @Override // o.qHN
    public void copydefault(@NotNull Product product, int i) {
        java.lang.String currencyName;
        java.lang.String name;
        java.lang.String currencyName2;
        java.lang.String name2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(product, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        InvestCurrency investCurrency = product.getInvestCurrency();
        if (investCurrency == null || (currencyName = investCurrency.getCurrencyName()) == null) {
            currencyName = "";
        }
        ProductType productType = product.getProductType();
        if (productType == null || (name = productType.getName()) == null) {
            name = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("click_item", currencyName + " " + name);
        pairArr[1] = C56390yDp.OLrzqt("click_item_type", "finance");
        pairArr[2] = C56390yDp.OLrzqt("end_session_type", "clickItem");
        pairArr[3] = C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1));
        java.util.List listGEmmrt = yDY.gEmmrt(pairArr);
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr c46688tbr = C46688tbr.KWHzl;
        InvestCurrency investCurrency2 = product.getInvestCurrency();
        if (investCurrency2 == null || (currencyName2 = investCurrency2.getCurrencyName()) == null) {
            currencyName2 = "";
        }
        ProductType productType2 = product.getProductType();
        if (productType2 != null && (name2 = productType2.getName()) != null) {
            str = name2;
        }
        c46688tbr.KWHzl("SearchMainResultFragmentFinanceClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("click_item", currencyName2 + " " + str)));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackNavToProductDetail invoked: [product: " + product + ", position: " + i + "]");
    }

    @Override // o.qHN
    public void a_(@NotNull SearchTrader searchTrader, int i) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("click_item", qGG.OLrzqt(searchTrader)), C56390yDp.OLrzqt("click_item_type", "users"), C56390yDp.OLrzqt("end_session_type", "clickItem"), C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1)));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentTraderClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("click_item", qGG.OLrzqt(searchTrader))));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackNavToTraderDetail invoked: [trader: " + searchTrader + ", position: " + i + "]");
    }

    @Override // o.qHN
    public void KWHzl(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z) {
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (z) {
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("click_item", bizInstrument.getInstId());
            if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SWAP")) {
                instType = "perpetual";
            } else {
                instType = bizInstrument.isPreMarketPair() ? "premarket" : bizInstrument.getInstType();
            }
            pairArr[1] = C56390yDp.OLrzqt("biz_type", instType);
            pairArr[2] = C56390yDp.OLrzqt("click_item_type", "token");
            pairArr[3] = C56390yDp.OLrzqt("end_session_type", "clickItem");
            pairArr[4] = C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1));
            java.util.List listGEmmrt = yDY.gEmmrt(pairArr);
            C40081qIq c40081qIq = this.OLrzqt;
            if (c40081qIq != null) {
                C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
            }
            C40081qIq c40081qIq2 = this.OLrzqt;
            if (c40081qIq2 != null) {
                c40081qIq2.KWHzl();
            }
            C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentTokenClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("click_item", bizInstrument.getInstId())));
            C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackNavToCoinDetail invoked: [instrument: " + bizInstrument + ", position: " + i + ", subPageType: " + subPage + ", keyword: " + str + "]");
        }
    }

    @Override // o.qHN
    public void AkhnZx() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("click_item_type", "campaign"));
        arrayList.add(C56390yDp.OLrzqt("biz_type", "campaign"));
        arrayList.add(C56390yDp.OLrzqt("click_item", "campaign"));
        arrayList.add(C56390yDp.OLrzqt("end_session_type", "clickItem"));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr.marketClickTrack$default(C46688tbr.KWHzl, "SearchMainResultFragmentCampaignClick", null, 2, null);
    }

    @Override // o.qHN
    public void values() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C56390yDp.OLrzqt("click_item_type", "announcement"));
        arrayList.add(C56390yDp.OLrzqt("biz_type", "announcement"));
        arrayList.add(C56390yDp.OLrzqt("end_session_type", "clickItem"));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr.marketClickTrack$default(C46688tbr.KWHzl, "SearchMainResultFragmentAnnouncementClick", null, 2, null);
    }

    @Override // o.qHN
    public void a_(@NotNull DefiWebCoins defiWebCoins, int i) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        arrayList.add(C56390yDp.OLrzqt("click_item", tokenSymbol));
        arrayList.add(C56390yDp.OLrzqt("click_item_type", "dex"));
        arrayList.add(C56390yDp.OLrzqt("end_session_type", "clickItem"));
        java.lang.String tokenContractAddress = defiWebCoins.getTokenContractAddress();
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        arrayList.add(C56390yDp.OLrzqt("token_address", tokenContractAddress));
        java.lang.String chainName = defiWebCoins.getChainName();
        arrayList.add(C56390yDp.OLrzqt("chain_name", chainName != null ? chainName : ""));
        java.lang.Boolean cedefiSupport = defiWebCoins.getCedefiSupport();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        arrayList.add(C56390yDp.OLrzqt("biz_type", Intrinsics.EZpvd(cedefiSupport, bool) ? "cedefi" : "dex"));
        arrayList.add(C56390yDp.OLrzqt("dex_community_recognized", Intrinsics.EZpvd(defiWebCoins.getCommunityRecognized(), bool) ? "1" : "0"));
        arrayList.add(C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1)));
        arrayList.add(C56390yDp.OLrzqt("is_boost", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(defiWebCoins.getBoosted()))));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr.marketClickTrack$default(C46688tbr.KWHzl, "SearchMainResultFragmentDefiWeb3Click", null, 2, null);
    }

    @Override // o.qHN
    public void KWHzl(@NotNull P2pAndDeposit p2pAndDeposit, boolean z) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = OtcRouteConst.P2P;
        arrayList.add(C56390yDp.OLrzqt("click_item_type", z ? OtcRouteConst.P2P : "deposit"));
        arrayList.add(C56390yDp.OLrzqt("end_session_type", "clickItem"));
        arrayList.add(C56390yDp.OLrzqt("biz_type", z ? OtcRouteConst.P2P : "deposit"));
        java.lang.String ccy = p2pAndDeposit.getCcy();
        arrayList.add(C56390yDp.OLrzqt("click_item", ccy != null ? ccy : ""));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, arrayList, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C46688tbr c46688tbr = C46688tbr.KWHzl;
        if (!z) {
            str = "deposit";
        }
        C46688tbr.marketClickTrack$default(c46688tbr, "SearchMainResultFragment" + str + "Click", null, 2, null);
    }

    @Override // o.qHN
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            c40081qIq.OLrzqt(str);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "setParamTabPosition invoked: [positionDesc: " + str + "]");
    }

    @Override // o.qHN
    public void isConnected() {
        java.lang.String strOLrzqt;
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            if (c40081qIq == null || (strOLrzqt = c40081qIq.OLrzqt()) == null) {
                strOLrzqt = "";
            }
            C40081qIq.process$default(c40081qIq, C56402yEa.EZpvd(C56390yDp.OLrzqt("search_from", strOLrzqt)), null, 2, null);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackParamSearchFrom invoked");
    }

    @Override // o.qHN
    public void AEQbTJ(int i) {
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_SearchResult_Tab_View", (TrackChannel[]) null, new Function1() { // from class: o.qHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.EZpvd(this.OLrzqt, c40081qIq, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentTabClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("tab", C40383qTv.EZpvd(c40081qIq.AYXKKw()))));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackTabChanged invoked");
    }

    public static final Unit EZpvd(C40048qHk c40048qHk, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        java.lang.String type;
        java.lang.String ccy;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        eventParamsList.put("search_text", c40081qIq.AEQbTJ(), true);
        eventParamsList.put("tab", C40383qTv.EZpvd(c40081qIq.AYXKKw()), true);
        if (c40081qIq.copydefault() != null) {
            SearchRecommendVo searchRecommendVoCopydefault = c40081qIq.copydefault();
            EventParamsList.put$default(eventParamsList, "rcmd_position", C33129mqd.gEmmrt(searchRecommendVoCopydefault != null ? searchRecommendVoCopydefault.getIndex() : null), false, 4, null);
            EventParamsList.put$default(eventParamsList, "is_textbox_rcmd", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(c40081qIq.copydefault() != null)), false, 4, null);
            SearchRecommendVo searchRecommendVoCopydefault2 = c40081qIq.copydefault();
            EventParamsList.put$default(eventParamsList, "rcmd_token", (searchRecommendVoCopydefault2 == null || (ccy = searchRecommendVoCopydefault2.getCcy()) == null) ? "" : ccy, false, 4, null);
            SearchRecommendVo searchRecommendVoCopydefault3 = c40081qIq.copydefault();
            EventParamsList.put$default(eventParamsList, "rcmd_type", (searchRecommendVoCopydefault3 == null || (type = searchRecommendVoCopydefault3.getType()) == null) ? "" : type, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void copydefault(int i, @NotNull final SubPage subPage) {
        Intrinsics.checkNotNullParameter(subPage, "");
        C32866mlf.onEvent$default("Search_SearchResult_ViewMore_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.AEQbTJ, subPage, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C46688tbr.KWHzl.KWHzl("SearchMainResultFragmentViewMoreClick", C56423yEv.EZpvd(C56390yDp.OLrzqt("tab", subPage.getTrackSubType())));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackViewMore invoked: [position: " + i + ", subPage: " + subPage + "]");
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, SubPage subPage, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        eventParamsList.put("tab", subPage.getTrackSubType(), true);
        eventParamsList.put("terminal", "App", true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void copydefault(@NotNull final BizInstrument bizInstrument, final int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Searchnoresults_Recommended_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.KWHzl(this.KWHzl, c40081qIq, i, bizInstrument, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickEmptyRecommendItem invoked: [instrument: " + bizInstrument + ", position: " + i + "]");
    }

    public static final Unit KWHzl(C40048qHk c40048qHk, C40081qIq c40081qIq, int i, BizInstrument bizInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        EventParamsList.put$default(eventParamsList, "search_text", c40081qIq.AEQbTJ(), false, 4, null);
        eventParamsList.put("rank_order", java.lang.String.valueOf(i + 1), true);
        EventParamsList.put$default(eventParamsList, "token_pair", bizInstrument.getInstId(), false, 4, null);
        eventParamsList.put("biz_type", "SPOT", true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AEQbTJ(@NotNull final BizInstrument bizInstrument, final boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        C32866mlf.onEvent$default("Search_SearchResult_Favorite_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.EZpvd(z, this, bizInstrument, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickWatching invoked: [instrument: " + bizInstrument + ", isWatching: " + z + "]");
    }

    public static final Unit EZpvd(boolean z, C40048qHk c40048qHk, BizInstrument bizInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", !z ? "unfavorite" : "favorite", true);
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        eventParamsList.put("tab", "all", true);
        EventParamsList.put$default(eventParamsList, "token_pair", bizInstrument.getInstId(), false, 4, null);
        eventParamsList.put("biz_type", C40383qTv.EZpvd(bizInstrument.getInstType()), true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AEQbTJ(boolean z) {
        C32866mlf.onEvent$default("Search_SearchHistory_Api_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackExpandHistory invoked: [expand: " + z + "]");
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "viewmore", true);
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AYXKKw() {
        C32866mlf.onEvent$default("Search_SearchHistory_Api_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickClearHistory invoked");
    }

    public static final Unit copydefault(C40048qHk c40048qHk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", Web3SecurityTrackEvent.VALUE_CLEAR, true);
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void OLrzqt(@NotNull final BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(bizInstrument, c40081qIq, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickHistoryInstrument invoked: [instrument: " + bizInstrument + "]");
    }

    public static final Unit OLrzqt(BizInstrument bizInstrument, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String strAEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (strAEQbTJ = interfaceC54577xNn.AEQbTJ()) != null) {
            str = strAEQbTJ;
        }
        eventParamsList.put("system_type", str, false);
        eventParamsList.put(bizInstrument.getInstType(), bizInstrument.getInstFamily(), false);
        java.lang.String strOLrzqt = C40382qTu.AEQbTJ.OLrzqt(c40081qIq.OLrzqt());
        if (strOLrzqt != null) {
            eventParamsList.put("page", strOLrzqt, true);
        }
        eventParamsList.put("feature", "record", true);
        eventParamsList.put("click_item", bizInstrument.getInstId(), false);
        eventParamsList.put("click_item_category", "token", true);
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") && bizInstrument.isPreMarketPair()) {
            eventParamsList.put("click_item_category", "premarket", true);
        } else {
            eventParamsList.put("click_item_category", "token", true);
        }
        eventParamsList.put("from_page", c40081qIq.OLrzqt(), true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void EZpvd(@NotNull final SearchTrader searchTrader) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.AEQbTJ(c40081qIq, searchTrader, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickHistoryTrader invoked: [trader: " + searchTrader + "]");
    }

    public static final Unit AEQbTJ(C40081qIq c40081qIq, SearchTrader searchTrader, EventParamsList eventParamsList) {
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String strAEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (strAEQbTJ = interfaceC54577xNn.AEQbTJ()) != null) {
            str = strAEQbTJ;
        }
        eventParamsList.put("system_type", str, false);
        java.lang.String strOLrzqt = C40382qTu.AEQbTJ.OLrzqt(c40081qIq.OLrzqt());
        if (strOLrzqt != null) {
            eventParamsList.put("page", strOLrzqt, true);
        }
        eventParamsList.put("feature", "record", true);
        eventParamsList.put("click_item_category", "users", true);
        eventParamsList.put("from_page", c40081qIq.OLrzqt(), true);
        eventParamsList.put("click_item", qGG.OLrzqt(searchTrader), true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void copydefault(@NotNull final Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.KWHzl, c40081qIq, product, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickHistoryProduct invoked: [product: " + product + "]");
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, C40081qIq c40081qIq, Product product, EventParamsList eventParamsList) {
        java.lang.String strAEQbTJ;
        java.lang.String currencyName;
        java.lang.String name;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (strAEQbTJ = interfaceC54577xNn.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        eventParamsList.put("system_type", strAEQbTJ, false);
        eventParamsList.put("page", c40048qHk.AEQbTJ, true);
        eventParamsList.put("feature", "record", true);
        eventParamsList.put("click_item_category", "finance", true);
        eventParamsList.put("from_page", c40081qIq.OLrzqt(), true);
        InvestCurrency investCurrency = product.getInvestCurrency();
        if (investCurrency == null || (currencyName = investCurrency.getCurrencyName()) == null) {
            currencyName = "";
        }
        ProductType productType = product.getProductType();
        if (productType != null && (name = productType.getName()) != null) {
            str = name;
        }
        eventParamsList.put("click_item", currencyName + " " + str, true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void copydefault(@NotNull final TradingStrategy tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.copydefault(c40081qIq, tradingStrategy, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackClickHistoryStrategy invoked: [strategy: " + tradingStrategy + "]");
    }

    public static final Unit copydefault(C40081qIq c40081qIq, TradingStrategy tradingStrategy, EventParamsList eventParamsList) {
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String strAEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (strAEQbTJ = interfaceC54577xNn.AEQbTJ()) != null) {
            str = strAEQbTJ;
        }
        eventParamsList.put("system_type", str, false);
        java.lang.String strOLrzqt = C40382qTu.AEQbTJ.OLrzqt(c40081qIq.OLrzqt());
        if (strOLrzqt != null) {
            eventParamsList.put("page", strOLrzqt, true);
        }
        eventParamsList.put("feature", "record", true);
        eventParamsList.put("click_item_category", "bots", true);
        eventParamsList.put("from_page", c40081qIq.OLrzqt(), true);
        eventParamsList.put("click_item", qGH.AEQbTJ(tradingStrategy), true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AEQbTJ(@NotNull final DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.copydefault, c40081qIq, defiWebCoins, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, C40081qIq c40081qIq, DefiWebCoins defiWebCoins, EventParamsList eventParamsList) {
        java.lang.String strAEQbTJ;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (strAEQbTJ = interfaceC54577xNn.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        eventParamsList.put("system_type", strAEQbTJ, false);
        eventParamsList.put("page", c40048qHk.AEQbTJ, true);
        eventParamsList.put("feature", "record", true);
        eventParamsList.put("click_item_category", "dex", true);
        eventParamsList.put("from_page", c40081qIq.OLrzqt(), false);
        java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        eventParamsList.put("click_item", tokenSymbol, false);
        java.lang.String tokenContractAddress = defiWebCoins.getTokenContractAddress();
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        eventParamsList.put("token_address", tokenContractAddress, false);
        java.lang.String chainName = defiWebCoins.getChainName();
        eventParamsList.put("chain_name", chainName != null ? chainName : "", false);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void EZpvd(@NotNull final BizInstrument bizInstrument, final int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Top_Popular_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.copydefault(this.OLrzqt, c40081qIq, i, bizInstrument, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource(), c40081qIq.AEQbTJ(), C33129mqd.gEmmrt(bizInstrument.getTradeSymbol()), C33129mqd.gEmmrt(bizInstrument.fullCoinName()), "", "", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i + 1)));
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackPopularItemClick invoked: [instrument: " + bizInstrument + ", position: " + i + "]");
    }

    public static final Unit copydefault(C40048qHk c40048qHk, C40081qIq c40081qIq, int i, BizInstrument bizInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        eventParamsList.put(OtcExtraKeys.MODE, c40048qHk.KWHzl, true);
        EventParamsList.put$default(eventParamsList, "search_text", c40081qIq.AEQbTJ(), false, 4, null);
        eventParamsList.put("rank_order", java.lang.String.valueOf(i + 1), true);
        EventParamsList.put$default(eventParamsList, "token_pair", bizInstrument.getInstId(), false, 4, null);
        eventParamsList.put("biz_type", "SPOT", true);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void KWHzl(@NotNull final P2pAndDepositHistory p2pAndDepositHistory) {
        Intrinsics.checkNotNullParameter(p2pAndDepositHistory, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.AEQbTJ(this.OLrzqt, c40081qIq, p2pAndDepositHistory, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C40048qHk c40048qHk, C40081qIq c40081qIq, P2pAndDepositHistory p2pAndDepositHistory, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("click_item_category", OtcRouteConst.P2P, true);
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        EventParamsList.put$default(eventParamsList, "search_text", c40081qIq.AEQbTJ(), false, 4, null);
        java.lang.String ccy = p2pAndDepositHistory.getP2pData().getCcy();
        EventParamsList.put$default(eventParamsList, "click_item", ccy == null ? "" : ccy, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void copydefault(@NotNull final P2pAndDepositHistory p2pAndDepositHistory) {
        Intrinsics.checkNotNullParameter(p2pAndDepositHistory, "");
        final C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        C32866mlf.onEvent$default("Search_Mid_SearchHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.EZpvd, c40081qIq, p2pAndDepositHistory, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, C40081qIq c40081qIq, P2pAndDepositHistory p2pAndDepositHistory, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("click_item_category", "deposit", true);
        eventParamsList.put("from_page", c40048qHk.AEQbTJ, true);
        EventParamsList.put$default(eventParamsList, "search_text", c40081qIq.AEQbTJ(), false, 4, null);
        java.lang.String ccy = p2pAndDepositHistory.getP2pData().getCcy();
        EventParamsList.put$default(eventParamsList, "click_item", ccy == null ? "" : ccy, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void EZpvd(@NotNull C39991qFh c39991qFh, int i) {
        Intrinsics.checkNotNullParameter(c39991qFh, "");
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        c40081qIq.copydefault(yDY.gEmmrt(C56390yDp.OLrzqt("click_item", c39991qFh.KWHzl()), C56390yDp.OLrzqt("biz_type", "feed"), C56390yDp.OLrzqt("click_item_type", "feed_item"), C56390yDp.OLrzqt("end_session_type", "clickItem"), C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1))), C56402yEa.EZpvd(new Triple("terminal", "App", java.lang.Boolean.TRUE)));
        c40081qIq.KWHzl();
    }

    @Override // o.qHN
    public void KWHzl(@NotNull C39997qFn c39997qFn, int i) {
        Intrinsics.checkNotNullParameter(c39997qFn, "");
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq == null) {
            return;
        }
        c40081qIq.copydefault(yDY.gEmmrt(C56390yDp.OLrzqt("click_item", c39997qFn.AEQbTJ()), C56390yDp.OLrzqt("biz_type", "kol"), C56390yDp.OLrzqt("click_item_type", "feed_kol"), C56390yDp.OLrzqt("end_session_type", "clickItem"), C56390yDp.OLrzqt("rank_order", java.lang.String.valueOf(i + 1))), C56402yEa.EZpvd(new Triple("terminal", "App", java.lang.Boolean.TRUE)));
        c40081qIq.KWHzl();
    }

    @Override // o.qHN
    public void KWHzl(final java.lang.String str, final java.lang.String str2, final int i, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Homepage_Top_SearchInputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.AEQbTJ(str, str2, i, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "rcmd_token", str == null ? "" : str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "rcmd_type", str2 == null ? "" : str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "rcmd_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void EZpvd(SearchRecommendVo searchRecommendVo) {
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            c40081qIq.KWHzl(searchRecommendVo);
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "setCurrentEnterHintData invoked: [data: " + searchRecommendVo + "]");
    }

    @Override // o.qHN
    public void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("PreSearch_Rankings_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.OLrzqt(this.KWHzl, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C40048qHk c40048qHk, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", c40048qHk.AEQbTJ(str), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void EZpvd(final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("PreSearch_Rankings_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.copydefault(this.KWHzl, str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C40048qHk c40048qHk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", c40048qHk.AEQbTJ(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_pair", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void djBIcL(final java.lang.String str) {
        C32866mlf.onEvent$default("PreSearch_Rankings_ViewMore_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.valueOf(this.OLrzqt, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(C40048qHk c40048qHk, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", c40048qHk.AEQbTJ(str), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1001959400) {
                if (iHashCode != 629738236) {
                    if (iHashCode == 1297255772 && str.equals("most_buyers")) {
                        return "buyers";
                    }
                } else if (str.equals("popular_searches")) {
                    return "searches";
                }
            } else if (str.equals("most_sellers")) {
                return "sellers";
            }
        }
        return "";
    }

    @Override // o.qHN
    public void KWHzl(@NotNull C40004qFu c40004qFu, int i) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c40004qFu, "");
        SearchResultData searchResultDataOLrzqt = c40004qFu.OLrzqt();
        if (searchResultDataOLrzqt instanceof SearchResultData.Message) {
            str = "chat_message";
        } else if (!(searchResultDataOLrzqt instanceof SearchResultData.ChatAndContact)) {
            return;
        } else {
            str = "chat_contact";
        }
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("biz_type", "chat"), C56390yDp.OLrzqt("click_item_type", str), C56390yDp.OLrzqt("end_session_type", "clickItem"));
        C40081qIq c40081qIq = this.OLrzqt;
        if (c40081qIq != null) {
            C40081qIq.process$default(c40081qIq, listGEmmrt, null, 2, null);
        }
        C40081qIq c40081qIq2 = this.OLrzqt;
        if (c40081qIq2 != null) {
            c40081qIq2.KWHzl();
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchTrack", "trackNavToImChatDetail invoked: [vo: " + c40004qFu + ", position: " + i + "]");
    }

    @Override // o.qHN
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Cedefi_Tag_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.AEQbTJ(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", "global_search", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.qHN
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Search_List_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40048qHk.KWHzl(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
