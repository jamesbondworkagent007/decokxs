package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PnlDetailPageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PnlDetailPageType[] $VALUES;
    private final String eventTracker;
    private final int value;
    public static final PnlDetailPageType CURRENT_HOLDINGS = new PnlDetailPageType("CURRENT_HOLDINGS", 0, 1, "current");
    public static final PnlDetailPageType ALL_TIME = new PnlDetailPageType("ALL_TIME", 1, 2, "all");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PnlDetailPageType[] $values() {
        return new PnlDetailPageType[]{CURRENT_HOLDINGS, ALL_TIME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PnlDetailPageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTracker() {
        return this.eventTracker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PnlDetailPageType(String str, int i, int i2, String str2) {
        this.value = i2;
        this.eventTracker = str2;
    }

    static {
        PnlDetailPageType[] pnlDetailPageTypeArr$values = $values();
        $VALUES = pnlDetailPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pnlDetailPageTypeArr$values);
    }

    public static PnlDetailPageType valueOf(String str) {
        return (PnlDetailPageType) Enum.valueOf(PnlDetailPageType.class, str);
    }

    public static PnlDetailPageType[] values() {
        return (PnlDetailPageType[]) $VALUES.clone();
    }
}
