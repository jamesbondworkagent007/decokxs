package com.okinc.business.market.features.analysis.futures.root;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FundingFeeType[] $VALUES;
    public static final FundingFeeType FundingRanking = new FundingFeeType("FundingRanking", 0);
    public static final FundingFeeType FundingFee = new FundingFeeType("FundingFee", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FundingFeeType[] $values() {
        return new FundingFeeType[]{FundingRanking, FundingFee};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FundingFeeType> getEntries() {
        return $ENTRIES;
    }

    private FundingFeeType(String str, int i) {
    }

    static {
        FundingFeeType[] fundingFeeTypeArr$values = $values();
        $VALUES = fundingFeeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fundingFeeTypeArr$values);
    }

    public static FundingFeeType valueOf(String str) {
        return (FundingFeeType) Enum.valueOf(FundingFeeType.class, str);
    }

    public static FundingFeeType[] values() {
        return (FundingFeeType[]) $VALUES.clone();
    }
}
