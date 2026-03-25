package com.okinc.kline.ui;

import androidx.lifecycle.FlowLiveDataConversions;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C38516pas;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinMoreTradeFragmentV2$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38516pas this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMoreTradeFragmentV2$onCreate$1(C38516pas c38516pas, Continuation<? super CoinMoreTradeFragmentV2$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = c38516pas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoinMoreTradeFragmentV2$onCreate$1 coinMoreTradeFragmentV2$onCreate$1 = new CoinMoreTradeFragmentV2$onCreate$1(this.this$0, continuation);
        coinMoreTradeFragmentV2$onCreate$1.L$0 = obj;
        return coinMoreTradeFragmentV2$onCreate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMoreTradeFragmentV2$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowConflate = FlowKt.conflate(FlowLiveDataConversions.asFlow(this.this$0.gEmmrt().ejfBZ()));
            final C38516pas c38516pas = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<String, String> pair, Continuation<? super Unit> continuation) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoinMoreTradeFragmentV2$onCreate$1$1$1(c38516pas, pair, null), 3, null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowConflate.collect(flowCollector, this) == objCopydefault) {
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
