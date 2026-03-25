package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class HistoryFilterType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HistoryFilterType[] $VALUES;
    public static final HistoryFilterType ALL = new HistoryFilterType("ALL", 0);
    public static final HistoryFilterType CRYPTO = new HistoryFilterType("CRYPTO", 1);
    public static final HistoryFilterType DAPPS = new HistoryFilterType("DAPPS", 2);
    public static final HistoryFilterType ADDRESS = new HistoryFilterType("ADDRESS", 3);
    public static final HistoryFilterType MY_ASSET = new HistoryFilterType("MY_ASSET", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HistoryFilterType[] $values() {
        return new HistoryFilterType[]{ALL, CRYPTO, DAPPS, ADDRESS, MY_ASSET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HistoryFilterType> getEntries() {
        return $ENTRIES;
    }

    private HistoryFilterType(String str, int i) {
    }

    static {
        HistoryFilterType[] historyFilterTypeArr$values = $values();
        $VALUES = historyFilterTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(historyFilterTypeArr$values);
    }

    public static HistoryFilterType valueOf(String str) {
        return (HistoryFilterType) Enum.valueOf(HistoryFilterType.class, str);
    }

    public static HistoryFilterType[] values() {
        return (HistoryFilterType[]) $VALUES.clone();
    }
}
