package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class DappCaseType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DappCaseType[] $VALUES;
    public static final DappCaseType UNKNOWN = new DappCaseType("UNKNOWN", 0);
    public static final DappCaseType NORMAL = new DappCaseType("NORMAL", 1);
    public static final DappCaseType SPECIAL = new DappCaseType("SPECIAL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DappCaseType[] $values() {
        return new DappCaseType[]{UNKNOWN, NORMAL, SPECIAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DappCaseType> getEntries() {
        return $ENTRIES;
    }

    private DappCaseType(String str, int i) {
    }

    static {
        DappCaseType[] dappCaseTypeArr$values = $values();
        $VALUES = dappCaseTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dappCaseTypeArr$values);
    }

    public static DappCaseType valueOf(String str) {
        return (DappCaseType) Enum.valueOf(DappCaseType.class, str);
    }

    public static DappCaseType[] values() {
        return (DappCaseType[]) $VALUES.clone();
    }
}
