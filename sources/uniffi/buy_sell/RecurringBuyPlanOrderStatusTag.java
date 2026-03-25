package uniffi.buy_sell;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RecurringBuyPlanOrderStatusTag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanOrderStatusTag[] $VALUES;
    public static final RecurringBuyPlanOrderStatusTag NONE = new RecurringBuyPlanOrderStatusTag("NONE", 0);
    public static final RecurringBuyPlanOrderStatusTag PENDING = new RecurringBuyPlanOrderStatusTag(CardSyncResponse.PENDING, 1);
    public static final RecurringBuyPlanOrderStatusTag FAILED = new RecurringBuyPlanOrderStatusTag(CardSyncResponse.FAILED, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanOrderStatusTag[] $values() {
        return new RecurringBuyPlanOrderStatusTag[]{NONE, PENDING, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanOrderStatusTag> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanOrderStatusTag(String str, int i) {
    }

    static {
        RecurringBuyPlanOrderStatusTag[] recurringBuyPlanOrderStatusTagArr$values = $values();
        $VALUES = recurringBuyPlanOrderStatusTagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanOrderStatusTagArr$values);
    }

    public static RecurringBuyPlanOrderStatusTag valueOf(String str) {
        return (RecurringBuyPlanOrderStatusTag) Enum.valueOf(RecurringBuyPlanOrderStatusTag.class, str);
    }

    public static RecurringBuyPlanOrderStatusTag[] values() {
        return (RecurringBuyPlanOrderStatusTag[]) $VALUES.clone();
    }
}
