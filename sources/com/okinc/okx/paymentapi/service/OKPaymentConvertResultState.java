package com.okinc.okx.paymentapi.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class OKPaymentConvertResultState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKPaymentConvertResultState[] $VALUES;
    public static final OKPaymentConvertResultState SUCCESS = new OKPaymentConvertResultState("SUCCESS", 0);
    public static final OKPaymentConvertResultState FAIL = new OKPaymentConvertResultState("FAIL", 1);
    public static final OKPaymentConvertResultState BUY_PROCESSING = new OKPaymentConvertResultState("BUY_PROCESSING", 2);
    public static final OKPaymentConvertResultState SELL_PROCESSING = new OKPaymentConvertResultState("SELL_PROCESSING", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKPaymentConvertResultState[] $values() {
        return new OKPaymentConvertResultState[]{SUCCESS, FAIL, BUY_PROCESSING, SELL_PROCESSING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKPaymentConvertResultState> getEntries() {
        return $ENTRIES;
    }

    private OKPaymentConvertResultState(String str, int i) {
    }

    static {
        OKPaymentConvertResultState[] oKPaymentConvertResultStateArr$values = $values();
        $VALUES = oKPaymentConvertResultStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKPaymentConvertResultStateArr$values);
    }

    public static OKPaymentConvertResultState valueOf(String str) {
        return (OKPaymentConvertResultState) Enum.valueOf(OKPaymentConvertResultState.class, str);
    }

    public static OKPaymentConvertResultState[] values() {
        return (OKPaymentConvertResultState[]) $VALUES.clone();
    }
}
