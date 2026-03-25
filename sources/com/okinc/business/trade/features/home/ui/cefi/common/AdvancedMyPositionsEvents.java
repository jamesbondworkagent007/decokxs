package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMyPositionsEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedMyPositionsEvents[] $VALUES;
    public static final AdvancedMyPositionsEvents Orders = new AdvancedMyPositionsEvents("Orders", 0, "orders");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedMyPositionsEvents[] $values() {
        return new AdvancedMyPositionsEvents[]{Orders};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedMyPositionsEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedMyPositionsEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedMyPositionsEvents[] advancedMyPositionsEventsArr$values = $values();
        $VALUES = advancedMyPositionsEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedMyPositionsEventsArr$values);
    }

    public static AdvancedMyPositionsEvents valueOf(String str) {
        return (AdvancedMyPositionsEvents) Enum.valueOf(AdvancedMyPositionsEvents.class, str);
    }

    public static AdvancedMyPositionsEvents[] values() {
        return (AdvancedMyPositionsEvents[]) $VALUES.clone();
    }
}
