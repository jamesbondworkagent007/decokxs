package com.okinc.buysell.ui.cedefiwallet;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30039lJq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellDexEnableViewModel$trigger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC30039lJq $action;
    int label;
    final /* synthetic */ BuySellDexEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellDexEnableViewModel$trigger$1(AbstractC30039lJq abstractC30039lJq, BuySellDexEnableViewModel buySellDexEnableViewModel, Continuation<? super BuySellDexEnableViewModel$trigger$1> continuation) {
        super(2, continuation);
        this.$action = abstractC30039lJq;
        this.this$0 = buySellDexEnableViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellDexEnableViewModel$trigger$1(this.$action, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellDexEnableViewModel$trigger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                AbstractC30039lJq abstractC30039lJq = this.$action;
                if (abstractC30039lJq instanceof AbstractC30039lJq.Activity) {
                    this.this$0.OLrzqt(((AbstractC30039lJq.Activity) abstractC30039lJq).EZpvd());
                } else if (abstractC30039lJq instanceof AbstractC30039lJq.ActionBar) {
                    this.this$0.AEQbTJ();
                } else if (abstractC30039lJq instanceof AbstractC30039lJq.Application) {
                    this.this$0.OLrzqt();
                } else if (abstractC30039lJq instanceof AbstractC30039lJq.StateListAnimator) {
                    this.this$0.EZpvd(((AbstractC30039lJq.StateListAnimator) abstractC30039lJq).EZpvd());
                } else if (abstractC30039lJq instanceof AbstractC30039lJq.TaskDescription) {
                    this.this$0.KWHzl((AbstractC30039lJq.TaskDescription) abstractC30039lJq);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Exception e) {
                pUU.AEQbTJ("BuySellDexEnableViewModel", "trigger() - error handling action: " + this.$action.getClass().getSimpleName(), e);
                this.this$0.copydefault(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
