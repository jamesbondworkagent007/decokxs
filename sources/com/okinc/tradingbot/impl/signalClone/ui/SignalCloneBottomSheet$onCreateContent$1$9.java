package com.okinc.tradingbot.impl.signalClone.ui;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C53739wrF;
import o.C53740wrG;
import o.C56391yDq;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$9 extends SuspendLambda implements Function2<uLU<? extends C53740wrG>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$9(SignalCloneBottomSheet signalCloneBottomSheet, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$9> continuation) {
        super(2, continuation);
        this.this$0 = signalCloneBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneBottomSheet$onCreateContent$1$9 signalCloneBottomSheet$onCreateContent$1$9 = new SignalCloneBottomSheet$onCreateContent$1$9(this.this$0, continuation);
        signalCloneBottomSheet$onCreateContent$1$9.L$0 = obj;
        return signalCloneBottomSheet$onCreateContent$1$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(uLU<? extends C53740wrG> ulu, Continuation<? super Unit> continuation) {
        return invoke2((uLU<C53740wrG>) ulu, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(uLU<C53740wrG> ulu, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$9) create(ulu, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyDetailsResponse strategyDetailsResponseOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            uLU ulu = (uLU) this.L$0;
            if (ulu instanceof uLU.ActionBar) {
                C53739wrF c53739wrFKWHzl = this.this$0.AYXKKw().copydefault().getValue().KWHzl();
                if (c53739wrFKWHzl != null && (strategyDetailsResponseOLrzqt = c53739wrFKWHzl.OLrzqt()) != null) {
                    this.this$0.copydefault((C53740wrG) ((uLU.ActionBar) ulu).KWHzl(), strategyDetailsResponseOLrzqt);
                } else {
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
