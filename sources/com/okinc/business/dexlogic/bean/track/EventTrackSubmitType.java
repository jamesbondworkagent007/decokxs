package com.okinc.business.dexlogic.bean.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EventTrackSubmitType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventTrackSubmitType[] $VALUES;
    private final String type;
    public static final EventTrackSubmitType SUBMIT = new EventTrackSubmitType("SUBMIT", 0, "submit");
    public static final EventTrackSubmitType DEPOSIT = new EventTrackSubmitType("DEPOSIT", 1, "deposit");
    public static final EventTrackSubmitType DAPP = new EventTrackSubmitType("DAPP", 2, "dapp");
    public static final EventTrackSubmitType CONNECTED_WALLET = new EventTrackSubmitType("CONNECTED_WALLET", 3, "connect wallet");
    public static final EventTrackSubmitType APPROVE = new EventTrackSubmitType("APPROVE", 4, "approve");
    public static final EventTrackSubmitType REVOKE = new EventTrackSubmitType("REVOKE", 5, "revoke");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventTrackSubmitType[] $values() {
        return new EventTrackSubmitType[]{SUBMIT, DEPOSIT, DAPP, CONNECTED_WALLET, APPROVE, REVOKE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventTrackSubmitType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private EventTrackSubmitType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        EventTrackSubmitType[] eventTrackSubmitTypeArr$values = $values();
        $VALUES = eventTrackSubmitTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventTrackSubmitTypeArr$values);
    }

    public static EventTrackSubmitType valueOf(String str) {
        return (EventTrackSubmitType) Enum.valueOf(EventTrackSubmitType.class, str);
    }

    public static EventTrackSubmitType[] values() {
        return (EventTrackSubmitType[]) $VALUES.clone();
    }
}
