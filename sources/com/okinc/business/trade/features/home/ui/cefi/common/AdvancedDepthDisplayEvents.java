package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedDepthDisplayEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedDepthDisplayEvents[] $VALUES;
    private final String value;
    public static final AdvancedDepthDisplayEvents Select = new AdvancedDepthDisplayEvents("Select", 0, "depth_display_select");
    public static final AdvancedDepthDisplayEvents Close = new AdvancedDepthDisplayEvents("Close", 1, "depth_display_select_close");
    public static final AdvancedDepthDisplayEvents Value = new AdvancedDepthDisplayEvents("Value", 2, "depth_display_value");
    public static final AdvancedDepthDisplayEvents Amount = new AdvancedDepthDisplayEvents("Amount", 3, "depth_display_amount");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedDepthDisplayEvents[] $values() {
        return new AdvancedDepthDisplayEvents[]{Select, Close, Value, Amount};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedDepthDisplayEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedDepthDisplayEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedDepthDisplayEvents[] advancedDepthDisplayEventsArr$values = $values();
        $VALUES = advancedDepthDisplayEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedDepthDisplayEventsArr$values);
    }

    public static AdvancedDepthDisplayEvents valueOf(String str) {
        return (AdvancedDepthDisplayEvents) Enum.valueOf(AdvancedDepthDisplayEvents.class, str);
    }

    public static AdvancedDepthDisplayEvents[] values() {
        return (AdvancedDepthDisplayEvents[]) $VALUES.clone();
    }
}
