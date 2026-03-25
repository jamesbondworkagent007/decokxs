package com.okinc.business.invest_biz.data.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestAssetPositionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestAssetPositionType[] $VALUES;
    public static final InvestAssetPositionType UNI_V3_POSITION = new InvestAssetPositionType("UNI_V3_POSITION", 0);
    public static final InvestAssetPositionType EXPIRY_POSITION = new InvestAssetPositionType("EXPIRY_POSITION", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestAssetPositionType[] $values() {
        return new InvestAssetPositionType[]{UNI_V3_POSITION, EXPIRY_POSITION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestAssetPositionType> getEntries() {
        return $ENTRIES;
    }

    private InvestAssetPositionType(String str, int i) {
    }

    static {
        InvestAssetPositionType[] investAssetPositionTypeArr$values = $values();
        $VALUES = investAssetPositionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investAssetPositionTypeArr$values);
    }

    public static InvestAssetPositionType valueOf(String str) {
        return (InvestAssetPositionType) Enum.valueOf(InvestAssetPositionType.class, str);
    }

    public static InvestAssetPositionType[] values() {
        return (InvestAssetPositionType[]) $VALUES.clone();
    }
}
