package uniffi.buy_sell;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class BuySellOrderDetailContentStateVariant {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellOrderDetailContentStateVariant[] $VALUES;
    public static final BuySellOrderDetailContentStateVariant IDLE = new BuySellOrderDetailContentStateVariant("IDLE", 0);
    public static final BuySellOrderDetailContentStateVariant LOADING = new BuySellOrderDetailContentStateVariant("LOADING", 1);
    public static final BuySellOrderDetailContentStateVariant SUCCESS = new BuySellOrderDetailContentStateVariant("SUCCESS", 2);
    public static final BuySellOrderDetailContentStateVariant ERROR = new BuySellOrderDetailContentStateVariant(EventType.ERROR, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellOrderDetailContentStateVariant[] $values() {
        return new BuySellOrderDetailContentStateVariant[]{IDLE, LOADING, SUCCESS, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellOrderDetailContentStateVariant> getEntries() {
        return $ENTRIES;
    }

    private BuySellOrderDetailContentStateVariant(String str, int i) {
    }

    static {
        BuySellOrderDetailContentStateVariant[] buySellOrderDetailContentStateVariantArr$values = $values();
        $VALUES = buySellOrderDetailContentStateVariantArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellOrderDetailContentStateVariantArr$values);
    }

    public static BuySellOrderDetailContentStateVariant valueOf(String str) {
        return (BuySellOrderDetailContentStateVariant) Enum.valueOf(BuySellOrderDetailContentStateVariant.class, str);
    }

    public static BuySellOrderDetailContentStateVariant[] values() {
        return (BuySellOrderDetailContentStateVariant[]) $VALUES.clone();
    }
}
