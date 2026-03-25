package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedTpslAddStrategyEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedTpslAddStrategyEvents[] $VALUES;
    private final String value;
    public static final AdvancedTpslAddStrategyEvents Tp = new AdvancedTpslAddStrategyEvents("Tp", 0, "tp");
    public static final AdvancedTpslAddStrategyEvents Sl = new AdvancedTpslAddStrategyEvents("Sl", 1, "sl");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedTpslAddStrategyEvents[] $values() {
        return new AdvancedTpslAddStrategyEvents[]{Tp, Sl};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedTpslAddStrategyEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedTpslAddStrategyEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedTpslAddStrategyEvents[] advancedTpslAddStrategyEventsArr$values = $values();
        $VALUES = advancedTpslAddStrategyEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedTpslAddStrategyEventsArr$values);
    }

    public static AdvancedTpslAddStrategyEvents valueOf(String str) {
        return (AdvancedTpslAddStrategyEvents) Enum.valueOf(AdvancedTpslAddStrategyEvents.class, str);
    }

    public static AdvancedTpslAddStrategyEvents[] values() {
        return (AdvancedTpslAddStrategyEvents[]) $VALUES.clone();
    }
}
