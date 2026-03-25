package com.okinc.business.market.features.scanner.surge.trending.domain;

import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C22416heu;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29249kqA;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$subscribeWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TrendingConfigData $config;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$subscribeWs$2(C29300kqz c29300kqz, String str, TrendingConfigData trendingConfigData, Continuation<? super GetTrendingTokensUseCase$subscribeWs$2> continuation) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$chainId = str;
        this.$config = trendingConfigData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrendingTokensUseCase$subscribeWs$2(this.this$0, this.$chainId, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetTrendingTokensUseCase$subscribeWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C22416heu.ejfBZ()) {
                return Unit.INSTANCE;
            }
            InterfaceC29249kqA interfaceC29249kqA = this.this$0.AYXKKw;
            String str = this.$chainId;
            this.label = 1;
            obj = interfaceC29249kqA.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C29300kqz c29300kqz = this.this$0;
        final TrendingConfigData trendingConfigData = this.$config;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeWs$2.3
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<TrendingTokenData> list, Continuation<? super Unit> continuation) {
                Object value;
                MutableStateFlow mutableStateFlow = c29300kqz.OLrzqt;
                C29300kqz c29300kqz2 = c29300kqz;
                TrendingConfigData trendingConfigData2 = trendingConfigData;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, c29300kqz2.EZpvd((List) value, list, trendingConfigData2)));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
