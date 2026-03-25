package com.okinc.business.dexlogic.main.swap.trade.viewmodel.util;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class CacheStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CacheStatus[] $VALUES;
    public static final CacheStatus NONE = new CacheStatus("NONE", 0);
    public static final CacheStatus YES = new CacheStatus("YES", 1);
    public static final CacheStatus NO = new CacheStatus("NO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CacheStatus[] $values() {
        return new CacheStatus[]{NONE, YES, NO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacheStatus> getEntries() {
        return $ENTRIES;
    }

    private CacheStatus(String str, int i) {
    }

    static {
        CacheStatus[] cacheStatusArr$values = $values();
        $VALUES = cacheStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacheStatusArr$values);
    }

    public static CacheStatus valueOf(String str) {
        return (CacheStatus) Enum.valueOf(CacheStatus.class, str);
    }

    public static CacheStatus[] values() {
        return (CacheStatus[]) $VALUES.clone();
    }
}
