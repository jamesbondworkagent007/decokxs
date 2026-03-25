package com.okinc.okimcore.feature.notification.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class NotificationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType MESSAGE = new NotificationType("MESSAGE", 0);
    public static final NotificationType VOICE_CALL = new NotificationType("VOICE_CALL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationType[] $values() {
        return new NotificationType[]{MESSAGE, VOICE_CALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationType> getEntries() {
        return $ENTRIES;
    }

    private NotificationType(String str, int i) {
    }

    static {
        NotificationType[] notificationTypeArr$values = $values();
        $VALUES = notificationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationTypeArr$values);
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }
}
