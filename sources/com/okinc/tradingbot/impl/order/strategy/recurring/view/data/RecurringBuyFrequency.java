package com.okinc.tradingbot.impl.order.strategy.recurring.view.data;

import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTB;
import o.pTD;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyFrequency {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringBuyFrequency[] $VALUES;
    public static final Activity Companion;
    public static final RecurringBuyFrequency DAILY;
    public static final RecurringBuyFrequency HOUR_1;
    public static final RecurringBuyFrequency HOUR_12;
    public static final RecurringBuyFrequency HOUR_4;
    public static final RecurringBuyFrequency HOUR_8;
    public static final RecurringBuyFrequency MONTHLY;
    public static final RecurringBuyFrequency WEEKLY;
    private final String period;
    private final int periodIndex;
    private final String recurringHour;
    private final int subPeriodIndex;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyFrequency.values().length];
            try {
                iArr[RecurringBuyFrequency.HOUR_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyFrequency.HOUR_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringBuyFrequency.HOUR_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringBuyFrequency.HOUR_12.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RecurringBuyFrequency.DAILY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RecurringBuyFrequency.WEEKLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RecurringBuyFrequency.MONTHLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringBuyFrequency[] $values() {
        return new RecurringBuyFrequency[]{HOUR_1, HOUR_4, HOUR_8, HOUR_12, DAILY, WEEKLY, MONTHLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringBuyFrequency> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPeriodIndex() {
        return this.periodIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringHour() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubPeriodIndex() {
        return this.subPeriodIndex;
    }

    private RecurringBuyFrequency(String str, int i, String str2, String str3, int i2, int i3) {
        this.period = str2;
        this.recurringHour = str3;
        this.periodIndex = i2;
        this.subPeriodIndex = i3;
    }

    static {
        RecurringCycleConfigNew recurringCycleConfigNew = RecurringCycleConfigNew.HOUR;
        HOUR_1 = new RecurringBuyFrequency("HOUR_1", 0, "hourly", "1", recurringCycleConfigNew.getIndex(), 0);
        HOUR_4 = new RecurringBuyFrequency("HOUR_4", 1, "hourly", "4", recurringCycleConfigNew.getIndex(), 1);
        HOUR_8 = new RecurringBuyFrequency("HOUR_8", 2, "hourly", "8", recurringCycleConfigNew.getIndex(), 2);
        HOUR_12 = new RecurringBuyFrequency("HOUR_12", 3, "hourly", "12", recurringCycleConfigNew.getIndex(), 3);
        DAILY = new RecurringBuyFrequency("DAILY", 4, "daily", "", RecurringCycleConfigNew.DAY.getIndex(), 0);
        WEEKLY = new RecurringBuyFrequency("WEEKLY", 5, "weekly", "", RecurringCycleConfigNew.WEEK.getIndex(), 0);
        MONTHLY = new RecurringBuyFrequency("MONTHLY", 6, "monthly", "", RecurringCycleConfigNew.MONTH.getIndex(), 0);
        RecurringBuyFrequency[] recurringBuyFrequencyArr$values = $values();
        $VALUES = recurringBuyFrequencyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringBuyFrequencyArr$values);
        Companion = new Activity(null);
    }

    public final String getDisplayString() {
        switch (StateListAnimator.EZpvd[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(this.recurringHour), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(this.recurringHour, null, 1, null))));
            case 5:
                return C33070mpX.AYXKKw(C55688xof.Application.setActive);
            case 6:
                return C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatShuffleMode);
            case 7:
                return C33070mpX.AYXKKw(C55688xof.Application.mask);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isHourlyFrequency() {
        return yDY.gEmmrt(HOUR_1, HOUR_4, HOUR_8, HOUR_12).contains(this);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final List<RecurringBuyFrequency> EZpvd() {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(RecurringBuyFrequency.getEntries());
        }

        public final RecurringBuyFrequency copydefault(@NotNull String str, @NotNull String str2) {
            RecurringBuyFrequency next;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Iterator<RecurringBuyFrequency> it = RecurringBuyFrequency.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RecurringBuyFrequency recurringBuyFrequency = next;
                if (Intrinsics.EZpvd((Object) recurringBuyFrequency.getPeriod(), (Object) str) && (!Intrinsics.EZpvd((Object) recurringBuyFrequency.getPeriod(), (Object) "hourly") || Intrinsics.EZpvd((Object) recurringBuyFrequency.getRecurringHour(), (Object) str2))) {
                    break;
                }
            }
            RecurringBuyFrequency recurringBuyFrequency2 = next;
            return recurringBuyFrequency2 == null ? RecurringBuyFrequency.DAILY : recurringBuyFrequency2;
        }

        public final RecurringBuyFrequency AEQbTJ(int i, int i2) {
            RecurringBuyFrequency next;
            if (i != RecurringCycleConfigNew.HOUR.getIndex()) {
                return i == RecurringCycleConfigNew.DAY.getIndex() ? RecurringBuyFrequency.DAILY : i == RecurringCycleConfigNew.WEEK.getIndex() ? RecurringBuyFrequency.WEEKLY : i == RecurringCycleConfigNew.MONTH.getIndex() ? RecurringBuyFrequency.MONTHLY : RecurringBuyFrequency.DAILY;
            }
            Iterator<RecurringBuyFrequency> it = RecurringBuyFrequency.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RecurringBuyFrequency recurringBuyFrequency = next;
                if (recurringBuyFrequency.getPeriodIndex() == i && recurringBuyFrequency.getSubPeriodIndex() == i2) {
                    break;
                }
            }
            RecurringBuyFrequency recurringBuyFrequency2 = next;
            return recurringBuyFrequency2 == null ? RecurringBuyFrequency.HOUR_1 : recurringBuyFrequency2;
        }

        public final int copydefault() {
            return new GregorianCalendar().getTimeZone().getOffset(System.currentTimeMillis()) / 3600000;
        }
    }

    public static RecurringBuyFrequency valueOf(String str) {
        return (RecurringBuyFrequency) Enum.valueOf(RecurringBuyFrequency.class, str);
    }

    public static RecurringBuyFrequency[] values() {
        return (RecurringBuyFrequency[]) $VALUES.clone();
    }
}
