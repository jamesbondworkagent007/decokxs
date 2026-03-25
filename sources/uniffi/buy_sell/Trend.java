package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class Trend {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Trend[] $VALUES;
    public static final Trend UP = new Trend("UP", 0);
    public static final Trend DOWN = new Trend("DOWN", 1);
    public static final Trend FLAT = new Trend("FLAT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Trend[] $values() {
        return new Trend[]{UP, DOWN, FLAT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Trend> getEntries() {
        return $ENTRIES;
    }

    private Trend(String str, int i) {
    }

    static {
        Trend[] trendArr$values = $values();
        $VALUES = trendArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trendArr$values);
    }

    public static Trend valueOf(String str) {
        return (Trend) Enum.valueOf(Trend.class, str);
    }

    public static Trend[] values() {
        return (Trend[]) $VALUES.clone();
    }
}
