package com.okinc.business.invest_biz.ui.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3APRViewMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestUniv3APRViewMode[] $VALUES;
    public static final InvestUniv3APRViewMode DEFAULT = new InvestUniv3APRViewMode("DEFAULT", 0);
    public static final InvestUniv3APRViewMode V2 = new InvestUniv3APRViewMode("V2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestUniv3APRViewMode[] $values() {
        return new InvestUniv3APRViewMode[]{DEFAULT, V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestUniv3APRViewMode> getEntries() {
        return $ENTRIES;
    }

    private InvestUniv3APRViewMode(String str, int i) {
    }

    static {
        InvestUniv3APRViewMode[] investUniv3APRViewModeArr$values = $values();
        $VALUES = investUniv3APRViewModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investUniv3APRViewModeArr$values);
    }

    public static InvestUniv3APRViewMode valueOf(String str) {
        return (InvestUniv3APRViewMode) Enum.valueOf(InvestUniv3APRViewMode.class, str);
    }

    public static InvestUniv3APRViewMode[] values() {
        return (InvestUniv3APRViewMode[]) $VALUES.clone();
    }
}
