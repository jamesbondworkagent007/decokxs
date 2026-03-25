package com.okinc.core.base;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadingDialogType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoadingDialogType[] $VALUES;
    public static final LoadingDialogType BRANDING = new LoadingDialogType("BRANDING", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoadingDialogType[] $values() {
        return new LoadingDialogType[]{BRANDING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoadingDialogType> getEntries() {
        return $ENTRIES;
    }

    private LoadingDialogType(String str, int i) {
    }

    static {
        LoadingDialogType[] loadingDialogTypeArr$values = $values();
        $VALUES = loadingDialogTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loadingDialogTypeArr$values);
    }

    public static LoadingDialogType valueOf(String str) {
        return (LoadingDialogType) Enum.valueOf(LoadingDialogType.class, str);
    }

    public static LoadingDialogType[] values() {
        return (LoadingDialogType[]) $VALUES.clone();
    }
}
