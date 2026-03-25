package com.okinc.cruilib.utils;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanOrderStatus[] $VALUES;
    public static final Activity Companion;
    private final String value;
    public static final RecurringBuyPlanOrderStatus PENDING = new RecurringBuyPlanOrderStatus(CardSyncResponse.PENDING, 0, "0");
    public static final RecurringBuyPlanOrderStatus SUCCESS = new RecurringBuyPlanOrderStatus("SUCCESS", 1, "1");
    public static final RecurringBuyPlanOrderStatus FAILED = new RecurringBuyPlanOrderStatus(CardSyncResponse.FAILED, 2, "2");
    public static final RecurringBuyPlanOrderStatus CANCELED = new RecurringBuyPlanOrderStatus("CANCELED", 3, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanOrderStatus[] $values() {
        return new RecurringBuyPlanOrderStatus[]{PENDING, SUCCESS, FAILED, CANCELED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RecurringBuyPlanOrderStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RecurringBuyPlanOrderStatus[] recurringBuyPlanOrderStatusArr$values = $values();
        $VALUES = recurringBuyPlanOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanOrderStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.utils.RecurringBuyPlanOrderStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringBuyPlanOrderStatus EZpvd(String str) {
            for (RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus : RecurringBuyPlanOrderStatus.values()) {
                if (Intrinsics.EZpvd((Object) recurringBuyPlanOrderStatus.getValue(), (Object) str)) {
                    return recurringBuyPlanOrderStatus;
                }
            }
            return null;
        }
    }

    public static RecurringBuyPlanOrderStatus valueOf(String str) {
        return (RecurringBuyPlanOrderStatus) Enum.valueOf(RecurringBuyPlanOrderStatus.class, str);
    }

    public static RecurringBuyPlanOrderStatus[] values() {
        return (RecurringBuyPlanOrderStatus[]) $VALUES.clone();
    }
}
