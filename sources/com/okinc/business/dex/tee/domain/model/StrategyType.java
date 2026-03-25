package com.okinc.business.dex.tee.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class StrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyType[] $VALUES;
    private final String command;
    public static final StrategyType StrategySwap = new StrategyType("StrategySwap", 0, "Swap");
    public static final StrategyType StrategyLimitOrderClassic = new StrategyType("StrategyLimitOrderClassic", 1, "LimitOrderClassic");
    public static final StrategyType StrategyLimitOrderUBased = new StrategyType("StrategyLimitOrderUBased", 2, "LimitOrderUbased");
    public static final StrategyType StrategySwapAndAutoSell = new StrategyType("StrategySwapAndAutoSell", 3, "SwapAndAutoSell");
    public static final StrategyType StrategyTrailingTPSLUBased = new StrategyType("StrategyTrailingTPSLUBased", 4, "TrailingTPSLUBased");
    public static final StrategyType StrategyCopyTrade = new StrategyType("StrategyCopyTrade", 5, "CopyTrade");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyType[] $values() {
        return new StrategyType[]{StrategySwap, StrategyLimitOrderClassic, StrategyLimitOrderUBased, StrategySwapAndAutoSell, StrategyTrailingTPSLUBased, StrategyCopyTrade};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    private StrategyType(String str, int i, String str2) {
        this.command = str2;
    }

    static {
        StrategyType[] strategyTypeArr$values = $values();
        $VALUES = strategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyTypeArr$values);
    }

    public static StrategyType valueOf(String str) {
        return (StrategyType) Enum.valueOf(StrategyType.class, str);
    }

    public static StrategyType[] values() {
        return (StrategyType[]) $VALUES.clone();
    }
}
