package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedDepthTierEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedDepthTierEvents[] $VALUES;
    private final String value;
    public static final AdvancedDepthTierEvents Select = new AdvancedDepthTierEvents("Select", 0, "depth_tier_select");
    public static final AdvancedDepthTierEvents Close = new AdvancedDepthTierEvents("Close", 1, "depth_tier_select_close");
    public static final AdvancedDepthTierEvents All = new AdvancedDepthTierEvents("All", 2, "depth_tier_all");
    public static final AdvancedDepthTierEvents One = new AdvancedDepthTierEvents("One", 3, "depth_tier_1");
    public static final AdvancedDepthTierEvents Two = new AdvancedDepthTierEvents("Two", 4, "depth_tier_2");
    public static final AdvancedDepthTierEvents Three = new AdvancedDepthTierEvents("Three", 5, "depth_tier_3");
    public static final AdvancedDepthTierEvents Four = new AdvancedDepthTierEvents("Four", 6, "depth_tier_4");
    public static final AdvancedDepthTierEvents Five = new AdvancedDepthTierEvents("Five", 7, "depth_tier_5");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedDepthTierEvents[] $values() {
        return new AdvancedDepthTierEvents[]{Select, Close, All, One, Two, Three, Four, Five};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedDepthTierEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedDepthTierEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedDepthTierEvents[] advancedDepthTierEventsArr$values = $values();
        $VALUES = advancedDepthTierEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedDepthTierEventsArr$values);
    }

    public static AdvancedDepthTierEvents valueOf(String str) {
        return (AdvancedDepthTierEvents) Enum.valueOf(AdvancedDepthTierEvents.class, str);
    }

    public static AdvancedDepthTierEvents[] values() {
        return (AdvancedDepthTierEvents[]) $VALUES.clone();
    }
}
