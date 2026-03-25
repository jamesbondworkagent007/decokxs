package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ChartPeriod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartPeriod[] $VALUES;
    public static final ActionBar Companion;
    public static final ChartPeriod Days90;
    private static final ChartPeriod Default;
    public static final ChartPeriod Year1;
    private final int days;
    public static final ChartPeriod Days7 = new ChartPeriod("Days7", 0, 7);
    public static final ChartPeriod Days30 = new ChartPeriod("Days30", 1, 30);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartPeriod[] $values() {
        return new ChartPeriod[]{Days7, Days30, Days90, Year1};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartPeriod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDays() {
        return this.days;
    }

    private ChartPeriod(String str, int i, int i2) {
        this.days = i2;
    }

    static {
        ChartPeriod chartPeriod = new ChartPeriod("Days90", 2, 90);
        Days90 = chartPeriod;
        Year1 = new ChartPeriod("Year1", 3, 365);
        ChartPeriod[] chartPeriodArr$values = $values();
        $VALUES = chartPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartPeriodArr$values);
        Companion = new ActionBar(null);
        Default = chartPeriod;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.ChartPeriod.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ChartPeriod KWHzl() {
            return ChartPeriod.Default;
        }
    }

    public static ChartPeriod valueOf(String str) {
        return (ChartPeriod) Enum.valueOf(ChartPeriod.class, str);
    }

    public static ChartPeriod[] values() {
        return (ChartPeriod[]) $VALUES.clone();
    }
}
