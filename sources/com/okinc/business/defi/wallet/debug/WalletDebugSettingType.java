package com.okinc.business.defi.wallet.debug;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class WalletDebugSettingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletDebugSettingType[] $VALUES;
    public static final WalletDebugSettingType WALLET_DIAGNOSIS = new WalletDebugSettingType("WALLET_DIAGNOSIS", 0);
    public static final WalletDebugSettingType DECODE_TX = new WalletDebugSettingType("DECODE_TX", 1);
    public static final WalletDebugSettingType CLOUD_BACKUP = new WalletDebugSettingType("CLOUD_BACKUP", 2);
    public static final WalletDebugSettingType MPC_CLOUD_BACKUP = new WalletDebugSettingType("MPC_CLOUD_BACKUP", 3);
    public static final WalletDebugSettingType EXPORT_NOSTR_KEY = new WalletDebugSettingType("EXPORT_NOSTR_KEY", 4);
    public static final WalletDebugSettingType SHOW_WEB3 = new WalletDebugSettingType("SHOW_WEB3", 5);
    public static final WalletDebugSettingType REFERRAL_MANAGERMENT = new WalletDebugSettingType("REFERRAL_MANAGERMENT", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletDebugSettingType[] $values() {
        return new WalletDebugSettingType[]{WALLET_DIAGNOSIS, DECODE_TX, CLOUD_BACKUP, MPC_CLOUD_BACKUP, EXPORT_NOSTR_KEY, SHOW_WEB3, REFERRAL_MANAGERMENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletDebugSettingType> getEntries() {
        return $ENTRIES;
    }

    private WalletDebugSettingType(String str, int i) {
    }

    static {
        WalletDebugSettingType[] walletDebugSettingTypeArr$values = $values();
        $VALUES = walletDebugSettingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletDebugSettingTypeArr$values);
    }

    public static WalletDebugSettingType valueOf(String str) {
        return (WalletDebugSettingType) Enum.valueOf(WalletDebugSettingType.class, str);
    }

    public static WalletDebugSettingType[] values() {
        return (WalletDebugSettingType[]) $VALUES.clone();
    }
}
