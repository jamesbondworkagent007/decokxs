package com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
public final class CacheApiLoader$getCacheThenNetworkFlow$1<T> extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheApiLoader$getCacheThenNetworkFlow$1(Continuation<? super CacheApiLoader$getCacheThenNetworkFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CacheApiLoader$getCacheThenNetworkFlow$1 cacheApiLoader$getCacheThenNetworkFlow$1 = new CacheApiLoader$getCacheThenNetworkFlow$1(continuation);
        cacheApiLoader$getCacheThenNetworkFlow$1.L$0 = obj;
        return cacheApiLoader$getCacheThenNetworkFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t, Continuation<? super T> continuation) {
        return ((CacheApiLoader$getCacheThenNetworkFlow$1) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return this.L$0;
    }
}
