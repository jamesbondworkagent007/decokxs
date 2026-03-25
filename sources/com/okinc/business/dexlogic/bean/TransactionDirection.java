package com.okinc.business.dexlogic.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TransactionDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionDirection[] $VALUES;
    public static final TransactionDirection TransactionBuy = new TransactionDirection("TransactionBuy", 0, 0);
    public static final TransactionDirection TransactionSell = new TransactionDirection("TransactionSell", 1, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionDirection[] $values() {
        return new TransactionDirection[]{TransactionBuy, TransactionSell};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TransactionDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TransactionDirection[] transactionDirectionArr$values = $values();
        $VALUES = transactionDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionDirectionArr$values);
    }

    public static TransactionDirection valueOf(String str) {
        return (TransactionDirection) Enum.valueOf(TransactionDirection.class, str);
    }

    public static TransactionDirection[] values() {
        return (TransactionDirection[]) $VALUES.clone();
    }
}
