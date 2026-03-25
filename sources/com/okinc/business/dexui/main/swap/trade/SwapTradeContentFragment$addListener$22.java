package com.okinc.business.dexui.main.swap.trade;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22380heK;
import o.C22947hov;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23194htd;
import o.xWY;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapTradeContentFragment$addListener$22 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SwapTradeContentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapTradeContentFragment$addListener$22(SwapTradeContentFragment swapTradeContentFragment, Continuation<? super SwapTradeContentFragment$addListener$22> continuation) {
        super(2, continuation);
        this.this$0 = swapTradeContentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwapTradeContentFragment$addListener$22(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwapTradeContentFragment$addListener$22) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(this.this$0.AEQbTJ()).fARcdN();
            final SwapTradeContentFragment swapTradeContentFragment = this.this$0;
            FlowCollector<? super xWY> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeContentFragment$addListener$22.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(xWY xwy, Continuation<? super Unit> continuation) {
                    if (xwy != null) {
                        SwapTradeContentFragment swapTradeContentFragment2 = swapTradeContentFragment;
                        C22947hov c22947hovAEQbTJ = swapTradeContentFragment2.isConnected().finit().AEQbTJ();
                        if (c22947hovAEQbTJ != null && Intrinsics.EZpvd((Object) c22947hovAEQbTJ.AEQbTJ(), (Object) String.valueOf(xwy.OLrzqt())) && xwy.copydefault().indexOf(c22947hovAEQbTJ.copydefault()) != -1) {
                            swapTradeContentFragment2.isConnected().finit().AEQbTJ(new C22947hov(xwy.KWHzl(), c22947hovAEQbTJ.AEQbTJ(), c22947hovAEQbTJ.OLrzqt(), c22947hovAEQbTJ.EZpvd(), null, false, 48, null));
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interfaceC23194htdFARcdN.KWHzl(flowCollector, this) == objCopydefault) {
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
