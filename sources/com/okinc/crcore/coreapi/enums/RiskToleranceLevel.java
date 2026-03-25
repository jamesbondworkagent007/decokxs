package com.okinc.crcore.coreapi.enums;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RiskToleranceLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskToleranceLevel[] $VALUES;
    public static final Activity Companion;
    private final String riskLevel;
    public static final RiskToleranceLevel LOW = new RiskToleranceLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 0, "low");
    public static final RiskToleranceLevel MEDIUM = new RiskToleranceLevel(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1, "medium");
    public static final RiskToleranceLevel HIGH = new RiskToleranceLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 2, "high");
    public static final RiskToleranceLevel UNKNOWN = new RiskToleranceLevel("UNKNOWN", 3, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskToleranceLevel[] $values() {
        return new RiskToleranceLevel[]{LOW, MEDIUM, HIGH, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskToleranceLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    private RiskToleranceLevel(String str, int i, String str2) {
        this.riskLevel = str2;
    }

    static {
        RiskToleranceLevel[] riskToleranceLevelArr$values = $values();
        $VALUES = riskToleranceLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskToleranceLevelArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.enums.RiskToleranceLevel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static RiskToleranceLevel valueOf(String str) {
        return (RiskToleranceLevel) Enum.valueOf(RiskToleranceLevel.class, str);
    }

    public static RiskToleranceLevel[] values() {
        return (RiskToleranceLevel[]) $VALUES.clone();
    }
}
