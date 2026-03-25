package com.okinc.tradecore.main.mvp.home;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class EventTrade {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventTrade[] $VALUES;
    public static final EventTrade GET_CONTEXT = new EventTrade("GET_CONTEXT", 0);
    public static final EventTrade GET_CHILD_FM = new EventTrade("GET_CHILD_FM", 1);
    public static final EventTrade GET_TRADE_MODE = new EventTrade("GET_TRADE_MODE", 2);
    public static final EventTrade GET_ROUTE_DATA = new EventTrade("GET_ROUTE_DATA", 3);
    public static final EventTrade GET_MARGIN_LEVEL = new EventTrade("GET_MARGIN_LEVEL", 4);
    public static final EventTrade GET_TRADE_VIEW = new EventTrade("GET_TRADE_VIEW", 5);
    public static final EventTrade METHOD_SWITCH_COIN = new EventTrade("METHOD_SWITCH_COIN", 6);
    public static final EventTrade SET_TRADE_MODE = new EventTrade("SET_TRADE_MODE", 7);
    public static final EventTrade GET_ARBITRAGEVM = new EventTrade("GET_ARBITRAGEVM", 8);
    public static final EventTrade GET_b = new EventTrade("GET_b", 9);
    public static final EventTrade GET_INIT_PRESENTER = new EventTrade("GET_INIT_PRESENTER", 10);
    public static final EventTrade NOTIFY_CALLAUCTION = new EventTrade("NOTIFY_CALLAUCTION", 11);
    public static final EventTrade NOTIFY_PREQUOTE = new EventTrade("NOTIFY_PREQUOTE", 12);
    public static final EventTrade GET_IS_BEGIN_GUIDE = new EventTrade("GET_IS_BEGIN_GUIDE", 13);
    public static final EventTrade NOTIFY_NEWCOIN_ONLINE = new EventTrade("NOTIFY_NEWCOIN_ONLINE", 14);
    public static final EventTrade BOTTOM_KLINE_PRESENTER = new EventTrade("BOTTOM_KLINE_PRESENTER", 15);
    public static final EventTrade UPDATE_PRE_QUOTE_STATE = new EventTrade("UPDATE_PRE_QUOTE_STATE", 16);
    public static final EventTrade GET_DEPTH_VIEW = new EventTrade("GET_DEPTH_VIEW", 17);
    public static final EventTrade GET_DEPTH_BIZ = new EventTrade("GET_DEPTH_BIZ", 18);
    public static final EventTrade GET_DEPTH_BIZINSTRUMENT = new EventTrade("GET_DEPTH_BIZINSTRUMENT", 19);
    public static final EventTrade GET_DEPTH_CURR_BIZINSTRUMENT = new EventTrade("GET_DEPTH_CURR_BIZINSTRUMENT", 20);
    public static final EventTrade SET_DEPTH_CURR_BIZINSTRUMENT = new EventTrade("SET_DEPTH_CURR_BIZINSTRUMENT", 21);
    public static final EventTrade DEPTH_SUBSCRIBE = new EventTrade("DEPTH_SUBSCRIBE", 22);
    public static final EventTrade DEPTH_INFO_UPDATE = new EventTrade("DEPTH_INFO_UPDATE", 23);
    public static final EventTrade GET_BIZ_CONFIG = new EventTrade("GET_BIZ_CONFIG", 24);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventTrade[] $values() {
        return new EventTrade[]{GET_CONTEXT, GET_CHILD_FM, GET_TRADE_MODE, GET_ROUTE_DATA, GET_MARGIN_LEVEL, GET_TRADE_VIEW, METHOD_SWITCH_COIN, SET_TRADE_MODE, GET_ARBITRAGEVM, GET_b, GET_INIT_PRESENTER, NOTIFY_CALLAUCTION, NOTIFY_PREQUOTE, GET_IS_BEGIN_GUIDE, NOTIFY_NEWCOIN_ONLINE, BOTTOM_KLINE_PRESENTER, UPDATE_PRE_QUOTE_STATE, GET_DEPTH_VIEW, GET_DEPTH_BIZ, GET_DEPTH_BIZINSTRUMENT, GET_DEPTH_CURR_BIZINSTRUMENT, SET_DEPTH_CURR_BIZINSTRUMENT, DEPTH_SUBSCRIBE, DEPTH_INFO_UPDATE, GET_BIZ_CONFIG};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventTrade> getEntries() {
        return $ENTRIES;
    }

    private EventTrade(String str, int i) {
    }

    static {
        EventTrade[] eventTradeArr$values = $values();
        $VALUES = eventTradeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventTradeArr$values);
    }

    public static EventTrade valueOf(String str) {
        return (EventTrade) Enum.valueOf(EventTrade.class, str);
    }

    public static EventTrade[] values() {
        return (EventTrade[]) $VALUES.clone();
    }
}
