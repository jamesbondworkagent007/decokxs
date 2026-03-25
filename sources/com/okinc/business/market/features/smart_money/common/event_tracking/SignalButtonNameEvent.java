package com.okinc.business.market.features.smart_money.common.event_tracking;

import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalButtonNameEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalButtonNameEvent[] $VALUES;
    private final String info;
    public static final SignalButtonNameEvent GEMS_TAB = new SignalButtonNameEvent("GEMS_TAB", 0, "gems_tab");
    public static final SignalButtonNameEvent OVERVIEWS_TAB = new SignalButtonNameEvent("OVERVIEWS_TAB", 1, "overviews_tab");
    public static final SignalButtonNameEvent ACTIVITIES_TAB = new SignalButtonNameEvent("ACTIVITIES_TAB", 2, "activities_tab");
    public static final SignalButtonNameEvent TOKEN_DETAILS = new SignalButtonNameEvent("TOKEN_DETAILS", 3, "token_details");
    public static final SignalButtonNameEvent TOKEN_SIGNAL_DETAILS = new SignalButtonNameEvent("TOKEN_SIGNAL_DETAILS", 4, "token_signal_details");
    public static final SignalButtonNameEvent FILTER_BUTTON = new SignalButtonNameEvent("FILTER_BUTTON", 5, "filter");
    public static final SignalButtonNameEvent BUY_BUTTON = new SignalButtonNameEvent("BUY_BUTTON", 6, "buy_button");
    public static final SignalButtonNameEvent QUICK_BUY_BUTTON = new SignalButtonNameEvent("QUICK_BUY_BUTTON", 7, "quick_buy_button");
    public static final SignalButtonNameEvent GEMS_RANKING_CATEGORY = new SignalButtonNameEvent("GEMS_RANKING_CATEGORY", 8, "ranking_category");
    public static final SignalButtonNameEvent ALERT_BUTTON = new SignalButtonNameEvent("ALERT_BUTTON", 9, ProductMatrixRemoteConfig.ALERT);
    public static final SignalButtonNameEvent CHAIN = new SignalButtonNameEvent("CHAIN", 10, "chain");
    public static final SignalButtonNameEvent RANKING_SORT = new SignalButtonNameEvent("RANKING_SORT", 11, "ranking_sort");
    public static final SignalButtonNameEvent INFLUENCER_FILTER = new SignalButtonNameEvent("INFLUENCER_FILTER", 12, "address_sources_filter");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalButtonNameEvent[] $values() {
        return new SignalButtonNameEvent[]{GEMS_TAB, OVERVIEWS_TAB, ACTIVITIES_TAB, TOKEN_DETAILS, TOKEN_SIGNAL_DETAILS, FILTER_BUTTON, BUY_BUTTON, QUICK_BUY_BUTTON, GEMS_RANKING_CATEGORY, ALERT_BUTTON, CHAIN, RANKING_SORT, INFLUENCER_FILTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalButtonNameEvent> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfo() {
        return this.info;
    }

    private SignalButtonNameEvent(String str, int i, String str2) {
        this.info = str2;
    }

    static {
        SignalButtonNameEvent[] signalButtonNameEventArr$values = $values();
        $VALUES = signalButtonNameEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalButtonNameEventArr$values);
    }

    public static SignalButtonNameEvent valueOf(String str) {
        return (SignalButtonNameEvent) Enum.valueOf(SignalButtonNameEvent.class, str);
    }

    public static SignalButtonNameEvent[] values() {
        return (SignalButtonNameEvent[]) $VALUES.clone();
    }
}
