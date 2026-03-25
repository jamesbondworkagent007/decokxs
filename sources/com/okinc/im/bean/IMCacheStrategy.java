package com.okinc.im.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class IMCacheStrategy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IMCacheStrategy[] $VALUES;
    public static final IMCacheStrategy CacheFirst = new IMCacheStrategy("CacheFirst", 0);
    public static final IMCacheStrategy CacheOnly = new IMCacheStrategy("CacheOnly", 1);
    public static final IMCacheStrategy ForceRemote = new IMCacheStrategy("ForceRemote", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IMCacheStrategy[] $values() {
        return new IMCacheStrategy[]{CacheFirst, CacheOnly, ForceRemote};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IMCacheStrategy> getEntries() {
        return $ENTRIES;
    }

    private IMCacheStrategy(String str, int i) {
    }

    static {
        IMCacheStrategy[] iMCacheStrategyArr$values = $values();
        $VALUES = iMCacheStrategyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iMCacheStrategyArr$values);
    }

    public static IMCacheStrategy valueOf(String str) {
        return (IMCacheStrategy) Enum.valueOf(IMCacheStrategy.class, str);
    }

    public static IMCacheStrategy[] values() {
        return (IMCacheStrategy[]) $VALUES.clone();
    }
}
