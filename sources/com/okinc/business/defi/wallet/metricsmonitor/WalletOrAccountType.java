package com.okinc.business.defi.wallet.metricsmonitor;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class WalletOrAccountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletOrAccountType[] $VALUES;
    private final String stringValue;
    public static final WalletOrAccountType WALLET = new WalletOrAccountType("WALLET", 0, "wallet");
    public static final WalletOrAccountType ACCOUNT = new WalletOrAccountType("ACCOUNT", 1, MTAnalysisConstants.Account.KEY_ACCOUNT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletOrAccountType[] $values() {
        return new WalletOrAccountType[]{WALLET, ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletOrAccountType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStringValue() {
        return this.stringValue;
    }

    private WalletOrAccountType(String str, int i, String str2) {
        this.stringValue = str2;
    }

    static {
        WalletOrAccountType[] walletOrAccountTypeArr$values = $values();
        $VALUES = walletOrAccountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletOrAccountTypeArr$values);
    }

    public static WalletOrAccountType valueOf(String str) {
        return (WalletOrAccountType) Enum.valueOf(WalletOrAccountType.class, str);
    }

    public static WalletOrAccountType[] values() {
        return (WalletOrAccountType[]) $VALUES.clone();
    }
}
