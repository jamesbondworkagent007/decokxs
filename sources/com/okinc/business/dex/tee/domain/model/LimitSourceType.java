package com.okinc.business.dex.tee.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class LimitSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitSourceType[] $VALUES;
    private final int value;
    public static final LimitSourceType SWAP = new LimitSourceType("SWAP", 0, 0);
    public static final LimitSourceType MEME = new LimitSourceType("MEME", 1, 1);
    public static final LimitSourceType ADVANCED_MODE = new LimitSourceType("ADVANCED_MODE", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitSourceType[] $values() {
        return new LimitSourceType[]{SWAP, MEME, ADVANCED_MODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitSourceType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LimitSourceType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitSourceType[] limitSourceTypeArr$values = $values();
        $VALUES = limitSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitSourceTypeArr$values);
    }

    public static LimitSourceType valueOf(String str) {
        return (LimitSourceType) Enum.valueOf(LimitSourceType.class, str);
    }

    public static LimitSourceType[] values() {
        return (LimitSourceType[]) $VALUES.clone();
    }
}
