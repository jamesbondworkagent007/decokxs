package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletStatus[] $VALUES;
    public static final WalletStatus NoWallet = new WalletStatus("NoWallet", 0);
    public static final WalletStatus DemoWallet = new WalletStatus("DemoWallet", 1);
    public static final WalletStatus RealWallets = new WalletStatus("RealWallets", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletStatus[] $values() {
        return new WalletStatus[]{NoWallet, DemoWallet, RealWallets};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletStatus> getEntries() {
        return $ENTRIES;
    }

    private WalletStatus(String str, int i) {
    }

    static {
        WalletStatus[] walletStatusArr$values = $values();
        $VALUES = walletStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletStatusArr$values);
    }

    public static WalletStatus valueOf(String str) {
        return (WalletStatus) Enum.valueOf(WalletStatus.class, str);
    }

    public static WalletStatus[] values() {
        return (WalletStatus[]) $VALUES.clone();
    }
}
