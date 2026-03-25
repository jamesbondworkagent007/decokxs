package com.okinc.business.dexui.main.limitorder;

import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentFragment$addDataListener$34$1$2$1 extends SuspendLambda implements Function2<TradeStep, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderContentFragment$addDataListener$34$1$2$1(Continuation<? super LimitOrderContentFragment$addDataListener$34$1$2$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LimitOrderContentFragment$addDataListener$34$1$2$1 limitOrderContentFragment$addDataListener$34$1$2$1 = new LimitOrderContentFragment$addDataListener$34$1$2$1(continuation);
        limitOrderContentFragment$addDataListener$34$1$2$1.L$0 = obj;
        return limitOrderContentFragment$addDataListener$34$1$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TradeStep tradeStep, Continuation<? super Boolean> continuation) {
        return ((LimitOrderContentFragment$addDataListener$34$1$2$1) create(tradeStep, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(Intrinsics.EZpvd((TradeStep) this.L$0, new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
