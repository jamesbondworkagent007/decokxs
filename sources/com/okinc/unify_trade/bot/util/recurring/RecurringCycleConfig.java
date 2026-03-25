package com.okinc.unify_trade.bot.util.recurring;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class RecurringCycleConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringCycleConfig[] $VALUES;
    public static final StateListAnimator Companion;
    private final int index;
    private final String period;
    private final int title;
    public static final RecurringCycleConfig HOUR = new RecurringCycleConfig("HOUR", 0, 0, "hourly", C55688xof.Application.UkvvWh);
    public static final RecurringCycleConfig DAY = new RecurringCycleConfig("DAY", 1, 1, "daily", C55688xof.Application.setActive);
    public static final RecurringCycleConfig WEEK = new RecurringCycleConfig("WEEK", 2, 2, "weekly", C55688xof.Application.PlaybackStateCompatShuffleMode);
    public static final RecurringCycleConfig MONTH = new RecurringCycleConfig("MONTH", 3, 3, "monthly", C55688xof.Application.mask);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringCycleConfig[] $values() {
        return new RecurringCycleConfig[]{HOUR, DAY, WEEK, MONTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringCycleConfig> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private RecurringCycleConfig(String str, int i, int i2, String str2, int i3) {
        this.index = i2;
        this.period = str2;
        this.title = i3;
    }

    static {
        RecurringCycleConfig[] recurringCycleConfigArr$values = $values();
        $VALUES = recurringCycleConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringCycleConfigArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfig.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String EZpvd(@NotNull String str) {
            RecurringCycleConfig next;
            String strAYXKKw;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<RecurringCycleConfig> it = RecurringCycleConfig.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getPeriod(), (Object) str)) {
                    break;
                }
            }
            RecurringCycleConfig recurringCycleConfig = next;
            return (recurringCycleConfig == null || (strAYXKKw = C33070mpX.AYXKKw(recurringCycleConfig.getTitle())) == null) ? C33070mpX.AYXKKw(C55688xof.Application.UkvvWh) : strAYXKKw;
        }
    }

    public static RecurringCycleConfig valueOf(String str) {
        return (RecurringCycleConfig) Enum.valueOf(RecurringCycleConfig.class, str);
    }

    public static RecurringCycleConfig[] values() {
        return (RecurringCycleConfig[]) $VALUES.clone();
    }
}
