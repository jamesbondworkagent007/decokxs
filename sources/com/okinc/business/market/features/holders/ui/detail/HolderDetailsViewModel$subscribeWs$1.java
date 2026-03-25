package com.okinc.business.market.features.holders.ui.detail;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26249jXl;
import o.C26277jYm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $filter;
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$subscribeWs$1(HolderDetailsViewModel holderDetailsViewModel, TokenFilter tokenFilter, Continuation<? super HolderDetailsViewModel$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = holderDetailsViewModel;
        this.$filter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$subscribeWs$1(this.this$0, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowSubscribeWs$default = C26249jXl.subscribeWs$default(this.this$0.values, this.$filter, false, null, 4, null);
            final HolderDetailsViewModel holderDetailsViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$subscribeWs$1.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(C26277jYm c26277jYm, Continuation<? super Unit> continuation) {
                    Object value;
                    if (c26277jYm != null) {
                        List list = (List) ((Pair) holderDetailsViewModel.AEQbTJ.getValue()).getSecond();
                        List listFJNWhG = list != null ? CollectionsKt___CollectionsKt.fJNWhG((Collection) list) : null;
                        if (listFJNWhG != null) {
                            listFJNWhG.add(0, c26277jYm);
                        }
                        MutableStateFlow mutableStateFlow = holderDetailsViewModel.AEQbTJ;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, Pair.copy$default((Pair) value, null, listFJNWhG, 1, null)));
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSubscribeWs$default.collect(flowCollector, this) == objCopydefault) {
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
