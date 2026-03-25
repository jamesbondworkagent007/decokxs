package com.okinc.ok_kyc_core.ocrvendor;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class VendorEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VendorEvent[] $VALUES;
    public static final VendorEvent VENDOR_VERIFY_RESULT_COMPLETE = new VendorEvent("VENDOR_VERIFY_RESULT_COMPLETE", 0);
    public static final VendorEvent VENDOR_NO_PIC = new VendorEvent("VENDOR_NO_PIC", 1);
    public static final VendorEvent VENDOR_VERIFY_FAILED = new VendorEvent("VENDOR_VERIFY_FAILED", 2);
    public static final VendorEvent VENDOR_SDK_TOKEN_ERROR = new VendorEvent("VENDOR_SDK_TOKEN_ERROR", 3);
    public static final VendorEvent VENDOR_PERMISSIONS_DENIED = new VendorEvent("VENDOR_PERMISSIONS_DENIED", 4);
    public static final VendorEvent VENDOR_CANCELLED_BY_USER = new VendorEvent("VENDOR_CANCELLED_BY_USER", 5);
    public static final VendorEvent VENDOR_BACKEND_INIT_ERROR = new VendorEvent("VENDOR_BACKEND_INIT_ERROR", 6);
    public static final VendorEvent VENDOR_CRASH_ERROR = new VendorEvent("VENDOR_CRASH_ERROR", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VendorEvent[] $values() {
        return new VendorEvent[]{VENDOR_VERIFY_RESULT_COMPLETE, VENDOR_NO_PIC, VENDOR_VERIFY_FAILED, VENDOR_SDK_TOKEN_ERROR, VENDOR_PERMISSIONS_DENIED, VENDOR_CANCELLED_BY_USER, VENDOR_BACKEND_INIT_ERROR, VENDOR_CRASH_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VendorEvent> getEntries() {
        return $ENTRIES;
    }

    private VendorEvent(String str, int i) {
    }

    static {
        VendorEvent[] vendorEventArr$values = $values();
        $VALUES = vendorEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vendorEventArr$values);
    }

    public static VendorEvent valueOf(String str) {
        return (VendorEvent) Enum.valueOf(VendorEvent.class, str);
    }

    public static VendorEvent[] values() {
        return (VendorEvent[]) $VALUES.clone();
    }
}
