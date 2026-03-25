package com.okinc.business.trade.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TradeGuideType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeGuideType[] $VALUES;
    public static final TradeGuideType MODE_SWITCH = new TradeGuideType("MODE_SWITCH", 0);
    public static final TradeGuideType ADVANCED_MODE = new TradeGuideType("ADVANCED_MODE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeGuideType[] $values() {
        return new TradeGuideType[]{MODE_SWITCH, ADVANCED_MODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeGuideType> getEntries() {
        return $ENTRIES;
    }

    private TradeGuideType(String str, int i) {
    }

    static {
        TradeGuideType[] tradeGuideTypeArr$values = $values();
        $VALUES = tradeGuideTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeGuideTypeArr$values);
    }

    public static TradeGuideType valueOf(String str) {
        return (TradeGuideType) Enum.valueOf(TradeGuideType.class, str);
    }

    public static TradeGuideType[] values() {
        return (TradeGuideType[]) $VALUES.clone();
    }
}
