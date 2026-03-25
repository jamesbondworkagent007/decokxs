package com.okinc.okpaymentapi.data.remote.model.management;

import com.okinc.auth.impl.mfa.model.MfaResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PaymentError {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentError[] $VALUES;
    private final int code;
    public static final PaymentError UNSUPPORTED_REGION = new PaymentError("UNSUPPORTED_REGION", 0, 103002);
    public static final PaymentError ACCOUNT_RISK_REJECTION = new PaymentError("ACCOUNT_RISK_REJECTION", 1, 103300);
    public static final PaymentError LIMIT_EXCEEDED = new PaymentError("LIMIT_EXCEEDED", 2, 102101);
    public static final PaymentError ACCOUNT_FROZEN = new PaymentError("ACCOUNT_FROZEN", 3, 102201);
    public static final PaymentError PAYMENT_METHOD_NOT_SUPPORT = new PaymentError("PAYMENT_METHOD_NOT_SUPPORT", 4, 102003);
    public static final PaymentError FAILED_3DS = new PaymentError("FAILED_3DS", 5, 102001);
    public static final PaymentError OTHER_PAYMENT_ERROR = new PaymentError("OTHER_PAYMENT_ERROR", 6, 102002);
    public static final PaymentError TRANSACTION_RISK_REJECTION = new PaymentError("TRANSACTION_RISK_REJECTION", 7, 102300);
    public static final PaymentError GENERIC_FAILURE = new PaymentError("GENERIC_FAILURE", 8, 102000);
    public static final PaymentError MAX_OUT_ERROR = new PaymentError("MAX_OUT_ERROR", 9, MfaResponse.MAXIMUM_RETRY);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentError[] $values() {
        return new PaymentError[]{UNSUPPORTED_REGION, ACCOUNT_RISK_REJECTION, LIMIT_EXCEEDED, ACCOUNT_FROZEN, PAYMENT_METHOD_NOT_SUPPORT, FAILED_3DS, OTHER_PAYMENT_ERROR, TRANSACTION_RISK_REJECTION, GENERIC_FAILURE, MAX_OUT_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentError> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private PaymentError(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        PaymentError[] paymentErrorArr$values = $values();
        $VALUES = paymentErrorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentErrorArr$values);
    }

    public static PaymentError valueOf(String str) {
        return (PaymentError) Enum.valueOf(PaymentError.class, str);
    }

    public static PaymentError[] values() {
        return (PaymentError[]) $VALUES.clone();
    }
}
