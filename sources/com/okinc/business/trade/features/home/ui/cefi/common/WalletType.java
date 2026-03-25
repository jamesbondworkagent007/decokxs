package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class WalletType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletType[] $VALUES;
    public static final WalletType AA = new WalletType("AA", 0);
    public static final WalletType TRACKING = new WalletType("TRACKING", 1);
    public static final WalletType UNSUPPORTED = new WalletType("UNSUPPORTED", 2);
    public static final WalletType MPC = new WalletType("MPC", 3);
    public static final WalletType VALID = new WalletType("VALID", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletType[] $values() {
        return new WalletType[]{AA, TRACKING, UNSUPPORTED, MPC, VALID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletType> getEntries() {
        return $ENTRIES;
    }

    private WalletType(String str, int i) {
    }

    static {
        WalletType[] walletTypeArr$values = $values();
        $VALUES = walletTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletTypeArr$values);
    }

    public static WalletType valueOf(String str) {
        return (WalletType) Enum.valueOf(WalletType.class, str);
    }

    public static WalletType[] values() {
        return (WalletType[]) $VALUES.clone();
    }
}
