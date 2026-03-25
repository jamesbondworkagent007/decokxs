package com.okinc.tradeuilib.widget;

import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SelectedTime {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SelectedTime[] $VALUES;
    public static final Application Companion;
    private final int startDayOfMonth;
    private final String value;
    public static final SelectedTime TYPE_7_DAYS = new SelectedTime("TYPE_7_DAYS", 0, "last_7_days", -6);
    public static final SelectedTime TYPE_30_DAYS = new SelectedTime("TYPE_30_DAYS", 1, "last_30_days", -29);
    public static final SelectedTime TYPE_90_DAYS = new SelectedTime("TYPE_90_DAYS", 2, "last_90_days", -89);
    public static final SelectedTime NONE = new SelectedTime("NONE", 3, "unSelected", -6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SelectedTime[] $values() {
        return new SelectedTime[]{TYPE_7_DAYS, TYPE_30_DAYS, TYPE_90_DAYS, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SelectedTime> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SelectedTime(String str, int i, String str2, int i2) {
        this.value = str2;
        this.startDayOfMonth = i2;
    }

    static {
        SelectedTime[] selectedTimeArr$values = $values();
        $VALUES = selectedTimeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(selectedTimeArr$values);
        Companion = new Application(null);
    }

    public final Calendar getSelectedStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, this.startDayOfMonth);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return calendar;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.widget.SelectedTime.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static SelectedTime valueOf(String str) {
        return (SelectedTime) Enum.valueOf(SelectedTime.class, str);
    }

    public static SelectedTime[] values() {
        return (SelectedTime[]) $VALUES.clone();
    }
}
