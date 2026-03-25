package com.okinc.business.defi.api.model.tx;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class FeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeeType[] $VALUES;
    public static final FeeType FEE_TYPE_NO = new FeeType("FEE_TYPE_NO", 0);
    public static final FeeType FEE_TYPE_FREE = new FeeType("FEE_TYPE_FREE", 1);
    public static final FeeType FEE_TYPE_FIXED = new FeeType("FEE_TYPE_FIXED", 2);
    public static final FeeType FEE_TYPE_SELECTED = new FeeType("FEE_TYPE_SELECTED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeeType[] $values() {
        return new FeeType[]{FEE_TYPE_NO, FEE_TYPE_FREE, FEE_TYPE_FIXED, FEE_TYPE_SELECTED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowFee() {
        return this != FEE_TYPE_NO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVariable() {
        return (this == FEE_TYPE_NO || this == FEE_TYPE_FREE || this == FEE_TYPE_FIXED) ? false : true;
    }

    private FeeType(String str, int i) {
    }

    static {
        FeeType[] feeTypeArr$values = $values();
        $VALUES = feeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(feeTypeArr$values);
    }

    public static FeeType valueOf(String str) {
        return (FeeType) Enum.valueOf(FeeType.class, str);
    }

    public static FeeType[] values() {
        return (FeeType[]) $VALUES.clone();
    }
}
