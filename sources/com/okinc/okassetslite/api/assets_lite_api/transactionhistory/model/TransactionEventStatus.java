package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionEventStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionEventStatus[] $VALUES;
    private int eventStatus;
    public static final TransactionEventStatus PENDING = new TransactionEventStatus(CardSyncResponse.PENDING, 0, 1);
    public static final TransactionEventStatus COMPLETED = new TransactionEventStatus("COMPLETED", 1, 2);
    public static final TransactionEventStatus CANCELED = new TransactionEventStatus("CANCELED", 2, 3);
    public static final TransactionEventStatus FAILED = new TransactionEventStatus(CardSyncResponse.FAILED, 3, 4);
    public static final TransactionEventStatus EXPIRED = new TransactionEventStatus("EXPIRED", 4, 5);
    public static final TransactionEventStatus CANCELLING = new TransactionEventStatus("CANCELLING", 5, 6);
    public static final TransactionEventStatus INTERCEPTED = new TransactionEventStatus("INTERCEPTED", 6, 7);
    public static final TransactionEventStatus UNSUCCESSFUL = new TransactionEventStatus("UNSUCCESSFUL", 7, 8);
    public static final TransactionEventStatus ON_HOLD = new TransactionEventStatus("ON_HOLD", 8, 9);
    public static final TransactionEventStatus PROCESSING = new TransactionEventStatus("PROCESSING", 9, 14);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionEventStatus[] $values() {
        return new TransactionEventStatus[]{PENDING, COMPLETED, CANCELED, FAILED, EXPIRED, CANCELLING, INTERCEPTED, UNSUCCESSFUL, ON_HOLD, PROCESSING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionEventStatus> getEntries() {
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

    private TransactionEventStatus(String str, int i, int i2) {
        this.eventStatus = i2;
    }

    static {
        TransactionEventStatus[] transactionEventStatusArr$values = $values();
        $VALUES = transactionEventStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionEventStatusArr$values);
    }

    public static TransactionEventStatus valueOf(String str) {
        return (TransactionEventStatus) Enum.valueOf(TransactionEventStatus.class, str);
    }

    public static TransactionEventStatus[] values() {
        return (TransactionEventStatus[]) $VALUES.clone();
    }
}
