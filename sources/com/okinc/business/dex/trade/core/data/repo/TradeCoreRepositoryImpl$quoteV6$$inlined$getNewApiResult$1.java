package com.okinc.business.dex.trade.core.data.repo;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gYL;
import o.gYN;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<V6QuoteResponseData>>, Object> {
    final /* synthetic */ V6QuoteRequest $req$inlined;
    int label;
    final /* synthetic */ gYN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1(Continuation continuation, gYN gyn, V6QuoteRequest v6QuoteRequest) {
        super(2, continuation);
        this.this$0 = gyn;
        this.$req$inlined = v6QuoteRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1(continuation, this.this$0, this.$req$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<V6QuoteResponseData>> continuation) {
        return ((TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gYL gyl = this.this$0.KWHzl;
            V6QuoteRequest v6QuoteRequest = this.$req$inlined;
            this.label = 1;
            obj = gyl.EZpvd(v6QuoteRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
