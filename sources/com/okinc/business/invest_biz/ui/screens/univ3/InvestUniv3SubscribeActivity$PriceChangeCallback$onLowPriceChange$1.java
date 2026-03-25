package com.okinc.business.invest_biz.ui.screens.univ3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C27315jsq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C27315jsq $result;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C27315jsq c27315jsq, Continuation<? super InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$result = c27315jsq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx = this.this$0.isConnected().sSMYrx();
            C27315jsq c27315jsq = this.$result;
            this.label = 1;
            if (mutableSharedFlowSSMYrx.emit(c27315jsq, this) == objCopydefault) {
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
