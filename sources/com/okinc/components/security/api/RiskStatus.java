package com.okinc.components.security.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RiskStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskStatus[] $VALUES;
    public static final RiskStatus HIGH_RISK = new RiskStatus("HIGH_RISK", 0);
    public static final RiskStatus MEDIUM_RISK = new RiskStatus("MEDIUM_RISK", 1);
    public static final RiskStatus NO_RISK = new RiskStatus("NO_RISK", 2);
    public static final RiskStatus NO_RECORD = new RiskStatus("NO_RECORD", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskStatus[] $values() {
        return new RiskStatus[]{HIGH_RISK, MEDIUM_RISK, NO_RISK, NO_RECORD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskStatus> getEntries() {
        return $ENTRIES;
    }

    private RiskStatus(String str, int i) {
    }

    static {
        RiskStatus[] riskStatusArr$values = $values();
        $VALUES = riskStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskStatusArr$values);
    }

    public static RiskStatus valueOf(String str) {
        return (RiskStatus) Enum.valueOf(RiskStatus.class, str);
    }

    public static RiskStatus[] values() {
        return (RiskStatus[]) $VALUES.clone();
    }
}
