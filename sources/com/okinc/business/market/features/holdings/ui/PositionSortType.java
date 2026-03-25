package com.okinc.business.market.features.holdings.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class PositionSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PositionSortType[] $VALUES;
    public static final PositionSortType BALANCE = new PositionSortType("BALANCE", 0);
    public static final PositionSortType PNL = new PositionSortType("PNL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PositionSortType[] $values() {
        return new PositionSortType[]{BALANCE, PNL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PositionSortType> getEntries() {
        return $ENTRIES;
    }

    private PositionSortType(String str, int i) {
    }

    static {
        PositionSortType[] positionSortTypeArr$values = $values();
        $VALUES = positionSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(positionSortTypeArr$values);
    }

    public static PositionSortType valueOf(String str) {
        return (PositionSortType) Enum.valueOf(PositionSortType.class, str);
    }

    public static PositionSortType[] values() {
        return (PositionSortType[]) $VALUES.clone();
    }
}
