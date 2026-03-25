package com.okinc.buysell.data;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class FrequencyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FrequencyType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final FrequencyType ONE_TIME = new FrequencyType("ONE_TIME", 0, "just_once");
    public static final FrequencyType DAILY = new FrequencyType("DAILY", 1, "daily");
    public static final FrequencyType WEEKLY = new FrequencyType("WEEKLY", 2, "weekly");
    public static final FrequencyType BIWEEKLY = new FrequencyType("BIWEEKLY", 3, "bi-weekly");
    public static final FrequencyType MONTHLY = new FrequencyType("MONTHLY", 4, "monthly");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FrequencyType[] $values() {
        return new FrequencyType[]{ONE_TIME, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FrequencyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private FrequencyType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        FrequencyType[] frequencyTypeArr$values = $values();
        $VALUES = frequencyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(frequencyTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.FrequencyType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final FrequencyType copydefault(@NotNull String str) {
            FrequencyType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<FrequencyType> it = FrequencyType.getEntries().iterator();
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
            FrequencyType frequencyType = next;
            return frequencyType == null ? FrequencyType.ONE_TIME : frequencyType;
        }
    }

    public static FrequencyType valueOf(String str) {
        return (FrequencyType) Enum.valueOf(FrequencyType.class, str);
    }

    public static FrequencyType[] values() {
        return (FrequencyType[]) $VALUES.clone();
    }
}
