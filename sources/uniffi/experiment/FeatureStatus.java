package uniffi.experiment;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class FeatureStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeatureStatus[] $VALUES;
    public static final FeatureStatus ACTIVITY = new FeatureStatus("ACTIVITY", 0);
    public static final FeatureStatus INACTIVE = new FeatureStatus("INACTIVE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeatureStatus[] $values() {
        return new FeatureStatus[]{ACTIVITY, INACTIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeatureStatus> getEntries() {
        return $ENTRIES;
    }

    private FeatureStatus(String str, int i) {
    }

    static {
        FeatureStatus[] featureStatusArr$values = $values();
        $VALUES = featureStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(featureStatusArr$values);
    }

    public static FeatureStatus valueOf(String str) {
        return (FeatureStatus) Enum.valueOf(FeatureStatus.class, str);
    }

    public static FeatureStatus[] values() {
        return (FeatureStatus[]) $VALUES.clone();
    }
}
