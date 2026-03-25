package com.okinc.im.imui.relationlist.viewmodel.searchrelation;

import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35856oGf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchRelationViewModel$fetchReferralData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $phoneNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRelationViewModel$fetchReferralData$1(SearchRelationViewModel searchRelationViewModel, String str, String str2, Continuation<? super SearchRelationViewModel$fetchReferralData$1> continuation) {
        super(2, continuation);
        this.this$0 = searchRelationViewModel;
        this.$displayName = str;
        this.$phoneNumber = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchRelationViewModel$fetchReferralData$1 searchRelationViewModel$fetchReferralData$1 = new SearchRelationViewModel$fetchReferralData$1(this.this$0, this.$displayName, this.$phoneNumber, continuation);
        searchRelationViewModel$fetchReferralData$1.L$0 = obj;
        return searchRelationViewModel$fetchReferralData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchRelationViewModel$fetchReferralData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(true));
                SearchRelationViewModel searchRelationViewModel = this.this$0;
                String str = this.$displayName;
                String str2 = this.$phoneNumber;
                Result.Application application = Result.Companion;
                C35856oGf c35856oGf = searchRelationViewModel.djBIcL;
                this.label = 1;
                obj = c35856oGf.KWHzl(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ReferralData) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SearchRelationViewModel searchRelationViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            searchRelationViewModel2.KWHzl.setValue(new C32989mnw(new SearchRelationViewModel.Activity.TaskDescription((ReferralData) objM7377constructorimpl)));
        }
        SearchRelationViewModel searchRelationViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SearchRelationViewModel", "fetchReferralData failed: " + thM7380exceptionOrNullimpl);
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                searchRelationViewModel3.KWHzl.setValue(new C32989mnw(new SearchRelationViewModel.Activity.C0476Activity(message)));
            }
        }
        this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
