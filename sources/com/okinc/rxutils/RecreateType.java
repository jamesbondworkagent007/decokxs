package com.okinc.rxutils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class RecreateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecreateType[] $VALUES;
    public static final RecreateType LANGUAGE = new RecreateType("LANGUAGE", 0);
    public static final RecreateType THEME = new RecreateType("THEME", 1);
    public static final RecreateType BOTH = new RecreateType("BOTH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecreateType[] $values() {
        return new RecreateType[]{LANGUAGE, THEME, BOTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecreateType> getEntries() {
        return $ENTRIES;
    }

    private RecreateType(String str, int i) {
    }

    static {
        RecreateType[] recreateTypeArr$values = $values();
        $VALUES = recreateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recreateTypeArr$values);
    }

    public static RecreateType valueOf(String str) {
        return (RecreateType) Enum.valueOf(RecreateType.class, str);
    }

    public static RecreateType[] values() {
        return (RecreateType[]) $VALUES.clone();
    }
}
