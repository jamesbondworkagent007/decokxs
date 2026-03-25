package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class NotificationReadStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationReadStatus[] $VALUES;
    private final int value;
    public static final NotificationReadStatus UNREAD = new NotificationReadStatus("UNREAD", 0, 0);
    public static final NotificationReadStatus READ = new NotificationReadStatus("READ", 1, 1);
    public static final NotificationReadStatus VIEWED = new NotificationReadStatus("VIEWED", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationReadStatus[] $values() {
        return new NotificationReadStatus[]{UNREAD, READ, VIEWED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationReadStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private NotificationReadStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        NotificationReadStatus[] notificationReadStatusArr$values = $values();
        $VALUES = notificationReadStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationReadStatusArr$values);
    }

    public static NotificationReadStatus valueOf(String str) {
        return (NotificationReadStatus) Enum.valueOf(NotificationReadStatus.class, str);
    }

    public static NotificationReadStatus[] values() {
        return (NotificationReadStatus[]) $VALUES.clone();
    }
}
