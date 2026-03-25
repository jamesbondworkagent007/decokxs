package aws.smithy.kotlin.runtime.auth.awssigning;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AwsSigningAlgorithm {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AwsSigningAlgorithm[] $VALUES;
    public static final AwsSigningAlgorithm SIGV4 = new AwsSigningAlgorithm("SIGV4", 0);
    public static final AwsSigningAlgorithm SIGV4_ASYMMETRIC = new AwsSigningAlgorithm("SIGV4_ASYMMETRIC", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AwsSigningAlgorithm[] $values() {
        return new AwsSigningAlgorithm[]{SIGV4, SIGV4_ASYMMETRIC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AwsSigningAlgorithm> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSigningAlgorithm valueOf(String str) {
        return (AwsSigningAlgorithm) Enum.valueOf(AwsSigningAlgorithm.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSigningAlgorithm[] values() {
        return (AwsSigningAlgorithm[]) $VALUES.clone();
    }

    private AwsSigningAlgorithm(String str, int i) {
    }

    static {
        AwsSigningAlgorithm[] awsSigningAlgorithmArr$values = $values();
        $VALUES = awsSigningAlgorithmArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(awsSigningAlgorithmArr$values);
    }
}
