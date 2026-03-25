package com.okinc.ok_kyc_core.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class VerifyFlowType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VerifyFlowType[] $VALUES;
    private final int verifyType;
    public static final VerifyFlowType ID_FRONT = new VerifyFlowType("ID_FRONT", 0, 2);
    public static final VerifyFlowType ID_BACK = new VerifyFlowType("ID_BACK", 1, 3);
    public static final VerifyFlowType LIVE_FACE = new VerifyFlowType("LIVE_FACE", 2, 26);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VerifyFlowType[] $values() {
        return new VerifyFlowType[]{ID_FRONT, ID_BACK, LIVE_FACE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VerifyFlowType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVerifyType() {
        return this.verifyType;
    }

    private VerifyFlowType(String str, int i, int i2) {
        this.verifyType = i2;
    }

    static {
        VerifyFlowType[] verifyFlowTypeArr$values = $values();
        $VALUES = verifyFlowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(verifyFlowTypeArr$values);
    }

    public static VerifyFlowType valueOf(String str) {
        return (VerifyFlowType) Enum.valueOf(VerifyFlowType.class, str);
    }

    public static VerifyFlowType[] values() {
        return (VerifyFlowType[]) $VALUES.clone();
    }
}
