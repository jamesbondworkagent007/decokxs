package com.okinc.unify_trade.utils.event_dispatch;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class EventSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventSourceType[] $VALUES;
    public static final EventSourceType FIRST_EVENT = new EventSourceType("FIRST_EVENT", 0);
    public static final EventSourceType IMMEDIATELY = new EventSourceType("IMMEDIATELY", 1);
    public static final EventSourceType DELAY = new EventSourceType("DELAY", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventSourceType[] $values() {
        return new EventSourceType[]{FIRST_EVENT, IMMEDIATELY, DELAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventSourceType> getEntries() {
        return $ENTRIES;
    }

    private EventSourceType(String str, int i) {
    }

    static {
        EventSourceType[] eventSourceTypeArr$values = $values();
        $VALUES = eventSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventSourceTypeArr$values);
    }

    public static EventSourceType valueOf(String str) {
        return (EventSourceType) Enum.valueOf(EventSourceType.class, str);
    }

    public static EventSourceType[] values() {
        return (EventSourceType[]) $VALUES.clone();
    }
}
