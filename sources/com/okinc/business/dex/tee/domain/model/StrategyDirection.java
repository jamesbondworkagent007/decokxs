package com.okinc.business.dex.tee.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class StrategyDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyDirection[] $VALUES;
    private final int value;
    public static final StrategyDirection SWAP = new StrategyDirection("SWAP", 0, -1);
    public static final StrategyDirection BUY = new StrategyDirection("BUY", 1, 0);
    public static final StrategyDirection SELL = new StrategyDirection("SELL", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyDirection[] $values() {
        return new StrategyDirection[]{SWAP, BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private StrategyDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        StrategyDirection[] strategyDirectionArr$values = $values();
        $VALUES = strategyDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyDirectionArr$values);
    }

    public static StrategyDirection valueOf(String str) {
        return (StrategyDirection) Enum.valueOf(StrategyDirection.class, str);
    }

    public static StrategyDirection[] values() {
        return (StrategyDirection[]) $VALUES.clone();
    }
}
