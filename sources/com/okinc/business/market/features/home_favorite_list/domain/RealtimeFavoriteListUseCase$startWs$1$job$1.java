package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28414kaN;
import o.C28420kaT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class RealtimeFavoriteListUseCase$startWs$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C28420kaT> $wsRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C28414kaN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeFavoriteListUseCase$startWs$1$job$1(C28414kaN c28414kaN, List<C28420kaT> list, Continuation<? super RealtimeFavoriteListUseCase$startWs$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c28414kaN;
        this.$wsRequest = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RealtimeFavoriteListUseCase$startWs$1$job$1 realtimeFavoriteListUseCase$startWs$1$job$1 = new RealtimeFavoriteListUseCase$startWs$1$job$1(this.this$0, this.$wsRequest, continuation);
        realtimeFavoriteListUseCase$startWs$1$job$1.L$0 = obj;
        return realtimeFavoriteListUseCase$startWs$1$job$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealtimeFavoriteListUseCase$startWs$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow<List<HomeFavoriteTokenData>> flowAEQbTJ = this.this$0.djBIcL.AEQbTJ(this.$wsRequest);
            final C28414kaN c28414kaN = this.this$0;
            FlowCollector<? super List<HomeFavoriteTokenData>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.home_favorite_list.domain.RealtimeFavoriteListUseCase$startWs$1$job$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<HomeFavoriteTokenData> list, Continuation<? super Unit> continuation) throws Throwable {
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    Object objEZpvd = c28414kaN.EZpvd(list, continuation);
                    return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
