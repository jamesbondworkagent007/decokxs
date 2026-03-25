package com.okinc.network.request;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class SchemeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SchemeType[] $VALUES;
    public static final SchemeType HTTP = new SchemeType("HTTP", 0);
    public static final SchemeType WS = new SchemeType("WS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SchemeType[] $values() {
        return new SchemeType[]{HTTP, WS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SchemeType> getEntries() {
        return $ENTRIES;
    }

    private SchemeType(String str, int i) {
    }

    static {
        SchemeType[] schemeTypeArr$values = $values();
        $VALUES = schemeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(schemeTypeArr$values);
    }

    public static SchemeType valueOf(String str) {
        return (SchemeType) Enum.valueOf(SchemeType.class, str);
    }

    public static SchemeType[] values() {
        return (SchemeType[]) $VALUES.clone();
    }
}
