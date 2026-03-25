package uniffi.feature_restriction;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class CefiMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CefiMode[] $VALUES;
    public static final CefiMode PRO = new CefiMode("PRO", 0);
    public static final CefiMode LITE = new CefiMode("LITE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CefiMode[] $values() {
        return new CefiMode[]{PRO, LITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CefiMode> getEntries() {
        return $ENTRIES;
    }

    private CefiMode(String str, int i) {
    }

    static {
        CefiMode[] cefiModeArr$values = $values();
        $VALUES = cefiModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cefiModeArr$values);
    }

    public static CefiMode valueOf(String str) {
        return (CefiMode) Enum.valueOf(CefiMode.class, str);
    }

    public static CefiMode[] values() {
        return (CefiMode[]) $VALUES.clone();
    }
}
