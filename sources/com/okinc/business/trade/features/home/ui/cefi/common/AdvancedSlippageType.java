package com.okinc.business.trade.features.home.ui.cefi.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedSlippageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedSlippageType[] $VALUES;
    public static final AdvancedSlippageType Auto = new AdvancedSlippageType("Auto", 0, 0);
    public static final AdvancedSlippageType Custom = new AdvancedSlippageType(TypedValues.Custom.NAME, 1, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedSlippageType[] $values() {
        return new AdvancedSlippageType[]{Auto, Custom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedSlippageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AdvancedSlippageType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AdvancedSlippageType[] advancedSlippageTypeArr$values = $values();
        $VALUES = advancedSlippageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedSlippageTypeArr$values);
    }

    public static AdvancedSlippageType valueOf(String str) {
        return (AdvancedSlippageType) Enum.valueOf(AdvancedSlippageType.class, str);
    }

    public static AdvancedSlippageType[] values() {
        return (AdvancedSlippageType[]) $VALUES.clone();
    }
}
