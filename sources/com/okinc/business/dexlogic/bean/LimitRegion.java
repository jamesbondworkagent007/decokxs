package com.okinc.business.dexlogic.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class LimitRegion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitRegion[] $VALUES;
    private final String value;
    public static final LimitRegion NOT_LIMIT = new LimitRegion("NOT_LIMIT", 0, "0");
    public static final LimitRegion LIMIT = new LimitRegion("LIMIT", 1, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitRegion[] $values() {
        return new LimitRegion[]{NOT_LIMIT, LIMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitRegion> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private LimitRegion(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        LimitRegion[] limitRegionArr$values = $values();
        $VALUES = limitRegionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitRegionArr$values);
    }

    public static LimitRegion valueOf(String str) {
        return (LimitRegion) Enum.valueOf(LimitRegion.class, str);
    }

    public static LimitRegion[] values() {
        return (LimitRegion[]) $VALUES.clone();
    }
}
