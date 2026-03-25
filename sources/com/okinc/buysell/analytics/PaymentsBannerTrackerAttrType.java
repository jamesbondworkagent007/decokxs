package com.okinc.buysell.analytics;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class PaymentsBannerTrackerAttrType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentsBannerTrackerAttrType[] $VALUES;
    private final String type;
    public static final PaymentsBannerTrackerAttrType PILL_BUTTON_CLICK = new PaymentsBannerTrackerAttrType("PILL_BUTTON_CLICK", 0, "banner_v2_pill_button_click");
    public static final PaymentsBannerTrackerAttrType BANNER_V2_OK_BUTTON_CLICK = new PaymentsBannerTrackerAttrType("BANNER_V2_OK_BUTTON_CLICK", 1, "banner_v2_ok_button_click");
    public static final PaymentsBannerTrackerAttrType BANNER_V2_AUTOMATIC_POPUP = new PaymentsBannerTrackerAttrType("BANNER_V2_AUTOMATIC_POPUP", 2, "banner_v2_automatic_popup");
    public static final PaymentsBannerTrackerAttrType PILL_BUTTON_VIEW = new PaymentsBannerTrackerAttrType("PILL_BUTTON_VIEW", 3, "banner_v2_pill_button_view");
    public static final PaymentsBannerTrackerAttrType CTA_BUTTON_BANNER = new PaymentsBannerTrackerAttrType("CTA_BUTTON_BANNER", 4, "banner_cta_button_click");
    public static final PaymentsBannerTrackerAttrType PILL_BUTTON_VIEW_HIDDEN = new PaymentsBannerTrackerAttrType("PILL_BUTTON_VIEW_HIDDEN", 5, "banner_v2_pill_button_end_view");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentsBannerTrackerAttrType[] $values() {
        return new PaymentsBannerTrackerAttrType[]{PILL_BUTTON_CLICK, BANNER_V2_OK_BUTTON_CLICK, BANNER_V2_AUTOMATIC_POPUP, PILL_BUTTON_VIEW, CTA_BUTTON_BANNER, PILL_BUTTON_VIEW_HIDDEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentsBannerTrackerAttrType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private PaymentsBannerTrackerAttrType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        PaymentsBannerTrackerAttrType[] paymentsBannerTrackerAttrTypeArr$values = $values();
        $VALUES = paymentsBannerTrackerAttrTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentsBannerTrackerAttrTypeArr$values);
    }

    public static PaymentsBannerTrackerAttrType valueOf(String str) {
        return (PaymentsBannerTrackerAttrType) Enum.valueOf(PaymentsBannerTrackerAttrType.class, str);
    }

    public static PaymentsBannerTrackerAttrType[] values() {
        return (PaymentsBannerTrackerAttrType[]) $VALUES.clone();
    }
}
