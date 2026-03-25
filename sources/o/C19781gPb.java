package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19781gPb {
    public final java.util.List<TradeReminderType> AEQbTJ;
    public final ReminderTierType EZpvd;
    public final TradeReminderType KWHzl;
    public final java.util.List<TradeReminderType> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gPb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C19781gPb copy$default(C19781gPb c19781gPb, ReminderTierType reminderTierType, java.util.List list, java.util.List list2, TradeReminderType tradeReminderType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            reminderTierType = c19781gPb.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c19781gPb.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list2 = c19781gPb.OLrzqt;
        }
        if ((i & 8) != 0) {
            tradeReminderType = c19781gPb.KWHzl;
        }
        return c19781gPb.KWHzl(reminderTierType, list, list2, tradeReminderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeReminderType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19781gPb KWHzl(@NotNull ReminderTierType reminderTierType, @NotNull java.util.List<? extends TradeReminderType> list, @NotNull java.util.List<? extends TradeReminderType> list2, TradeReminderType tradeReminderType) {
        Intrinsics.checkNotNullParameter(reminderTierType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C19781gPb(reminderTierType, list, list2, tradeReminderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TradeReminderType> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19781gPb)) {
            return false;
        }
        C19781gPb c19781gPb = (C19781gPb) obj;
        return this.EZpvd == c19781gPb.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c19781gPb.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c19781gPb.OLrzqt) && this.KWHzl == c19781gPb.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        TradeReminderType tradeReminderType = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tradeReminderType == null ? 0 : tradeReminderType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReminderResult(tier=" + this.EZpvd + ", reminderTypes=" + this.AEQbTJ + ", sortedReminderTypes=" + this.OLrzqt + ", topReminderType=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.business.dex.trade.common.reminder.TradeReminderType> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19781gPb(@NotNull ReminderTierType reminderTierType, @NotNull java.util.List<? extends TradeReminderType> list, @NotNull java.util.List<? extends TradeReminderType> list2, TradeReminderType tradeReminderType) {
        Intrinsics.checkNotNullParameter(reminderTierType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = reminderTierType;
        this.AEQbTJ = list;
        this.OLrzqt = list2;
        this.KWHzl = tradeReminderType;
    }

    public final boolean KWHzl() {
        return !this.AEQbTJ.isEmpty();
    }
}
