package uniffi.buy_sell;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RecurringBuyPlanListContentStateVariant {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanListContentStateVariant[] $VALUES;
    public static final RecurringBuyPlanListContentStateVariant IDLE = new RecurringBuyPlanListContentStateVariant("IDLE", 0);
    public static final RecurringBuyPlanListContentStateVariant LOADING = new RecurringBuyPlanListContentStateVariant("LOADING", 1);
    public static final RecurringBuyPlanListContentStateVariant LOADED = new RecurringBuyPlanListContentStateVariant("LOADED", 2);
    public static final RecurringBuyPlanListContentStateVariant EMPTY = new RecurringBuyPlanListContentStateVariant("EMPTY", 3);
    public static final RecurringBuyPlanListContentStateVariant ERROR = new RecurringBuyPlanListContentStateVariant(EventType.ERROR, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanListContentStateVariant[] $values() {
        return new RecurringBuyPlanListContentStateVariant[]{IDLE, LOADING, LOADED, EMPTY, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanListContentStateVariant> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanListContentStateVariant(String str, int i) {
    }

    static {
        RecurringBuyPlanListContentStateVariant[] recurringBuyPlanListContentStateVariantArr$values = $values();
        $VALUES = recurringBuyPlanListContentStateVariantArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanListContentStateVariantArr$values);
    }

    public static RecurringBuyPlanListContentStateVariant valueOf(String str) {
        return (RecurringBuyPlanListContentStateVariant) Enum.valueOf(RecurringBuyPlanListContentStateVariant.class, str);
    }

    public static RecurringBuyPlanListContentStateVariant[] values() {
        return (RecurringBuyPlanListContentStateVariant[]) $VALUES.clone();
    }
}
