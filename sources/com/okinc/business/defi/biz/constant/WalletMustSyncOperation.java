package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletMustSyncOperation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletMustSyncOperation[] $VALUES;
    private final int value;
    public static final WalletMustSyncOperation HasRequestSegwit = new WalletMustSyncOperation("HasRequestSegwit", 0, 0);
    public static final WalletMustSyncOperation HasRequestEosInfo = new WalletMustSyncOperation("HasRequestEosInfo", 1, 1);
    public static final WalletMustSyncOperation HasRequestAsset = new WalletMustSyncOperation("HasRequestAsset", 2, 2);
    public static final WalletMustSyncOperation HasRequestNearAccount = new WalletMustSyncOperation("HasRequestNearAccount", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletMustSyncOperation[] $values() {
        return new WalletMustSyncOperation[]{HasRequestSegwit, HasRequestEosInfo, HasRequestAsset, HasRequestNearAccount};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletMustSyncOperation> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WalletMustSyncOperation(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WalletMustSyncOperation[] walletMustSyncOperationArr$values = $values();
        $VALUES = walletMustSyncOperationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletMustSyncOperationArr$values);
    }

    public static WalletMustSyncOperation valueOf(String str) {
        return (WalletMustSyncOperation) Enum.valueOf(WalletMustSyncOperation.class, str);
    }

    public static WalletMustSyncOperation[] values() {
        return (WalletMustSyncOperation[]) $VALUES.clone();
    }
}
