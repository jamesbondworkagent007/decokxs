package com.okinc.tradelite.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class TradeProductId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeProductId[] $VALUES;
    private final String identifier;
    public static final TradeProductId SPOT_GRID = new TradeProductId("SPOT_GRID", 0, "SPOT_GRID");
    public static final TradeProductId SPOT_DCA = new TradeProductId("SPOT_DCA", 1, "SPOT_DCA");
    public static final TradeProductId SMART_PORTFOLIO = new TradeProductId("SMART_PORTFOLIO", 2, "SMART_PORTFOLIO");
    public static final TradeProductId INFINITY_GRID = new TradeProductId("INFINITY_GRID", 3, "INFINITY_GRID");
    public static final TradeProductId COPY_TRADING = new TradeProductId("COPY_TRADING", 4, "COPY_TRADING");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeProductId[] $values() {
        return new TradeProductId[]{SPOT_GRID, SPOT_DCA, SMART_PORTFOLIO, INFINITY_GRID, COPY_TRADING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeProductId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentifier() {
        return this.identifier;
    }

    private TradeProductId(String str, int i, String str2) {
        this.identifier = str2;
    }

    static {
        TradeProductId[] tradeProductIdArr$values = $values();
        $VALUES = tradeProductIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeProductIdArr$values);
    }

    public static TradeProductId valueOf(String str) {
        return (TradeProductId) Enum.valueOf(TradeProductId.class, str);
    }

    public static TradeProductId[] values() {
        return (TradeProductId[]) $VALUES.clone();
    }
}
