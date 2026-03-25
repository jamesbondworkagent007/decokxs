package com.okinc.tradingbot.impl.order.strategy.ordercomfirm;

import com.okinc.tradingbot.impl.dto.MarginUsage;
import com.okinc.unify_trade.biz.Distribution;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C55688xof;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.vNB;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderConfirmFragment$observeGridHoldingDistribution$1 extends SuspendLambda implements Function2<vNB<? extends List<? extends MarginUsage>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotOrderConfirmFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderConfirmFragment$observeGridHoldingDistribution$1(BotOrderConfirmFragment botOrderConfirmFragment, Continuation<? super BotOrderConfirmFragment$observeGridHoldingDistribution$1> continuation) {
        super(2, continuation);
        this.this$0 = botOrderConfirmFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotOrderConfirmFragment$observeGridHoldingDistribution$1 botOrderConfirmFragment$observeGridHoldingDistribution$1 = new BotOrderConfirmFragment$observeGridHoldingDistribution$1(this.this$0, continuation);
        botOrderConfirmFragment$observeGridHoldingDistribution$1.L$0 = obj;
        return botOrderConfirmFragment$observeGridHoldingDistribution$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends List<? extends MarginUsage>> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<? extends List<MarginUsage>>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<? extends List<MarginUsage>> vnb, Continuation<? super Unit> continuation) {
        return ((BotOrderConfirmFragment$observeGridHoldingDistribution$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) ((vNB) this.L$0).KWHzl();
            if (list != null) {
                BotOrderConfirmFragment botOrderConfirmFragment = this.this$0;
                MarginUsage marginUsage = (MarginUsage) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (marginUsage != null) {
                    botOrderConfirmFragment.values().AYXKKw.setText(BotOrderConfirmFragment.getSingleGridAmt$default(botOrderConfirmFragment, botOrderConfirmFragment.OLrzqt().KWHzl(), botOrderConfirmFragment.OLrzqt().EZpvd(), marginUsage.getEstOpenedPositions(), null, 8, null));
                    botOrderConfirmFragment.EZpvd((List<Distribution>) yDY.copydefault(new Distribution(C33069mpW.copydefault(C55688xof.Application.QMuEJi, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", ""))), marginUsage.getOpenPositionRatio()), new Distribution(C33069mpW.copydefault(C55688xof.Application.config, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", ""))), marginUsage.getPendingOrderRatio()), new Distribution(C33069mpW.copydefault(C55688xof.Application.fhUrPt, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", ""))), marginUsage.getReservedMarginRatio())), true);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
