package uniffi.dex;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class CoinRiskLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinRiskLevel[] $VALUES;
    public static final CoinRiskLevel HIGH = new CoinRiskLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0);
    public static final CoinRiskLevel MEDIUM = new CoinRiskLevel(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1);
    public static final CoinRiskLevel LOW = new CoinRiskLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinRiskLevel[] $values() {
        return new CoinRiskLevel[]{HIGH, MEDIUM, LOW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinRiskLevel> getEntries() {
        return $ENTRIES;
    }

    private CoinRiskLevel(String str, int i) {
    }

    static {
        CoinRiskLevel[] coinRiskLevelArr$values = $values();
        $VALUES = coinRiskLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinRiskLevelArr$values);
    }

    public static CoinRiskLevel valueOf(String str) {
        return (CoinRiskLevel) Enum.valueOf(CoinRiskLevel.class, str);
    }

    public static CoinRiskLevel[] values() {
        return (CoinRiskLevel[]) $VALUES.clone();
    }
}
