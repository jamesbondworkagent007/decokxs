package com.okinc.social_trade_api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeType[] $VALUES;
    public static final TradeType Spot = new TradeType("Spot", 0);
    public static final TradeType Swap = new TradeType("Swap", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeType[] $values() {
        return new TradeType[]{Spot, Swap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeType> getEntries() {
        return $ENTRIES;
    }

    private TradeType(String str, int i) {
    }

    static {
        TradeType[] tradeTypeArr$values = $values();
        $VALUES = tradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeTypeArr$values);
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}
