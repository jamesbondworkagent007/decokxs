package com.okinc.business.defi.wallet.tee.activate.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class NotificationStateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationStateType[] $VALUES;
    public static final NotificationStateType EnableFailed = new NotificationStateType("EnableFailed", 0, 0);
    public static final NotificationStateType EnableAgain = new NotificationStateType("EnableAgain", 1, 1);
    public static final NotificationStateType SmartEnabled = new NotificationStateType("SmartEnabled", 2, 2);
    public static final NotificationStateType Other = new NotificationStateType("Other", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationStateType[] $values() {
        return new NotificationStateType[]{EnableFailed, EnableAgain, SmartEnabled, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationStateType> getEntries() {
        return $ENTRIES;
    }

    private NotificationStateType(String str, int i, int i2) {
    }

    static {
        NotificationStateType[] notificationStateTypeArr$values = $values();
        $VALUES = notificationStateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationStateTypeArr$values);
    }

    public static NotificationStateType valueOf(String str) {
        return (NotificationStateType) Enum.valueOf(NotificationStateType.class, str);
    }

    public static NotificationStateType[] values() {
        return (NotificationStateType[]) $VALUES.clone();
    }
}
