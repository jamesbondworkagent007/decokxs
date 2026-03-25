package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class RecurringBuyPlanDetailStatusChangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanDetailStatusChangeType[] $VALUES;
    public static final RecurringBuyPlanDetailStatusChangeType RESUMED = new RecurringBuyPlanDetailStatusChangeType("RESUMED", 0);
    public static final RecurringBuyPlanDetailStatusChangeType PAUSED = new RecurringBuyPlanDetailStatusChangeType("PAUSED", 1);
    public static final RecurringBuyPlanDetailStatusChangeType CANCELED = new RecurringBuyPlanDetailStatusChangeType("CANCELED", 2);
    public static final RecurringBuyPlanDetailStatusChangeType PLAN_UPDATED = new RecurringBuyPlanDetailStatusChangeType("PLAN_UPDATED", 3);
    public static final RecurringBuyPlanDetailStatusChangeType PLAN_UPDATE_ERROR = new RecurringBuyPlanDetailStatusChangeType("PLAN_UPDATE_ERROR", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanDetailStatusChangeType[] $values() {
        return new RecurringBuyPlanDetailStatusChangeType[]{RESUMED, PAUSED, CANCELED, PLAN_UPDATED, PLAN_UPDATE_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanDetailStatusChangeType> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanDetailStatusChangeType(String str, int i) {
    }

    static {
        RecurringBuyPlanDetailStatusChangeType[] recurringBuyPlanDetailStatusChangeTypeArr$values = $values();
        $VALUES = recurringBuyPlanDetailStatusChangeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanDetailStatusChangeTypeArr$values);
    }

    public static RecurringBuyPlanDetailStatusChangeType valueOf(String str) {
        return (RecurringBuyPlanDetailStatusChangeType) Enum.valueOf(RecurringBuyPlanDetailStatusChangeType.class, str);
    }

    public static RecurringBuyPlanDetailStatusChangeType[] values() {
        return (RecurringBuyPlanDetailStatusChangeType[]) $VALUES.clone();
    }
}
