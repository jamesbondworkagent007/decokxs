package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AlertRepeatType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertRepeatType[] $VALUES;
    private final int value;
    public static final AlertRepeatType REPEAT = new AlertRepeatType("REPEAT", 0, 0);
    public static final AlertRepeatType ONCE = new AlertRepeatType("ONCE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertRepeatType[] $values() {
        return new AlertRepeatType[]{REPEAT, ONCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertRepeatType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AlertRepeatType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AlertRepeatType[] alertRepeatTypeArr$values = $values();
        $VALUES = alertRepeatTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertRepeatTypeArr$values);
    }

    public static AlertRepeatType valueOf(String str) {
        return (AlertRepeatType) Enum.valueOf(AlertRepeatType.class, str);
    }

    public static AlertRepeatType[] values() {
        return (AlertRepeatType[]) $VALUES.clone();
    }
}
