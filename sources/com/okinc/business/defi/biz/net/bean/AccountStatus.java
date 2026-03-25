package com.okinc.business.defi.biz.net.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AccountStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountStatus[] $VALUES;
    private final int value;
    public static final AccountStatus Normal = new AccountStatus("Normal", 0, 0);
    public static final AccountStatus Delete = new AccountStatus("Delete", 1, 1);
    public static final AccountStatus Frozen = new AccountStatus("Frozen", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountStatus[] $values() {
        return new AccountStatus[]{Normal, Delete, Frozen};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AccountStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AccountStatus[] accountStatusArr$values = $values();
        $VALUES = accountStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountStatusArr$values);
    }

    public static AccountStatus valueOf(String str) {
        return (AccountStatus) Enum.valueOf(AccountStatus.class, str);
    }

    public static AccountStatus[] values() {
        return (AccountStatus[]) $VALUES.clone();
    }
}
