package com.okinc.tradingbot.impl.aiBot.ui.preview;

import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.uFV;

/* JADX INFO: loaded from: classes16.dex */
public final class PreviewAiStrategyResultActivity$observeViewModel$1 extends SuspendLambda implements Function2<PreviewAiStrategyViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAiStrategyResultActivity$observeViewModel$1(uFV ufv, Continuation<? super PreviewAiStrategyResultActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = ufv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PreviewAiStrategyResultActivity$observeViewModel$1 previewAiStrategyResultActivity$observeViewModel$1 = new PreviewAiStrategyResultActivity$observeViewModel$1(this.this$0, continuation);
        previewAiStrategyResultActivity$observeViewModel$1.L$0 = obj;
        return previewAiStrategyResultActivity$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PreviewAiStrategyViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((PreviewAiStrategyResultActivity$observeViewModel$1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PreviewAiStrategyViewModel.StateListAnimator stateListAnimator = (PreviewAiStrategyViewModel.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof PreviewAiStrategyViewModel.StateListAnimator.TaskDescription) {
                this.this$0.djBIcL();
            } else if (stateListAnimator instanceof PreviewAiStrategyViewModel.StateListAnimator.Application) {
                this.this$0.valueOf = ((PreviewAiStrategyViewModel.StateListAnimator.Application) stateListAnimator).EZpvd();
                this.this$0.gEmmrt();
            } else if (stateListAnimator instanceof PreviewAiStrategyViewModel.StateListAnimator.ActionBar) {
                this.this$0.copydefault(((PreviewAiStrategyViewModel.StateListAnimator.ActionBar) stateListAnimator).KWHzl());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
