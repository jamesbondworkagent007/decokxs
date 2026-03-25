package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedConfirmEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedConfirmEvents[] $VALUES;
    private final String value;
    public static final AdvancedConfirmEvents Confirm = new AdvancedConfirmEvents("Confirm", 0, Web3SecurityTrackEvent.VALUE_CONFIRM);
    public static final AdvancedConfirmEvents Back = new AdvancedConfirmEvents("Back", 1, DexTrackEventParameter.ButtonName.BACK.getValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedConfirmEvents[] $values() {
        return new AdvancedConfirmEvents[]{Confirm, Back};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedConfirmEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedConfirmEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedConfirmEvents[] advancedConfirmEventsArr$values = $values();
        $VALUES = advancedConfirmEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedConfirmEventsArr$values);
    }

    public static AdvancedConfirmEvents valueOf(String str) {
        return (AdvancedConfirmEvents) Enum.valueOf(AdvancedConfirmEvents.class, str);
    }

    public static AdvancedConfirmEvents[] values() {
        return (AdvancedConfirmEvents[]) $VALUES.clone();
    }
}
