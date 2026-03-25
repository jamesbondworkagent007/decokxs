package com.okinc.buysell.ui.recurring.edit.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C33070mpX;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class RecurringFrequencyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringFrequencyType[] $VALUES;
    public static final Activity Companion;
    private final String desc;
    private final String label;
    private final String value;
    public static final RecurringFrequencyType DAILY = new RecurringFrequencyType("DAILY", 0, "daily", C33070mpX.AYXKKw(C31351lsQ.Activity.atDTRm), C33070mpX.AYXKKw(C31351lsQ.Activity.dzkkkq));
    public static final RecurringFrequencyType WEEKLY = new RecurringFrequencyType("WEEKLY", 1, "weekly", C33070mpX.AYXKKw(C31351lsQ.Activity.gBtXYZ), C33070mpX.AYXKKw(C31351lsQ.Activity.dzkkkq));
    public static final RecurringFrequencyType BIWEEKLY = new RecurringFrequencyType("BIWEEKLY", 2, "bi-weekly", C33070mpX.AYXKKw(C31351lsQ.Activity.Rtjmuc), C33070mpX.AYXKKw(C31351lsQ.Activity.dzkkkq));
    public static final RecurringFrequencyType MONTHLY = new RecurringFrequencyType("MONTHLY", 3, "monthly", C33070mpX.AYXKKw(C31351lsQ.Activity.dPnHjp), C33070mpX.AYXKKw(C31351lsQ.Activity.dzkkkq));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringFrequencyType[] $values() {
        return new RecurringFrequencyType[]{DAILY, WEEKLY, BIWEEKLY, MONTHLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringFrequencyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RecurringFrequencyType(String str, int i, String str2, String str3, String str4) {
        this.value = str2;
        this.label = str3;
        this.desc = str4;
    }

    static {
        RecurringFrequencyType[] recurringFrequencyTypeArr$values = $values();
        $VALUES = recurringFrequencyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringFrequencyTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringFrequencyType KWHzl(@NotNull String str) {
            RecurringFrequencyType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<RecurringFrequencyType> it = RecurringFrequencyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            RecurringFrequencyType recurringFrequencyType = next;
            return recurringFrequencyType == null ? RecurringFrequencyType.WEEKLY : recurringFrequencyType;
        }
    }

    public static RecurringFrequencyType valueOf(String str) {
        return (RecurringFrequencyType) Enum.valueOf(RecurringFrequencyType.class, str);
    }

    public static RecurringFrequencyType[] values() {
        return (RecurringFrequencyType[]) $VALUES.clone();
    }
}
