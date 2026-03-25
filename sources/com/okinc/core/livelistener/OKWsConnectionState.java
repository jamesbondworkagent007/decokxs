package com.okinc.core.livelistener;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class OKWsConnectionState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKWsConnectionState[] $VALUES;
    private final int state;
    public static final OKWsConnectionState OPEN = new OKWsConnectionState("OPEN", 0, 0);
    public static final OKWsConnectionState CLOSED = new OKWsConnectionState("CLOSED", 1, 1);
    public static final OKWsConnectionState FAILURE = new OKWsConnectionState("FAILURE", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKWsConnectionState[] $values() {
        return new OKWsConnectionState[]{OPEN, CLOSED, FAILURE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKWsConnectionState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getState() {
        return this.state;
    }

    private OKWsConnectionState(String str, int i, int i2) {
        this.state = i2;
    }

    static {
        OKWsConnectionState[] oKWsConnectionStateArr$values = $values();
        $VALUES = oKWsConnectionStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKWsConnectionStateArr$values);
    }

    public static OKWsConnectionState valueOf(String str) {
        return (OKWsConnectionState) Enum.valueOf(OKWsConnectionState.class, str);
    }

    public static OKWsConnectionState[] values() {
        return (OKWsConnectionState[]) $VALUES.clone();
    }
}
