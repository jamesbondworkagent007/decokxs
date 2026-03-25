package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RefreshType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RefreshType[] $VALUES;
    private final String value;
    public static final RefreshType REMEDIATION = new RefreshType("REMEDIATION", 0, "0");
    public static final RefreshType STANDARD = new RefreshType("STANDARD", 1, "1");
    public static final RefreshType ID_EXPIRED = new RefreshType("ID_EXPIRED", 2, "2");
    public static final RefreshType COR_CHANGE = new RefreshType("COR_CHANGE", 3, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RefreshType[] $values() {
        return new RefreshType[]{REMEDIATION, STANDARD, ID_EXPIRED, COR_CHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RefreshType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RefreshType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RefreshType[] refreshTypeArr$values = $values();
        $VALUES = refreshTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(refreshTypeArr$values);
    }

    public static RefreshType valueOf(String str) {
        return (RefreshType) Enum.valueOf(RefreshType.class, str);
    }

    public static RefreshType[] values() {
        return (RefreshType[]) $VALUES.clone();
    }
}
