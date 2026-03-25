package com.okinc.business.dex.trade.common.reminder.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class WalletTypeForReminder {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletTypeForReminder[] $VALUES;
    public static final WalletTypeForReminder Hardware = new WalletTypeForReminder("Hardware", 0);
    public static final WalletTypeForReminder MPC = new WalletTypeForReminder("MPC", 1);
    public static final WalletTypeForReminder AA = new WalletTypeForReminder("AA", 2);
    public static final WalletTypeForReminder PrivateKey = new WalletTypeForReminder("PrivateKey", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletTypeForReminder[] $values() {
        return new WalletTypeForReminder[]{Hardware, MPC, AA, PrivateKey};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletTypeForReminder> getEntries() {
        return $ENTRIES;
    }

    private WalletTypeForReminder(String str, int i) {
    }

    static {
        WalletTypeForReminder[] walletTypeForReminderArr$values = $values();
        $VALUES = walletTypeForReminderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletTypeForReminderArr$values);
    }

    public static WalletTypeForReminder valueOf(String str) {
        return (WalletTypeForReminder) Enum.valueOf(WalletTypeForReminder.class, str);
    }

    public static WalletTypeForReminder[] values() {
        return (WalletTypeForReminder[]) $VALUES.clone();
    }
}
