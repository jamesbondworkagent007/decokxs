package com.okinc.business.defi.wallet.approve;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ApproveRiskyTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ApproveRiskyTagType[] $VALUES;
    private final int value;
    public static final ApproveRiskyTagType MALICIOUS_ADDRESS = new ApproveRiskyTagType("MALICIOUS_ADDRESS", 0, 1);
    public static final ApproveRiskyTagType DISCARDED_CONTRACT = new ApproveRiskyTagType("DISCARDED_CONTRACT", 1, 2);
    public static final ApproveRiskyTagType INACTIVE_APPROVAL = new ApproveRiskyTagType("INACTIVE_APPROVAL", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ApproveRiskyTagType[] $values() {
        return new ApproveRiskyTagType[]{MALICIOUS_ADDRESS, DISCARDED_CONTRACT, INACTIVE_APPROVAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ApproveRiskyTagType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ApproveRiskyTagType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ApproveRiskyTagType[] approveRiskyTagTypeArr$values = $values();
        $VALUES = approveRiskyTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(approveRiskyTagTypeArr$values);
    }

    public static ApproveRiskyTagType valueOf(String str) {
        return (ApproveRiskyTagType) Enum.valueOf(ApproveRiskyTagType.class, str);
    }

    public static ApproveRiskyTagType[] values() {
        return (ApproveRiskyTagType[]) $VALUES.clone();
    }
}
