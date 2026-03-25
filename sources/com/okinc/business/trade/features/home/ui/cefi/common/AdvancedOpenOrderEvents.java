package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOpenOrderEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedOpenOrderEvents[] $VALUES;
    private final String value;
    public static final AdvancedOpenOrderEvents Orders = new AdvancedOpenOrderEvents("Orders", 0, "orders");
    public static final AdvancedOpenOrderEvents Cancel = new AdvancedOpenOrderEvents("Cancel", 1, DexTrackEventParameter.ButtonName.CANCEL.getValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedOpenOrderEvents[] $values() {
        return new AdvancedOpenOrderEvents[]{Orders, Cancel};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedOpenOrderEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedOpenOrderEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedOpenOrderEvents[] advancedOpenOrderEventsArr$values = $values();
        $VALUES = advancedOpenOrderEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedOpenOrderEventsArr$values);
    }

    public static AdvancedOpenOrderEvents valueOf(String str) {
        return (AdvancedOpenOrderEvents) Enum.valueOf(AdvancedOpenOrderEvents.class, str);
    }

    public static AdvancedOpenOrderEvents[] values() {
        return (AdvancedOpenOrderEvents[]) $VALUES.clone();
    }
}
