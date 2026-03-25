package com.okinc.assets.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class AssetWithdrawSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetWithdrawSource[] $VALUES;
    private final String value;
    public static final AssetWithdrawSource PUSH = new AssetWithdrawSource("PUSH", 0, "1");
    public static final AssetWithdrawSource LIST = new AssetWithdrawSource("LIST", 1, "2");
    public static final AssetWithdrawSource RECENT = new AssetWithdrawSource("RECENT", 2, "3");
    public static final AssetWithdrawSource SUCCESS = new AssetWithdrawSource("SUCCESS", 3, "4");
    public static final AssetWithdrawSource OTHER = new AssetWithdrawSource("OTHER", 4, "5");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetWithdrawSource[] $values() {
        return new AssetWithdrawSource[]{PUSH, LIST, RECENT, SUCCESS, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetWithdrawSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AssetWithdrawSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AssetWithdrawSource[] assetWithdrawSourceArr$values = $values();
        $VALUES = assetWithdrawSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetWithdrawSourceArr$values);
    }

    public static AssetWithdrawSource valueOf(String str) {
        return (AssetWithdrawSource) Enum.valueOf(AssetWithdrawSource.class, str);
    }

    public static AssetWithdrawSource[] values() {
        return (AssetWithdrawSource[]) $VALUES.clone();
    }
}
