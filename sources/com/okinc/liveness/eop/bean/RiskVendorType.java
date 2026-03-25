package com.okinc.liveness.eop.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RiskVendorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskVendorType[] $VALUES;
    public static final RiskVendorType ALI = new RiskVendorType("ALI", 0, "ali");
    private final String vendorName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskVendorType[] $values() {
        return new RiskVendorType[]{ALI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskVendorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVendorName() {
        return this.vendorName;
    }

    private RiskVendorType(String str, int i, String str2) {
        this.vendorName = str2;
    }

    static {
        RiskVendorType[] riskVendorTypeArr$values = $values();
        $VALUES = riskVendorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskVendorTypeArr$values);
    }

    public static RiskVendorType valueOf(String str) {
        return (RiskVendorType) Enum.valueOf(RiskVendorType.class, str);
    }

    public static RiskVendorType[] values() {
        return (RiskVendorType[]) $VALUES.clone();
    }
}
