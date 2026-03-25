package com.okinc.localization.util.format;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OKTimeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKTimeEnum[] $VALUES;
    private final String format;
    public static final OKTimeEnum NONE = new OKTimeEnum("NONE", 0, "");
    public static final OKTimeEnum TIME_FORMAT_STANDARD = new OKTimeEnum("TIME_FORMAT_STANDARD", 1, "hhmmss");
    public static final OKTimeEnum TIME_FORMAT_SIMPLE = new OKTimeEnum("TIME_FORMAT_SIMPLE", 2, "HHmmss");
    public static final OKTimeEnum TIME_FORMAT_STANDARD_HM = new OKTimeEnum("TIME_FORMAT_STANDARD_HM", 3, "hhmm");
    public static final OKTimeEnum TIME_FORMAT_SIMPLE_HM = new OKTimeEnum("TIME_FORMAT_SIMPLE_HM", 4, "HHmm");
    public static final OKTimeEnum TIME_FORMAT_MS = new OKTimeEnum("TIME_FORMAT_MS", 5, "mmss");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKTimeEnum[] $values() {
        return new OKTimeEnum[]{NONE, TIME_FORMAT_STANDARD, TIME_FORMAT_SIMPLE, TIME_FORMAT_STANDARD_HM, TIME_FORMAT_SIMPLE_HM, TIME_FORMAT_MS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKTimeEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormat() {
        return this.format;
    }

    private OKTimeEnum(String str, int i, String str2) {
        this.format = str2;
    }

    static {
        OKTimeEnum[] oKTimeEnumArr$values = $values();
        $VALUES = oKTimeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKTimeEnumArr$values);
    }

    public static OKTimeEnum valueOf(String str) {
        return (OKTimeEnum) Enum.valueOf(OKTimeEnum.class, str);
    }

    public static OKTimeEnum[] values() {
        return (OKTimeEnum[]) $VALUES.clone();
    }
}
