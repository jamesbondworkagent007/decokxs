package com.okinc.social_trade_api.data;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SocialApiServiceState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialApiServiceState[] $VALUES;
    public static final SocialApiServiceState LOADING = new SocialApiServiceState("LOADING", 0);
    public static final SocialApiServiceState SUCCESS = new SocialApiServiceState("SUCCESS", 1);
    public static final SocialApiServiceState FAILURE = new SocialApiServiceState("FAILURE", 2);
    public static final SocialApiServiceState ERROR = new SocialApiServiceState(EventType.ERROR, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialApiServiceState[] $values() {
        return new SocialApiServiceState[]{LOADING, SUCCESS, FAILURE, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialApiServiceState> getEntries() {
        return $ENTRIES;
    }

    private SocialApiServiceState(String str, int i) {
    }

    static {
        SocialApiServiceState[] socialApiServiceStateArr$values = $values();
        $VALUES = socialApiServiceStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialApiServiceStateArr$values);
    }

    public static SocialApiServiceState valueOf(String str) {
        return (SocialApiServiceState) Enum.valueOf(SocialApiServiceState.class, str);
    }

    public static SocialApiServiceState[] values() {
        return (SocialApiServiceState[]) $VALUES.clone();
    }
}
