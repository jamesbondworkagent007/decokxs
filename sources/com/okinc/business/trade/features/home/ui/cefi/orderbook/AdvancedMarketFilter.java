package com.okinc.business.trade.features.home.ui.cefi.orderbook;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketFilter {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedMarketFilter[] $VALUES;
    public static final AdvancedMarketFilter AMOUNTS_FILTER = new AdvancedMarketFilter("AMOUNTS_FILTER", 0);
    public static final AdvancedMarketFilter SWITCH_FILTER = new AdvancedMarketFilter("SWITCH_FILTER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedMarketFilter[] $values() {
        return new AdvancedMarketFilter[]{AMOUNTS_FILTER, SWITCH_FILTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedMarketFilter> getEntries() {
        return $ENTRIES;
    }

    private AdvancedMarketFilter(String str, int i) {
    }

    static {
        AdvancedMarketFilter[] advancedMarketFilterArr$values = $values();
        $VALUES = advancedMarketFilterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedMarketFilterArr$values);
    }

    public static AdvancedMarketFilter valueOf(String str) {
        return (AdvancedMarketFilter) Enum.valueOf(AdvancedMarketFilter.class, str);
    }

    public static AdvancedMarketFilter[] values() {
        return (AdvancedMarketFilter[]) $VALUES.clone();
    }
}
