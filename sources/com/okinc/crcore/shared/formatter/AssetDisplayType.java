package com.okinc.crcore.shared.formatter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AssetDisplayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetDisplayType[] $VALUES;
    public static final AssetDisplayType FIAT = new AssetDisplayType("FIAT", 0);
    public static final AssetDisplayType STABLECOIN_1_TO_1 = new AssetDisplayType("STABLECOIN_1_TO_1", 1);
    public static final AssetDisplayType STABLECOIN = new AssetDisplayType("STABLECOIN", 2);
    public static final AssetDisplayType CRYPTO = new AssetDisplayType("CRYPTO", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetDisplayType[] $values() {
        return new AssetDisplayType[]{FIAT, STABLECOIN_1_TO_1, STABLECOIN, CRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetDisplayType> getEntries() {
        return $ENTRIES;
    }

    private AssetDisplayType(String str, int i) {
    }

    static {
        AssetDisplayType[] assetDisplayTypeArr$values = $values();
        $VALUES = assetDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetDisplayTypeArr$values);
    }

    public static AssetDisplayType valueOf(String str) {
        return (AssetDisplayType) Enum.valueOf(AssetDisplayType.class, str);
    }

    public static AssetDisplayType[] values() {
        return (AssetDisplayType[]) $VALUES.clone();
    }
}
