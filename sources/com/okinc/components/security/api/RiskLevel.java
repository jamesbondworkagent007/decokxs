package com.okinc.components.security.api;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class RiskLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskLevel[] $VALUES;
    public static final RiskLevel NONE = new RiskLevel("NONE", 0);
    public static final RiskLevel MEDIUM = new RiskLevel(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1);
    public static final RiskLevel HIGH = new RiskLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskLevel[] $values() {
        return new RiskLevel[]{NONE, MEDIUM, HIGH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskLevel> getEntries() {
        return $ENTRIES;
    }

    private RiskLevel(String str, int i) {
    }

    static {
        RiskLevel[] riskLevelArr$values = $values();
        $VALUES = riskLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskLevelArr$values);
    }

    public static RiskLevel valueOf(String str) {
        return (RiskLevel) Enum.valueOf(RiskLevel.class, str);
    }

    public static RiskLevel[] values() {
        return (RiskLevel[]) $VALUES.clone();
    }
}
