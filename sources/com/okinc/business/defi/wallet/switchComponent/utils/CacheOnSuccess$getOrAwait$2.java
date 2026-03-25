package com.okinc.business.defi.wallet.switchComponent.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import o.C17776fRw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
public final class CacheOnSuccess$getOrAwait$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C17776fRw<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheOnSuccess$getOrAwait$2(C17776fRw<T> c17776fRw, Continuation<? super CacheOnSuccess$getOrAwait$2> continuation) {
        super(2, continuation);
        this.this$0 = c17776fRw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CacheOnSuccess$getOrAwait$2 cacheOnSuccess$getOrAwait$2 = new CacheOnSuccess$getOrAwait$2(this.this$0, continuation);
        cacheOnSuccess$getOrAwait$2.L$0 = obj;
        return cacheOnSuccess$getOrAwait$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CacheOnSuccess$getOrAwait$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        C17776fRw<T> c17776fRw;
        Mutex mutex;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Mutex mutex2 = this.this$0.EZpvd;
                c17776fRw = this.this$0;
                this.L$0 = coroutineScope;
                this.L$1 = mutex2;
                this.L$2 = c17776fRw;
                this.label = 1;
                if (mutex2.lock(null, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutex = mutex2;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17776fRw = (C17776fRw) this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Deferred deferredAsync$default = c17776fRw.AEQbTJ;
            if (deferredAsync$default == null) {
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CacheOnSuccess$getOrAwait$2$currentDeferred$1$2(c17776fRw, null), 3, null);
                c17776fRw.AEQbTJ = deferredAsync$default;
            }
            mutex.unlock(null);
            C17776fRw<T> c17776fRw2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = c17776fRw2.copydefault(deferredAsync$default, this);
            return obj == objCopydefault ? objCopydefault : obj;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
