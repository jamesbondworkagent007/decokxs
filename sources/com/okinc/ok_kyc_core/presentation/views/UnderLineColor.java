package com.okinc.ok_kyc_core.presentation.views;

import androidx.annotation.IdRes;
import o.C43662rtX;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UnderLineColor {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnderLineColor[] $VALUES;
    private final int colorId;
    private final String nameValue;
    public static final UnderLineColor BLACK = new UnderLineColor("BLACK", 0, "black", C43662rtX.PendingIntent.DLWbHP);
    public static final UnderLineColor RED = new UnderLineColor("RED", 1, "red", C43662rtX.PendingIntent.QVsKAR);
    public static final UnderLineColor ORANGE = new UnderLineColor("ORANGE", 2, "orange", C43662rtX.PendingIntent.OJuSTm);
    public static final UnderLineColor YELLOW = new UnderLineColor("YELLOW", 3, "yellow", C43662rtX.PendingIntent.dUDNAs);
    public static final UnderLineColor GREEN = new UnderLineColor("GREEN", 4, "green", C43662rtX.PendingIntent.QCjLjM);
    public static final UnderLineColor BLUE = new UnderLineColor("BLUE", 5, "blue", C43662rtX.PendingIntent.ODXsMY);
    public static final UnderLineColor LINK_BLUE = new UnderLineColor("LINK_BLUE", 6, "linkBlue", C43662rtX.PendingIntent.hBpjJd);
    public static final UnderLineColor GRAY = new UnderLineColor("GRAY", 7, "gray", C43662rtX.PendingIntent.OFhtUX);
    public static final UnderLineColor WHITE = new UnderLineColor("WHITE", 8, "white", C43662rtX.PendingIntent.UlJrfe);
    public static final UnderLineColor GRAY_SECONDARY = new UnderLineColor("GRAY_SECONDARY", 9, "graySecondary", C43662rtX.PendingIntent.QSLkRj);
    public static final UnderLineColor GRAY_DISABLE = new UnderLineColor("GRAY_DISABLE", 10, "grayDisable", C43662rtX.PendingIntent.QHmsKR);
    public static final UnderLineColor GRAY_CONTRAST = new UnderLineColor("GRAY_CONTRAST", 11, "grayContrast", C43662rtX.PendingIntent.QkdxfA);
    public static final UnderLineColor GRAY_SURFACE_PRIMARY = new UnderLineColor("GRAY_SURFACE_PRIMARY", 12, "graySurfacePrimary", C43662rtX.PendingIntent.RKDWNf);
    public static final UnderLineColor CATEGORY_GREEN = new UnderLineColor("CATEGORY_GREEN", 13, "categoryGreen", C43662rtX.PendingIntent.hrNTAI);
    public static final UnderLineColor PRIMARY = new UnderLineColor("PRIMARY", 14, "primary", C43662rtX.PendingIntent.OxVOHk);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnderLineColor[] $values() {
        return new UnderLineColor[]{BLACK, RED, ORANGE, YELLOW, GREEN, BLUE, LINK_BLUE, GRAY, WHITE, GRAY_SECONDARY, GRAY_DISABLE, GRAY_CONTRAST, GRAY_SURFACE_PRIMARY, CATEGORY_GREEN, PRIMARY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnderLineColor> getEntries() {
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

    private UnderLineColor(String str, @IdRes int i, String str2, int i2) {
        this.nameValue = str2;
        this.colorId = i2;
    }

    static {
        UnderLineColor[] underLineColorArr$values = $values();
        $VALUES = underLineColorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(underLineColorArr$values);
    }

    public static UnderLineColor valueOf(String str) {
        return (UnderLineColor) Enum.valueOf(UnderLineColor.class, str);
    }

    public static UnderLineColor[] values() {
        return (UnderLineColor[]) $VALUES.clone();
    }
}
