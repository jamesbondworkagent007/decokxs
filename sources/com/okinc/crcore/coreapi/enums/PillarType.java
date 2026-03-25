package com.okinc.crcore.coreapi.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PillarType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PillarType[] $VALUES;
    private final String pillarType;
    public static final PillarType INVESTMENT_OBJECTIVE = new PillarType("INVESTMENT_OBJECTIVE", 0, "INVESTMENT_OBJECTIVE");
    public static final PillarType KNOWLEDGE = new PillarType("KNOWLEDGE", 1, "KNOWLEDGE");
    public static final PillarType FINANCIAL_STATUS = new PillarType("FINANCIAL_STATUS", 2, "FINANCIAL_STATUS");
    public static final PillarType RISK_TOLERANCE = new PillarType("RISK_TOLERANCE", 3, "RISK_TOLERANCE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PillarType[] $values() {
        return new PillarType[]{INVESTMENT_OBJECTIVE, KNOWLEDGE, FINANCIAL_STATUS, RISK_TOLERANCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PillarType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarType() {
        return this.pillarType;
    }

    private PillarType(String str, int i, String str2) {
        this.pillarType = str2;
    }

    static {
        PillarType[] pillarTypeArr$values = $values();
        $VALUES = pillarTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pillarTypeArr$values);
    }

    public static PillarType valueOf(String str) {
        return (PillarType) Enum.valueOf(PillarType.class, str);
    }

    public static PillarType[] values() {
        return (PillarType[]) $VALUES.clone();
    }
}
