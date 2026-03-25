package com.okinc.okimcore.feature.conversation.listener;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class RefreshEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RefreshEvent[] $VALUES;
    public static final RefreshEvent EVENT_PIN = new RefreshEvent("EVENT_PIN", 0);
    public static final RefreshEvent EVENT_MUTE_NOTIFICATION = new RefreshEvent("EVENT_MUTE_NOTIFICATION", 1);
    public static final RefreshEvent EVENT_INBOUND = new RefreshEvent("EVENT_INBOUND", 2);
    public static final RefreshEvent EVENT_UNREAD_COUNT = new RefreshEvent("EVENT_UNREAD_COUNT", 3);
    public static final RefreshEvent EVENT_UNKNOWN = new RefreshEvent("EVENT_UNKNOWN", 4);
    public static final RefreshEvent EVENT_SYNC = new RefreshEvent("EVENT_SYNC", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RefreshEvent[] $values() {
        return new RefreshEvent[]{EVENT_PIN, EVENT_MUTE_NOTIFICATION, EVENT_INBOUND, EVENT_UNREAD_COUNT, EVENT_UNKNOWN, EVENT_SYNC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RefreshEvent> getEntries() {
        return $ENTRIES;
    }

    private RefreshEvent(String str, int i) {
    }

    static {
        RefreshEvent[] refreshEventArr$values = $values();
        $VALUES = refreshEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(refreshEventArr$values);
    }

    public static RefreshEvent valueOf(String str) {
        return (RefreshEvent) Enum.valueOf(RefreshEvent.class, str);
    }

    public static RefreshEvent[] values() {
        return (RefreshEvent[]) $VALUES.clone();
    }
}
