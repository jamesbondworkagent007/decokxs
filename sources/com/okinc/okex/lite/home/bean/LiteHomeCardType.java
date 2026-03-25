package com.okinc.okex.lite.home.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class LiteHomeCardType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiteHomeCardType[] $VALUES;
    public static final LiteHomeCardType PRIMARY = new LiteHomeCardType("PRIMARY", 0, "primary");
    public static final LiteHomeCardType SECONDARY = new LiteHomeCardType("SECONDARY", 1, "secondary");
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiteHomeCardType[] $values() {
        return new LiteHomeCardType[]{PRIMARY, SECONDARY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiteHomeCardType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private LiteHomeCardType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        LiteHomeCardType[] liteHomeCardTypeArr$values = $values();
        $VALUES = liteHomeCardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liteHomeCardTypeArr$values);
    }

    public static LiteHomeCardType valueOf(String str) {
        return (LiteHomeCardType) Enum.valueOf(LiteHomeCardType.class, str);
    }

    public static LiteHomeCardType[] values() {
        return (LiteHomeCardType[]) $VALUES.clone();
    }
}
