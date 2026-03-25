package com.okinc.okx.paymentapi.service;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class HistoryOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HistoryOrderStatus[] $VALUES;
    private final int value;
    public static final HistoryOrderStatus PENDING = new HistoryOrderStatus(CardSyncResponse.PENDING, 0, 0);
    public static final HistoryOrderStatus PROCESSING = new HistoryOrderStatus("PROCESSING", 1, 1);
    public static final HistoryOrderStatus FAILED = new HistoryOrderStatus(CardSyncResponse.FAILED, 2, 2);
    public static final HistoryOrderStatus COMPLETED = new HistoryOrderStatus("COMPLETED", 3, 3);
    public static final HistoryOrderStatus REFUNDED = new HistoryOrderStatus("REFUNDED", 4, 4);
    public static final HistoryOrderStatus IN_QUEUE = new HistoryOrderStatus("IN_QUEUE", 5, 5);
    public static final HistoryOrderStatus EXPIRED = new HistoryOrderStatus("EXPIRED", 6, 9);
    public static final HistoryOrderStatus CANCELLED = new HistoryOrderStatus("CANCELLED", 7, 10);
    public static final HistoryOrderStatus REVERSING = new HistoryOrderStatus("REVERSING", 8, 14);
    public static final HistoryOrderStatus REVERSED = new HistoryOrderStatus("REVERSED", 9, 15);
    public static final HistoryOrderStatus UNKNOWN = new HistoryOrderStatus("UNKNOWN", 10, -999);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HistoryOrderStatus[] $values() {
        return new HistoryOrderStatus[]{PENDING, PROCESSING, FAILED, COMPLETED, REFUNDED, IN_QUEUE, EXPIRED, CANCELLED, REVERSING, REVERSED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HistoryOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private HistoryOrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        HistoryOrderStatus[] historyOrderStatusArr$values = $values();
        $VALUES = historyOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(historyOrderStatusArr$values);
    }

    public static HistoryOrderStatus valueOf(String str) {
        return (HistoryOrderStatus) Enum.valueOf(HistoryOrderStatus.class, str);
    }

    public static HistoryOrderStatus[] values() {
        return (HistoryOrderStatus[]) $VALUES.clone();
    }
}
