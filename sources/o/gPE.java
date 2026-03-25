package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gPE extends AbstractC19793gPn {
    @Override // o.InterfaceC19785gPf
    public ReminderTierType AEQbTJ() {
        return ReminderTierType.TradeRisk;
    }

    @Override // o.AbstractC19793gPn
    public java.util.List<C19782gPc> KWHzl() {
        ReminderTierType reminderTierType = ReminderTierType.TradeRisk;
        return yDY.gEmmrt(new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.QuoteValueDiffExceeded), new Function1() { // from class: o.gPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPE.KWHzl((C19783gPd) obj);
            }
        }, null, 8, null), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.NoLiquidityForOKXWarning), new Function1() { // from class: o.gPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPE.copydefault((C19783gPd) obj);
            }
        }, null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType KWHzl(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default = gOL.checkQuoteResponse$OKDex_dex_impl$default(gOL.EZpvd, c19783gPd.fetchVPNInfo(), c19783gPd.KWHzl(), c19783gPd.copydefault(), c19783gPd.values(), c19783gPd.hDKMBd(), false, 32, null);
        return tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default == TradeReminderType.QuoteValueDiffExceeded ? tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default : TradeReminderType.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType copydefault(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default = gOL.checkQuoteResponse$OKDex_dex_impl$default(gOL.EZpvd, c19783gPd.fetchVPNInfo(), c19783gPd.KWHzl(), c19783gPd.copydefault(), c19783gPd.values(), c19783gPd.hDKMBd(), false, 32, null);
        return tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default == TradeReminderType.NoLiquidityForOKXWarning ? tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default : TradeReminderType.None;
    }
}
