package com.okinc.unify_trade.header;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class CacheSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CacheSource[] $VALUES;
    public static final CacheSource HEADER_VIEW = new CacheSource("HEADER_VIEW", 0);
    public static final CacheSource POPUP_WINDOW = new CacheSource("POPUP_WINDOW", 1);
    public static final CacheSource POPUP_WINDOW_LITE = new CacheSource("POPUP_WINDOW_LITE", 2);
    public static final CacheSource HEADER_VIEW_LITE = new CacheSource("HEADER_VIEW_LITE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CacheSource[] $values() {
        return new CacheSource[]{HEADER_VIEW, POPUP_WINDOW, POPUP_WINDOW_LITE, HEADER_VIEW_LITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacheSource> getEntries() {
        return $ENTRIES;
    }

    private CacheSource(String str, int i) {
    }

    static {
        CacheSource[] cacheSourceArr$values = $values();
        $VALUES = cacheSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacheSourceArr$values);
    }

    public static CacheSource valueOf(String str) {
        return (CacheSource) Enum.valueOf(CacheSource.class, str);
    }

    public static CacheSource[] values() {
        return (CacheSource[]) $VALUES.clone();
    }
}
