package com.okinc.business.trade.features.home.ui.meme.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeOrdersStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeOrdersStrategyType[] $VALUES;
    private final int value;
    public static final MemeOrdersStrategyType ALL = new MemeOrdersStrategyType("ALL", 0, 0);
    public static final MemeOrdersStrategyType MARKET = new MemeOrdersStrategyType("MARKET", 1, 1);
    public static final MemeOrdersStrategyType BUY_DIP = new MemeOrdersStrategyType("BUY_DIP", 2, 2);
    public static final MemeOrdersStrategyType TAKE_PROFIT = new MemeOrdersStrategyType("TAKE_PROFIT", 3, 3);
    public static final MemeOrdersStrategyType STOP_LOSS = new MemeOrdersStrategyType("STOP_LOSS", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeOrdersStrategyType[] $values() {
        return new MemeOrdersStrategyType[]{ALL, MARKET, BUY_DIP, TAKE_PROFIT, STOP_LOSS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeOrdersStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MemeOrdersStrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MemeOrdersStrategyType[] memeOrdersStrategyTypeArr$values = $values();
        $VALUES = memeOrdersStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeOrdersStrategyTypeArr$values);
    }

    public static MemeOrdersStrategyType valueOf(String str) {
        return (MemeOrdersStrategyType) Enum.valueOf(MemeOrdersStrategyType.class, str);
    }

    public static MemeOrdersStrategyType[] values() {
        return (MemeOrdersStrategyType[]) $VALUES.clone();
    }
}
