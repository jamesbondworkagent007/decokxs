package com.okinc.ok_kyc_core.presentation.views;

import androidx.annotation.IdRes;
import o.C43662rtX;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TextColor {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TextColor[] $VALUES;
    private final int colorId;
    private final String nameValue;
    public static final TextColor BLACK = new TextColor("BLACK", 0, "black", C43662rtX.PendingIntent.OuxcSI);
    public static final TextColor RED = new TextColor("RED", 1, "red", C43662rtX.PendingIntent.gwTjWJ);
    public static final TextColor ORANGE = new TextColor("ORANGE", 2, "orange", C43662rtX.PendingIntent.RdAHlO);
    public static final TextColor YELLOW = new TextColor("YELLOW", 3, "yellow", C43662rtX.PendingIntent.OHqIaq);
    public static final TextColor GREEN = new TextColor("GREEN", 4, "green", C43662rtX.PendingIntent.dmfpNf);
    public static final TextColor BLUE = new TextColor("BLUE", 5, "blue", C43662rtX.PendingIntent.zuWLRA);
    public static final TextColor LINK_BLUE = new TextColor("LINK_BLUE", 6, "linkBlue", C43662rtX.PendingIntent.hBpjJd);
    public static final TextColor GRAY = new TextColor("GRAY", 7, "gray", C43662rtX.PendingIntent.OBJEWx);
    public static final TextColor WHITE = new TextColor("WHITE", 8, "white", C43662rtX.PendingIntent.dHguZz);
    public static final TextColor GRAY_SECONDARY = new TextColor("GRAY_SECONDARY", 9, "graySecondary", C43662rtX.PendingIntent.QSBOWP);
    public static final TextColor GRAY_DISABLE = new TextColor("GRAY_DISABLE", 10, "grayDisable", C43662rtX.PendingIntent.QHmsKR);
    public static final TextColor GRAY_CONTRAST = new TextColor("GRAY_CONTRAST", 11, "grayContrast", C43662rtX.PendingIntent.QkdxfA);
    public static final TextColor GRAY_SURFACE_PRIMARY = new TextColor("GRAY_SURFACE_PRIMARY", 12, "graySurfacePrimary", C43662rtX.PendingIntent.RKDWNf);
    public static final TextColor CATEGORY_GREEN = new TextColor("CATEGORY_GREEN", 13, "categoryGreen", C43662rtX.PendingIntent.hrNTAI);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TextColor[] $values() {
        return new TextColor[]{BLACK, RED, ORANGE, YELLOW, GREEN, BLUE, LINK_BLUE, GRAY, WHITE, GRAY_SECONDARY, GRAY_DISABLE, GRAY_CONTRAST, GRAY_SURFACE_PRIMARY, CATEGORY_GREEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TextColor> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorId() {
        return this.colorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameValue() {
        return this.nameValue;
    }

    private TextColor(String str, @IdRes int i, String str2, int i2) {
        this.nameValue = str2;
        this.colorId = i2;
    }

    static {
        TextColor[] textColorArr$values = $values();
        $VALUES = textColorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(textColorArr$values);
    }

    public static TextColor valueOf(String str) {
        return (TextColor) Enum.valueOf(TextColor.class, str);
    }

    public static TextColor[] values() {
        return (TextColor[]) $VALUES.clone();
    }
}
