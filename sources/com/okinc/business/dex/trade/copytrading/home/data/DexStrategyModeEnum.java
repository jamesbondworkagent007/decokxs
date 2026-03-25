package com.okinc.business.dex.trade.copytrading.home.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class DexStrategyModeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexStrategyModeEnum[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexStrategyModeEnum[] $values() {
        return new DexStrategyModeEnum[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DexStrategyModeEnum[] dexStrategyModeEnumArr$values = $values();
        $VALUES = dexStrategyModeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexStrategyModeEnumArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexStrategyModeEnum> getEntries() {
        return $ENTRIES;
    }

    private DexStrategyModeEnum(String str, int i, int i2) {
    }

    public static DexStrategyModeEnum valueOf(String str) {
        return (DexStrategyModeEnum) Enum.valueOf(DexStrategyModeEnum.class, str);
    }

    public static DexStrategyModeEnum[] values() {
        return (DexStrategyModeEnum[]) $VALUES.clone();
    }
}
