package uniffi.buy_sell;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RecurringBuyPlanDetailContentStateVariant {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanDetailContentStateVariant[] $VALUES;
    public static final RecurringBuyPlanDetailContentStateVariant IDLE = new RecurringBuyPlanDetailContentStateVariant("IDLE", 0);
    public static final RecurringBuyPlanDetailContentStateVariant LOADING = new RecurringBuyPlanDetailContentStateVariant("LOADING", 1);
    public static final RecurringBuyPlanDetailContentStateVariant LOADED = new RecurringBuyPlanDetailContentStateVariant("LOADED", 2);
    public static final RecurringBuyPlanDetailContentStateVariant ERROR = new RecurringBuyPlanDetailContentStateVariant(EventType.ERROR, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanDetailContentStateVariant[] $values() {
        return new RecurringBuyPlanDetailContentStateVariant[]{IDLE, LOADING, LOADED, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanDetailContentStateVariant> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanDetailContentStateVariant(String str, int i) {
    }

    static {
        RecurringBuyPlanDetailContentStateVariant[] recurringBuyPlanDetailContentStateVariantArr$values = $values();
        $VALUES = recurringBuyPlanDetailContentStateVariantArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanDetailContentStateVariantArr$values);
    }

    public static RecurringBuyPlanDetailContentStateVariant valueOf(String str) {
        return (RecurringBuyPlanDetailContentStateVariant) Enum.valueOf(RecurringBuyPlanDetailContentStateVariant.class, str);
    }

    public static RecurringBuyPlanDetailContentStateVariant[] values() {
        return (RecurringBuyPlanDetailContentStateVariant[]) $VALUES.clone();
    }
}
