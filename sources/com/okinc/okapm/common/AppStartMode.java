package com.okinc.okapm.common;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AppStartMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppStartMode[] $VALUES;
    private final String value;
    public static final AppStartMode OnLaunch = new AppStartMode("OnLaunch", 0, "launch");
    public static final AppStartMode OnResume = new AppStartMode("OnResume", 1, "resume");
    public static final AppStartMode OnCold = new AppStartMode("OnCold", 2, "cold");
    public static final AppStartMode OnFirst = new AppStartMode("OnFirst", 3, "first");
    public static final AppStartMode OnLifecycle = new AppStartMode("OnLifecycle", 4, RequestParameters.SUBRESOURCE_LIFECYCLE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppStartMode[] $values() {
        return new AppStartMode[]{OnLaunch, OnResume, OnCold, OnFirst, OnLifecycle};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppStartMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AppStartMode(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AppStartMode[] appStartModeArr$values = $values();
        $VALUES = appStartModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appStartModeArr$values);
    }

    public static AppStartMode valueOf(String str) {
        return (AppStartMode) Enum.valueOf(AppStartMode.class, str);
    }

    public static AppStartMode[] values() {
        return (AppStartMode[]) $VALUES.clone();
    }
}
