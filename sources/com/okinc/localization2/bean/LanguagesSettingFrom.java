package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class LanguagesSettingFrom {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LanguagesSettingFrom[] $VALUES;
    public static final LanguagesSettingFrom ACCOUNT = new LanguagesSettingFrom("ACCOUNT", 0);
    public static final LanguagesSettingFrom COMPLIANCE = new LanguagesSettingFrom("COMPLIANCE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LanguagesSettingFrom[] $values() {
        return new LanguagesSettingFrom[]{ACCOUNT, COMPLIANCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LanguagesSettingFrom> getEntries() {
        return $ENTRIES;
    }

    private LanguagesSettingFrom(String str, int i) {
    }

    static {
        LanguagesSettingFrom[] languagesSettingFromArr$values = $values();
        $VALUES = languagesSettingFromArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(languagesSettingFromArr$values);
    }

    public static LanguagesSettingFrom valueOf(String str) {
        return (LanguagesSettingFrom) Enum.valueOf(LanguagesSettingFrom.class, str);
    }

    public static LanguagesSettingFrom[] values() {
        return (LanguagesSettingFrom[]) $VALUES.clone();
    }
}
