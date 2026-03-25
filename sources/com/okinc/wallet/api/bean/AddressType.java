package com.okinc.wallet.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AddressType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;
    private final int value;
    public static final AddressType Legacy = new AddressType("Legacy", 0, 1);
    public static final AddressType Bech32Type = new AddressType("Bech32Type", 1, 2);
    public static final AddressType P2SHType = new AddressType("P2SHType", 2, 3);
    public static final AddressType BCHPubKeyAddr = new AddressType("BCHPubKeyAddr", 3, 4);
    public static final AddressType P2SHCommonType = new AddressType("P2SHCommonType", 4, 5);
    public static final AddressType P2TRType = new AddressType("P2TRType", 5, 6);
    public static final AddressType LedgerLegacy = new AddressType("LedgerLegacy", 6, 7);
    public static final AddressType LedgerLive = new AddressType("LedgerLive", 7, 8);
    public static final AddressType LedgerBip44 = new AddressType("LedgerBip44", 8, 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressType[] $values() {
        return new AddressType[]{Legacy, Bech32Type, P2SHType, BCHPubKeyAddr, P2SHCommonType, P2TRType, LedgerLegacy, LedgerLive, LedgerBip44};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AddressType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AddressType[] addressTypeArr$values = $values();
        $VALUES = addressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressTypeArr$values);
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) $VALUES.clone();
    }
}
