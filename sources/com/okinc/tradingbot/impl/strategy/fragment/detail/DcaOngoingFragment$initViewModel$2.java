package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52179wBv;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes17.dex */
public final class DcaOngoingFragment$initViewModel$2 extends SuspendLambda implements Function2<Pair<? extends vNB<? extends StrategyPositionResponse>, ? extends vNB<? extends List<? extends TradeListResp>>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52179wBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaOngoingFragment$initViewModel$2(C52179wBv c52179wBv, Continuation<? super DcaOngoingFragment$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = c52179wBv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DcaOngoingFragment$initViewModel$2 dcaOngoingFragment$initViewModel$2 = new DcaOngoingFragment$initViewModel$2(this.this$0, continuation);
        dcaOngoingFragment$initViewModel$2.L$0 = obj;
        return dcaOngoingFragment$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends vNB<? extends StrategyPositionResponse>, ? extends vNB<? extends List<? extends TradeListResp>>> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<? extends vNB<StrategyPositionResponse>, ? extends vNB<? extends List<TradeListResp>>>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends vNB<StrategyPositionResponse>, ? extends vNB<? extends List<TradeListResp>>> pair, Continuation<? super Unit> continuation) {
        return ((DcaOngoingFragment$initViewModel$2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            vNB vnb = (vNB) pair.component1();
            vNB vnb2 = (vNB) pair.component2();
            if (vnb2 instanceof vNB.Activity) {
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd((vNB<StrategyPositionResponse>) vnb, (vNB<? extends List<TradeListResp>>) vnb2);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
