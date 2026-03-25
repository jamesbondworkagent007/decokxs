package com.okinc.business.web3pay.api.model;

import com.okinc.p2p.api.OtcExtraKeys;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class PayTransactionProjectId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PayTransactionProjectId[] $VALUES;
    public static final PayTransactionProjectId IM = new PayTransactionProjectId(OtcExtraKeys.IM, 0, "100");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PayTransactionProjectId[] $values() {
        return new PayTransactionProjectId[]{IM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PayTransactionProjectId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PayTransactionProjectId(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PayTransactionProjectId[] payTransactionProjectIdArr$values = $values();
        $VALUES = payTransactionProjectIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(payTransactionProjectIdArr$values);
    }

    public static PayTransactionProjectId valueOf(String str) {
        return (PayTransactionProjectId) Enum.valueOf(PayTransactionProjectId.class, str);
    }

    public static PayTransactionProjectId[] values() {
        return (PayTransactionProjectId[]) $VALUES.clone();
    }
}
