package com.okinc.cruilib.compose.composable.cryptolist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CryptoListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CryptoListType[] $VALUES;
    public static final CryptoListType FAVORITES = new CryptoListType("FAVORITES", 0);
    public static final CryptoListType ALL = new CryptoListType("ALL", 1);
    public static final CryptoListType HOT = new CryptoListType("HOT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CryptoListType[] $values() {
        return new CryptoListType[]{FAVORITES, ALL, HOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CryptoListType> getEntries() {
        return $ENTRIES;
    }

    private CryptoListType(String str, int i) {
    }

    static {
        CryptoListType[] cryptoListTypeArr$values = $values();
        $VALUES = cryptoListTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cryptoListTypeArr$values);
    }

    public static CryptoListType valueOf(String str) {
        return (CryptoListType) Enum.valueOf(CryptoListType.class, str);
    }

    public static CryptoListType[] values() {
        return (CryptoListType[]) $VALUES.clone();
    }
}
