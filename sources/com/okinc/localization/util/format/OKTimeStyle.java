package com.okinc.localization.util.format;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class OKTimeStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKTimeStyle[] $VALUES;
    private final int style;
    public static final OKTimeStyle TIME_STYLE_NONE = new OKTimeStyle("TIME_STYLE_NONE", 0, 0);
    public static final OKTimeStyle TIME_STYLE_FULL = new OKTimeStyle("TIME_STYLE_FULL", 1, 1);
    public static final OKTimeStyle TIME_STYLE_HM = new OKTimeStyle("TIME_STYLE_HM", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKTimeStyle[] $values() {
        return new OKTimeStyle[]{TIME_STYLE_NONE, TIME_STYLE_FULL, TIME_STYLE_HM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKTimeStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStyle() {
        return this.style;
    }

    private OKTimeStyle(String str, int i, int i2) {
        this.style = i2;
    }

    static {
        OKTimeStyle[] oKTimeStyleArr$values = $values();
        $VALUES = oKTimeStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKTimeStyleArr$values);
    }

    public static OKTimeStyle valueOf(String str) {
        return (OKTimeStyle) Enum.valueOf(OKTimeStyle.class, str);
    }

    public static OKTimeStyle[] values() {
        return (OKTimeStyle[]) $VALUES.clone();
    }
}
