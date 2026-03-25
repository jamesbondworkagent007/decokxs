package com.okinc.business.dexlogic.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class MemeTransactionSceneType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeTransactionSceneType[] $VALUES;
    private final String value;
    public static final MemeTransactionSceneType Market = new MemeTransactionSceneType("Market", 0, "0");
    public static final MemeTransactionSceneType Limit = new MemeTransactionSceneType("Limit", 1, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeTransactionSceneType[] $values() {
        return new MemeTransactionSceneType[]{Market, Limit};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeTransactionSceneType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private MemeTransactionSceneType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        MemeTransactionSceneType[] memeTransactionSceneTypeArr$values = $values();
        $VALUES = memeTransactionSceneTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeTransactionSceneTypeArr$values);
    }

    public static MemeTransactionSceneType valueOf(String str) {
        return (MemeTransactionSceneType) Enum.valueOf(MemeTransactionSceneType.class, str);
    }

    public static MemeTransactionSceneType[] values() {
        return (MemeTransactionSceneType[]) $VALUES.clone();
    }
}
