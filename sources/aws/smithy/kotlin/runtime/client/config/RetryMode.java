package aws.smithy.kotlin.runtime.client.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RetryMode[] $VALUES;
    public static final RetryMode LEGACY = new RetryMode("LEGACY", 0);
    public static final RetryMode STANDARD = new RetryMode("STANDARD", 1);
    public static final RetryMode ADAPTIVE = new RetryMode("ADAPTIVE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RetryMode[] $values() {
        return new RetryMode[]{LEGACY, STANDARD, ADAPTIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RetryMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static RetryMode valueOf(String str) {
        return (RetryMode) Enum.valueOf(RetryMode.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static RetryMode[] values() {
        return (RetryMode[]) $VALUES.clone();
    }

    private RetryMode(String str, int i) {
    }

    static {
        RetryMode[] retryModeArr$values = $values();
        $VALUES = retryModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(retryModeArr$values);
    }
}
