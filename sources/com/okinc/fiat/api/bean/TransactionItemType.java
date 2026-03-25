package com.okinc.fiat.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionItemType[] $VALUES;
    public static final TransactionItemType EARN = new TransactionItemType("EARN", 0);
    public static final TransactionItemType RECEIVE = new TransactionItemType("RECEIVE", 1);
    public static final TransactionItemType SEND = new TransactionItemType("SEND", 2);
    public static final TransactionItemType BUY = new TransactionItemType("BUY", 3);
    public static final TransactionItemType CONVERT = new TransactionItemType("CONVERT", 4);
    public static final TransactionItemType SELL = new TransactionItemType("SELL", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionItemType[] $values() {
        return new TransactionItemType[]{EARN, RECEIVE, SEND, BUY, CONVERT, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionItemType> getEntries() {
        return $ENTRIES;
    }

    private TransactionItemType(String str, int i) {
    }

    static {
        TransactionItemType[] transactionItemTypeArr$values = $values();
        $VALUES = transactionItemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionItemTypeArr$values);
    }

    public static TransactionItemType valueOf(String str) {
        return (TransactionItemType) Enum.valueOf(TransactionItemType.class, str);
    }

    public static TransactionItemType[] values() {
        return (TransactionItemType[]) $VALUES.clone();
    }
}
