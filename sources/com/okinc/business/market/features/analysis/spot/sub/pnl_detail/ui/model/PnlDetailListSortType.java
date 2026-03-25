package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PnlDetailListSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PnlDetailListSortType[] $VALUES;
    private final int value;
    public static final PnlDetailListSortType NONE = new PnlDetailListSortType("NONE", 0, 0);
    public static final PnlDetailListSortType NAME_ASC = new PnlDetailListSortType("NAME_ASC", 1, 1);
    public static final PnlDetailListSortType NAME_DESC = new PnlDetailListSortType("NAME_DESC", 2, 2);
    public static final PnlDetailListSortType AMOUNT_ASC = new PnlDetailListSortType("AMOUNT_ASC", 3, 3);
    public static final PnlDetailListSortType AMOUNT_DESC = new PnlDetailListSortType("AMOUNT_DESC", 4, 4);
    public static final PnlDetailListSortType PNL_ASC = new PnlDetailListSortType("PNL_ASC", 5, 5);
    public static final PnlDetailListSortType PNL_DESC = new PnlDetailListSortType("PNL_DESC", 6, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PnlDetailListSortType[] $values() {
        return new PnlDetailListSortType[]{NONE, NAME_ASC, NAME_DESC, AMOUNT_ASC, AMOUNT_DESC, PNL_ASC, PNL_DESC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PnlDetailListSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PnlDetailListSortType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PnlDetailListSortType[] pnlDetailListSortTypeArr$values = $values();
        $VALUES = pnlDetailListSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pnlDetailListSortTypeArr$values);
    }

    public static PnlDetailListSortType valueOf(String str) {
        return (PnlDetailListSortType) Enum.valueOf(PnlDetailListSortType.class, str);
    }

    public static PnlDetailListSortType[] values() {
        return (PnlDetailListSortType[]) $VALUES.clone();
    }
}
