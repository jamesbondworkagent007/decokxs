package com.okinc.business.invest_biz.ui.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class InvestUniv3CurrentPriceViewMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestUniv3CurrentPriceViewMode[] $VALUES;
    public static final InvestUniv3CurrentPriceViewMode DEFAULT = new InvestUniv3CurrentPriceViewMode("DEFAULT", 0);
    public static final InvestUniv3CurrentPriceViewMode V2 = new InvestUniv3CurrentPriceViewMode("V2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestUniv3CurrentPriceViewMode[] $values() {
        return new InvestUniv3CurrentPriceViewMode[]{DEFAULT, V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestUniv3CurrentPriceViewMode> getEntries() {
        return $ENTRIES;
    }

    private InvestUniv3CurrentPriceViewMode(String str, int i) {
    }

    static {
        InvestUniv3CurrentPriceViewMode[] investUniv3CurrentPriceViewModeArr$values = $values();
        $VALUES = investUniv3CurrentPriceViewModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investUniv3CurrentPriceViewModeArr$values);
    }

    public static InvestUniv3CurrentPriceViewMode valueOf(String str) {
        return (InvestUniv3CurrentPriceViewMode) Enum.valueOf(InvestUniv3CurrentPriceViewMode.class, str);
    }

    public static InvestUniv3CurrentPriceViewMode[] values() {
        return (InvestUniv3CurrentPriceViewMode[]) $VALUES.clone();
    }
}
