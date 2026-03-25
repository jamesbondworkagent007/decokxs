package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ConvertResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertResult[] $VALUES;
    public static final ConvertResult SUCCESS = new ConvertResult("SUCCESS", 0);
    public static final ConvertResult FAIL = new ConvertResult("FAIL", 1);
    public static final ConvertResult PROCESSING = new ConvertResult("PROCESSING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertResult[] $values() {
        return new ConvertResult[]{SUCCESS, FAIL, PROCESSING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertResult> getEntries() {
        return $ENTRIES;
    }

    private ConvertResult(String str, int i) {
    }

    static {
        ConvertResult[] convertResultArr$values = $values();
        $VALUES = convertResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertResultArr$values);
    }

    public static ConvertResult valueOf(String str) {
        return (ConvertResult) Enum.valueOf(ConvertResult.class, str);
    }

    public static ConvertResult[] values() {
        return (ConvertResult[]) $VALUES.clone();
    }
}
