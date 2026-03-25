package com.okinc.business.defi.wallet.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class NewWalletType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NewWalletType[] $VALUES;
    public static final NewWalletType CREATE_WALLET = new NewWalletType("CREATE_WALLET", 0);
    public static final NewWalletType IMPORT_WALLET = new NewWalletType("IMPORT_WALLET", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NewWalletType[] $values() {
        return new NewWalletType[]{CREATE_WALLET, IMPORT_WALLET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NewWalletType> getEntries() {
        return $ENTRIES;
    }

    private NewWalletType(String str, int i) {
    }

    static {
        NewWalletType[] newWalletTypeArr$values = $values();
        $VALUES = newWalletTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(newWalletTypeArr$values);
    }

    public static NewWalletType valueOf(String str) {
        return (NewWalletType) Enum.valueOf(NewWalletType.class, str);
    }

    public static NewWalletType[] values() {
        return (NewWalletType[]) $VALUES.clone();
    }
}
