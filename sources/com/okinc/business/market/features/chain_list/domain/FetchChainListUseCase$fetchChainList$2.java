package com.okinc.business.market.features.chain_list.domain;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AAL;
import o.ADO;
import o.C25983jNp;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import uniffi.network.CacheStrategy;

/* JADX INFO: loaded from: classes6.dex */
public final class FetchChainListUseCase$fetchChainList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ C25983jNp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChainListUseCase$fetchChainList$2(C25983jNp c25983jNp, Continuation<? super FetchChainListUseCase$fetchChainList$2> continuation) {
        super(2, continuation);
        this.this$0 = c25983jNp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchChainListUseCase$fetchChainList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((FetchChainListUseCase$fetchChainList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ADO marketChainList = AAL.getMarketChainList(CacheStrategy.NO_CACHE);
            C33077mpe c33077mpe = new C33077mpe(new FetchChainListUseCase$fetchChainList$2$1$1(marketChainList), new FetchChainListUseCase$fetchChainList$2$1$2(marketChainList), new FetchChainListUseCase$fetchChainList$2$1$3(marketChainList), new FetchChainListUseCase$fetchChainList$2$1$4(marketChainList), this.this$0.AEQbTJ);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            Result.Application application = Result.Companion;
            pUU.KWHzl("FetchChainListUseCase", "fetchChainList core success");
            objAEQbTJ = Unit.INSTANCE;
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("FetchChainListUseCase", "fetchChainList core failed", thM7380exceptionOrNullimpl);
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
