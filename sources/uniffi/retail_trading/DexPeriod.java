package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class DexPeriod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexPeriod[] $VALUES;
    public static final DexPeriod FIVE_MINUTES = new DexPeriod("FIVE_MINUTES", 0);
    public static final DexPeriod ONE_HOUR = new DexPeriod("ONE_HOUR", 1);
    public static final DexPeriod FOUR_HOURS = new DexPeriod("FOUR_HOURS", 2);
    public static final DexPeriod ONE_DAY = new DexPeriod("ONE_DAY", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexPeriod[] $values() {
        return new DexPeriod[]{FIVE_MINUTES, ONE_HOUR, FOUR_HOURS, ONE_DAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexPeriod> getEntries() {
        return $ENTRIES;
    }

    private DexPeriod(String str, int i) {
    }

    static {
        DexPeriod[] dexPeriodArr$values = $values();
        $VALUES = dexPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexPeriodArr$values);
    }

    public static DexPeriod valueOf(String str) {
        return (DexPeriod) Enum.valueOf(DexPeriod.class, str);
    }

    public static DexPeriod[] values() {
        return (DexPeriod[]) $VALUES.clone();
    }
}
