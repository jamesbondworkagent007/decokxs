package com.okinc.planet.biz_setting;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TopPadding {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TopPadding[] $VALUES;
    private final float dp;
    public static final TopPadding Large = new TopPadding("Large", 0, 178.0f);
    public static final TopPadding Default = new TopPadding("Default", 1, 96.0f);
    public static final TopPadding Small = new TopPadding("Small", 2, 48.0f);
    public static final TopPadding XSmall = new TopPadding("XSmall", 3, 24.0f);
    public static final TopPadding None = new TopPadding("None", 4, 0.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TopPadding[] $values() {
        return new TopPadding[]{Large, Default, Small, XSmall, None};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TopPadding> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getDp() {
        return this.dp;
    }

    private TopPadding(String str, int i, float f) {
        this.dp = f;
    }

    static {
        TopPadding[] topPaddingArr$values = $values();
        $VALUES = topPaddingArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(topPaddingArr$values);
    }

    public static TopPadding valueOf(String str) {
        return (TopPadding) Enum.valueOf(TopPadding.class, str);
    }

    public static TopPadding[] values() {
        return (TopPadding[]) $VALUES.clone();
    }
}
