package com.okinc.kline.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class KlineSettingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineSettingType[] $VALUES;
    public static final KlineSettingType CHART_CLASSIC = new KlineSettingType("CHART_CLASSIC", 0);
    public static final KlineSettingType CHART_FULL_SCREEN = new KlineSettingType("CHART_FULL_SCREEN", 1);
    public static final KlineSettingType CHART_LANDSCAPE = new KlineSettingType("CHART_LANDSCAPE", 2);
    public static final KlineSettingType CHART_TV = new KlineSettingType("CHART_TV", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineSettingType[] $values() {
        return new KlineSettingType[]{CHART_CLASSIC, CHART_FULL_SCREEN, CHART_LANDSCAPE, CHART_TV};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineSettingType> getEntries() {
        return $ENTRIES;
    }

    private KlineSettingType(String str, int i) {
    }

    static {
        KlineSettingType[] klineSettingTypeArr$values = $values();
        $VALUES = klineSettingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineSettingTypeArr$values);
    }

    public static KlineSettingType valueOf(String str) {
        return (KlineSettingType) Enum.valueOf(KlineSettingType.class, str);
    }

    public static KlineSettingType[] values() {
        return (KlineSettingType[]) $VALUES.clone();
    }
}
