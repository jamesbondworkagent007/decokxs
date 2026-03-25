package com.okinc.okex.lite.ukbanner;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class UKBannerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UKBannerType[] $VALUES;
    public static final UKBannerType NOT_APPROVED = new UKBannerType("NOT_APPROVED", 0);
    public static final UKBannerType APPROVED_6OCT23 = new UKBannerType("APPROVED_6OCT23", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UKBannerType[] $values() {
        return new UKBannerType[]{NOT_APPROVED, APPROVED_6OCT23};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UKBannerType> getEntries() {
        return $ENTRIES;
    }

    private UKBannerType(String str, int i) {
    }

    static {
        UKBannerType[] uKBannerTypeArr$values = $values();
        $VALUES = uKBannerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uKBannerTypeArr$values);
    }

    public static UKBannerType valueOf(String str) {
        return (UKBannerType) Enum.valueOf(UKBannerType.class, str);
    }

    public static UKBannerType[] values() {
        return (UKBannerType[]) $VALUES.clone();
    }
}
