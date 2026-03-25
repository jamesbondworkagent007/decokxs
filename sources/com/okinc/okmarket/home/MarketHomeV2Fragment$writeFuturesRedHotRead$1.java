package com.okinc.okmarket.home;

import com.okinc.core.util.SPUtils;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yEE;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$writeFuturesRedHotRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeV2Fragment$writeFuturesRedHotRead$1(Continuation<? super MarketHomeV2Fragment$writeFuturesRedHotRead$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$writeFuturesRedHotRead$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$writeFuturesRedHotRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Set<String> stringSet = SPUtils.getStringSet("SP_KEY_TOTAL_NEW_FUTURES_COIN_STR", new LinkedHashSet());
            Set<String> stringSet2 = SPUtils.getStringSet("SP_KEY_CURRENT_NEW_FUTURES_COIN_STR", new LinkedHashSet());
            Intrinsics.copydefault(stringSet2);
            stringSet.addAll(stringSet2);
            SPUtils.putStringSet("SP_KEY_CURRENT_NEW_FUTURES_COIN_STR", yEE.copydefault(), null);
            SPUtils.putStringSet("SP_KEY_TOTAL_NEW_FUTURES_COIN_STR", stringSet, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
