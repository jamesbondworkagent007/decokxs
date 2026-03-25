package com.okinc.buysell.data;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AccountStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountStatus[] $VALUES;
    private final String value;
    public static final AccountStatus ACTIVE = new AccountStatus("ACTIVE", 0, "active");
    public static final AccountStatus INACTIVE = new AccountStatus("INACTIVE", 1, "inactive");
    public static final AccountStatus PENDING = new AccountStatus(CardSyncResponse.PENDING, 2, "pending");
    public static final AccountStatus DELETED = new AccountStatus("DELETED", 3, "deleted");
    public static final AccountStatus REQUIRES_VERIFICATION = new AccountStatus("REQUIRES_VERIFICATION", 4, "requires_verification");
    public static final AccountStatus DISCONNECTED = new AccountStatus("DISCONNECTED", 5, "disconnected");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountStatus[] $values() {
        return new AccountStatus[]{ACTIVE, INACTIVE, PENDING, DELETED, REQUIRES_VERIFICATION, DISCONNECTED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AccountStatus(String str, int i, String str2) {
        this.value = str2;
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
