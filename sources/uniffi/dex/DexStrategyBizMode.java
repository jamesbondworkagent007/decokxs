package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class DexStrategyBizMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexStrategyBizMode[] $VALUES;
    public static final DexStrategyBizMode NORMAL = new DexStrategyBizMode("NORMAL", 0);
    public static final DexStrategyBizMode COPY_TRADE = new DexStrategyBizMode("COPY_TRADE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexStrategyBizMode[] $values() {
        return new DexStrategyBizMode[]{NORMAL, COPY_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexStrategyBizMode> getEntries() {
        return $ENTRIES;
    }

    private DexStrategyBizMode(String str, int i) {
    }

    static {
        DexStrategyBizMode[] dexStrategyBizModeArr$values = $values();
        $VALUES = dexStrategyBizModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexStrategyBizModeArr$values);
    }

    public static DexStrategyBizMode valueOf(String str) {
        return (DexStrategyBizMode) Enum.valueOf(DexStrategyBizMode.class, str);
    }

    public static DexStrategyBizMode[] values() {
        return (DexStrategyBizMode[]) $VALUES.clone();
    }
}
