package com.okinc.okpush.sdk.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class NotificationChannel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationChannel[] $VALUES;
    public static final NotificationChannel OneSignalFCM = new NotificationChannel("OneSignalFCM", 0);
    public static final NotificationChannel OneSignalHMS = new NotificationChannel("OneSignalHMS", 1);
    public static final NotificationChannel JPush = new NotificationChannel("JPush", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationChannel[] $values() {
        return new NotificationChannel[]{OneSignalFCM, OneSignalHMS, JPush};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationChannel> getEntries() {
        return $ENTRIES;
    }

    private NotificationChannel(String str, int i) {
    }

    static {
        NotificationChannel[] notificationChannelArr$values = $values();
        $VALUES = notificationChannelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationChannelArr$values);
    }

    public static NotificationChannel valueOf(String str) {
        return (NotificationChannel) Enum.valueOf(NotificationChannel.class, str);
    }

    public static NotificationChannel[] values() {
        return (NotificationChannel[]) $VALUES.clone();
    }
}
