package com.okinc.business.market.features.holders.ui.detail.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AccountDetail {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountDetail[] $VALUES;
    public static final AccountDetail HOLDER_DETAIL = new AccountDetail("HOLDER_DETAIL", 0);
    public static final AccountDetail TRADER_DETAIL = new AccountDetail("TRADER_DETAIL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountDetail[] $values() {
        return new AccountDetail[]{HOLDER_DETAIL, TRADER_DETAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountDetail> getEntries() {
        return $ENTRIES;
    }

    private AccountDetail(String str, int i) {
    }

    static {
        AccountDetail[] accountDetailArr$values = $values();
        $VALUES = accountDetailArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountDetailArr$values);
    }

    public static AccountDetail valueOf(String str) {
        return (AccountDetail) Enum.valueOf(AccountDetail.class, str);
    }

    public static AccountDetail[] values() {
        return (AccountDetail[]) $VALUES.clone();
    }
}
