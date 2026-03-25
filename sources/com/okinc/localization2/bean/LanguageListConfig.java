package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LanguageListConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LanguageListConfig[] $VALUES;
    public static final LanguageListConfig NO_CHECK = new LanguageListConfig("NO_CHECK", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LanguageListConfig[] $values() {
        return new LanguageListConfig[]{NO_CHECK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LanguageListConfig> getEntries() {
        return $ENTRIES;
    }

    private LanguageListConfig(String str, int i) {
    }

    static {
        LanguageListConfig[] languageListConfigArr$values = $values();
        $VALUES = languageListConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(languageListConfigArr$values);
    }

    public static LanguageListConfig valueOf(String str) {
        return (LanguageListConfig) Enum.valueOf(LanguageListConfig.class, str);
    }

    public static LanguageListConfig[] values() {
        return (LanguageListConfig[]) $VALUES.clone();
    }
}
