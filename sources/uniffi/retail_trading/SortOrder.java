package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class SortOrder {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    public static final SortOrder ASC = new SortOrder("ASC", 0);
    public static final SortOrder DESC = new SortOrder("DESC", 1);
    public static final SortOrder NONE = new SortOrder("NONE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortOrder[] $values() {
        return new SortOrder[]{ASC, DESC, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortOrder> getEntries() {
        return $ENTRIES;
    }

    private SortOrder(String str, int i) {
    }

    static {
        SortOrder[] sortOrderArr$values = $values();
        $VALUES = sortOrderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortOrderArr$values);
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }
}
