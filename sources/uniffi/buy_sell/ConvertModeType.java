package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ConvertModeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertModeType[] $VALUES;
    public static final ConvertModeType SIMPLE = new ConvertModeType("SIMPLE", 0);
    public static final ConvertModeType EXCHANGE = new ConvertModeType("EXCHANGE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertModeType[] $values() {
        return new ConvertModeType[]{SIMPLE, EXCHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertModeType> getEntries() {
        return $ENTRIES;
    }

    private ConvertModeType(String str, int i) {
    }

    static {
        ConvertModeType[] convertModeTypeArr$values = $values();
        $VALUES = convertModeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertModeTypeArr$values);
    }

    public static ConvertModeType valueOf(String str) {
        return (ConvertModeType) Enum.valueOf(ConvertModeType.class, str);
    }

    public static ConvertModeType[] values() {
        return (ConvertModeType[]) $VALUES.clone();
    }
}
