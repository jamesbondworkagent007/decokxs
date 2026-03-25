package com.okinc.business.market.features.module.domain.type;

import androidx.annotation.StringRes;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TimeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimeType[] $VALUES;
    public static final Activity Companion;
    private final int titleResId;
    private final String value;
    public static final TimeType FIVE_MINUTES = new TimeType("FIVE_MINUTES", 0, "1", C23274hvD.Fragment.DuQ);
    public static final TimeType ONE_HOUR = new TimeType("ONE_HOUR", 1, "2", C23274hvD.Fragment.sSi);
    public static final TimeType FOUR_HOUR = new TimeType("FOUR_HOUR", 2, "3", C23274hvD.Fragment.ZGRCNj);
    public static final TimeType ONE_DAY = new TimeType("ONE_DAY", 3, "4", C23274hvD.Fragment.ZNPcth);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimeType[] $values() {
        return new TimeType[]{FIVE_MINUTES, ONE_HOUR, FOUR_HOUR, ONE_DAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TimeType(String str, @StringRes int i, String str2, int i2) {
        this.value = str2;
        this.titleResId = i2;
    }

    static {
        TimeType[] timeTypeArr$values = $values();
        $VALUES = timeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timeTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.module.domain.type.TimeType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TimeType EZpvd(String str) {
            TimeType next;
            Iterator<TimeType> it = TimeType.getEntries().iterator();
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
            TimeType timeType = next;
            return timeType == null ? TimeType.ONE_DAY : timeType;
        }

        public final int AEQbTJ() {
            return TimeType.getEntries().size();
        }

        public final TimeType EZpvd(int i) {
            InterfaceC56445yFq<TimeType> entries = TimeType.getEntries();
            return (i < 0 || i >= entries.size()) ? TimeType.ONE_DAY : entries.get(i);
        }

        public final int OLrzqt(int i) {
            return EZpvd(i).getTitleResId();
        }
    }

    public static TimeType valueOf(String str) {
        return (TimeType) Enum.valueOf(TimeType.class, str);
    }

    public static TimeType[] values() {
        return (TimeType[]) $VALUES.clone();
    }
}
