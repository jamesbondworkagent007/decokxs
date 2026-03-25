package com.okinc.im.imui.contacts.viewmodel;

import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35180nqU;
import o.InterfaceC44177sGd;
import o.nAD;

/* JADX INFO: loaded from: classes18.dex */
public final class SearchContactViewModel$runSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nAD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchContactViewModel$runSearch$1(String str, nAD nad, Continuation<? super SearchContactViewModel$runSearch$1> continuation) {
        super(2, continuation);
        this.$searchName = str;
        this.this$0 = nad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchContactViewModel$runSearch$1 searchContactViewModel$runSearch$1 = new SearchContactViewModel$runSearch$1(this.$searchName, this.this$0, continuation);
        searchContactViewModel$runSearch$1.L$0 = obj;
        return searchContactViewModel$runSearch$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchContactViewModel$runSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$searchName;
                Result.Application application = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    throw new IllegalArgumentException("OKIM Service not available".toString());
                }
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = interfaceC35180nqU.AEQbTJ().AEQbTJ();
                this.label = 1;
                obj = interfaceC44177sGdAEQbTJ.valueOf(str, this);
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
        nAD nad = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            nad.OLrzqt.postValue(new C32989mnw(C56443yFo.KWHzl(false)));
            nad.OLrzqt((List<RelationInfo>) objM7377constructorimpl);
        }
        nAD nad2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            nad2.OLrzqt.postValue(new C32989mnw(C56443yFo.KWHzl(false)));
            nad2.copydefault(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
