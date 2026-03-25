package com.okinc.kline.ui;

import com.okinc.tradelite.bean.OrderBeanData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49506upo;
import o.ViewOnClickListenerC38659pdc;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineQuotesFullScreenFragment$showTradeBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderBeanData $order;
    int label;
    final /* synthetic */ ViewOnClickListenerC38659pdc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineQuotesFullScreenFragment$showTradeBottomSheet$1(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, OrderBeanData orderBeanData, Continuation<? super KLineQuotesFullScreenFragment$showTradeBottomSheet$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38659pdc;
        this.$order = orderBeanData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineQuotesFullScreenFragment$showTradeBottomSheet$1(this.this$0, this.$order, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineQuotesFullScreenFragment$showTradeBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC49506upo interfaceC49506upoFFgQHt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.isAdded() && !this.this$0.isDetached() && (interfaceC49506upoFFgQHt = this.this$0.fFgQHt()) != null) {
                interfaceC49506upoFFgQHt.KWHzl(this.$order);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
