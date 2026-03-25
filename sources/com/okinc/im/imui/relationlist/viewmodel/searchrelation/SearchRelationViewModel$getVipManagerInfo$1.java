package com.okinc.im.imui.relationlist.viewmodel.searchrelation;

import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35865oGo;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchRelationViewModel$getVipManagerInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRelationViewModel$getVipManagerInfo$1(SearchRelationViewModel searchRelationViewModel, Continuation<? super SearchRelationViewModel$getVipManagerInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = searchRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchRelationViewModel$getVipManagerInfo$1 searchRelationViewModel$getVipManagerInfo$1 = new SearchRelationViewModel$getVipManagerInfo$1(this.this$0, continuation);
        searchRelationViewModel$getVipManagerInfo$1.L$0 = obj;
        return searchRelationViewModel$getVipManagerInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchRelationViewModel$getVipManagerInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C35865oGo c35865oGo = searchRelationViewModel.valueOf;
                this.label = 1;
                obj = c35865oGo.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((VipManagerRelationInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SearchRelationViewModel searchRelationViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            searchRelationViewModel2.fetchVPNInfo.setValue((VipManagerRelationInfo) objM7377constructorimpl);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SearchRelationViewModel", "get vip manager info error:" + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
