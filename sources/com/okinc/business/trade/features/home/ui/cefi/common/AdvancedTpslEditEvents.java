package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedTpslEditEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedTpslEditEvents[] $VALUES;
    private final String value;
    public static final AdvancedTpslEditEvents TpslEditClose = new AdvancedTpslEditEvents("TpslEditClose", 0, "tpsl_edit_close");
    public static final AdvancedTpslEditEvents StrategyDelete = new AdvancedTpslEditEvents("StrategyDelete", 1, "strategy_delete");
    public static final AdvancedTpslEditEvents Confirm = new AdvancedTpslEditEvents("Confirm", 2, DexTrackEventParameter.ButtonName.CONFIRM.getValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedTpslEditEvents[] $values() {
        return new AdvancedTpslEditEvents[]{TpslEditClose, StrategyDelete, Confirm};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedTpslEditEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedTpslEditEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedTpslEditEvents[] advancedTpslEditEventsArr$values = $values();
        $VALUES = advancedTpslEditEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedTpslEditEventsArr$values);
    }

    public static AdvancedTpslEditEvents valueOf(String str) {
        return (AdvancedTpslEditEvents) Enum.valueOf(AdvancedTpslEditEvents.class, str);
    }

    public static AdvancedTpslEditEvents[] values() {
        return (AdvancedTpslEditEvents[]) $VALUES.clone();
    }
}
