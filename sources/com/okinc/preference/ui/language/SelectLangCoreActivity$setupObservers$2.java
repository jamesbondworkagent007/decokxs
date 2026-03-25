package com.okinc.preference.ui.language;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4712Bof;
import o.ActivityC46568tZd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tZH;

/* JADX INFO: loaded from: classes11.dex */
public final class SelectLangCoreActivity$setupObservers$2 extends SuspendLambda implements Function2<AbstractC4712Bof, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46568tZd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectLangCoreActivity$setupObservers$2(ActivityC46568tZd activityC46568tZd, Continuation<? super SelectLangCoreActivity$setupObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC46568tZd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectLangCoreActivity$setupObservers$2 selectLangCoreActivity$setupObservers$2 = new SelectLangCoreActivity$setupObservers$2(this.this$0, continuation);
        selectLangCoreActivity$setupObservers$2.L$0 = obj;
        return selectLangCoreActivity$setupObservers$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC4712Bof abstractC4712Bof, Continuation<? super Unit> continuation) {
        return ((SelectLangCoreActivity$setupObservers$2) create(abstractC4712Bof, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC4712Bof abstractC4712Bof = (AbstractC4712Bof) this.L$0;
            pUU.KWHzl(this.this$0.getClass().getSimpleName(), "onEvent: " + abstractC4712Bof);
            if (Intrinsics.EZpvd(abstractC4712Bof, AbstractC4712Bof.Application.INSTANCE)) {
                this.this$0.dismissLoading();
            } else if (abstractC4712Bof instanceof AbstractC4712Bof.StateListAnimator) {
                this.this$0.getString(tZH.EZpvd(((AbstractC4712Bof.StateListAnimator) abstractC4712Bof).copydefault()));
            } else {
                if (!Intrinsics.EZpvd(abstractC4712Bof, AbstractC4712Bof.TaskDescription.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.showLoadingAtOnceCannotCancel();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
