package com.okinc.unified;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class BusinessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessType[] $VALUES;
    public static final BusinessType CeFi = new BusinessType("CeFi", 0);
    public static final BusinessType CeDeFi = new BusinessType("CeDeFi", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{CeFi, CeDeFi};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessType> getEntries() {
        return $ENTRIES;
    }

    private BusinessType(String str, int i) {
    }

    static {
        BusinessType[] businessTypeArr$values = $values();
        $VALUES = businessTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessTypeArr$values);
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
