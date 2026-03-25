package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionCurrencyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionCurrencyType[] $VALUES;
    private int currencyType;
    public static final TransactionCurrencyType FIAT = new TransactionCurrencyType("FIAT", 0, 1);
    public static final TransactionCurrencyType STABLECOIN = new TransactionCurrencyType("STABLECOIN", 1, 2);
    public static final TransactionCurrencyType CRYPTO = new TransactionCurrencyType("CRYPTO", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionCurrencyType[] $values() {
        return new TransactionCurrencyType[]{FIAT, STABLECOIN, CRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionCurrencyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyType() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyType(int i) {
        this.currencyType = i;
    }

    private TransactionCurrencyType(String str, int i, int i2) {
        this.currencyType = i2;
    }

    static {
        TransactionCurrencyType[] transactionCurrencyTypeArr$values = $values();
        $VALUES = transactionCurrencyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionCurrencyTypeArr$values);
    }

    public static TransactionCurrencyType valueOf(String str) {
        return (TransactionCurrencyType) Enum.valueOf(TransactionCurrencyType.class, str);
    }

    public static TransactionCurrencyType[] values() {
        return (TransactionCurrencyType[]) $VALUES.clone();
    }
}
