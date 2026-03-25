package com.okinc.wallet.hardware.api.ledger;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class LedgerSupportedApp {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LedgerSupportedApp[] $VALUES;
    private final String appName;
    private final String signSetting;
    public static final LedgerSupportedApp Bitcoin = new LedgerSupportedApp("Bitcoin", 0, "Bitcoin", null);
    public static final LedgerSupportedApp Litecoin = new LedgerSupportedApp("Litecoin", 1, "Litecoin", null);
    public static final LedgerSupportedApp Ethereum = new LedgerSupportedApp("Ethereum", 2, "Ethereum", "Blind signing");
    public static final LedgerSupportedApp Ethereum_Classic = new LedgerSupportedApp("Ethereum_Classic", 3, "Ethereum Classic", "Blind signing");
    public static final LedgerSupportedApp Tron = new LedgerSupportedApp("Tron", 4, "Tron", "Sign by Hash");
    public static final LedgerSupportedApp Solana = new LedgerSupportedApp("Solana", 5, "Solana", "Allow blind sign");
    public static final LedgerSupportedApp Cosmos = new LedgerSupportedApp("Cosmos", 6, "Cosmos", null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LedgerSupportedApp[] $values() {
        return new LedgerSupportedApp[]{Bitcoin, Litecoin, Ethereum, Ethereum_Classic, Tron, Solana, Cosmos};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LedgerSupportedApp> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignSetting() {
        return this.signSetting;
    }

    private LedgerSupportedApp(String str, int i, String str2, String str3) {
        this.appName = str2;
        this.signSetting = str3;
    }

    static {
        LedgerSupportedApp[] ledgerSupportedAppArr$values = $values();
        $VALUES = ledgerSupportedAppArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ledgerSupportedAppArr$values);
    }

    public static LedgerSupportedApp valueOf(String str) {
        return (LedgerSupportedApp) Enum.valueOf(LedgerSupportedApp.class, str);
    }

    public static LedgerSupportedApp[] values() {
        return (LedgerSupportedApp[]) $VALUES.clone();
    }
}
