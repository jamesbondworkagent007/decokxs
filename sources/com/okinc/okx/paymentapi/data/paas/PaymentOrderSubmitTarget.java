package com.okinc.okx.paymentapi.data.paas;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PaymentOrderSubmitTarget {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentOrderSubmitTarget[] $VALUES;
    public static final PaymentOrderSubmitTarget BLIK_BUY = new PaymentOrderSubmitTarget("BLIK_BUY", 0, "1033", "BLIK_BUY");
    public static final PaymentOrderSubmitTarget CARD_DEPOSIT = new PaymentOrderSubmitTarget("CARD_DEPOSIT", 1, "1035", "CARD_DEPOSIT");
    public static final PaymentOrderSubmitTarget GETIVY = new PaymentOrderSubmitTarget("GETIVY", 2, "1036", "EA_OPENBANKING");
    public static final PaymentOrderSubmitTarget GRABPAY_BUY = new PaymentOrderSubmitTarget("GRABPAY_BUY", 3, "1038", "GRABPAY");
    private final String code;
    private final String depositName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentOrderSubmitTarget[] $values() {
        return new PaymentOrderSubmitTarget[]{BLIK_BUY, CARD_DEPOSIT, GETIVY, GRABPAY_BUY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentOrderSubmitTarget> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    private PaymentOrderSubmitTarget(String str, int i, String str2, String str3) {
        this.code = str2;
        this.depositName = str3;
    }

    static {
        PaymentOrderSubmitTarget[] paymentOrderSubmitTargetArr$values = $values();
        $VALUES = paymentOrderSubmitTargetArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentOrderSubmitTargetArr$values);
    }

    public static PaymentOrderSubmitTarget valueOf(String str) {
        return (PaymentOrderSubmitTarget) Enum.valueOf(PaymentOrderSubmitTarget.class, str);
    }

    public static PaymentOrderSubmitTarget[] values() {
        return (PaymentOrderSubmitTarget[]) $VALUES.clone();
    }
}
