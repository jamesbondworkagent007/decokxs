package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class NotificationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationType[] $VALUES;
    private final int type;
    public static final NotificationType PRICE_ALERT = new NotificationType("PRICE_ALERT", 0, 3);
    public static final NotificationType TRADE = new NotificationType("TRADE", 1, 4);
    public static final NotificationType CUSTOM_PRICE_PRICE = new NotificationType("CUSTOM_PRICE_PRICE", 2, 19);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationType[] $values() {
        return new NotificationType[]{PRICE_ALERT, TRADE, CUSTOM_PRICE_PRICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private NotificationType(String str, int i, int i2) {
        this.type = i2;
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
