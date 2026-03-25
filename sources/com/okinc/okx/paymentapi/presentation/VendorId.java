package com.okinc.okx.paymentapi.presentation;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class VendorId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VendorId[] $VALUES;
    public static final VendorId ALCHEMYPAY = new VendorId("ALCHEMYPAY", 0, "1", "AlchemyPay");
    public static final VendorId UNKNOWN = new VendorId("UNKNOWN", 1, "unknown", "Unknown");
    private final String code;
    private final String displayName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VendorId[] $values() {
        return new VendorId[]{ALCHEMYPAY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VendorId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    private VendorId(String str, int i, String str2, String str3) {
        this.code = str2;
        this.displayName = str3;
    }

    static {
        VendorId[] vendorIdArr$values = $values();
        $VALUES = vendorIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vendorIdArr$values);
    }

    public static VendorId valueOf(String str) {
        return (VendorId) Enum.valueOf(VendorId.class, str);
    }

    public static VendorId[] values() {
        return (VendorId[]) $VALUES.clone();
    }
}
