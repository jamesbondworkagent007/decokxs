package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCategory {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationCategory[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final NotificationCategory PriceAlerts = new NotificationCategory("PriceAlerts", 0, "PRICE_ALERTS");
    public static final NotificationCategory All = new NotificationCategory("All", 1, "ALL");
    public static final NotificationCategory AllExceptPriceAlert = new NotificationCategory("AllExceptPriceAlert", 2, "ALL_EXCEPT_PRICE_ALERT");
    public static final NotificationCategory Transactions = new NotificationCategory("Transactions", 3, "TRANSACTIONS");
    public static final NotificationCategory Web3 = new NotificationCategory("Web3", 4, "WEB3");
    public static final NotificationCategory Cefi = new NotificationCategory("Cefi", 5, "CEFI");
    public static final NotificationCategory LatestUpdates = new NotificationCategory("LatestUpdates", 6, "LATEST_UPDATES");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationCategory[] $values() {
        return new NotificationCategory[]{PriceAlerts, All, AllExceptPriceAlert, Transactions, Web3, Cefi, LatestUpdates};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationCategory> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private NotificationCategory(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        NotificationCategory[] notificationCategoryArr$values = $values();
        $VALUES = notificationCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationCategoryArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final NotificationCategory KWHzl(String str) {
            for (NotificationCategory notificationCategory : NotificationCategory.values()) {
                if (Intrinsics.EZpvd((Object) notificationCategory.getValue(), (Object) str)) {
                    return notificationCategory;
                }
            }
            return null;
        }
    }

    public static NotificationCategory valueOf(String str) {
        return (NotificationCategory) Enum.valueOf(NotificationCategory.class, str);
    }

    public static NotificationCategory[] values() {
        return (NotificationCategory[]) $VALUES.clone();
    }
}
