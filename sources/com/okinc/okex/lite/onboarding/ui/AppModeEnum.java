package com.okinc.okex.lite.onboarding.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class AppModeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppModeEnum[] $VALUES;
    public static final AppModeEnum MODE_NONE = new AppModeEnum("MODE_NONE", 0);
    public static final AppModeEnum MODE_LITE = new AppModeEnum("MODE_LITE", 1);
    public static final AppModeEnum MODE_PRO = new AppModeEnum("MODE_PRO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppModeEnum[] $values() {
        return new AppModeEnum[]{MODE_NONE, MODE_LITE, MODE_PRO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppModeEnum> getEntries() {
        return $ENTRIES;
    }

    private AppModeEnum(String str, int i) {
    }

    static {
        AppModeEnum[] appModeEnumArr$values = $values();
        $VALUES = appModeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appModeEnumArr$values);
    }

    public static AppModeEnum valueOf(String str) {
        return (AppModeEnum) Enum.valueOf(AppModeEnum.class, str);
    }

    public static AppModeEnum[] values() {
        return (AppModeEnum[]) $VALUES.clone();
    }
}
