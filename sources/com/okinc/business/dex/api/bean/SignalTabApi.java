package com.okinc.business.dex.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class SignalTabApi {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalTabApi[] $VALUES;
    private final String tabValue;
    public static final SignalTabApi GEMS = new SignalTabApi("GEMS", 0, "gems");
    public static final SignalTabApi OVERVIEW = new SignalTabApi("OVERVIEW", 1, "overview");
    public static final SignalTabApi ACTIVITY = new SignalTabApi("ACTIVITY", 2, "activities");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalTabApi[] $values() {
        return new SignalTabApi[]{GEMS, OVERVIEW, ACTIVITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalTabApi> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabValue() {
        return this.tabValue;
    }

    private SignalTabApi(String str, int i, String str2) {
        this.tabValue = str2;
    }

    static {
        SignalTabApi[] signalTabApiArr$values = $values();
        $VALUES = signalTabApiArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalTabApiArr$values);
    }

    public static SignalTabApi valueOf(String str) {
        return (SignalTabApi) Enum.valueOf(SignalTabApi.class, str);
    }

    public static SignalTabApi[] values() {
        return (SignalTabApi[]) $VALUES.clone();
    }
}
