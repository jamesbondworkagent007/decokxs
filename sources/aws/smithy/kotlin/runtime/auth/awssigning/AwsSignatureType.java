package aws.smithy.kotlin.runtime.auth.awssigning;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AwsSignatureType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AwsSignatureType[] $VALUES;
    public static final AwsSignatureType HTTP_REQUEST_VIA_HEADERS = new AwsSignatureType("HTTP_REQUEST_VIA_HEADERS", 0);
    public static final AwsSignatureType HTTP_REQUEST_VIA_QUERY_PARAMS = new AwsSignatureType("HTTP_REQUEST_VIA_QUERY_PARAMS", 1);
    public static final AwsSignatureType HTTP_REQUEST_CHUNK = new AwsSignatureType("HTTP_REQUEST_CHUNK", 2);
    public static final AwsSignatureType HTTP_REQUEST_TRAILING_HEADERS = new AwsSignatureType("HTTP_REQUEST_TRAILING_HEADERS", 3);
    public static final AwsSignatureType HTTP_REQUEST_EVENT = new AwsSignatureType("HTTP_REQUEST_EVENT", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AwsSignatureType[] $values() {
        return new AwsSignatureType[]{HTTP_REQUEST_VIA_HEADERS, HTTP_REQUEST_VIA_QUERY_PARAMS, HTTP_REQUEST_CHUNK, HTTP_REQUEST_TRAILING_HEADERS, HTTP_REQUEST_EVENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AwsSignatureType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSignatureType valueOf(String str) {
        return (AwsSignatureType) Enum.valueOf(AwsSignatureType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AwsSignatureType[] values() {
        return (AwsSignatureType[]) $VALUES.clone();
    }

    private AwsSignatureType(String str, int i) {
    }

    static {
        AwsSignatureType[] awsSignatureTypeArr$values = $values();
        $VALUES = awsSignatureTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(awsSignatureTypeArr$values);
    }
}
