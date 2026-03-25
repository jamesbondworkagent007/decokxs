package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class NotificationEntryPointEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationEntryPointEnum[] $VALUES;
    public static final NotificationEntryPointEnum CEFI = new NotificationEntryPointEnum("CEFI", 0);
    public static final NotificationEntryPointEnum WEB3 = new NotificationEntryPointEnum("WEB3", 1);
    public static final NotificationEntryPointEnum WITHPRICEALERT = new NotificationEntryPointEnum("WITHPRICEALERT", 2);
    public static final NotificationEntryPointEnum WEB3WITHPRICEALERT = new NotificationEntryPointEnum("WEB3WITHPRICEALERT", 3);
    public static final NotificationEntryPointEnum COPYTRADING = new NotificationEntryPointEnum("COPYTRADING", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationEntryPointEnum[] $values() {
        return new NotificationEntryPointEnum[]{CEFI, WEB3, WITHPRICEALERT, WEB3WITHPRICEALERT, COPYTRADING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationEntryPointEnum> getEntries() {
        return $ENTRIES;
    }

    private NotificationEntryPointEnum(String str, int i) {
    }

    static {
        NotificationEntryPointEnum[] notificationEntryPointEnumArr$values = $values();
        $VALUES = notificationEntryPointEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationEntryPointEnumArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }

    public static NotificationEntryPointEnum valueOf(String str) {
        return (NotificationEntryPointEnum) Enum.valueOf(NotificationEntryPointEnum.class, str);
    }

    public static NotificationEntryPointEnum[] values() {
        return (NotificationEntryPointEnum[]) $VALUES.clone();
    }
}
