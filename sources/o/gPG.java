package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gPG extends AbstractC19793gPn {
    @Override // o.InterfaceC19785gPf
    public ReminderTierType AEQbTJ() {
        return ReminderTierType.AccountStatus;
    }

    @Override // o.AbstractC19793gPn
    public java.util.List<C19782gPc> KWHzl() {
        ReminderTierType reminderTierType = ReminderTierType.AccountStatus;
        return yDY.gEmmrt(new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.SANeedUpgrade), new Function1() { // from class: o.gPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPG.fetchVPNInfo((C19783gPd) obj);
            }
        }, new Function1() { // from class: o.gPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(gPG.AYXKKw((C19783gPd) obj));
            }
        }), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.SAOrderExceedsValidity), new Function1() { // from class: o.gPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPG.AkhnZx((C19783gPd) obj);
            }
        }, new Function1() { // from class: o.gPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(gPG.valueOf((C19783gPd) obj));
            }
        }), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.SAExpiringSoon), new Function1() { // from class: o.gPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPG.AhwBna((C19783gPd) obj);
            }
        }, new Function1() { // from class: o.gPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(gPG.DbNXlk((C19783gPd) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType fetchVPNInfo(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        InterfaceC9738bbJ interfaceC9738bbJIwGUEr = c19783gPd.iwGUEr();
        if (interfaceC9738bbJIwGUEr == null || !interfaceC9738bbJIwGUEr.RJOkX()) {
            return TradeReminderType.None;
        }
        TradeReminderType tradeReminderTypeAEQbTJ = c19783gPd.isConnected().AEQbTJ(c19783gPd.isConnected().KWHzl(c19783gPd.KWHzl().getChainId()), c19783gPd.KWHzl().getChainId());
        if (tradeReminderTypeAEQbTJ != null) {
            if (tradeReminderTypeAEQbTJ != TradeReminderType.SANeedUpgrade) {
                tradeReminderTypeAEQbTJ = null;
            }
            if (tradeReminderTypeAEQbTJ != null) {
                return tradeReminderTypeAEQbTJ;
            }
        }
        return TradeReminderType.None;
    }

    public static final boolean AYXKKw(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        return c19783gPd.DbNXlk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType AkhnZx(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        java.lang.Long lDjBIcL = c19783gPd.djBIcL();
        if (lDjBIcL == null) {
            return TradeReminderType.None;
        }
        long jLongValue = lDjBIcL.longValue();
        long jOLrzqt = c19783gPd.isConnected().OLrzqt();
        boolean zKWHzl = c19783gPd.isConnected().KWHzl();
        if (jLongValue >= jOLrzqt && !zKWHzl) {
            return TradeReminderType.SAOrderExceedsValidity;
        }
        return TradeReminderType.None;
    }

    public static final boolean valueOf(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        return c19783gPd.DbNXlk();
    }

    public static final TradeReminderType AhwBna(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if (c19783gPd.DbNXlk()) {
            if (c19783gPd.isConnected().KWHzl()) {
                return TradeReminderType.None;
            }
            TradeReminderType tradeReminderTypeEZpvd = c19783gPd.isConnected().EZpvd(c19783gPd.isConnected().KWHzl(c19783gPd.KWHzl().getChainId()));
            return tradeReminderTypeEZpvd == null ? TradeReminderType.None : tradeReminderTypeEZpvd;
        }
        return TradeReminderType.None;
    }

    public static final boolean DbNXlk(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        return c19783gPd.DbNXlk();
    }
}
