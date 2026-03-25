package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C37246oqH;
import o.C37248oqJ;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1 extends SuspendLambda implements yHO<List<? extends C37248oqJ>, List<? extends C37246oqH>, Continuation<? super List<? extends Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1(Continuation<? super ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C37248oqJ> list, List<? extends C37246oqH> list2, Continuation<? super List<? extends Object>> continuation) {
        return invoke2((List<C37248oqJ>) list, (List<C37246oqH>) list2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C37248oqJ> list, List<C37246oqH> list2, Continuation<? super List<? extends Object>> continuation) {
        ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1 conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1 = new ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1(continuation);
        conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1.L$0 = list;
        conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1.L$1 = list2;
        return conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            if (list == null || list2 == null) {
                return null;
            }
            return CollectionsKt___CollectionsKt.djBIcL((Collection) list, (Iterable) list2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
