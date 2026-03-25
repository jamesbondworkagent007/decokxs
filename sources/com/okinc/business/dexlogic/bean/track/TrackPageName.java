package com.okinc.business.dexlogic.bean.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TrackPageName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackPageName[] $VALUES;
    private final String pageName;
    public static final TrackPageName COPY_TRADE_DASHBOARD = new TrackPageName("COPY_TRADE_DASHBOARD", 0, "copy_trade_dashboard");
    public static final TrackPageName COPY_TRADE_DETAILS = new TrackPageName("COPY_TRADE_DETAILS", 1, "copy_trade_details");
    public static final TrackPageName COPY_TRADE_STRATEGY_FORM = new TrackPageName("COPY_TRADE_STRATEGY_FORM", 2, "copy_trade_strategy_form");
    public static final TrackPageName STRATEGY_EDIT_PAGE = new TrackPageName("STRATEGY_EDIT_PAGE", 3, "strategy_edit_page");
    public static final TrackPageName BUY_CONFIG = new TrackPageName("BUY_CONFIG", 4, "buy_config");
    public static final TrackPageName SELL_CONFIG = new TrackPageName("SELL_CONFIG", 5, "sell_config");
    public static final TrackPageName HOME = new TrackPageName("HOME", 6, "home");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackPageName[] $values() {
        return new TrackPageName[]{COPY_TRADE_DASHBOARD, COPY_TRADE_DETAILS, COPY_TRADE_STRATEGY_FORM, STRATEGY_EDIT_PAGE, BUY_CONFIG, SELL_CONFIG, HOME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackPageName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageName() {
        return this.pageName;
    }

    private TrackPageName(String str, int i, String str2) {
        this.pageName = str2;
    }

    static {
        TrackPageName[] trackPageNameArr$values = $values();
        $VALUES = trackPageNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackPageNameArr$values);
    }

    public static TrackPageName valueOf(String str) {
        return (TrackPageName) Enum.valueOf(TrackPageName.class, str);
    }

    public static TrackPageName[] values() {
        return (TrackPageName[]) $VALUES.clone();
    }
}
