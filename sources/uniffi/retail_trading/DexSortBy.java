package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class DexSortBy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexSortBy[] $VALUES;
    public static final DexSortBy PRICE = new DexSortBy("PRICE", 0);
    public static final DexSortBy CHANGE = new DexSortBy("CHANGE", 1);
    public static final DexSortBy TURNOVER = new DexSortBy("TURNOVER", 2);
    public static final DexSortBy MARKET_CAP = new DexSortBy("MARKET_CAP", 3);
    public static final DexSortBy NONE = new DexSortBy("NONE", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexSortBy[] $values() {
        return new DexSortBy[]{PRICE, CHANGE, TURNOVER, MARKET_CAP, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexSortBy> getEntries() {
        return $ENTRIES;
    }

    private DexSortBy(String str, int i) {
    }

    static {
        DexSortBy[] dexSortByArr$values = $values();
        $VALUES = dexSortByArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexSortByArr$values);
    }

    public static DexSortBy valueOf(String str) {
        return (DexSortBy) Enum.valueOf(DexSortBy.class, str);
    }

    public static DexSortBy[] values() {
        return (DexSortBy[]) $VALUES.clone();
    }
}
