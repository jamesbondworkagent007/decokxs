package com.okinc.buysell.external;

import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SubKycStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SubKycStatus[] $VALUES;
    private final String code;
    public static final SubKycStatus DEFAULT_STATUS = new SubKycStatus("DEFAULT_STATUS", 0, "0");
    public static final SubKycStatus NON_DEPOSIT = new SubKycStatus("NON_DEPOSIT", 1, "1");
    public static final SubKycStatus IS_COMPLIANT = new SubKycStatus("IS_COMPLIANT", 2, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SubKycStatus[] $values() {
        return new SubKycStatus[]{DEFAULT_STATUS, NON_DEPOSIT, IS_COMPLIANT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SubKycStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    private SubKycStatus(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        SubKycStatus[] subKycStatusArr$values = $values();
        $VALUES = subKycStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(subKycStatusArr$values);
    }

    public static SubKycStatus valueOf(String str) {
        return (SubKycStatus) Enum.valueOf(SubKycStatus.class, str);
    }

    public static SubKycStatus[] values() {
        return (SubKycStatus[]) $VALUES.clone();
    }
}
