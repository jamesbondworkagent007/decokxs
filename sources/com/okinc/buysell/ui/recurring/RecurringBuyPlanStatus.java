package com.okinc.buysell.ui.recurring;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyPlanStatus[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final RecurringBuyPlanStatus ACTIVE = new RecurringBuyPlanStatus("ACTIVE", 0, "active");
    public static final RecurringBuyPlanStatus PAUSED = new RecurringBuyPlanStatus("PAUSED", 1, "paused");
    public static final RecurringBuyPlanStatus CANCELED = new RecurringBuyPlanStatus("CANCELED", 2, "canceled");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyPlanStatus[] $values() {
        return new RecurringBuyPlanStatus[]{ACTIVE, PAUSED, CANCELED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyPlanStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RecurringBuyPlanStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RecurringBuyPlanStatus[] recurringBuyPlanStatusArr$values = $values();
        $VALUES = recurringBuyPlanStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RecurringBuyPlanStatus KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (RecurringBuyPlanStatus recurringBuyPlanStatus : RecurringBuyPlanStatus.values()) {
                if (Intrinsics.EZpvd((Object) recurringBuyPlanStatus.getValue(), (Object) str)) {
                    return recurringBuyPlanStatus;
                }
            }
            return null;
        }
    }

    public static RecurringBuyPlanStatus valueOf(String str) {
        return (RecurringBuyPlanStatus) Enum.valueOf(RecurringBuyPlanStatus.class, str);
    }

    public static RecurringBuyPlanStatus[] values() {
        return (RecurringBuyPlanStatus[]) $VALUES.clone();
    }
}
