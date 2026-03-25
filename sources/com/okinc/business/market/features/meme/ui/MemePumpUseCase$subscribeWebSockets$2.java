package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.data.model.PublicMetricsWsData;
import com.okinc.business.market.features.meme.data.model.PublicMetricsWsResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28699kfh;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$subscribeWebSockets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$subscribeWebSockets$2(MemePumpUseCase memePumpUseCase, String str, Continuation<? super MemePumpUseCase$subscribeWebSockets$2> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$subscribeWebSockets$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$subscribeWebSockets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28699kfh interfaceC28699kfh = this.this$0.values;
            String str = this.$chainId;
            this.label = 1;
            obj = interfaceC28699kfh.copydefault(str, this);
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
        final MemePumpUseCase memePumpUseCase = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.meme.ui.MemePumpUseCase$subscribeWebSockets$2.5
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final Object emit(PublicMetricsWsResponse publicMetricsWsResponse, Continuation<? super Unit> continuation) {
                List<PublicMetricsWsData> detailVOS = publicMetricsWsResponse.getDetailVOS();
                MemePumpUseCase memePumpUseCase2 = memePumpUseCase;
                for (PublicMetricsWsData publicMetricsWsData : detailVOS) {
                    Iterator<T> it = memePumpUseCase2.EZpvd(publicMetricsWsData.getRankTypes()).iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        synchronized (memePumpUseCase2.AxsJAY[iIntValue]) {
                            memePumpUseCase2.AxsJAY[iIntValue].add(publicMetricsWsData);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
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
