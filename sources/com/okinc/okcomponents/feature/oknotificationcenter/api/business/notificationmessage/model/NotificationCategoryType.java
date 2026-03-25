package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCategoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationCategoryType[] $VALUES;
    public static final NotificationCategoryType New = new NotificationCategoryType("New", 0, OtpEventTracker.OTP_EVENT_VALUE_NEW);
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationCategoryType[] $values() {
        return new NotificationCategoryType[]{New};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationCategoryType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    private NotificationCategoryType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        NotificationCategoryType[] notificationCategoryTypeArr$values = $values();
        $VALUES = notificationCategoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationCategoryTypeArr$values);
    }

    public static NotificationCategoryType valueOf(String str) {
        return (NotificationCategoryType) Enum.valueOf(NotificationCategoryType.class, str);
    }

    public static NotificationCategoryType[] values() {
        return (NotificationCategoryType[]) $VALUES.clone();
    }
}
