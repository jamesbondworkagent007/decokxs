package com.okinc.business.defi.wallet.tx.send.adapter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class SendCoinGroup {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SendCoinGroup[] $VALUES;
    private final String group;
    public static final SendCoinGroup RECENT = new SendCoinGroup("RECENT", 0, "RECENT");
    public static final SendCoinGroup ADDRESS_BOOKS = new SendCoinGroup("ADDRESS_BOOKS", 1, "ADDRESS_BOOKS");
    public static final SendCoinGroup MY_WALLET = new SendCoinGroup("MY_WALLET", 2, "MY_WALLET");
    public static final SendCoinGroup DEFAULT = new SendCoinGroup("DEFAULT", 3, "DEFAULT");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SendCoinGroup[] $values() {
        return new SendCoinGroup[]{RECENT, ADDRESS_BOOKS, MY_WALLET, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SendCoinGroup> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroup() {
        return this.group;
    }

    private SendCoinGroup(String str, int i, String str2) {
        this.group = str2;
    }

    static {
        SendCoinGroup[] sendCoinGroupArr$values = $values();
        $VALUES = sendCoinGroupArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sendCoinGroupArr$values);
    }

    public static SendCoinGroup valueOf(String str) {
        return (SendCoinGroup) Enum.valueOf(SendCoinGroup.class, str);
    }

    public static SendCoinGroup[] values() {
        return (SendCoinGroup[]) $VALUES.clone();
    }
}
