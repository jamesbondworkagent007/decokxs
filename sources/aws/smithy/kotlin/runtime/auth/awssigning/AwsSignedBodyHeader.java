package aws.smithy.kotlin.runtime.auth.awssigning;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AwsSignedBodyHeader {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AwsSignedBodyHeader[] $VALUES;
    public static final AwsSignedBodyHeader NONE = new AwsSignedBodyHeader("NONE", 0);
    public static final AwsSignedBodyHeader X_AMZ_CONTENT_SHA256 = new AwsSignedBodyHeader("X_AMZ_CONTENT_SHA256", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AwsSignedBodyHeader[] $values() {
        return new AwsSignedBodyHeader[]{NONE, X_AMZ_CONTENT_SHA256};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AwsSignedBodyHeader> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSignedBodyHeader valueOf(String str) {
        return (AwsSignedBodyHeader) Enum.valueOf(AwsSignedBodyHeader.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSignedBodyHeader[] values() {
        return (AwsSignedBodyHeader[]) $VALUES.clone();
    }

    private AwsSignedBodyHeader(String str, int i) {
    }

    static {
        AwsSignedBodyHeader[] awsSignedBodyHeaderArr$values = $values();
        $VALUES = awsSignedBodyHeaderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(awsSignedBodyHeaderArr$values);
    }
}
