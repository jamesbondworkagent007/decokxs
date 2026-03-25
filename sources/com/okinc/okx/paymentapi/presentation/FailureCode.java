package com.okinc.okx.paymentapi.presentation;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class FailureCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FailureCode[] $VALUES;
    public static final FailureCode QUOTE_NOT_AVAILABLE = new FailureCode("QUOTE_NOT_AVAILABLE", 0);
    public static final FailureCode REQUEST_TIME_OUT = new FailureCode("REQUEST_TIME_OUT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FailureCode[] $values() {
        return new FailureCode[]{QUOTE_NOT_AVAILABLE, REQUEST_TIME_OUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FailureCode> getEntries() {
        return $ENTRIES;
    }

    private FailureCode(String str, int i) {
    }

    static {
        FailureCode[] failureCodeArr$values = $values();
        $VALUES = failureCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(failureCodeArr$values);
    }

    public static FailureCode valueOf(String str) {
        return (FailureCode) Enum.valueOf(FailureCode.class, str);
    }

    public static FailureCode[] values() {
        return (FailureCode[]) $VALUES.clone();
    }
}
