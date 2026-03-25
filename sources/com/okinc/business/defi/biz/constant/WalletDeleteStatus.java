package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletDeleteStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletDeleteStatus[] $VALUES;
    private final int value;
    public static final WalletDeleteStatus NotDeleteData = new WalletDeleteStatus("NotDeleteData", 0, 0);
    public static final WalletDeleteStatus HasDeleteData = new WalletDeleteStatus("HasDeleteData", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletDeleteStatus[] $values() {
        return new WalletDeleteStatus[]{NotDeleteData, HasDeleteData};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletDeleteStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WalletDeleteStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WalletDeleteStatus[] walletDeleteStatusArr$values = $values();
        $VALUES = walletDeleteStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletDeleteStatusArr$values);
    }

    public static WalletDeleteStatus valueOf(String str) {
        return (WalletDeleteStatus) Enum.valueOf(WalletDeleteStatus.class, str);
    }

    public static WalletDeleteStatus[] values() {
        return (WalletDeleteStatus[]) $VALUES.clone();
    }
}
