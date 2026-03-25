package com.okinc.unify_trade.bot.market_place.userpage.bean;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class LeadPnlRange {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LeadPnlRange[] $VALUES;
    public static final Activity Companion;
    private final String code;
    private final int titleRes;
    private final String trackValue;
    public static final LeadPnlRange DAY7 = new LeadPnlRange("DAY7", 0, C55688xof.Application.OcIXYQ, "7d", "all");
    public static final LeadPnlRange DAY30 = new LeadPnlRange("DAY30", 1, C55688xof.Application.ORxRYg, "30d", "week");
    public static final LeadPnlRange ALL = new LeadPnlRange("ALL", 2, C55688xof.Application.QezThh, "all", "month");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LeadPnlRange[] $values() {
        return new LeadPnlRange[]{DAY7, DAY30, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LeadPnlRange> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackValue() {
        return this.trackValue;
    }

    private LeadPnlRange(@StringRes String str, int i, int i2, String str2, String str3) {
        this.titleRes = i2;
        this.code = str2;
        this.trackValue = str3;
    }

    static {
        LeadPnlRange[] leadPnlRangeArr$values = $values();
        $VALUES = leadPnlRangeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(leadPnlRangeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.market_place.userpage.bean.LeadPnlRange.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static LeadPnlRange valueOf(String str) {
        return (LeadPnlRange) Enum.valueOf(LeadPnlRange.class, str);
    }

    public static LeadPnlRange[] values() {
        return (LeadPnlRange[]) $VALUES.clone();
    }
}
