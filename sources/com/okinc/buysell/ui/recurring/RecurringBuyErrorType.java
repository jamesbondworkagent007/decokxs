package com.okinc.buysell.ui.recurring;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyErrorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyErrorType[] $VALUES;
    public static final Activity Companion;
    public static final RecurringBuyErrorType LOW_BALANCE = new RecurringBuyErrorType("LOW_BALANCE", 0, "LOW_BALANCE");
    public static final RecurringBuyErrorType PAYMENT_METHOD_ISSUE = new RecurringBuyErrorType("PAYMENT_METHOD_ISSUE", 1, "PAYMENT_METHOD_ISSUE");
    public static final RecurringBuyErrorType PRICE_CHANGE = new RecurringBuyErrorType("PRICE_CHANGE", 2, "PRICE_CHANGE");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyErrorType[] $values() {
        return new RecurringBuyErrorType[]{LOW_BALANCE, PAYMENT_METHOD_ISSUE, PRICE_CHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyErrorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RecurringBuyErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RecurringBuyErrorType[] recurringBuyErrorTypeArr$values = $values();
        $VALUES = recurringBuyErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyErrorTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.RecurringBuyErrorType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringBuyErrorType copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (RecurringBuyErrorType recurringBuyErrorType : RecurringBuyErrorType.values()) {
                if (Intrinsics.EZpvd((Object) recurringBuyErrorType.getValue(), (Object) str)) {
                    return recurringBuyErrorType;
                }
            }
            return null;
        }
    }

    public static RecurringBuyErrorType valueOf(String str) {
        return (RecurringBuyErrorType) Enum.valueOf(RecurringBuyErrorType.class, str);
    }

    public static RecurringBuyErrorType[] values() {
        return (RecurringBuyErrorType[]) $VALUES.clone();
    }
}
