package uniffi.dex;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class RiskControlLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskControlLevel[] $VALUES;
    public static final RiskControlLevel HIGH = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0);
    public static final RiskControlLevel MEDIUM = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1);
    public static final RiskControlLevel LOW = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 2);
    public static final RiskControlLevel UNKNOWN = new RiskControlLevel("UNKNOWN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskControlLevel[] $values() {
        return new RiskControlLevel[]{HIGH, MEDIUM, LOW, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskControlLevel> getEntries() {
        return $ENTRIES;
    }

    private RiskControlLevel(String str, int i) {
    }

    static {
        RiskControlLevel[] riskControlLevelArr$values = $values();
        $VALUES = riskControlLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskControlLevelArr$values);
    }

    public static RiskControlLevel valueOf(String str) {
        return (RiskControlLevel) Enum.valueOf(RiskControlLevel.class, str);
    }

    public static RiskControlLevel[] values() {
        return (RiskControlLevel[]) $VALUES.clone();
    }
}
