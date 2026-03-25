package com.okinc.okpaymentapi.data.remote.model.management;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OrderFrequency {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderFrequency[] $VALUES;
    private RecurringFrequency details;
    private final String txt;
    public static final OrderFrequency NO_FREQ = new OrderFrequency("NO_FREQ", 0, "just_once", null);
    public static final OrderFrequency DAILY = new OrderFrequency("DAILY", 1, "daily", null);
    public static final OrderFrequency WEEKLY = new OrderFrequency("WEEKLY", 2, "weekly", null);
    public static final OrderFrequency BI_WEEKLY = new OrderFrequency("BI_WEEKLY", 3, "bi-weekly", null);
    public static final OrderFrequency MONTHLY = new OrderFrequency("MONTHLY", 4, "monthly", null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderFrequency[] $values() {
        return new OrderFrequency[]{NO_FREQ, DAILY, WEEKLY, BI_WEEKLY, MONTHLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderFrequency> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringFrequency getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxt() {
        return this.txt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetails(RecurringFrequency recurringFrequency) {
        this.details = recurringFrequency;
    }

    private OrderFrequency(String str, int i, String str2, RecurringFrequency recurringFrequency) {
        this.txt = str2;
        this.details = recurringFrequency;
    }

    static {
        OrderFrequency[] orderFrequencyArr$values = $values();
        $VALUES = orderFrequencyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderFrequencyArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = this.txt;
        RecurringFrequency recurringFrequency = this.details;
        String localizedName = recurringFrequency != null ? recurringFrequency.getLocalizedName() : null;
        RecurringFrequency recurringFrequency2 = this.details;
        return str + ", " + localizedName + (recurringFrequency2 != null ? recurringFrequency2.getNextPurchaseTime() : null);
    }

    public final String getNextOrder() {
        String nextPurchaseTime;
        RecurringFrequency recurringFrequency = this.details;
        return (recurringFrequency == null || (nextPurchaseTime = recurringFrequency.getNextPurchaseTime()) == null) ? "-" : nextPurchaseTime;
    }

    public static OrderFrequency valueOf(String str) {
        return (OrderFrequency) Enum.valueOf(OrderFrequency.class, str);
    }

    public static OrderFrequency[] values() {
        return (OrderFrequency[]) $VALUES.clone();
    }
}
