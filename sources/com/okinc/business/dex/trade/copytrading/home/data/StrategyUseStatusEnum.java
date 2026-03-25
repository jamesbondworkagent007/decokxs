package com.okinc.business.dex.trade.copytrading.home.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class StrategyUseStatusEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyUseStatusEnum[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyUseStatusEnum[] $values() {
        return new StrategyUseStatusEnum[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        StrategyUseStatusEnum[] strategyUseStatusEnumArr$values = $values();
        $VALUES = strategyUseStatusEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyUseStatusEnumArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyUseStatusEnum> getEntries() {
        return $ENTRIES;
    }

    private StrategyUseStatusEnum(String str, int i, int i2) {
    }

    public static StrategyUseStatusEnum valueOf(String str) {
        return (StrategyUseStatusEnum) Enum.valueOf(StrategyUseStatusEnum.class, str);
    }

    public static StrategyUseStatusEnum[] values() {
        return (StrategyUseStatusEnum[]) $VALUES.clone();
    }
}
