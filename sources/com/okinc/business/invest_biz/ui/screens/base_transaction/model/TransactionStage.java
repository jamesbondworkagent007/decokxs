package com.okinc.business.invest_biz.ui.screens.base_transaction.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TransactionStage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionStage[] $VALUES;
    public static final TransactionStage INPUT = new TransactionStage("INPUT", 0);
    public static final TransactionStage RECEIVE_INFO_TIME_OUT = new TransactionStage("RECEIVE_INFO_TIME_OUT", 1);
    public static final TransactionStage CONFIRMATION = new TransactionStage("CONFIRMATION", 2);
    public static final TransactionStage APPROVAL = new TransactionStage("APPROVAL", 3);
    public static final TransactionStage SUBMIT = new TransactionStage("SUBMIT", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionStage[] $values() {
        return new TransactionStage[]{INPUT, RECEIVE_INFO_TIME_OUT, CONFIRMATION, APPROVAL, SUBMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionStage> getEntries() {
        return $ENTRIES;
    }

    private TransactionStage(String str, int i) {
    }

    static {
        TransactionStage[] transactionStageArr$values = $values();
        $VALUES = transactionStageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionStageArr$values);
    }

    public static TransactionStage valueOf(String str) {
        return (TransactionStage) Enum.valueOf(TransactionStage.class, str);
    }

    public static TransactionStage[] values() {
        return (TransactionStage[]) $VALUES.clone();
    }
}
