package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AssetDetailsSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetDetailsSource[] $VALUES;
    public static final AssetDetailsSource MINI_PROJECT = new AssetDetailsSource("MINI_PROJECT", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetDetailsSource[] $values() {
        return new AssetDetailsSource[]{MINI_PROJECT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetDetailsSource> getEntries() {
        return $ENTRIES;
    }

    private AssetDetailsSource(String str, int i) {
    }

    static {
        AssetDetailsSource[] assetDetailsSourceArr$values = $values();
        $VALUES = assetDetailsSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetDetailsSourceArr$values);
    }

    public static AssetDetailsSource valueOf(String str) {
        return (AssetDetailsSource) Enum.valueOf(AssetDetailsSource.class, str);
    }

    public static AssetDetailsSource[] values() {
        return (AssetDetailsSource[]) $VALUES.clone();
    }
}
