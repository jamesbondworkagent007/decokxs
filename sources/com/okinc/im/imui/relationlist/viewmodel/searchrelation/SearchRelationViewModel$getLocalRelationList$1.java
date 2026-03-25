package com.okinc.im.imui.relationlist.viewmodel.searchrelation;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35866oGp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchRelationViewModel$getLocalRelationList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRelationViewModel$getLocalRelationList$1(SearchRelationViewModel searchRelationViewModel, Continuation<? super SearchRelationViewModel$getLocalRelationList$1> continuation) {
        super(2, continuation);
        this.this$0 = searchRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchRelationViewModel$getLocalRelationList$1 searchRelationViewModel$getLocalRelationList$1 = new SearchRelationViewModel$getLocalRelationList$1(this.this$0, continuation);
        searchRelationViewModel$getLocalRelationList$1.L$0 = obj;
        return searchRelationViewModel$getLocalRelationList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchRelationViewModel$getLocalRelationList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SearchRelationViewModel searchRelationViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C35866oGp c35866oGp = searchRelationViewModel.gEmmrt;
                this.label = 1;
                obj = c35866oGp.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = yDY.AhwBna();
        }
        List list = (List) objM7377constructorimpl;
        this.this$0.copydefault.setValue(list);
        pUU.KWHzl("SearchRelationViewModel", "Get phone contact result size: " + list.size());
        return Unit.INSTANCE;
    }
}
