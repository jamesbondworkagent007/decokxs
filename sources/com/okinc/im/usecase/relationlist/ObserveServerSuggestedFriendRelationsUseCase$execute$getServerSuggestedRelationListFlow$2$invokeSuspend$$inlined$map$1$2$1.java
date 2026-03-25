package com.okinc.im.usecase.relationlist;

import com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes18.dex */
public final class ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2.StateListAnimator.AnonymousClass1 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1(ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2.StateListAnimator.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
