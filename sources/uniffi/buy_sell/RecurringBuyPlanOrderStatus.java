package uniffi.buy_sell;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RecurringBuyPlanOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanOrderStatus[] $VALUES;
    public static final RecurringBuyPlanOrderStatus PENDING = new RecurringBuyPlanOrderStatus(CardSyncResponse.PENDING, 0);
    public static final RecurringBuyPlanOrderStatus SUCCESS = new RecurringBuyPlanOrderStatus("SUCCESS", 1);
    public static final RecurringBuyPlanOrderStatus FAILED = new RecurringBuyPlanOrderStatus(CardSyncResponse.FAILED, 2);
    public static final RecurringBuyPlanOrderStatus CANCELED = new RecurringBuyPlanOrderStatus("CANCELED", 3);
    public static final RecurringBuyPlanOrderStatus UNKNOWN = new RecurringBuyPlanOrderStatus("UNKNOWN", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanOrderStatus[] $values() {
        return new RecurringBuyPlanOrderStatus[]{PENDING, SUCCESS, FAILED, CANCELED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanOrderStatus> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanOrderStatus(String str, int i) {
    }

    static {
        RecurringBuyPlanOrderStatus[] recurringBuyPlanOrderStatusArr$values = $values();
        $VALUES = recurringBuyPlanOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanOrderStatusArr$values);
    }

    public static RecurringBuyPlanOrderStatus valueOf(String str) {
        return (RecurringBuyPlanOrderStatus) Enum.valueOf(RecurringBuyPlanOrderStatus.class, str);
    }

    public static RecurringBuyPlanOrderStatus[] values() {
        return (RecurringBuyPlanOrderStatus[]) $VALUES.clone();
    }
}
