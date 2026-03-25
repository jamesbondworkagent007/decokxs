package com.okinc.business.invest_biz.data.bean;

import kotlinx.serialization.SerialName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PointsValueType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PointsValueType[] $VALUES;

    @SerialName("1")
    public static final PointsValueType TEXT = new PointsValueType("TEXT", 0);

    @SerialName("2")
    public static final PointsValueType QUANTITY = new PointsValueType("QUANTITY", 1);

    @SerialName("3")
    public static final PointsValueType DOLLAR_VALUE = new PointsValueType("DOLLAR_VALUE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PointsValueType[] $values() {
        return new PointsValueType[]{TEXT, QUANTITY, DOLLAR_VALUE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PointsValueType> getEntries() {
        return $ENTRIES;
    }

    private PointsValueType(String str, int i) {
    }

    static {
        PointsValueType[] pointsValueTypeArr$values = $values();
        $VALUES = pointsValueTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pointsValueTypeArr$values);
    }

    public static PointsValueType valueOf(String str) {
        return (PointsValueType) Enum.valueOf(PointsValueType.class, str);
    }

    public static PointsValueType[] values() {
        return (PointsValueType[]) $VALUES.clone();
    }
}
