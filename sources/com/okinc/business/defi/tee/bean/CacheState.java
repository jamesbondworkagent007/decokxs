package com.okinc.business.defi.tee.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CacheState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CacheState[] $VALUES;
    public static final CacheState None = new CacheState("None", 0);
    public static final CacheState NetworkError = new CacheState("NetworkError", 1);
    public static final CacheState Ready = new CacheState("Ready", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CacheState[] $values() {
        return new CacheState[]{None, NetworkError, Ready};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacheState> getEntries() {
        return $ENTRIES;
    }

    private CacheState(String str, int i) {
    }

    static {
        CacheState[] cacheStateArr$values = $values();
        $VALUES = cacheStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacheStateArr$values);
    }

    public static CacheState valueOf(String str) {
        return (CacheState) Enum.valueOf(CacheState.class, str);
    }

    public static CacheState[] values() {
        return (CacheState[]) $VALUES.clone();
    }
}
