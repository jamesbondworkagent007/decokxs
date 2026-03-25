package com.okinc.okex.center.ui.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC45154skT;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1 extends SuspendLambda implements yHO<AbstractC45154skT, AbstractC45154skT, Continuation<? super AbstractC45154skT>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1(Continuation<? super SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(AbstractC45154skT abstractC45154skT, AbstractC45154skT abstractC45154skT2, Continuation<? super AbstractC45154skT> continuation) {
        SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1 supportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1 = new SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1(continuation);
        supportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1.L$0 = abstractC45154skT;
        supportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1.L$1 = abstractC45154skT2;
        return supportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC45154skT abstractC45154skT = (AbstractC45154skT) this.L$0;
            AbstractC45154skT abstractC45154skT2 = (AbstractC45154skT) this.L$1;
            return ((abstractC45154skT instanceof AbstractC45154skT.StateListAnimator) || (abstractC45154skT instanceof AbstractC45154skT.TaskDescription)) ? abstractC45154skT : ((abstractC45154skT2 instanceof AbstractC45154skT.StateListAnimator) || (abstractC45154skT2 instanceof AbstractC45154skT.TaskDescription) || abstractC45154skT.EZpvd() <= abstractC45154skT2.EZpvd()) ? abstractC45154skT2 : abstractC45154skT;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
