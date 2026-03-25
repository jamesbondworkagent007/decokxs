package com.okinc.okex.lite.home.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class LiteHomeCardLayoutType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiteHomeCardLayoutType[] $VALUES;
    public static final LiteHomeCardLayoutType ASSET_CARD = new LiteHomeCardLayoutType("ASSET_CARD", 0, 0);
    public static final LiteHomeCardLayoutType ONBOARDING_CARD = new LiteHomeCardLayoutType("ONBOARDING_CARD", 1, 1);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiteHomeCardLayoutType[] $values() {
        return new LiteHomeCardLayoutType[]{ASSET_CARD, ONBOARDING_CARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiteHomeCardLayoutType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private LiteHomeCardLayoutType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        LiteHomeCardLayoutType[] liteHomeCardLayoutTypeArr$values = $values();
        $VALUES = liteHomeCardLayoutTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liteHomeCardLayoutTypeArr$values);
    }

    public static LiteHomeCardLayoutType valueOf(String str) {
        return (LiteHomeCardLayoutType) Enum.valueOf(LiteHomeCardLayoutType.class, str);
    }

    public static LiteHomeCardLayoutType[] values() {
        return (LiteHomeCardLayoutType[]) $VALUES.clone();
    }
}
