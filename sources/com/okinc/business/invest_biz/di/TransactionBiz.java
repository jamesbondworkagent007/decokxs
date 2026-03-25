package com.okinc.business.invest_biz.di;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TransactionBiz {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionBiz[] $VALUES;
    private final long v;
    public static final TransactionBiz DEFI = new TransactionBiz("DEFI", 0, 1);
    public static final TransactionBiz BOOST = new TransactionBiz("BOOST", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionBiz[] $values() {
        return new TransactionBiz[]{DEFI, BOOST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionBiz> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getV() {
        return this.v;
    }

    private TransactionBiz(String str, int i, long j) {
        this.v = j;
    }

    static {
        TransactionBiz[] transactionBizArr$values = $values();
        $VALUES = transactionBizArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionBizArr$values);
    }

    public static TransactionBiz valueOf(String str) {
        return (TransactionBiz) Enum.valueOf(TransactionBiz.class, str);
    }

    public static TransactionBiz[] values() {
        return (TransactionBiz[]) $VALUES.clone();
    }
}
