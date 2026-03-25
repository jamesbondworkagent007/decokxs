package com.okinc.unify_trade.bot.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ArbitrageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ArbitrageType[] $VALUES;
    public static final ArbitrageType LEFT = new ArbitrageType("LEFT", 0);
    public static final ArbitrageType RIGHT = new ArbitrageType("RIGHT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ArbitrageType[] $values() {
        return new ArbitrageType[]{LEFT, RIGHT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ArbitrageType> getEntries() {
        return $ENTRIES;
    }

    private ArbitrageType(String str, int i) {
    }

    static {
        ArbitrageType[] arbitrageTypeArr$values = $values();
        $VALUES = arbitrageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(arbitrageTypeArr$values);
    }

    public static ArbitrageType valueOf(String str) {
        return (ArbitrageType) Enum.valueOf(ArbitrageType.class, str);
    }

    public static ArbitrageType[] values() {
        return (ArbitrageType[]) $VALUES.clone();
    }
}
