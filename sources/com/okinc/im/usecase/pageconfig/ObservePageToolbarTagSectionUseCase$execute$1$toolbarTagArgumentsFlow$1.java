package com.okinc.im.usecase.pageconfig;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC35352nth;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1 extends SuspendLambda implements Function2<AbstractC35352nth<?>, Continuation<? super Flow<? extends Bundle>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1(Continuation<? super ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1 observePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1 = new ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1(continuation);
        observePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1.L$0 = obj;
        return observePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC35352nth<?> abstractC35352nth, Continuation<? super Flow<? extends Bundle>> continuation) {
        return invoke2(abstractC35352nth, (Continuation<? super Flow<Bundle>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC35352nth<?> abstractC35352nth, Continuation<? super Flow<Bundle>> continuation) {
        return ((ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1) create(abstractC35352nth, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SharedFlow<Bundle> sharedFlowCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC35352nth abstractC35352nth = (AbstractC35352nth) this.L$0;
            return (abstractC35352nth == null || (sharedFlowCopydefault = abstractC35352nth.copydefault()) == null) ? FlowKt.flowOf((Object) null) : sharedFlowCopydefault;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
