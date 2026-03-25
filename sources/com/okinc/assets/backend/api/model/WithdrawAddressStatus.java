package com.okinc.assets.backend.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WithdrawAddressStatus[] $VALUES;
    public static final WithdrawAddressStatus NORMAL_ADDRESS = new WithdrawAddressStatus("NORMAL_ADDRESS", 0, 0);
    public static final WithdrawAddressStatus VERIFIED_ADDRESS = new WithdrawAddressStatus("VERIFIED_ADDRESS", 1, 1);
    public static final WithdrawAddressStatus VERIFYING = new WithdrawAddressStatus("VERIFYING", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WithdrawAddressStatus[] $values() {
        return new WithdrawAddressStatus[]{NORMAL_ADDRESS, VERIFIED_ADDRESS, VERIFYING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WithdrawAddressStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WithdrawAddressStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WithdrawAddressStatus[] withdrawAddressStatusArr$values = $values();
        $VALUES = withdrawAddressStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(withdrawAddressStatusArr$values);
    }

    public static WithdrawAddressStatus valueOf(String str) {
        return (WithdrawAddressStatus) Enum.valueOf(WithdrawAddressStatus.class, str);
    }

    public static WithdrawAddressStatus[] values() {
        return (WithdrawAddressStatus[]) $VALUES.clone();
    }
}
