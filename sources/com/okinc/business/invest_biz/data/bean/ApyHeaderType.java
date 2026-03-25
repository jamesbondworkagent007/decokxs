package com.okinc.business.invest_biz.data.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ApyHeaderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ApyHeaderType[] $VALUES;
    private final int value;
    public static final ApyHeaderType APY = new ApyHeaderType("APY", 0, 0);
    public static final ApyHeaderType APR = new ApyHeaderType("APR", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ApyHeaderType[] $values() {
        return new ApyHeaderType[]{APY, APR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ApyHeaderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ApyHeaderType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ApyHeaderType[] apyHeaderTypeArr$values = $values();
        $VALUES = apyHeaderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(apyHeaderTypeArr$values);
    }

    public static ApyHeaderType valueOf(String str) {
        return (ApyHeaderType) Enum.valueOf(ApyHeaderType.class, str);
    }

    public static ApyHeaderType[] values() {
        return (ApyHeaderType[]) $VALUES.clone();
    }
}
