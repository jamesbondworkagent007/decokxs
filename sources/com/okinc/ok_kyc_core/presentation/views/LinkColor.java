package com.okinc.ok_kyc_core.presentation.views;

import androidx.annotation.IdRes;
import o.C43662rtX;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class LinkColor {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkColor[] $VALUES;
    private final int colorId;
    private final String nameValue;
    public static final LinkColor BLACK = new LinkColor("BLACK", 0, "black", C43662rtX.PendingIntent.flVtFt);
    public static final LinkColor RED = new LinkColor("RED", 1, "red", C43662rtX.PendingIntent.DAIeex);
    public static final LinkColor ORANGE = new LinkColor("ORANGE", 2, "orange", C43662rtX.PendingIntent.RlQdEF);
    public static final LinkColor YELLOW = new LinkColor("YELLOW", 3, "yellow", C43662rtX.PendingIntent.QKudOq);
    public static final LinkColor GREEN = new LinkColor("GREEN", 4, "green", C43662rtX.PendingIntent.iRxXKY);
    public static final LinkColor BRAND_PRIMARY_ALTERNATIVE = new LinkColor("BRAND_PRIMARY_ALTERNATIVE", 5, "brandPrimaryAlternative", C43662rtX.PendingIntent.iZzfmt);
    public static final LinkColor BLUE = new LinkColor("BLUE", 6, "blue", C43662rtX.PendingIntent.gkJEwt);
    public static final LinkColor LINK_BLUE = new LinkColor("LINK_BLUE", 7, "linkBlue", C43662rtX.PendingIntent.hBpjJd);
    public static final LinkColor GRAY = new LinkColor("GRAY", 8, "gray", C43662rtX.PendingIntent.AxsJAYaxsJAY);
    public static final LinkColor WHITE = new LinkColor("WHITE", 9, "white", C43662rtX.PendingIntent.AxsJAYsNCnLh);
    public static final LinkColor GRAY_SECONDARY = new LinkColor("GRAY_SECONDARY", 10, "graySecondary", C43662rtX.PendingIntent.hUfVAv);
    public static final LinkColor GRAY_DISABLE = new LinkColor("GRAY_DISABLE", 11, "grayDisable", C43662rtX.PendingIntent.QHmsKR);
    public static final LinkColor GRAY_CONTRAST = new LinkColor("GRAY_CONTRAST", 12, "grayContrast", C43662rtX.PendingIntent.QkdxfA);
    public static final LinkColor GRAY_SURFACE_PRIMARY = new LinkColor("GRAY_SURFACE_PRIMARY", 13, "graySurfacePrimary", C43662rtX.PendingIntent.RKDWNf);
    public static final LinkColor CATEGORY_GREEN = new LinkColor("CATEGORY_GREEN", 14, "categoryGreen", C43662rtX.PendingIntent.hrNTAI);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkColor[] $values() {
        return new LinkColor[]{BLACK, RED, ORANGE, YELLOW, GREEN, BRAND_PRIMARY_ALTERNATIVE, BLUE, LINK_BLUE, GRAY, WHITE, GRAY_SECONDARY, GRAY_DISABLE, GRAY_CONTRAST, GRAY_SURFACE_PRIMARY, CATEGORY_GREEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkColor> getEntries() {
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

    private LinkColor(String str, @IdRes int i, String str2, int i2) {
        this.nameValue = str2;
        this.colorId = i2;
    }

    static {
        LinkColor[] linkColorArr$values = $values();
        $VALUES = linkColorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(linkColorArr$values);
    }

    public static LinkColor valueOf(String str) {
        return (LinkColor) Enum.valueOf(LinkColor.class, str);
    }

    public static LinkColor[] values() {
        return (LinkColor[]) $VALUES.clone();
    }
}
