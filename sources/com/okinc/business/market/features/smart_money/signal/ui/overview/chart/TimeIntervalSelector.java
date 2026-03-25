package com.okinc.business.market.features.smart_money.signal.ui.overview.chart;

import androidx.annotation.StringRes;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TimeIntervalSelector {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimeIntervalSelector[] $VALUES;
    public static final StateListAnimator Companion;
    private final String eventTrackingValue;
    private final String granularity;
    private final int limitCalculation;
    private final float maxNoOfXPoints;
    private final String periodKey;
    private final int stringRes;
    public static final TimeIntervalSelector FIFTEEN_MINUTES = new TimeIntervalSelector("FIFTEEN_MINUTES", 0, C23274hvD.Fragment.igXuih, "1m", 15.0f, "fifteen_minutes", "15M", 1439);
    public static final TimeIntervalSelector ONE_HOUR = new TimeIntervalSelector("ONE_HOUR", 1, C23274hvD.Fragment.htlTjW, "1m", 60.0f, "one_hour", "1H", Math.min(1439, 20160));
    public static final TimeIntervalSelector FOUR_HOURS = new TimeIntervalSelector("FOUR_HOURS", 2, C23274hvD.Fragment.Dmq, "5m", 48.0f, "four_hour", "4H", Math.min(1439, 4032));
    public static final TimeIntervalSelector TWENTY_FOUR_HOURS = new TimeIntervalSelector("TWENTY_FOUR_HOURS", 3, C23274hvD.Fragment.fERRXa, "30m", 48.0f, "twentyfour_hour", "24H", Math.min(1439, 672));
    public static final TimeIntervalSelector SEVEN_DAYS = new TimeIntervalSelector("SEVEN_DAYS", 4, C23274hvD.Fragment.DCUTEIdCUTEI, "4H", 48.0f, "seven_days", "7D", Math.min(1439, 84));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimeIntervalSelector[] $values() {
        return new TimeIntervalSelector[]{FIFTEEN_MINUTES, ONE_HOUR, FOUR_HOURS, TWENTY_FOUR_HOURS, SEVEN_DAYS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimeIntervalSelector> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingValue() {
        return this.eventTrackingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGranularity() {
        return this.granularity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limitCalculation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMaxNoOfXPoints() {
        return this.maxNoOfXPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriodKey() {
        return this.periodKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStringRes() {
        return this.stringRes;
    }

    private TimeIntervalSelector(@StringRes String str, int i, int i2, String str2, float f, String str3, String str4, int i3) {
        this.stringRes = i2;
        this.granularity = str2;
        this.maxNoOfXPoints = f;
        this.eventTrackingValue = str3;
        this.periodKey = str4;
        this.limitCalculation = i3;
    }

    static {
        TimeIntervalSelector[] timeIntervalSelectorArr$values = $values();
        $VALUES = timeIntervalSelectorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timeIntervalSelectorArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final TimeIntervalSelector KWHzl(@NotNull String str) {
            TimeIntervalSelector next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<TimeIntervalSelector> it = TimeIntervalSelector.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String periodKey = next.getPeriodKey();
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (Intrinsics.EZpvd((Object) periodKey, (Object) upperCase)) {
                    break;
                }
            }
            TimeIntervalSelector timeIntervalSelector = next;
            return timeIntervalSelector == null ? TimeIntervalSelector.FOUR_HOURS : timeIntervalSelector;
        }
    }

    public static TimeIntervalSelector valueOf(String str) {
        return (TimeIntervalSelector) Enum.valueOf(TimeIntervalSelector.class, str);
    }

    public static TimeIntervalSelector[] values() {
        return (TimeIntervalSelector[]) $VALUES.clone();
    }
}
