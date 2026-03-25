package com.okinc.assets.backend.api.model;

import com.google.gson.annotations.SerializedName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class TransactionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    private final int value;

    @SerializedName("1")
    public static final TransactionType Deposit = new TransactionType("Deposit", 0, 1);

    @SerializedName("2")
    public static final TransactionType Withdrawal = new TransactionType("Withdrawal", 1, 2);

    @SerializedName("325")
    public static final TransactionType SmartAccountTransfer = new TransactionType("SmartAccountTransfer", 2, 325);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{Deposit, Withdrawal, SmartAccountTransfer};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TransactionType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
