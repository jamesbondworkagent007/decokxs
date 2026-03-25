package com.okinc.unify_trade.bot.util.recurring;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class RecurringWeekConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringWeekConfig[] $VALUES;
    public static final Activity Companion;
    private final int index;
    private final int title;
    public static final RecurringWeekConfig MON = new RecurringWeekConfig("MON", 0, 1, C55688xof.Application.onStateChanged);
    public static final RecurringWeekConfig TUE = new RecurringWeekConfig("TUE", 1, 2, C55688xof.Application.ActivityViewModelLazyKtviewModels2);
    public static final RecurringWeekConfig WED = new RecurringWeekConfig("WED", 2, 3, C55688xof.Application.PlaybackStateCompatApi21);
    public static final RecurringWeekConfig THUR = new RecurringWeekConfig("THUR", 3, 4, C55688xof.Application.IMediaSession);
    public static final RecurringWeekConfig FRI = new RecurringWeekConfig("FRI", 4, 5, C55688xof.Application.PlaybackStateCompatMediaKeyAction);
    public static final RecurringWeekConfig STA = new RecurringWeekConfig("STA", 5, 6, C55688xof.Application.target);
    public static final RecurringWeekConfig SUN = new RecurringWeekConfig("SUN", 6, 7, C55688xof.Application.setActions);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringWeekConfig[] $values() {
        return new RecurringWeekConfig[]{MON, TUE, WED, THUR, FRI, STA, SUN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringWeekConfig> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private RecurringWeekConfig(String str, int i, int i2, int i3) {
        this.index = i2;
        this.title = i3;
    }

    static {
        RecurringWeekConfig[] recurringWeekConfigArr$values = $values();
        $VALUES = recurringWeekConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringWeekConfigArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String OLrzqt(int i) {
            RecurringWeekConfig recurringWeekConfig;
            String strAYXKKw;
            RecurringWeekConfig[] recurringWeekConfigArrValues = RecurringWeekConfig.values();
            int length = recurringWeekConfigArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    recurringWeekConfig = null;
                    break;
                }
                recurringWeekConfig = recurringWeekConfigArrValues[i2];
                if (C33129mqd.OLrzqt(Integer.valueOf(recurringWeekConfig.getIndex()), Integer.valueOf(i))) {
                    break;
                }
                i2++;
            }
            return (recurringWeekConfig == null || (strAYXKKw = C33070mpX.AYXKKw(recurringWeekConfig.getTitle())) == null) ? "" : strAYXKKw;
        }
    }

    public static RecurringWeekConfig valueOf(String str) {
        return (RecurringWeekConfig) Enum.valueOf(RecurringWeekConfig.class, str);
    }

    public static RecurringWeekConfig[] values() {
        return (RecurringWeekConfig[]) $VALUES.clone();
    }
}
