package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CacheStrategy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CacheStrategy[] $VALUES;
    public static final CacheStrategy CacheFirst = new CacheStrategy("CacheFirst", 0);
    public static final CacheStrategy CacheOnly = new CacheStrategy("CacheOnly", 1);
    public static final CacheStrategy ForceRemote = new CacheStrategy("ForceRemote", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CacheStrategy[] $values() {
        return new CacheStrategy[]{CacheFirst, CacheOnly, ForceRemote};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacheStrategy> getEntries() {
        return $ENTRIES;
    }

    private CacheStrategy(String str, int i) {
    }

    static {
        CacheStrategy[] cacheStrategyArr$values = $values();
        $VALUES = cacheStrategyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacheStrategyArr$values);
    }

    public static CacheStrategy valueOf(String str) {
        return (CacheStrategy) Enum.valueOf(CacheStrategy.class, str);
    }

    public static CacheStrategy[] values() {
        return (CacheStrategy[]) $VALUES.clone();
    }
}
