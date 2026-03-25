package com.okinc.buysell.analytics;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class PaymentsTrackerAttrType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentsTrackerAttrType[] $VALUES;
    private final String type;
    public static final PaymentsTrackerAttrType STARTED_FULL_PAGE_VIEW = new PaymentsTrackerAttrType("STARTED_FULL_PAGE_VIEW", 0, "started_full_page_view");
    public static final PaymentsTrackerAttrType BUTTON_CLICK = new PaymentsTrackerAttrType("BUTTON_CLICK", 1, "button_click");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentsTrackerAttrType[] $values() {
        return new PaymentsTrackerAttrType[]{STARTED_FULL_PAGE_VIEW, BUTTON_CLICK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentsTrackerAttrType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private PaymentsTrackerAttrType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        PaymentsTrackerAttrType[] paymentsTrackerAttrTypeArr$values = $values();
        $VALUES = paymentsTrackerAttrTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentsTrackerAttrTypeArr$values);
    }

    public static PaymentsTrackerAttrType valueOf(String str) {
        return (PaymentsTrackerAttrType) Enum.valueOf(PaymentsTrackerAttrType.class, str);
    }

    public static PaymentsTrackerAttrType[] values() {
        return (PaymentsTrackerAttrType[]) $VALUES.clone();
    }
}
