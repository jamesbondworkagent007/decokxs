package com.okinc.assets.api.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CacheLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CacheLevel[] $VALUES;
    public static final CacheLevel Memory = new CacheLevel("Memory", 0);
    public static final CacheLevel Network = new CacheLevel("Network", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CacheLevel[] $values() {
        return new CacheLevel[]{Memory, Network};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacheLevel> getEntries() {
        return $ENTRIES;
    }

    private CacheLevel(String str, int i) {
    }

    static {
        CacheLevel[] cacheLevelArr$values = $values();
        $VALUES = cacheLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacheLevelArr$values);
    }

    public static CacheLevel valueOf(String str) {
        return (CacheLevel) Enum.valueOf(CacheLevel.class, str);
    }

    public static CacheLevel[] values() {
        return (CacheLevel[]) $VALUES.clone();
    }
}
