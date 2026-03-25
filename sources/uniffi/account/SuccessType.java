package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class SuccessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SuccessType[] $VALUES;
    public static final SuccessType AUTO = new SuccessType("AUTO", 0);
    public static final SuccessType MANUAL = new SuccessType("MANUAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SuccessType[] $values() {
        return new SuccessType[]{AUTO, MANUAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SuccessType> getEntries() {
        return $ENTRIES;
    }

    private SuccessType(String str, int i) {
    }

    static {
        SuccessType[] successTypeArr$values = $values();
        $VALUES = successTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(successTypeArr$values);
    }

    public static SuccessType valueOf(String str) {
        return (SuccessType) Enum.valueOf(SuccessType.class, str);
    }

    public static SuccessType[] values() {
        return (SuccessType[]) $VALUES.clone();
    }
}
