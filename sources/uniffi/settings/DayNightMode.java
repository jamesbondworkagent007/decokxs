package uniffi.settings;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class DayNightMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DayNightMode[] $VALUES;
    public static final DayNightMode AUTO = new DayNightMode("AUTO", 0);
    public static final DayNightMode DAY = new DayNightMode("DAY", 1);
    public static final DayNightMode NIGHT = new DayNightMode("NIGHT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DayNightMode[] $values() {
        return new DayNightMode[]{AUTO, DAY, NIGHT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DayNightMode> getEntries() {
        return $ENTRIES;
    }

    private DayNightMode(String str, int i) {
    }

    static {
        DayNightMode[] dayNightModeArr$values = $values();
        $VALUES = dayNightModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dayNightModeArr$values);
    }

    public static DayNightMode valueOf(String str) {
        return (DayNightMode) Enum.valueOf(DayNightMode.class, str);
    }

    public static DayNightMode[] values() {
        return (DayNightMode[]) $VALUES.clone();
    }
}
