package com.okinc.unify_trade.bot.util.recurring;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class RecurringCycleConfigNew {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringCycleConfigNew[] $VALUES;
    public static final TaskDescription Companion;
    private final int index;
    private final String period;
    private final int title;
    public static final RecurringCycleConfigNew DAY = new RecurringCycleConfigNew("DAY", 0, 0, "daily", C55688xof.Application.setActive);
    public static final RecurringCycleConfigNew WEEK = new RecurringCycleConfigNew("WEEK", 1, 1, "weekly", C55688xof.Application.PlaybackStateCompatShuffleMode);
    public static final RecurringCycleConfigNew MONTH = new RecurringCycleConfigNew("MONTH", 2, 2, "monthly", C55688xof.Application.mask);
    public static final RecurringCycleConfigNew HOUR = new RecurringCycleConfigNew("HOUR", 3, 3, "hourly", C55688xof.Application.UkvvWh);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringCycleConfigNew[] $values() {
        return new RecurringCycleConfigNew[]{DAY, WEEK, MONTH, HOUR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringCycleConfigNew> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private RecurringCycleConfigNew(String str, int i, int i2, String str2, int i3) {
        this.index = i2;
        this.period = str2;
        this.title = i3;
    }

    static {
        RecurringCycleConfigNew[] recurringCycleConfigNewArr$values = $values();
        $VALUES = recurringCycleConfigNewArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringCycleConfigNewArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int OLrzqt(String str) {
            RecurringCycleConfigNew recurringCycleConfigNew;
            RecurringCycleConfigNew[] recurringCycleConfigNewArrValues = RecurringCycleConfigNew.values();
            int length = recurringCycleConfigNewArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    recurringCycleConfigNew = null;
                    break;
                }
                recurringCycleConfigNew = recurringCycleConfigNewArrValues[i];
                if (Intrinsics.EZpvd((Object) recurringCycleConfigNew.getPeriod(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (recurringCycleConfigNew != null) {
                return recurringCycleConfigNew.getIndex();
            }
            return 0;
        }

        public final String OLrzqt(int i) {
            RecurringCycleConfigNew recurringCycleConfigNew;
            String period;
            RecurringCycleConfigNew[] recurringCycleConfigNewArrValues = RecurringCycleConfigNew.values();
            int length = recurringCycleConfigNewArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    recurringCycleConfigNew = null;
                    break;
                }
                recurringCycleConfigNew = recurringCycleConfigNewArrValues[i2];
                if (C33129mqd.OLrzqt(Integer.valueOf(recurringCycleConfigNew.getIndex()), Integer.valueOf(i))) {
                    break;
                }
                i2++;
            }
            return (recurringCycleConfigNew == null || (period = recurringCycleConfigNew.getPeriod()) == null) ? "" : period;
        }
    }

    public static RecurringCycleConfigNew valueOf(String str) {
        return (RecurringCycleConfigNew) Enum.valueOf(RecurringCycleConfigNew.class, str);
    }

    public static RecurringCycleConfigNew[] values() {
        return (RecurringCycleConfigNew[]) $VALUES.clone();
    }
}
