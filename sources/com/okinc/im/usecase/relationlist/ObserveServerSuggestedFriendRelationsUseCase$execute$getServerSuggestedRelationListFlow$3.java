package com.okinc.im.usecase.relationlist;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C37248oqJ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sGG;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3 extends SuspendLambda implements Function2<List<? extends C37248oqJ>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3(Continuation<? super ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3 observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3 = new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3(continuation);
        observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3.L$0 = obj;
        return observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C37248oqJ> list, Continuation<? super Unit> continuation) {
        return invoke2((List<C37248oqJ>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C37248oqJ> list, Continuation<? super Unit> continuation) {
        return ((ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            sGG.copydefault.copydefault(C56443yFo.AEQbTJ(((List) this.L$0).size()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
