package com.okinc.websocket.bean;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class OKWSEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKWSEvent[] $VALUES;
    public static final OKWSEvent UNKNOWN = new OKWSEvent("UNKNOWN", 0);
    public static final OKWSEvent LOGIN = new OKWSEvent("LOGIN", 1);
    public static final OKWSEvent SUBSCRIBE = new OKWSEvent("SUBSCRIBE", 2);
    public static final OKWSEvent UNSUBSCRIBE = new OKWSEvent("UNSUBSCRIBE", 3);
    public static final OKWSEvent DATA = new OKWSEvent("DATA", 4);
    public static final OKWSEvent ERROR = new OKWSEvent(EventType.ERROR, 5);
    public static final OKWSEvent CHECK_SUM_ERROR = new OKWSEvent("CHECK_SUM_ERROR", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKWSEvent[] $values() {
        return new OKWSEvent[]{UNKNOWN, LOGIN, SUBSCRIBE, UNSUBSCRIBE, DATA, ERROR, CHECK_SUM_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKWSEvent> getEntries() {
        return $ENTRIES;
    }

    private OKWSEvent(String str, int i) {
    }

    static {
        OKWSEvent[] oKWSEventArr$values = $values();
        $VALUES = oKWSEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKWSEventArr$values);
    }

    public static OKWSEvent valueOf(String str) {
        return (OKWSEvent) Enum.valueOf(OKWSEvent.class, str);
    }

    public static OKWSEvent[] values() {
        return (OKWSEvent[]) $VALUES.clone();
    }
}
