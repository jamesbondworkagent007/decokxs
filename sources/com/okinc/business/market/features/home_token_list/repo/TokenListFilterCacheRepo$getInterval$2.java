package com.okinc.business.market.features.home_token_list.repo;

import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListFilterCacheRepo$getInterval$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TimeIntervalType>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenListFilterCacheRepo$getInterval$2(Continuation<? super TokenListFilterCacheRepo$getInterval$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListFilterCacheRepo$getInterval$2(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TimeIntervalType> continuation) {
        return ((TokenListFilterCacheRepo$getInterval$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TimeIntervalType.Companion companion = TimeIntervalType.Companion;
            Integer num = SPUtils.getInt("dex_market_home_time_interval", TimeIntervalType.ONE_HOUR.getValue(), "dex_market");
            Intrinsics.checkNotNullExpressionValue(num, "");
            TimeIntervalType timeIntervalTypeFromValue$default = TimeIntervalType.Companion.fromValue$default(companion, num.intValue(), null, 2, null);
            if (!SPUtils.contains("dex_market_home_time_interval", "dex_market")) {
                return null;
            }
            return timeIntervalTypeFromValue$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
