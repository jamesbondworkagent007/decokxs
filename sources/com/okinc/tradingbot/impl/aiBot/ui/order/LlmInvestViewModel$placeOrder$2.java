package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestViewModel;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TwapReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C53735wrB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmInvestViewModel$placeOrder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LlmInvestViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmInvestViewModel$placeOrder$2(LlmInvestViewModel llmInvestViewModel, Continuation<? super LlmInvestViewModel$placeOrder$2> continuation) {
        super(2, continuation);
        this.this$0 = llmInvestViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LlmInvestViewModel$placeOrder$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmInvestViewModel$placeOrder$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53735wrB c53735wrB = this.this$0.DbNXlk;
            C53735wrB.TaskDescription taskDescription = new C53735wrB.TaskDescription(new StrategyReqGroup(new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, "ai_bot", (TradeType) null, (String) null, (Boolean) null, 1919, (DefaultConstructorMarker) null), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, this.this$0.copydefault, 16382, (DefaultConstructorMarker) null));
            this.label = 1;
            objKWHzl = c53735wrB.KWHzl(taskDescription, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        this.this$0.EZpvd(new LlmInvestViewModel.ActionBar.C0635ActionBar(((C53735wrB.ActionBar) objKWHzl).KWHzl()));
        return Unit.INSTANCE;
    }
}
