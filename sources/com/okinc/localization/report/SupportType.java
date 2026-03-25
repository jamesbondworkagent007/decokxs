package com.okinc.localization.report;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class SupportType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupportType[] $VALUES;
    private final String type;
    public static final SupportType KEY = new SupportType("KEY", 0, "1");
    public static final SupportType PIC = new SupportType("PIC", 1, "2");
    public static final SupportType CLASS = new SupportType("CLASS", 2, "3");
    public static final SupportType VIEW = new SupportType("VIEW", 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupportType[] $values() {
        return new SupportType[]{KEY, PIC, CLASS, VIEW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupportType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private SupportType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        SupportType[] supportTypeArr$values = $values();
        $VALUES = supportTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supportTypeArr$values);
    }

    public static SupportType valueOf(String str) {
        return (SupportType) Enum.valueOf(SupportType.class, str);
    }

    public static SupportType[] values() {
        return (SupportType[]) $VALUES.clone();
    }
}
