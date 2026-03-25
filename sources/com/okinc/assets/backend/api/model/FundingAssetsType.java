package com.okinc.assets.backend.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class FundingAssetsType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FundingAssetsType[] $VALUES;
    public static final FundingAssetsType All = new FundingAssetsType("All", 0);
    public static final FundingAssetsType NORMAL = new FundingAssetsType("NORMAL", 1);
    public static final FundingAssetsType INVALID = new FundingAssetsType("INVALID", 2);
    public static final FundingAssetsType CANNOT_WITHDRAW = new FundingAssetsType("CANNOT_WITHDRAW", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FundingAssetsType[] $values() {
        return new FundingAssetsType[]{All, NORMAL, INVALID, CANNOT_WITHDRAW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FundingAssetsType> getEntries() {
        return $ENTRIES;
    }

    private FundingAssetsType(String str, int i) {
    }

    static {
        FundingAssetsType[] fundingAssetsTypeArr$values = $values();
        $VALUES = fundingAssetsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fundingAssetsTypeArr$values);
    }

    public static FundingAssetsType valueOf(String str) {
        return (FundingAssetsType) Enum.valueOf(FundingAssetsType.class, str);
    }

    public static FundingAssetsType[] values() {
        return (FundingAssetsType[]) $VALUES.clone();
    }
}
