package com.okinc.buysell.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CdnResourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CdnResourceType[] $VALUES;
    public static final CdnResourceType Audio = new CdnResourceType("Audio", 0, "audio/");
    public static final CdnResourceType Images = new CdnResourceType("Images", 1, "images/");
    public static final CdnResourceType Js = new CdnResourceType("Js", 2, "js/");
    public static final CdnResourceType Json = new CdnResourceType("Json", 3, "json/");
    public static final CdnResourceType Lottie = new CdnResourceType("Lottie", 4, "lottie/");
    public static final CdnResourceType Text = new CdnResourceType("Text", 5, "text/");
    private final String prefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CdnResourceType[] $values() {
        return new CdnResourceType[]{Audio, Images, Js, Json, Lottie, Text};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CdnResourceType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrefix() {
        return this.prefix;
    }

    private CdnResourceType(String str, int i, String str2) {
        this.prefix = str2;
    }

    static {
        CdnResourceType[] cdnResourceTypeArr$values = $values();
        $VALUES = cdnResourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cdnResourceTypeArr$values);
    }

    public static CdnResourceType valueOf(String str) {
        return (CdnResourceType) Enum.valueOf(CdnResourceType.class, str);
    }

    public static CdnResourceType[] values() {
        return (CdnResourceType[]) $VALUES.clone();
    }
}
