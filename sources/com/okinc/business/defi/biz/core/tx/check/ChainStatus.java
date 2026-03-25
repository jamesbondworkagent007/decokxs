package com.okinc.business.defi.biz.core.tx.check;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ChainStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainStatus[] $VALUES;
    public static final ChainStatus CANNOT_TRANSFER = new ChainStatus("CANNOT_TRANSFER", 0);
    public static final ChainStatus REGISTERED = new ChainStatus("REGISTERED", 1);
    public static final ChainStatus REGISTERING = new ChainStatus("REGISTERING", 2);
    public static final ChainStatus UNREGISTERED = new ChainStatus("UNREGISTERED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainStatus[] $values() {
        return new ChainStatus[]{CANNOT_TRANSFER, REGISTERED, REGISTERING, UNREGISTERED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainStatus> getEntries() {
        return $ENTRIES;
    }

    private ChainStatus(String str, int i) {
    }

    static {
        ChainStatus[] chainStatusArr$values = $values();
        $VALUES = chainStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainStatusArr$values);
    }

    public static ChainStatus valueOf(String str) {
        return (ChainStatus) Enum.valueOf(ChainStatus.class, str);
    }

    public static ChainStatus[] values() {
        return (ChainStatus[]) $VALUES.clone();
    }
}
