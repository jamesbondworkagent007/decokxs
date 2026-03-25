package com.okinc.im.imui.chatsettings;

import o.C35399nuc;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AutoDownloadOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AutoDownloadOption[] $VALUES;
    public static final AutoDownloadOption NEVER = new AutoDownloadOption("NEVER", 0, C35399nuc.LoaderManager.DGUQLIOvDItG);
    public static final AutoDownloadOption WIFI = new AutoDownloadOption("WIFI", 1, C35399nuc.LoaderManager.DGUQLIDGUQLI);
    public static final AutoDownloadOption WIFI_AND_CELLULAR = new AutoDownloadOption("WIFI_AND_CELLULAR", 2, C35399nuc.LoaderManager.DTg);
    private final int titleResId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AutoDownloadOption[] $values() {
        return new AutoDownloadOption[]{NEVER, WIFI, WIFI_AND_CELLULAR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AutoDownloadOption> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private AutoDownloadOption(String str, int i, int i2) {
        this.titleResId = i2;
    }

    static {
        AutoDownloadOption[] autoDownloadOptionArr$values = $values();
        $VALUES = autoDownloadOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(autoDownloadOptionArr$values);
    }

    public static AutoDownloadOption valueOf(String str) {
        return (AutoDownloadOption) Enum.valueOf(AutoDownloadOption.class, str);
    }

    public static AutoDownloadOption[] values() {
        return (AutoDownloadOption[]) $VALUES.clone();
    }
}
