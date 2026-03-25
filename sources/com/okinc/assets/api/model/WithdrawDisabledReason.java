package com.okinc.assets.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WithdrawDisabledReason {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WithdrawDisabledReason[] $VALUES;
    public static final WithdrawDisabledReason DemoTrading = new WithdrawDisabledReason("DemoTrading", 0);
    public static final WithdrawDisabledReason SubAccount = new WithdrawDisabledReason("SubAccount", 1);
    public static final WithdrawDisabledReason OneDayFreeze = new WithdrawDisabledReason("OneDayFreeze", 2);
    public static final WithdrawDisabledReason MissingTwoFactorBinding = new WithdrawDisabledReason("MissingTwoFactorBinding", 3);
    public static final WithdrawDisabledReason KycError = new WithdrawDisabledReason("KycError", 4);
    public static final WithdrawDisabledReason GenericError = new WithdrawDisabledReason("GenericError", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WithdrawDisabledReason[] $values() {
        return new WithdrawDisabledReason[]{DemoTrading, SubAccount, OneDayFreeze, MissingTwoFactorBinding, KycError, GenericError};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WithdrawDisabledReason> getEntries() {
        return $ENTRIES;
    }

    private WithdrawDisabledReason(String str, int i) {
    }

    static {
        WithdrawDisabledReason[] withdrawDisabledReasonArr$values = $values();
        $VALUES = withdrawDisabledReasonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(withdrawDisabledReasonArr$values);
    }

    public static WithdrawDisabledReason valueOf(String str) {
        return (WithdrawDisabledReason) Enum.valueOf(WithdrawDisabledReason.class, str);
    }

    public static WithdrawDisabledReason[] values() {
        return (WithdrawDisabledReason[]) $VALUES.clone();
    }
}
