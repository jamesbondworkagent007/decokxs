package com.okinc.okassetslite.api.assets_lite_api.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OKAssetDetailBalanceTokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKAssetDetailBalanceTokenType[] $VALUES;
    private final int value;
    public static final OKAssetDetailBalanceTokenType OKAssetDetailBalanceTokenTypeStable = new OKAssetDetailBalanceTokenType("OKAssetDetailBalanceTokenTypeStable", 0, 0);
    public static final OKAssetDetailBalanceTokenType OKAssetDetailBalanceTokenTypeNonStable = new OKAssetDetailBalanceTokenType("OKAssetDetailBalanceTokenTypeNonStable", 1, 1);
    public static final OKAssetDetailBalanceTokenType OKAssetDetailBalanceTokenTypeCash = new OKAssetDetailBalanceTokenType("OKAssetDetailBalanceTokenTypeCash", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKAssetDetailBalanceTokenType[] $values() {
        return new OKAssetDetailBalanceTokenType[]{OKAssetDetailBalanceTokenTypeStable, OKAssetDetailBalanceTokenTypeNonStable, OKAssetDetailBalanceTokenTypeCash};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKAssetDetailBalanceTokenType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private OKAssetDetailBalanceTokenType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        OKAssetDetailBalanceTokenType[] oKAssetDetailBalanceTokenTypeArr$values = $values();
        $VALUES = oKAssetDetailBalanceTokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKAssetDetailBalanceTokenTypeArr$values);
    }

    public static OKAssetDetailBalanceTokenType valueOf(String str) {
        return (OKAssetDetailBalanceTokenType) Enum.valueOf(OKAssetDetailBalanceTokenType.class, str);
    }

    public static OKAssetDetailBalanceTokenType[] values() {
        return (OKAssetDetailBalanceTokenType[]) $VALUES.clone();
    }
}
