package com.okinc.assets.backend.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WithdrawAddressType[] $VALUES;
    private final int value;
    public static final WithdrawAddressType WITHDRAWAL_ADDRESS = new WithdrawAddressType("WITHDRAWAL_ADDRESS", 0, -1);
    public static final WithdrawAddressType CN = new WithdrawAddressType("CN", 1, 0);
    public static final WithdrawAddressType INTL = new WithdrawAddressType("INTL", 2, 1);
    public static final WithdrawAddressType OKEX = new WithdrawAddressType("OKEX", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WithdrawAddressType[] $values() {
        return new WithdrawAddressType[]{WITHDRAWAL_ADDRESS, CN, INTL, OKEX};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WithdrawAddressType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WithdrawAddressType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WithdrawAddressType[] withdrawAddressTypeArr$values = $values();
        $VALUES = withdrawAddressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(withdrawAddressTypeArr$values);
    }

    public static WithdrawAddressType valueOf(String str) {
        return (WithdrawAddressType) Enum.valueOf(WithdrawAddressType.class, str);
    }

    public static WithdrawAddressType[] values() {
        return (WithdrawAddressType[]) $VALUES.clone();
    }
}
