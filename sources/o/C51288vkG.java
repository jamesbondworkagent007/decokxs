package o;

import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.strategy.bean.StrategyItemData;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.xKK;

/* JADX INFO: renamed from: o.vkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51288vkG extends AbstractC51282vkA {
    public StrategyPendingListResp AEQbTJ;
    public final C56258xzS OLrzqt = new C56258xzS();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StrategyPendingListResp strategyPendingListResp) {
        this.AEQbTJ = strategyPendingListResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56258xzS isConnected() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC51282vkA
    public void AkhnZx() {
        C56258xzS c56258xzS = this.OLrzqt;
        StrategyPendingListReq strategyPendingListReq = new StrategyPendingListReq();
        strategyPendingListReq.setAlgoId(KWHzl());
        strategyPendingListReq.setOrdType("recurring");
        c56258xzS.KWHzl(strategyPendingListReq);
        c56258xzS.OLrzqt(AEQbTJ(), new TaskDescription());
        xKK.Activity.execute$default(c56258xzS, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkG$TaskDescription */
    public static final class TaskDescription implements InterfaceC54501xKt<java.util.List<? extends StrategyPendingListResp>, StrategyItemData> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StrategyItemData KWHzl(java.util.List<StrategyPendingListResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C51288vkG.this.copydefault((StrategyPendingListResp) CollectionsKt___CollectionsKt.firstOrNull(list));
            StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (strategyPendingListResp != null) {
                return new StrategyItemData(strategyPendingListResp.getOrdType(), C56033xvF.uzCIH(strategyPendingListResp.getOrdType()), Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "canceled") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "order_failed") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "stopped"), strategyPendingListResp.getAlgoId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getState(), strategyPendingListResp.getCancelType(), "", strategyPendingListResp.getTradeNum(), strategyPendingListResp.getCopyType());
            }
            return null;
        }
    }

    @Override // o.AbstractC51282vkA
    public java.lang.String OLrzqt() {
        BotVo bot;
        RecurringBuyDto recurring;
        StrategyPendingListResp strategyPendingListResp;
        java.lang.String recNextInvestTime;
        java.lang.String strCopydefault;
        StrategyPendingListResp strategyPendingListResp2 = this.AEQbTJ;
        if (strategyPendingListResp2 != null && (bot = strategyPendingListResp2.getBot()) != null && (recurring = bot.getRecurring()) != null) {
            java.lang.Integer recurringTimeType = recurring.getRecurringTimeType();
            int orderParamCode = FirstTimeBuyOption.BUY_NOW.getOrderParamCode();
            if (recurringTimeType != null && recurringTimeType.intValue() == orderParamCode) {
                return C33070mpX.AYXKKw(C48033uCm.Fragment.aCSzUz);
            }
            int orderParamCode2 = FirstTimeBuyOption.BUY_CUSTOM.getOrderParamCode();
            if (recurringTimeType != null && recurringTimeType.intValue() == orderParamCode2 && (strategyPendingListResp = this.AEQbTJ) != null && (recNextInvestTime = strategyPendingListResp.getRecNextInvestTime()) != null && (strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.DPHOMC, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", C56046xvS.AEQbTJ.copydefault(recNextInvestTime))))) != null) {
                return strCopydefault;
            }
        }
        return "";
    }

    @Override // o.AbstractC51282vkA
    public int EZpvd() {
        return C33070mpX.copydefault(C52761wXj.Activity.Dmq);
    }

    @Override // o.AbstractC51282vkA
    public java.util.ArrayList<xKK> djBIcL() {
        java.util.ArrayList<xKK> arrayList = new java.util.ArrayList<>();
        arrayList.add(this.OLrzqt);
        return arrayList;
    }
}
