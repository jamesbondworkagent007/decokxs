package com.okinc.tradingbot.impl.botDetail.ui.llmSignal;

import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LLMSignalDetailsFragment$observeEvents$1 extends SuspendLambda implements Function2<LLMSignalDetailsViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LLMSignalDetailsFragment$observeEvents$1(Continuation<? super LLMSignalDetailsFragment$observeEvents$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LLMSignalDetailsFragment$observeEvents$1 lLMSignalDetailsFragment$observeEvents$1 = new LLMSignalDetailsFragment$observeEvents$1(continuation);
        lLMSignalDetailsFragment$observeEvents$1.L$0 = obj;
        return lLMSignalDetailsFragment$observeEvents$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LLMSignalDetailsViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((LLMSignalDetailsFragment$observeEvents$1) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LLMSignalDetailsViewModel.ActionBar actionBar = (LLMSignalDetailsViewModel.ActionBar) this.L$0;
            if (!(actionBar instanceof LLMSignalDetailsViewModel.ActionBar.Activity) && !(actionBar instanceof LLMSignalDetailsViewModel.ActionBar.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
