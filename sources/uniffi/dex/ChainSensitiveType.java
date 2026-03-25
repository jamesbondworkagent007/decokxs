package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ChainSensitiveType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainSensitiveType[] $VALUES;
    public static final ChainSensitiveType NOT_SENSITIVE = new ChainSensitiveType("NOT_SENSITIVE", 0);
    public static final ChainSensitiveType SENSITIVE = new ChainSensitiveType("SENSITIVE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainSensitiveType[] $values() {
        return new ChainSensitiveType[]{NOT_SENSITIVE, SENSITIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainSensitiveType> getEntries() {
        return $ENTRIES;
    }

    private ChainSensitiveType(String str, int i) {
    }

    static {
        ChainSensitiveType[] chainSensitiveTypeArr$values = $values();
        $VALUES = chainSensitiveTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainSensitiveTypeArr$values);
    }

    public static ChainSensitiveType valueOf(String str) {
        return (ChainSensitiveType) Enum.valueOf(ChainSensitiveType.class, str);
    }

    public static ChainSensitiveType[] values() {
        return (ChainSensitiveType[]) $VALUES.clone();
    }
}
