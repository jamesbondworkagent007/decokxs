package com.okinc.localization2.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AppLanguagesChangeResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppLanguagesChangeResult[] $VALUES;
    public static final AppLanguagesChangeResult SUCCEED = new AppLanguagesChangeResult("SUCCEED", 0);
    public static final AppLanguagesChangeResult FAIL = new AppLanguagesChangeResult("FAIL", 1);
    public static final AppLanguagesChangeResult IGNORE = new AppLanguagesChangeResult("IGNORE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppLanguagesChangeResult[] $values() {
        return new AppLanguagesChangeResult[]{SUCCEED, FAIL, IGNORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppLanguagesChangeResult> getEntries() {
        return $ENTRIES;
    }

    private AppLanguagesChangeResult(String str, int i) {
    }

    static {
        AppLanguagesChangeResult[] appLanguagesChangeResultArr$values = $values();
        $VALUES = appLanguagesChangeResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appLanguagesChangeResultArr$values);
    }

    public static AppLanguagesChangeResult valueOf(String str) {
        return (AppLanguagesChangeResult) Enum.valueOf(AppLanguagesChangeResult.class, str);
    }

    public static AppLanguagesChangeResult[] values() {
        return (AppLanguagesChangeResult[]) $VALUES.clone();
    }
}
