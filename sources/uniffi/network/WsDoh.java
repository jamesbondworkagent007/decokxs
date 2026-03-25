package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class WsDoh {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WsDoh[] $VALUES;
    public static final WsDoh CEFI = new WsDoh("CEFI", 0);
    public static final WsDoh WEB3 = new WsDoh("WEB3", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WsDoh[] $values() {
        return new WsDoh[]{CEFI, WEB3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WsDoh> getEntries() {
        return $ENTRIES;
    }

    private WsDoh(String str, int i) {
    }

    static {
        WsDoh[] wsDohArr$values = $values();
        $VALUES = wsDohArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(wsDohArr$values);
    }

    public static WsDoh valueOf(String str) {
        return (WsDoh) Enum.valueOf(WsDoh.class, str);
    }

    public static WsDoh[] values() {
        return (WsDoh[]) $VALUES.clone();
    }
}
