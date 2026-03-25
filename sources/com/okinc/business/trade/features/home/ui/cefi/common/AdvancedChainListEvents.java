package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedChainListEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedChainListEvents[] $VALUES;
    private final String value;
    public static final AdvancedChainListEvents ChainSelect = new AdvancedChainListEvents("ChainSelect", 0, "chain_select");
    public static final AdvancedChainListEvents Back = new AdvancedChainListEvents("Back", 1, DexTrackEventParameter.ButtonName.BACK.getValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedChainListEvents[] $values() {
        return new AdvancedChainListEvents[]{ChainSelect, Back};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedChainListEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedChainListEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedChainListEvents[] advancedChainListEventsArr$values = $values();
        $VALUES = advancedChainListEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedChainListEventsArr$values);
    }

    public static AdvancedChainListEvents valueOf(String str) {
        return (AdvancedChainListEvents) Enum.valueOf(AdvancedChainListEvents.class, str);
    }

    public static AdvancedChainListEvents[] values() {
        return (AdvancedChainListEvents[]) $VALUES.clone();
    }
}
