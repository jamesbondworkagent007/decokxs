package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class RoundingMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RoundingMode[] $VALUES;
    private final int value;
    public static final RoundingMode HALF_UP = new RoundingMode("HALF_UP", 0, 0);
    public static final RoundingMode DOWN = new RoundingMode("DOWN", 1, 1);
    public static final RoundingMode UP = new RoundingMode("UP", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RoundingMode[] $values() {
        return new RoundingMode[]{HALF_UP, DOWN, UP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RoundingMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RoundingMode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RoundingMode[] roundingModeArr$values = $values();
        $VALUES = roundingModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(roundingModeArr$values);
    }

    public static RoundingMode valueOf(String str) {
        return (RoundingMode) Enum.valueOf(RoundingMode.class, str);
    }

    public static RoundingMode[] values() {
        return (RoundingMode[]) $VALUES.clone();
    }
}
