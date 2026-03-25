package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class RecurringBuyPlanDetailErrorCase {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanDetailErrorCase[] $VALUES;
    public static final RecurringBuyPlanDetailErrorCase LOW_BALANCE_WARNING = new RecurringBuyPlanDetailErrorCase("LOW_BALANCE_WARNING", 0);
    public static final RecurringBuyPlanDetailErrorCase LOW_BALANCE_FAIL_WARNING = new RecurringBuyPlanDetailErrorCase("LOW_BALANCE_FAIL_WARNING", 1);
    public static final RecurringBuyPlanDetailErrorCase LOW_BALANCE_AUTO_PAUSED = new RecurringBuyPlanDetailErrorCase("LOW_BALANCE_AUTO_PAUSED", 2);
    public static final RecurringBuyPlanDetailErrorCase PAYMENT_METHOD_ISSUE_FAIL_WARNING = new RecurringBuyPlanDetailErrorCase("PAYMENT_METHOD_ISSUE_FAIL_WARNING", 3);
    public static final RecurringBuyPlanDetailErrorCase PAYMENT_METHOD_ISSUE_AUTO_PAUSED = new RecurringBuyPlanDetailErrorCase("PAYMENT_METHOD_ISSUE_AUTO_PAUSED", 4);
    public static final RecurringBuyPlanDetailErrorCase NO_OTC_QUOTE_FAIL_WARNING = new RecurringBuyPlanDetailErrorCase("NO_OTC_QUOTE_FAIL_WARNING", 5);
    public static final RecurringBuyPlanDetailErrorCase NO_OTC_QUOTE_AUTO_PAUSED = new RecurringBuyPlanDetailErrorCase("NO_OTC_QUOTE_AUTO_PAUSED", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanDetailErrorCase[] $values() {
        return new RecurringBuyPlanDetailErrorCase[]{LOW_BALANCE_WARNING, LOW_BALANCE_FAIL_WARNING, LOW_BALANCE_AUTO_PAUSED, PAYMENT_METHOD_ISSUE_FAIL_WARNING, PAYMENT_METHOD_ISSUE_AUTO_PAUSED, NO_OTC_QUOTE_FAIL_WARNING, NO_OTC_QUOTE_AUTO_PAUSED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanDetailErrorCase> getEntries() {
        return $ENTRIES;
    }

    private RecurringBuyPlanDetailErrorCase(String str, int i) {
    }

    static {
        RecurringBuyPlanDetailErrorCase[] recurringBuyPlanDetailErrorCaseArr$values = $values();
        $VALUES = recurringBuyPlanDetailErrorCaseArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanDetailErrorCaseArr$values);
    }

    public static RecurringBuyPlanDetailErrorCase valueOf(String str) {
        return (RecurringBuyPlanDetailErrorCase) Enum.valueOf(RecurringBuyPlanDetailErrorCase.class, str);
    }

    public static RecurringBuyPlanDetailErrorCase[] values() {
        return (RecurringBuyPlanDetailErrorCase[]) $VALUES.clone();
    }
}
