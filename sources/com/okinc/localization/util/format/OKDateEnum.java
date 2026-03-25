package com.okinc.localization.util.format;

import com.ibm.icu.text.DateFormat;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OKDateEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKDateEnum[] $VALUES;
    private final String format;
    public static final OKDateEnum NONE = new OKDateEnum("NONE", 0, "");
    public static final OKDateEnum DATE_FORMAT_Y = new OKDateEnum("DATE_FORMAT_Y", 1, "yyyy");
    public static final OKDateEnum DATE_FORMAT_STANDARD = new OKDateEnum("DATE_FORMAT_STANDARD", 2, "yyyyMMMd");
    public static final OKDateEnum DATE_FORMAT_STANDARD_YM = new OKDateEnum("DATE_FORMAT_STANDARD_YM", 3, "yyyyMMM");
    public static final OKDateEnum DATE_FORMAT_STANDARD_MD = new OKDateEnum("DATE_FORMAT_STANDARD_MD", 4, DateFormat.ABBR_MONTH_DAY);
    public static final OKDateEnum DATE_FORMAT_STANDARD_M = new OKDateEnum("DATE_FORMAT_STANDARD_M", 5, DateFormat.ABBR_MONTH);
    public static final OKDateEnum DATE_FORMAT_SIMPLE = new OKDateEnum("DATE_FORMAT_SIMPLE", 6, "yyyyMMdd");
    public static final OKDateEnum DATE_FORMAT_SIMPLE_YM = new OKDateEnum("DATE_FORMAT_SIMPLE_YM", 7, "yyyyMM");
    public static final OKDateEnum DATE_FORMAT_SIMPLE_MD = new OKDateEnum("DATE_FORMAT_SIMPLE_MD", 8, "MMdd");
    public static final OKDateEnum DATE_FORMAT_SIMPLE_M = new OKDateEnum("DATE_FORMAT_SIMPLE_M", 9, "MM");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKDateEnum[] $values() {
        return new OKDateEnum[]{NONE, DATE_FORMAT_Y, DATE_FORMAT_STANDARD, DATE_FORMAT_STANDARD_YM, DATE_FORMAT_STANDARD_MD, DATE_FORMAT_STANDARD_M, DATE_FORMAT_SIMPLE, DATE_FORMAT_SIMPLE_YM, DATE_FORMAT_SIMPLE_MD, DATE_FORMAT_SIMPLE_M};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKDateEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormat() {
        return this.format;
    }

    private OKDateEnum(String str, int i, String str2) {
        this.format = str2;
    }

    static {
        OKDateEnum[] oKDateEnumArr$values = $values();
        $VALUES = oKDateEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKDateEnumArr$values);
    }

    public static OKDateEnum valueOf(String str) {
        return (OKDateEnum) Enum.valueOf(OKDateEnum.class, str);
    }

    public static OKDateEnum[] values() {
        return (OKDateEnum[]) $VALUES.clone();
    }
}
