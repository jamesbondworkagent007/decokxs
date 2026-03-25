package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class BuySellOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellOrderType[] $VALUES;
    public static final BuySellOrderType ONE_TIME = new BuySellOrderType("ONE_TIME", 0);
    public static final BuySellOrderType RECURRING = new BuySellOrderType("RECURRING", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellOrderType[] $values() {
        return new BuySellOrderType[]{ONE_TIME, RECURRING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellOrderType> getEntries() {
        return $ENTRIES;
    }

    private BuySellOrderType(String str, int i) {
    }

    static {
        BuySellOrderType[] buySellOrderTypeArr$values = $values();
        $VALUES = buySellOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellOrderTypeArr$values);
    }

    public static BuySellOrderType valueOf(String str) {
        return (BuySellOrderType) Enum.valueOf(BuySellOrderType.class, str);
    }

    public static BuySellOrderType[] values() {
        return (BuySellOrderType[]) $VALUES.clone();
    }
}
