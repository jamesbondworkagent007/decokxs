package com.okinc.business.invest_biz.ui.screens.univ3.zap.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3Mode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestUniv3Mode[] $VALUES;
    public static final InvestUniv3Mode Normal = new InvestUniv3Mode("Normal", 0);
    public static final InvestUniv3Mode Zap = new InvestUniv3Mode("Zap", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestUniv3Mode[] $values() {
        return new InvestUniv3Mode[]{Normal, Zap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestUniv3Mode> getEntries() {
        return $ENTRIES;
    }

    private InvestUniv3Mode(String str, int i) {
    }

    static {
        InvestUniv3Mode[] investUniv3ModeArr$values = $values();
        $VALUES = investUniv3ModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investUniv3ModeArr$values);
    }

    public static InvestUniv3Mode valueOf(String str) {
        return (InvestUniv3Mode) Enum.valueOf(InvestUniv3Mode.class, str);
    }

    public static InvestUniv3Mode[] values() {
        return (InvestUniv3Mode[]) $VALUES.clone();
    }
}
