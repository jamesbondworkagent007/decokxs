package aws.smithy.kotlin.runtime.retries.policy;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryErrorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RetryErrorType[] $VALUES;
    public static final RetryErrorType ServerSide = new RetryErrorType("ServerSide", 0);
    public static final RetryErrorType ClientSide = new RetryErrorType("ClientSide", 1);
    public static final RetryErrorType Throttling = new RetryErrorType("Throttling", 2);
    public static final RetryErrorType Transient = new RetryErrorType("Transient", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RetryErrorType[] $values() {
        return new RetryErrorType[]{ServerSide, ClientSide, Throttling, Transient};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RetryErrorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static RetryErrorType valueOf(String str) {
        return (RetryErrorType) Enum.valueOf(RetryErrorType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static RetryErrorType[] values() {
        return (RetryErrorType[]) $VALUES.clone();
    }

    private RetryErrorType(String str, int i) {
    }

    static {
        RetryErrorType[] retryErrorTypeArr$values = $values();
        $VALUES = retryErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(retryErrorTypeArr$values);
    }
}
