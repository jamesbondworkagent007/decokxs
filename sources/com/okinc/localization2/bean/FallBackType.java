package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class FallBackType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FallBackType[] $VALUES;
    public static final FallBackType NONE = new FallBackType("NONE", 0);
    public static final FallBackType DynamicLanguagePack = new FallBackType("DynamicLanguagePack", 1);
    public static final FallBackType EmbeddedLanguagePack = new FallBackType("EmbeddedLanguagePack", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FallBackType[] $values() {
        return new FallBackType[]{NONE, DynamicLanguagePack, EmbeddedLanguagePack};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FallBackType> getEntries() {
        return $ENTRIES;
    }

    private FallBackType(String str, int i) {
    }

    static {
        FallBackType[] fallBackTypeArr$values = $values();
        $VALUES = fallBackTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fallBackTypeArr$values);
    }

    public static FallBackType valueOf(String str) {
        return (FallBackType) Enum.valueOf(FallBackType.class, str);
    }

    public static FallBackType[] values() {
        return (FallBackType[]) $VALUES.clone();
    }
}
