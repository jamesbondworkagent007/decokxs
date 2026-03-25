package com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class CdnResourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CdnResourceType[] $VALUES;
    public static final CdnResourceType Lottie = new CdnResourceType("Lottie", 0, "lottie/");
    private final String prefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CdnResourceType[] $values() {
        return new CdnResourceType[]{Lottie};
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
