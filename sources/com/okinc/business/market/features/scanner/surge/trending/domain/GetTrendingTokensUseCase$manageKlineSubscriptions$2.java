package com.okinc.business.market.features.scanner.surge.trending.domain;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C29250kqB;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$manageKlineSubscriptions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<String> $currentTokenKeys;
    final /* synthetic */ Set<String> $newTokenKeys;
    final /* synthetic */ List<C29250kqB> $newTokens;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$manageKlineSubscriptions$2(C29300kqz c29300kqz, List<C29250kqB> list, Set<String> set, Set<String> set2, Continuation<? super GetTrendingTokensUseCase$manageKlineSubscriptions$2> continuation) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$newTokens = list;
        this.$newTokenKeys = set;
        this.$currentTokenKeys = set2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrendingTokensUseCase$manageKlineSubscriptions$2(this.this$0, this.$newTokens, this.$newTokenKeys, this.$currentTokenKeys, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetTrendingTokensUseCase$manageKlineSubscriptions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.AEQbTJ((List<C29250kqB>) this.$newTokens, (Set<String>) this.$newTokenKeys, (Set<String>) this.$currentTokenKeys);
        return Unit.INSTANCE;
    }
}
