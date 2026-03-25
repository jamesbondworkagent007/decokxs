package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19782gPc {
    public final ReminderTierType AEQbTJ;
    public final java.util.List<TradeReminderType> EZpvd;
    public final Function1<C19783gPd, java.lang.Boolean> KWHzl;
    public final Function1<C19783gPd, TradeReminderType> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gPc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C19782gPc copy$default(C19782gPc c19782gPc, ReminderTierType reminderTierType, java.util.List list, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            reminderTierType = c19782gPc.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c19782gPc.EZpvd;
        }
        if ((i & 4) != 0) {
            function1 = c19782gPc.OLrzqt;
        }
        if ((i & 8) != 0) {
            function12 = c19782gPc.KWHzl;
        }
        return c19782gPc.EZpvd(reminderTierType, list, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19782gPc EZpvd(@NotNull ReminderTierType reminderTierType, @NotNull java.util.List<? extends TradeReminderType> list, @NotNull Function1<? super C19783gPd, ? extends TradeReminderType> function1, Function1<? super C19783gPd, java.lang.Boolean> function12) {
        Intrinsics.checkNotNullParameter(reminderTierType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C19782gPc(reminderTierType, list, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TradeReminderType> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderTierType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19782gPc)) {
            return false;
        }
        C19782gPc c19782gPc = (C19782gPc) obj;
        return this.AEQbTJ == c19782gPc.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c19782gPc.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c19782gPc.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c19782gPc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        Function1<C19783gPd, java.lang.Boolean> function1 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReminderConfig(tier=" + this.AEQbTJ + ", possibleTypes=" + this.EZpvd + ", check=" + this.OLrzqt + ", condition=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.gPd, ? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.gPd, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19782gPc(@NotNull ReminderTierType reminderTierType, @NotNull java.util.List<? extends TradeReminderType> list, @NotNull Function1<? super C19783gPd, ? extends TradeReminderType> function1, Function1<? super C19783gPd, java.lang.Boolean> function12) {
        Intrinsics.checkNotNullParameter(reminderTierType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = reminderTierType;
        this.EZpvd = list;
        this.OLrzqt = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.dex.trade.common.reminder.data.ReminderTierType)
  (r2v0 java.util.List)
  (r3v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
 A[MD:(com.okinc.business.dex.trade.common.reminder.data.ReminderTierType, java.util.List<? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType>, kotlin.jvm.functions.Function1<? super o.gPd, ? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType>, kotlin.jvm.functions.Function1<? super o.gPd, java.lang.Boolean>):void (m)] (LINE:12) call: o.gPc.<init>(com.okinc.business.dex.trade.common.reminder.data.ReminderTierType, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C19782gPc(ReminderTierType reminderTierType, java.util.List list, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reminderTierType, list, function1, (i & 8) != 0 ? null : function12);
    }

    public final TradeReminderType KWHzl(@NotNull C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        Function1<C19783gPd, java.lang.Boolean> function1 = this.KWHzl;
        if (function1 != null && !function1.invoke(c19783gPd).booleanValue()) {
            return TradeReminderType.None;
        }
        return this.OLrzqt.invoke(c19783gPd);
    }
}
