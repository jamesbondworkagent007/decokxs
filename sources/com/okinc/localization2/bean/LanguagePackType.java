package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LanguagePackType[] $VALUES;
    public static final LanguagePackType NORMAL = new LanguagePackType("NORMAL", 0);
    public static final LanguagePackType START_UP = new LanguagePackType("START_UP", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LanguagePackType[] $values() {
        return new LanguagePackType[]{NORMAL, START_UP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LanguagePackType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStartup() {
        return this == START_UP;
    }

    private LanguagePackType(String str, int i) {
    }

    static {
        LanguagePackType[] languagePackTypeArr$values = $values();
        $VALUES = languagePackTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(languagePackTypeArr$values);
    }

    public static LanguagePackType valueOf(String str) {
        return (LanguagePackType) Enum.valueOf(LanguagePackType.class, str);
    }

    public static LanguagePackType[] values() {
        return (LanguagePackType[]) $VALUES.clone();
    }
}
