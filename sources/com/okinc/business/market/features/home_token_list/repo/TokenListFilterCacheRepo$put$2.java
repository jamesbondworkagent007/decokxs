package com.okinc.business.market.features.home_token_list.repo;

import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28548kcp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListFilterCacheRepo$put$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedFilter $filter;
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ C28548kcp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListFilterCacheRepo$put$2(C28548kcp c28548kcp, String str, AdvancedFilter advancedFilter, Continuation<? super TokenListFilterCacheRepo$put$2> continuation) {
        super(2, continuation);
        this.this$0 = c28548kcp;
        this.$key = str;
        this.$filter = advancedFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListFilterCacheRepo$put$2(this.this$0, this.$key, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListFilterCacheRepo$put$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.put(this.$key, this.$filter);
            int value = this.$filter.fetchVPNInfo().getValue();
            SPUtils.put("dex_market_home_filter" + this.$key, this.$filter, "dex_market");
            if (!this.$filter.zuBGHE()) {
                SPUtils.put("dex_market_home_time_interval", C56443yFo.AEQbTJ(value), "dex_market");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
