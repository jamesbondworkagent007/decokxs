package com.okinc.business.dexlogic.bean.track;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EventPageNameType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventPageNameType[] $VALUES;
    private final String pageName;
    public static final EventPageNameType HOME_GENERAL = new EventPageNameType("HOME_GENERAL", 0, "home_general");
    public static final EventPageNameType HOME_TRADE = new EventPageNameType("HOME_TRADE", 1, "home_trade");
    public static final EventPageNameType SWAP = new EventPageNameType("SWAP", 2, "swap");
    public static final EventPageNameType MEME = new EventPageNameType("MEME", 3, TabTitleInfo.KEY_MEME);
    public static final EventPageNameType QUICK = new EventPageNameType("QUICK", 4, "quick");
    public static final EventPageNameType BRIDGE = new EventPageNameType("BRIDGE", 5, TabTitleInfo.KEY_BRIDGE);
    public static final EventPageNameType LIMIT = new EventPageNameType("LIMIT", 6, "limit");
    public static final EventPageNameType MARKET = new EventPageNameType("MARKET", 7, "market");
    public static final EventPageNameType SELECT_DAPP = new EventPageNameType("SELECT_DAPP", 8, "select_dapp");
    public static final EventPageNameType TOKEN_INFO = new EventPageNameType("TOKEN_INFO", 9, "token_info");
    public static final EventPageNameType GO_DAPP_CONFIRMATION = new EventPageNameType("GO_DAPP_CONFIRMATION", 10, "go_dapp_confirmation");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventPageNameType[] $values() {
        return new EventPageNameType[]{HOME_GENERAL, HOME_TRADE, SWAP, MEME, QUICK, BRIDGE, LIMIT, MARKET, SELECT_DAPP, TOKEN_INFO, GO_DAPP_CONFIRMATION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventPageNameType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageName() {
        return this.pageName;
    }

    private EventPageNameType(String str, int i, String str2) {
        this.pageName = str2;
    }

    static {
        EventPageNameType[] eventPageNameTypeArr$values = $values();
        $VALUES = eventPageNameTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventPageNameTypeArr$values);
    }

    public static EventPageNameType valueOf(String str) {
        return (EventPageNameType) Enum.valueOf(EventPageNameType.class, str);
    }

    public static EventPageNameType[] values() {
        return (EventPageNameType[]) $VALUES.clone();
    }
}
