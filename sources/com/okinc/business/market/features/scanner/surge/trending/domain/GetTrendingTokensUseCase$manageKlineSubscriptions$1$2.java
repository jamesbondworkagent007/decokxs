package com.okinc.business.market.features.scanner.surge.trending.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$manageKlineSubscriptions$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tokenKey;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$manageKlineSubscriptions$1$2(C29300kqz c29300kqz, String str, Continuation<? super GetTrendingTokensUseCase$manageKlineSubscriptions$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$tokenKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrendingTokensUseCase$manageKlineSubscriptions$1$2(this.this$0, this.$tokenKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetTrendingTokensUseCase$manageKlineSubscriptions$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C29300kqz c29300kqz;
        Mutex mutex;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.this$0.KWHzl;
            c29300kqz = this.this$0;
            String str2 = this.$tokenKey;
            this.L$0 = mutex2;
            this.L$1 = c29300kqz;
            this.L$2 = str2;
            this.label = 1;
            if (mutex2.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            c29300kqz = (C29300kqz) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            c29300kqz.copydefault.remove(str);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
