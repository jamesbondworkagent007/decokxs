package com.okinc.localization.util.format;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class OKDateTimeFormat {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKDateTimeFormat[] $VALUES;
    private final int format;
    public static final OKDateTimeFormat DT_STANDARD = new OKDateTimeFormat("DT_STANDARD", 0, 0);
    public static final OKDateTimeFormat DT_SIMPLE = new OKDateTimeFormat("DT_SIMPLE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKDateTimeFormat[] $values() {
        return new OKDateTimeFormat[]{DT_STANDARD, DT_SIMPLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKDateTimeFormat> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFormat() {
        return this.format;
    }

    private OKDateTimeFormat(String str, int i, int i2) {
        this.format = i2;
    }

    static {
        OKDateTimeFormat[] oKDateTimeFormatArr$values = $values();
        $VALUES = oKDateTimeFormatArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKDateTimeFormatArr$values);
    }

    public static OKDateTimeFormat valueOf(String str) {
        return (OKDateTimeFormat) Enum.valueOf(OKDateTimeFormat.class, str);
    }

    public static OKDateTimeFormat[] values() {
        return (OKDateTimeFormat[]) $VALUES.clone();
    }
}
