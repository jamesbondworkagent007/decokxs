package com.okinc.dexkline.dexui.main.market.base;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ActionOnMarketDetail {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActionOnMarketDetail[] $VALUES;
    private final String value;
    public static final ActionOnMarketDetail RISK_INFO = new ActionOnMarketDetail("RISK_INFO", 0, "risk_info");
    public static final ActionOnMarketDetail SHARE = new ActionOnMarketDetail("SHARE", 1, "share");
    public static final ActionOnMarketDetail SUBSCRIBE = new ActionOnMarketDetail("SUBSCRIBE", 2, "subscribe");
    public static final ActionOnMarketDetail HISTORY_MORE = new ActionOnMarketDetail("HISTORY_MORE", 3, "history_more");
    public static final ActionOnMarketDetail FUND_POOL_MORE = new ActionOnMarketDetail("FUND_POOL_MORE", 4, "fund_pool_more");
    public static final ActionOnMarketDetail ADDRESS_FILTER = new ActionOnMarketDetail("ADDRESS_FILTER", 5, "address_filter");
    public static final ActionOnMarketDetail ADDRESS_COPY = new ActionOnMarketDetail("ADDRESS_COPY", 6, "address_click");
    public static final ActionOnMarketDetail EVENT = new ActionOnMarketDetail("EVENT", 7, "event_click");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActionOnMarketDetail[] $values() {
        return new ActionOnMarketDetail[]{RISK_INFO, SHARE, SUBSCRIBE, HISTORY_MORE, FUND_POOL_MORE, ADDRESS_FILTER, ADDRESS_COPY, EVENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActionOnMarketDetail> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ActionOnMarketDetail(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ActionOnMarketDetail[] actionOnMarketDetailArr$values = $values();
        $VALUES = actionOnMarketDetailArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(actionOnMarketDetailArr$values);
    }

    public static ActionOnMarketDetail valueOf(String str) {
        return (ActionOnMarketDetail) Enum.valueOf(ActionOnMarketDetail.class, str);
    }

    public static ActionOnMarketDetail[] values() {
        return (ActionOnMarketDetail[]) $VALUES.clone();
    }
}
