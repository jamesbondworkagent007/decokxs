package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LanguagePackConfig[] $VALUES;
    public static final LanguagePackConfig CACHE_OR_EMBEDDED = new LanguagePackConfig("CACHE_OR_EMBEDDED", 0);
    public static final LanguagePackConfig NEED_LATEST = new LanguagePackConfig("NEED_LATEST", 1);
    public static final LanguagePackConfig CACHE_OR_LATEST_OR_EMBEDDED = new LanguagePackConfig("CACHE_OR_LATEST_OR_EMBEDDED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LanguagePackConfig[] $values() {
        return new LanguagePackConfig[]{CACHE_OR_EMBEDDED, NEED_LATEST, CACHE_OR_LATEST_OR_EMBEDDED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LanguagePackConfig> getEntries() {
        return $ENTRIES;
    }

    private LanguagePackConfig(String str, int i) {
    }

    static {
        LanguagePackConfig[] languagePackConfigArr$values = $values();
        $VALUES = languagePackConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(languagePackConfigArr$values);
    }

    public static LanguagePackConfig valueOf(String str) {
        return (LanguagePackConfig) Enum.valueOf(LanguagePackConfig.class, str);
    }

    public static LanguagePackConfig[] values() {
        return (LanguagePackConfig[]) $VALUES.clone();
    }
}
