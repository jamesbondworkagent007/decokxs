package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletSyncStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletSyncStatus[] $VALUES;
    private final int value;
    public static final WalletSyncStatus NotSync = new WalletSyncStatus("NotSync", 0, 0);
    public static final WalletSyncStatus HasCreate = new WalletSyncStatus("HasCreate", 1, 1);
    public static final WalletSyncStatus HasSync = new WalletSyncStatus("HasSync", 2, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletSyncStatus[] $values() {
        return new WalletSyncStatus[]{NotSync, HasCreate, HasSync};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletSyncStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WalletSyncStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WalletSyncStatus[] walletSyncStatusArr$values = $values();
        $VALUES = walletSyncStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletSyncStatusArr$values);
    }

    public static WalletSyncStatus valueOf(String str) {
        return (WalletSyncStatus) Enum.valueOf(WalletSyncStatus.class, str);
    }

    public static WalletSyncStatus[] values() {
        return (WalletSyncStatus[]) $VALUES.clone();
    }
}
