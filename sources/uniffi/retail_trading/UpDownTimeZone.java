package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UpDownTimeZone {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UpDownTimeZone[] $VALUES;
    public static final UpDownTimeZone MODE24H = new UpDownTimeZone("MODE24H", 0);
    public static final UpDownTimeZone MODE_UTC0 = new UpDownTimeZone("MODE_UTC0", 1);
    public static final UpDownTimeZone MODE_UTC8 = new UpDownTimeZone("MODE_UTC8", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UpDownTimeZone[] $values() {
        return new UpDownTimeZone[]{MODE24H, MODE_UTC0, MODE_UTC8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UpDownTimeZone> getEntries() {
        return $ENTRIES;
    }

    private UpDownTimeZone(String str, int i) {
    }

    static {
        UpDownTimeZone[] upDownTimeZoneArr$values = $values();
        $VALUES = upDownTimeZoneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(upDownTimeZoneArr$values);
    }

    public static UpDownTimeZone valueOf(String str) {
        return (UpDownTimeZone) Enum.valueOf(UpDownTimeZone.class, str);
    }

    public static UpDownTimeZone[] values() {
        return (UpDownTimeZone[]) $VALUES.clone();
    }
}
