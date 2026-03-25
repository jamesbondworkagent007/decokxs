package com.okinc.business.dex.trade.core.data.repo;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
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
public final class TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<V6QuoteAndCalldataResponseData>>, Object> {
    final /* synthetic */ Map $header$inlined;
    final /* synthetic */ V6QuoteAndCalldataRequest $req$inlined;
    int label;
    final /* synthetic */ gYN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1(Continuation continuation, gYN gyn, Map map, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest) {
        super(2, continuation);
        this.this$0 = gyn;
        this.$header$inlined = map;
        this.$req$inlined = v6QuoteAndCalldataRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1(continuation, this.this$0, this.$header$inlined, this.$req$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<V6QuoteAndCalldataResponseData>> continuation) {
        return ((TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gYL gyl = this.this$0.KWHzl;
            Map<String, String> map = this.$header$inlined;
            V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.$req$inlined;
            this.label = 1;
            obj = gyl.copydefault(map, v6QuoteAndCalldataRequest, this);
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
