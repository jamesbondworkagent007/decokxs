package com.okinc.okimcore.feature.notification.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationSource[] $VALUES;
    public static final NotificationSource PUSH_CHANNEL = new NotificationSource("PUSH_CHANNEL", 0);
    public static final NotificationSource WS = new NotificationSource("WS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationSource[] $values() {
        return new NotificationSource[]{PUSH_CHANNEL, WS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationSource> getEntries() {
        return $ENTRIES;
    }

    private NotificationSource(String str, int i) {
    }

    static {
        NotificationSource[] notificationSourceArr$values = $values();
        $VALUES = notificationSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationSourceArr$values);
    }

    public static NotificationSource valueOf(String str) {
        return (NotificationSource) Enum.valueOf(NotificationSource.class, str);
    }

    public static NotificationSource[] values() {
        return (NotificationSource[]) $VALUES.clone();
    }
}
