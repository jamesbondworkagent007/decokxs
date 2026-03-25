package com.okinc.business.market.market.fragment;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.kGD;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseOptionQuoteFragment$handleTradeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC54581xNr $trade;
    int label;
    final /* synthetic */ kGD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOptionQuoteFragment$handleTradeResult$1(InterfaceC54581xNr interfaceC54581xNr, kGD kgd, Continuation<? super BaseOptionQuoteFragment$handleTradeResult$1> continuation) {
        super(2, continuation);
        this.$trade = interfaceC54581xNr;
        this.this$0 = kgd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseOptionQuoteFragment$handleTradeResult$1(this.$trade, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseOptionQuoteFragment$handleTradeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNr = this.$trade;
            MutableLiveData mutableLiveData = this.this$0.gEmmrt;
            this.label = 1;
            if (C55608xnE.createOptionDataSource$default(interfaceC54581xNr, true, mutableLiveData, null, false, this, 12, null) == objCopydefault) {
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
