package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gPn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19793gPn implements InterfaceC19785gPf {
    public abstract java.util.List<C19782gPc> KWHzl();

    @Override // o.InterfaceC19785gPf
    public C19781gPb OLrzqt(@NotNull C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        ReminderTierType reminderTierTypeAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C19782gPc c19782gPc : KWHzl()) {
            TradeReminderType tradeReminderTypeKWHzl = c19782gPc.KWHzl(c19783gPd);
            if (tradeReminderTypeKWHzl != TradeReminderType.None && c19782gPc.KWHzl().contains(tradeReminderTypeKWHzl) && c19782gPc.copydefault() == reminderTierTypeAEQbTJ) {
                arrayList.add(tradeReminderTypeKWHzl);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator());
        return new C19781gPb(reminderTierTypeAEQbTJ, arrayList, listEZpvd, (TradeReminderType) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd));
    }

    public final int copydefault(TradeReminderType tradeReminderType) {
        java.util.Iterator<T> it = KWHzl().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C19782gPc) it.next()).KWHzl().contains(tradeReminderType)) {
                return i;
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }

    public final C19781gPb EZpvd(@NotNull ReminderTierType reminderTierType) {
        Intrinsics.checkNotNullParameter(reminderTierType, "");
        return new C19781gPb(reminderTierType, yDY.AhwBna(), yDY.AhwBna(), null);
    }

    /* JADX INFO: renamed from: o.gPn$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(AbstractC19793gPn.this.copydefault((TradeReminderType) t)), java.lang.Integer.valueOf(AbstractC19793gPn.this.copydefault((TradeReminderType) t2)));
        }
    }
}
