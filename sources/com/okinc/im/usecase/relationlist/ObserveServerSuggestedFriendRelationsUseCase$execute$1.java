package com.okinc.im.usecase.relationlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C37248oqJ;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveServerSuggestedFriendRelationsUseCase$execute$1 extends SuspendLambda implements yHO<List<? extends C37248oqJ>, Set<? extends String>, Continuation<? super List<? extends C37248oqJ>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObserveServerSuggestedFriendRelationsUseCase$execute$1(Continuation<? super ObserveServerSuggestedFriendRelationsUseCase$execute$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C37248oqJ> list, Set<? extends String> set, Continuation<? super List<? extends C37248oqJ>> continuation) {
        return invoke2((List<C37248oqJ>) list, (Set<String>) set, (Continuation<? super List<C37248oqJ>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C37248oqJ> list, Set<String> set, Continuation<? super List<C37248oqJ>> continuation) {
        ObserveServerSuggestedFriendRelationsUseCase$execute$1 observeServerSuggestedFriendRelationsUseCase$execute$1 = new ObserveServerSuggestedFriendRelationsUseCase$execute$1(continuation);
        observeServerSuggestedFriendRelationsUseCase$execute$1.L$0 = list;
        observeServerSuggestedFriendRelationsUseCase$execute$1.L$1 = set;
        return observeServerSuggestedFriendRelationsUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            Set set = (Set) this.L$1;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!set.contains(((C37248oqJ) obj2).OLrzqt().getContactsId())) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
