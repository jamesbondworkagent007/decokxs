package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class DualAccountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DualAccountType[] $VALUES;
    public static final DualAccountType INVALID = new DualAccountType("INVALID", 0, 0);
    public static final DualAccountType PRIMARY = new DualAccountType("PRIMARY", 1, 1);
    public static final DualAccountType SECONDARY = new DualAccountType("SECONDARY", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DualAccountType[] $values() {
        return new DualAccountType[]{INVALID, PRIMARY, SECONDARY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DualAccountType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private DualAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        DualAccountType[] dualAccountTypeArr$values = $values();
        $VALUES = dualAccountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dualAccountTypeArr$values);
    }

    public static DualAccountType valueOf(String str) {
        return (DualAccountType) Enum.valueOf(DualAccountType.class, str);
    }

    public static DualAccountType[] values() {
        return (DualAccountType[]) $VALUES.clone();
    }
}
