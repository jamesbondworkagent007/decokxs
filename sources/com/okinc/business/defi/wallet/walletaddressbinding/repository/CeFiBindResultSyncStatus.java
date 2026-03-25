package com.okinc.business.defi.wallet.walletaddressbinding.repository;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CeFiBindResultSyncStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CeFiBindResultSyncStatus[] $VALUES;
    private final String value;
    public static final CeFiBindResultSyncStatus CANCEL = new CeFiBindResultSyncStatus("CANCEL", 0, "1");
    public static final CeFiBindResultSyncStatus SUCCESS = new CeFiBindResultSyncStatus("SUCCESS", 1, "2");
    public static final CeFiBindResultSyncStatus ALREADY_BOUND = new CeFiBindResultSyncStatus("ALREADY_BOUND", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CeFiBindResultSyncStatus[] $values() {
        return new CeFiBindResultSyncStatus[]{CANCEL, SUCCESS, ALREADY_BOUND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CeFiBindResultSyncStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CeFiBindResultSyncStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        CeFiBindResultSyncStatus[] ceFiBindResultSyncStatusArr$values = $values();
        $VALUES = ceFiBindResultSyncStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ceFiBindResultSyncStatusArr$values);
    }

    public static CeFiBindResultSyncStatus valueOf(String str) {
        return (CeFiBindResultSyncStatus) Enum.valueOf(CeFiBindResultSyncStatus.class, str);
    }

    public static CeFiBindResultSyncStatus[] values() {
        return (CeFiBindResultSyncStatus[]) $VALUES.clone();
    }
}
