package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class BuySellTokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellTokenType[] $VALUES;
    public static final BuySellTokenType CEFI = new BuySellTokenType("CEFI", 0);
    public static final BuySellTokenType DEFI = new BuySellTokenType("DEFI", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellTokenType[] $values() {
        return new BuySellTokenType[]{CEFI, DEFI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellTokenType> getEntries() {
        return $ENTRIES;
    }

    private BuySellTokenType(String str, int i) {
    }

    static {
        BuySellTokenType[] buySellTokenTypeArr$values = $values();
        $VALUES = buySellTokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellTokenTypeArr$values);
    }

    public static BuySellTokenType valueOf(String str) {
        return (BuySellTokenType) Enum.valueOf(BuySellTokenType.class, str);
    }

    public static BuySellTokenType[] values() {
        return (BuySellTokenType[]) $VALUES.clone();
    }
}
