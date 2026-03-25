package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PaymentStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;
    public static final PaymentStatus PENDING_FOR_PAYMENT = new PaymentStatus("PENDING_FOR_PAYMENT", 0, 0);
    public static final PaymentStatus PENDING_FOR_RELEASE = new PaymentStatus("PENDING_FOR_RELEASE", 1, 1);
    private int paymentStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentStatus[] $values() {
        return new PaymentStatus[]{PENDING_FOR_PAYMENT, PENDING_FOR_RELEASE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    private PaymentStatus(String str, int i, int i2) {
        this.paymentStatus = i2;
    }

    static {
        PaymentStatus[] paymentStatusArr$values = $values();
        $VALUES = paymentStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentStatusArr$values);
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }
}
