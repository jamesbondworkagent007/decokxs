package com.okinc.assets.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class AssetDepositSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetDepositSource[] $VALUES;
    private final String value;
    public static final AssetDepositSource PUSH = new AssetDepositSource("PUSH", 0, "1");
    public static final AssetDepositSource LIST = new AssetDepositSource("LIST", 1, "3");
    public static final AssetDepositSource RECENT = new AssetDepositSource("RECENT", 2, "4");
    public static final AssetDepositSource OTHER = new AssetDepositSource("OTHER", 3, "5");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetDepositSource[] $values() {
        return new AssetDepositSource[]{PUSH, LIST, RECENT, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetDepositSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AssetDepositSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AssetDepositSource[] assetDepositSourceArr$values = $values();
        $VALUES = assetDepositSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetDepositSourceArr$values);
    }

    public static AssetDepositSource valueOf(String str) {
        return (AssetDepositSource) Enum.valueOf(AssetDepositSource.class, str);
    }

    public static AssetDepositSource[] values() {
        return (AssetDepositSource[]) $VALUES.clone();
    }
}
