package uniffi.buy_sell;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RecurringBuyPlanOrderListContentStateVariant {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanOrderListContentStateVariant[] $VALUES;
    public static final RecurringBuyPlanOrderListContentStateVariant IDLE = new RecurringBuyPlanOrderListContentStateVariant("IDLE", 0);
    public static final RecurringBuyPlanOrderListContentStateVariant LOADING = new RecurringBuyPlanOrderListContentStateVariant("LOADING", 1);
    public static final RecurringBuyPlanOrderListContentStateVariant LOADED = new RecurringBuyPlanOrderListContentStateVariant("LOADED", 2);
    public static final RecurringBuyPlanOrderListContentStateVariant EMPTY = new RecurringBuyPlanOrderListContentStateVariant("EMPTY", 3);
    public static final RecurringBuyPlanOrderListContentStateVariant ERROR = new RecurringBuyPlanOrderListContentStateVariant(EventType.ERROR, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanOrderListContentStateVariant[] $values() {
        return new RecurringBuyPlanOrderListContentStateVariant[]{IDLE, LOADING, LOADED, EMPTY, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanOrderListContentStateVariant> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanOrderListContentStateVariant(String str, int i) {
    }

    static {
        RecurringBuyPlanOrderListContentStateVariant[] recurringBuyPlanOrderListContentStateVariantArr$values = $values();
        $VALUES = recurringBuyPlanOrderListContentStateVariantArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanOrderListContentStateVariantArr$values);
    }

    public static RecurringBuyPlanOrderListContentStateVariant valueOf(String str) {
        return (RecurringBuyPlanOrderListContentStateVariant) Enum.valueOf(RecurringBuyPlanOrderListContentStateVariant.class, str);
    }

    public static RecurringBuyPlanOrderListContentStateVariant[] values() {
        return (RecurringBuyPlanOrderListContentStateVariant[]) $VALUES.clone();
    }
}
