package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedAmountValueType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedAmountValueType[] $VALUES;
    public static final AdvancedAmountValueType AMOUNT = new AdvancedAmountValueType("AMOUNT", 0);
    public static final AdvancedAmountValueType VALUE = new AdvancedAmountValueType("VALUE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedAmountValueType[] $values() {
        return new AdvancedAmountValueType[]{AMOUNT, VALUE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedAmountValueType> getEntries() {
        return $ENTRIES;
    }

    static {
        AdvancedAmountValueType[] advancedAmountValueTypeArr$values = $values();
        $VALUES = advancedAmountValueTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedAmountValueTypeArr$values);
    }

    private AdvancedAmountValueType(String str, int i) {
    }

    public static AdvancedAmountValueType valueOf(String str) {
        return (AdvancedAmountValueType) Enum.valueOf(AdvancedAmountValueType.class, str);
    }

    public static AdvancedAmountValueType[] values() {
        return (AdvancedAmountValueType[]) $VALUES.clone();
    }
}
