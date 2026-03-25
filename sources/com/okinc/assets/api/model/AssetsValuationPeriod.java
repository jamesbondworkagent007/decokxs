package com.okinc.assets.api.model;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.C8162axY;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class AssetsValuationPeriod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetsValuationPeriod[] $VALUES;
    public static final Activity Companion;
    private final int apiType;
    private final int chartTitle;
    private final String eventTrackingValue;
    private final int pnlTitle;
    public static final AssetsValuationPeriod ONE_DAY = new AssetsValuationPeriod("ONE_DAY", 0, C8162axY.TaskDescription.AEQbTJ, C8162axY.TaskDescription.gEmmrt, "1d", 0);
    public static final AssetsValuationPeriod ONE_WEEK = new AssetsValuationPeriod("ONE_WEEK", 1, C8162axY.TaskDescription.OLrzqt, C8162axY.TaskDescription.AYXKKw, "1w", 1);
    public static final AssetsValuationPeriod ONE_MONTH = new AssetsValuationPeriod("ONE_MONTH", 2, C8162axY.TaskDescription.copydefault, C8162axY.TaskDescription.valueOf, "1m", 2);
    public static final AssetsValuationPeriod SIX_MONTHS = new AssetsValuationPeriod("SIX_MONTHS", 3, C8162axY.TaskDescription.EZpvd, C8162axY.TaskDescription.djBIcL, "6m", 3);
    public static final AssetsValuationPeriod ONE_YEAR = new AssetsValuationPeriod("ONE_YEAR", 4, C8162axY.TaskDescription.KWHzl, C8162axY.TaskDescription.AhwBna, "1y", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetsValuationPeriod[] $values() {
        return new AssetsValuationPeriod[]{ONE_DAY, ONE_WEEK, ONE_MONTH, SIX_MONTHS, ONE_YEAR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetsValuationPeriod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiType() {
        return this.apiType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChartTitle() {
        return this.chartTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingValue() {
        return this.eventTrackingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPnlTitle() {
        return this.pnlTitle;
    }

    private AssetsValuationPeriod(@StringRes String str, @StringRes int i, int i2, int i3, String str2, int i4) {
        this.pnlTitle = i2;
        this.chartTitle = i3;
        this.eventTrackingValue = str2;
        this.apiType = i4;
    }

    static {
        AssetsValuationPeriod[] assetsValuationPeriodArr$values = $values();
        $VALUES = assetsValuationPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetsValuationPeriodArr$values);
        Companion = new Activity(null);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.api.model.AssetsValuationPeriod.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static AssetsValuationPeriod valueOf(String str) {
        return (AssetsValuationPeriod) Enum.valueOf(AssetsValuationPeriod.class, str);
    }

    public static AssetsValuationPeriod[] values() {
        return (AssetsValuationPeriod[]) $VALUES.clone();
    }
}
