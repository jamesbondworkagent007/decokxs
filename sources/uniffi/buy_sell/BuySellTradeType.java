package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class BuySellTradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellTradeType[] $VALUES;
    public static final BuySellTradeType BUY = new BuySellTradeType("BUY", 0);
    public static final BuySellTradeType SELL = new BuySellTradeType("SELL", 1);
    public static final BuySellTradeType CONVERT = new BuySellTradeType("CONVERT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellTradeType[] $values() {
        return new BuySellTradeType[]{BUY, SELL, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellTradeType> getEntries() {
        return $ENTRIES;
    }

    private BuySellTradeType(String str, int i) {
    }

    static {
        BuySellTradeType[] buySellTradeTypeArr$values = $values();
        $VALUES = buySellTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellTradeTypeArr$values);
    }

    public static BuySellTradeType valueOf(String str) {
        return (BuySellTradeType) Enum.valueOf(BuySellTradeType.class, str);
    }

    public static BuySellTradeType[] values() {
        return (BuySellTradeType[]) $VALUES.clone();
    }
}
