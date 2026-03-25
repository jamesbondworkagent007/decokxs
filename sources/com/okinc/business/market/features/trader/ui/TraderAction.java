package com.okinc.business.market.features.trader.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TraderAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TraderAction[] $VALUES;
    private final String key;
    public static final TraderAction FILTER = new TraderAction("FILTER", 0, "filter_button");
    public static final TraderAction ADDRESS_CLICK = new TraderAction("ADDRESS_CLICK", 1, "trader_address");
    public static final TraderAction CURRENCY = new TraderAction("CURRENCY", 2, "currency_switch");
    public static final TraderAction SORT = new TraderAction("SORT", 3, "sort_pnl");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TraderAction[] $values() {
        return new TraderAction[]{FILTER, ADDRESS_CLICK, CURRENCY, SORT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TraderAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private TraderAction(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        TraderAction[] traderActionArr$values = $values();
        $VALUES = traderActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(traderActionArr$values);
    }

    public static TraderAction valueOf(String str) {
        return (TraderAction) Enum.valueOf(TraderAction.class, str);
    }

    public static TraderAction[] values() {
        return (TraderAction[]) $VALUES.clone();
    }
}
