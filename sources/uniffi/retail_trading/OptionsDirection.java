package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class OptionsDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OptionsDirection[] $VALUES;
    public static final OptionsDirection ALL = new OptionsDirection("ALL", 0);
    public static final OptionsDirection CALL = new OptionsDirection("CALL", 1);
    public static final OptionsDirection PUT = new OptionsDirection("PUT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OptionsDirection[] $values() {
        return new OptionsDirection[]{ALL, CALL, PUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OptionsDirection> getEntries() {
        return $ENTRIES;
    }

    private OptionsDirection(String str, int i) {
    }

    static {
        OptionsDirection[] optionsDirectionArr$values = $values();
        $VALUES = optionsDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(optionsDirectionArr$values);
    }

    public static OptionsDirection valueOf(String str) {
        return (OptionsDirection) Enum.valueOf(OptionsDirection.class, str);
    }

    public static OptionsDirection[] values() {
        return (OptionsDirection[]) $VALUES.clone();
    }
}
