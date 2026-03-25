package com.okinc.components.security.scanner;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class BlackAppType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BlackAppType[] $VALUES;
    private final String value;
    public static final BlackAppType FAKE_IM = new BlackAppType("FAKE_IM", 0, "fake_im");
    public static final BlackAppType FAKE_WALLET = new BlackAppType("FAKE_WALLET", 1, "fake_wallet");
    public static final BlackAppType TROJAN = new BlackAppType("TROJAN", 2, "trojan");
    public static final BlackAppType REMOTE_CONTROL = new BlackAppType("REMOTE_CONTROL", 3, "remote_control");
    public static final BlackAppType MNEMONIC_STEALER = new BlackAppType("MNEMONIC_STEALER", 4, "mnemonic_stealer");
    public static final BlackAppType CLIPBOARD = new BlackAppType("CLIPBOARD", 5, "clipboard");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BlackAppType[] $values() {
        return new BlackAppType[]{FAKE_IM, FAKE_WALLET, TROJAN, REMOTE_CONTROL, MNEMONIC_STEALER, CLIPBOARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BlackAppType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private BlackAppType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        BlackAppType[] blackAppTypeArr$values = $values();
        $VALUES = blackAppTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(blackAppTypeArr$values);
    }

    public static BlackAppType valueOf(String str) {
        return (BlackAppType) Enum.valueOf(BlackAppType.class, str);
    }

    public static BlackAppType[] values() {
        return (BlackAppType[]) $VALUES.clone();
    }
}
