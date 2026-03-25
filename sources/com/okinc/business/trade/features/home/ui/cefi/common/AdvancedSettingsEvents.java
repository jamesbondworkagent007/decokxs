package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedSettingsEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedSettingsEvents[] $VALUES;
    public static final AdvancedSettingsEvents Back = new AdvancedSettingsEvents("Back", 0, DexTrackEventParameter.ButtonName.BACK.getValue());
    public static final AdvancedSettingsEvents Cancel = new AdvancedSettingsEvents("Cancel", 1, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    public static final AdvancedSettingsEvents Confirm = new AdvancedSettingsEvents("Confirm", 2, Web3SecurityTrackEvent.VALUE_CONFIRM);
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedSettingsEvents[] $values() {
        return new AdvancedSettingsEvents[]{Back, Cancel, Confirm};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedSettingsEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedSettingsEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedSettingsEvents[] advancedSettingsEventsArr$values = $values();
        $VALUES = advancedSettingsEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedSettingsEventsArr$values);
    }

    public static AdvancedSettingsEvents valueOf(String str) {
        return (AdvancedSettingsEvents) Enum.valueOf(AdvancedSettingsEvents.class, str);
    }

    public static AdvancedSettingsEvents[] values() {
        return (AdvancedSettingsEvents[]) $VALUES.clone();
    }
}
