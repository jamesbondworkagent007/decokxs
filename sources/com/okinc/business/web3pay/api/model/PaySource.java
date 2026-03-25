package com.okinc.business.web3pay.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class PaySource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaySource[] $VALUES;
    public static final PaySource PORTFOLIO = new PaySource("PORTFOLIO", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaySource[] $values() {
        return new PaySource[]{PORTFOLIO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaySource> getEntries() {
        return $ENTRIES;
    }

    private PaySource(String str, int i) {
    }

    static {
        PaySource[] paySourceArr$values = $values();
        $VALUES = paySourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paySourceArr$values);
    }

    public static PaySource valueOf(String str) {
        return (PaySource) Enum.valueOf(PaySource.class, str);
    }

    public static PaySource[] values() {
        return (PaySource[]) $VALUES.clone();
    }
}
