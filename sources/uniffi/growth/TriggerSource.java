package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class TriggerSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TriggerSource[] $VALUES;
    public static final TriggerSource BUTTON_CLICK = new TriggerSource("BUTTON_CLICK", 0, 1);
    public static final TriggerSource SCREEN_SHOT = new TriggerSource("SCREEN_SHOT", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TriggerSource[] $values() {
        return new TriggerSource[]{BUTTON_CLICK, SCREEN_SHOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TriggerSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TriggerSource(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TriggerSource[] triggerSourceArr$values = $values();
        $VALUES = triggerSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(triggerSourceArr$values);
    }

    public static TriggerSource valueOf(String str) {
        return (TriggerSource) Enum.valueOf(TriggerSource.class, str);
    }

    public static TriggerSource[] values() {
        return (TriggerSource[]) $VALUES.clone();
    }
}
