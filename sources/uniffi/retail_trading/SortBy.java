package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SortBy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortBy[] $VALUES;
    public static final SortBy NAME = new SortBy("NAME", 0);
    public static final SortBy VOLUME = new SortBy("VOLUME", 1);
    public static final SortBy TURNOVER = new SortBy("TURNOVER", 2);
    public static final SortBy PRICE = new SortBy("PRICE", 3);
    public static final SortBy CHANGE = new SortBy("CHANGE", 4);
    public static final SortBy NONE = new SortBy("NONE", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortBy[] $values() {
        return new SortBy[]{NAME, VOLUME, TURNOVER, PRICE, CHANGE, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortBy> getEntries() {
        return $ENTRIES;
    }

    private SortBy(String str, int i) {
    }

    static {
        SortBy[] sortByArr$values = $values();
        $VALUES = sortByArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortByArr$values);
    }

    public static SortBy valueOf(String str) {
        return (SortBy) Enum.valueOf(SortBy.class, str);
    }

    public static SortBy[] values() {
        return (SortBy[]) $VALUES.clone();
    }
}
