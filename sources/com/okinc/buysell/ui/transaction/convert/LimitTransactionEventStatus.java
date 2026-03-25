package com.okinc.buysell.ui.transaction.convert;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class LimitTransactionEventStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitTransactionEventStatus[] $VALUES;
    private int eventStatus;
    public static final LimitTransactionEventStatus FILLED = new LimitTransactionEventStatus("FILLED", 0, 2);
    public static final LimitTransactionEventStatus CANCELED = new LimitTransactionEventStatus("CANCELED", 1, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitTransactionEventStatus[] $values() {
        return new LimitTransactionEventStatus[]{FILLED, CANCELED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitTransactionEventStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventStatus() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventStatus(int i) {
        this.eventStatus = i;
    }

    private LimitTransactionEventStatus(String str, int i, int i2) {
        this.eventStatus = i2;
    }

    static {
        LimitTransactionEventStatus[] limitTransactionEventStatusArr$values = $values();
        $VALUES = limitTransactionEventStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitTransactionEventStatusArr$values);
    }

    public static LimitTransactionEventStatus valueOf(String str) {
        return (LimitTransactionEventStatus) Enum.valueOf(LimitTransactionEventStatus.class, str);
    }

    public static LimitTransactionEventStatus[] values() {
        return (LimitTransactionEventStatus[]) $VALUES.clone();
    }
}
