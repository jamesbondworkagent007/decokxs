package uniffi.compliance;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class BlurDecision {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BlurDecision[] $VALUES;
    public static final BlurDecision REJECT = new BlurDecision("REJECT", 0);
    public static final BlurDecision ACCEPT = new BlurDecision("ACCEPT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BlurDecision[] $values() {
        return new BlurDecision[]{REJECT, ACCEPT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BlurDecision> getEntries() {
        return $ENTRIES;
    }

    private BlurDecision(String str, int i) {
    }

    static {
        BlurDecision[] blurDecisionArr$values = $values();
        $VALUES = blurDecisionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(blurDecisionArr$values);
    }

    public static BlurDecision valueOf(String str) {
        return (BlurDecision) Enum.valueOf(BlurDecision.class, str);
    }

    public static BlurDecision[] values() {
        return (BlurDecision[]) $VALUES.clone();
    }
}
