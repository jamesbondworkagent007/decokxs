package uniffi.feature_restriction;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class FetchFeatureRestrictionResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FetchFeatureRestrictionResult[] $VALUES;
    public static final FetchFeatureRestrictionResult SUCCESS = new FetchFeatureRestrictionResult("SUCCESS", 0);
    public static final FetchFeatureRestrictionResult FAILED = new FetchFeatureRestrictionResult(CardSyncResponse.FAILED, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FetchFeatureRestrictionResult[] $values() {
        return new FetchFeatureRestrictionResult[]{SUCCESS, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FetchFeatureRestrictionResult> getEntries() {
        return $ENTRIES;
    }

    private FetchFeatureRestrictionResult(String str, int i) {
    }

    static {
        FetchFeatureRestrictionResult[] fetchFeatureRestrictionResultArr$values = $values();
        $VALUES = fetchFeatureRestrictionResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fetchFeatureRestrictionResultArr$values);
    }

    public static FetchFeatureRestrictionResult valueOf(String str) {
        return (FetchFeatureRestrictionResult) Enum.valueOf(FetchFeatureRestrictionResult.class, str);
    }

    public static FetchFeatureRestrictionResult[] values() {
        return (FetchFeatureRestrictionResult[]) $VALUES.clone();
    }
}
