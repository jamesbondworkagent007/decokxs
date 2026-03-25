package com.okinc.localization.util.format;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class OKDateStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKDateStyle[] $VALUES;
    private final int style;
    public static final OKDateStyle DATE_STYLE_NONE = new OKDateStyle("DATE_STYLE_NONE", 0, 0);
    public static final OKDateStyle DATE_STYLE_FULL = new OKDateStyle("DATE_STYLE_FULL", 1, 1);
    public static final OKDateStyle DATE_STYLE_YM = new OKDateStyle("DATE_STYLE_YM", 2, 2);
    public static final OKDateStyle DATE_STYLE_MD = new OKDateStyle("DATE_STYLE_MD", 3, 3);
    public static final OKDateStyle DATE_STYLE_M = new OKDateStyle("DATE_STYLE_M", 4, 4);
    public static final OKDateStyle DATE_STYLE_Y = new OKDateStyle("DATE_STYLE_Y", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKDateStyle[] $values() {
        return new OKDateStyle[]{DATE_STYLE_NONE, DATE_STYLE_FULL, DATE_STYLE_YM, DATE_STYLE_MD, DATE_STYLE_M, DATE_STYLE_Y};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKDateStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStyle() {
        return this.style;
    }

    private OKDateStyle(String str, int i, int i2) {
        this.style = i2;
    }

    static {
        OKDateStyle[] oKDateStyleArr$values = $values();
        $VALUES = oKDateStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKDateStyleArr$values);
    }

    public static OKDateStyle valueOf(String str) {
        return (OKDateStyle) Enum.valueOf(OKDateStyle.class, str);
    }

    public static OKDateStyle[] values() {
        return (OKDateStyle[]) $VALUES.clone();
    }
}
