package com.okinc.business.invest_biz.ui.screens.history;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class LoadHistoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoadHistoryType[] $VALUES;
    public static final LoadHistoryType REFRESH_PAGE = new LoadHistoryType("REFRESH_PAGE", 0);
    public static final LoadHistoryType LOAD_MORE = new LoadHistoryType("LOAD_MORE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoadHistoryType[] $values() {
        return new LoadHistoryType[]{REFRESH_PAGE, LOAD_MORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoadHistoryType> getEntries() {
        return $ENTRIES;
    }

    private LoadHistoryType(String str, int i) {
    }

    static {
        LoadHistoryType[] loadHistoryTypeArr$values = $values();
        $VALUES = loadHistoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loadHistoryTypeArr$values);
    }

    public static LoadHistoryType valueOf(String str) {
        return (LoadHistoryType) Enum.valueOf(LoadHistoryType.class, str);
    }

    public static LoadHistoryType[] values() {
        return (LoadHistoryType[]) $VALUES.clone();
    }
}
