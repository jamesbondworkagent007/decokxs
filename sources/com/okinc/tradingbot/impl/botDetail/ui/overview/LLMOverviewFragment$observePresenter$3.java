package com.okinc.tradingbot.impl.botDetail.ui.overview;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48208uIz;
import o.C48227uJr;
import o.C48496uTo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LLMOverviewFragment$observePresenter$3 extends SuspendLambda implements Function2<C48208uIz.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48227uJr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLMOverviewFragment$observePresenter$3(C48227uJr c48227uJr, Continuation<? super LLMOverviewFragment$observePresenter$3> continuation) {
        super(2, continuation);
        this.this$0 = c48227uJr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LLMOverviewFragment$observePresenter$3 lLMOverviewFragment$observePresenter$3 = new LLMOverviewFragment$observePresenter$3(this.this$0, continuation);
        lLMOverviewFragment$observePresenter$3.L$0 = obj;
        return lLMOverviewFragment$observePresenter$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C48208uIz.Activity activity, Continuation<? super Unit> continuation) {
        return ((LLMOverviewFragment$observePresenter$3) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C48208uIz c48208uIz;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C48208uIz.Activity activity = (C48208uIz.Activity) this.L$0;
            C48496uTo c48496uTo = this.this$0.AhwBna;
            if (c48496uTo != null && (c48208uIz = c48496uTo.AEQbTJ) != null) {
                c48208uIz.OLrzqt(activity);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
