package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.yHO;

/* JADX INFO: loaded from: classes17.dex */
public final class DcaOngoingFragment$initViewModel$1 extends SuspendLambda implements yHO<vNB<? extends StrategyPositionResponse>, vNB<? extends List<? extends TradeListResp>>, Continuation<? super Pair<? extends vNB<? extends StrategyPositionResponse>, ? extends vNB<? extends List<? extends TradeListResp>>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaOngoingFragment$initViewModel$1(Continuation<? super DcaOngoingFragment$initViewModel$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends StrategyPositionResponse> vnb, vNB<? extends List<? extends TradeListResp>> vnb2, Continuation<? super Pair<? extends vNB<? extends StrategyPositionResponse>, ? extends vNB<? extends List<? extends TradeListResp>>>> continuation) {
        return invoke2((vNB<StrategyPositionResponse>) vnb, (vNB<? extends List<TradeListResp>>) vnb2, (Continuation<? super Pair<? extends vNB<StrategyPositionResponse>, ? extends vNB<? extends List<TradeListResp>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<StrategyPositionResponse> vnb, vNB<? extends List<TradeListResp>> vnb2, Continuation<? super Pair<? extends vNB<StrategyPositionResponse>, ? extends vNB<? extends List<TradeListResp>>>> continuation) {
        DcaOngoingFragment$initViewModel$1 dcaOngoingFragment$initViewModel$1 = new DcaOngoingFragment$initViewModel$1(continuation);
        dcaOngoingFragment$initViewModel$1.L$0 = vnb;
        dcaOngoingFragment$initViewModel$1.L$1 = vnb2;
        return dcaOngoingFragment$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((vNB) this.L$0, (vNB) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
