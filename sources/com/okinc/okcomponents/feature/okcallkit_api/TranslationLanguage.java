package com.okinc.okcomponents.feature.okcallkit_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TranslationLanguage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TranslationLanguage[] $VALUES;
    private final String code;
    public static final TranslationLanguage French = new TranslationLanguage("French", 0, "fr");
    public static final TranslationLanguage Russian = new TranslationLanguage("Russian", 1, "ru");
    public static final TranslationLanguage Vietnamese = new TranslationLanguage("Vietnamese", 2, "vi");
    public static final TranslationLanguage Indonesian = new TranslationLanguage("Indonesian", 3, "id");
    public static final TranslationLanguage Turkish = new TranslationLanguage("Turkish", 4, "tr");
    public static final TranslationLanguage German = new TranslationLanguage("German", 5, "de");
    public static final TranslationLanguage Italian = new TranslationLanguage("Italian", 6, "it");
    public static final TranslationLanguage Portuguese = new TranslationLanguage("Portuguese", 7, "pt");
    public static final TranslationLanguage Spanish = new TranslationLanguage("Spanish", 8, "es");
    public static final TranslationLanguage Arabic = new TranslationLanguage("Arabic", 9, "ar");
    public static final TranslationLanguage English = new TranslationLanguage("English", 10, "en");
    public static final TranslationLanguage SimplifiedChinese = new TranslationLanguage("SimplifiedChinese", 11, "zh");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TranslationLanguage[] $values() {
        return new TranslationLanguage[]{French, Russian, Vietnamese, Indonesian, Turkish, German, Italian, Portuguese, Spanish, Arabic, English, SimplifiedChinese};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TranslationLanguage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    private TranslationLanguage(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        TranslationLanguage[] translationLanguageArr$values = $values();
        $VALUES = translationLanguageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(translationLanguageArr$values);
    }

    public static TranslationLanguage valueOf(String str) {
        return (TranslationLanguage) Enum.valueOf(TranslationLanguage.class, str);
    }

    public static TranslationLanguage[] values() {
        return (TranslationLanguage[]) $VALUES.clone();
    }
}
