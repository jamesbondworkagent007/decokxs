package com.okinc.unify_trade.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TradePanelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradePanelType[] $VALUES;
    public static final TradePanelType LEFT = new TradePanelType("LEFT", 0, "1");
    public static final TradePanelType RIGHT = new TradePanelType("RIGHT", 1, "2");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradePanelType[] $values() {
        return new TradePanelType[]{LEFT, RIGHT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradePanelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TradePanelType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TradePanelType[] tradePanelTypeArr$values = $values();
        $VALUES = tradePanelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradePanelTypeArr$values);
    }

    public static TradePanelType valueOf(String str) {
        return (TradePanelType) Enum.valueOf(TradePanelType.class, str);
    }

    public static TradePanelType[] values() {
        return (TradePanelType[]) $VALUES.clone();
    }
}
