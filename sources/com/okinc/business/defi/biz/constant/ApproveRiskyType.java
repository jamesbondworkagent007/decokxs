package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ApproveRiskyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ApproveRiskyType[] $VALUES;
    public static final ApproveRiskyType ApprovalAddressRisk = new ApproveRiskyType("ApprovalAddressRisk", 0, 1);
    public static final ApproveRiskyType LongTimeNoActive = new ApproveRiskyType("LongTimeNoActive", 1, 2);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ApproveRiskyType[] $values() {
        return new ApproveRiskyType[]{ApprovalAddressRisk, LongTimeNoActive};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ApproveRiskyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private ApproveRiskyType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ApproveRiskyType[] approveRiskyTypeArr$values = $values();
        $VALUES = approveRiskyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(approveRiskyTypeArr$values);
    }

    public static ApproveRiskyType valueOf(String str) {
        return (ApproveRiskyType) Enum.valueOf(ApproveRiskyType.class, str);
    }

    public static ApproveRiskyType[] values() {
        return (ApproveRiskyType[]) $VALUES.clone();
    }
}
