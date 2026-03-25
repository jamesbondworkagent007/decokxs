package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DexFeature {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexFeature[] $VALUES;
    public static final DexFeature MARKET = new DexFeature("MARKET", 0);
    public static final DexFeature TRADE = new DexFeature("TRADE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexFeature[] $values() {
        return new DexFeature[]{MARKET, TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexFeature> getEntries() {
        return $ENTRIES;
    }

    private DexFeature(String str, int i) {
    }

    static {
        DexFeature[] dexFeatureArr$values = $values();
        $VALUES = dexFeatureArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexFeatureArr$values);
    }

    public static DexFeature valueOf(String str) {
        return (DexFeature) Enum.valueOf(DexFeature.class, str);
    }

    public static DexFeature[] values() {
        return (DexFeature[]) $VALUES.clone();
    }
}
