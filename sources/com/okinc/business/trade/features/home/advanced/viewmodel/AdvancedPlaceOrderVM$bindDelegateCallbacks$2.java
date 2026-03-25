package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQV;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$bindDelegateCallbacks$2 extends SuspendLambda implements Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$bindDelegateCallbacks$2(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$bindDelegateCallbacks$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderVM$bindDelegateCallbacks$2 advancedPlaceOrderVM$bindDelegateCallbacks$2 = new AdvancedPlaceOrderVM$bindDelegateCallbacks$2(this.this$0, continuation);
        advancedPlaceOrderVM$bindDelegateCallbacks$2.L$0 = obj;
        return advancedPlaceOrderVM$bindDelegateCallbacks$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvancedQuoteUiData advancedQuoteUiData, Continuation<? super InterfaceC30595leC> continuation) {
        return ((AdvancedPlaceOrderVM$bindDelegateCallbacks$2) create(advancedQuoteUiData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedQuoteUiData advancedQuoteUiData = (AdvancedQuoteUiData) this.L$0;
            kQV kqv = this.this$0.ORxRYg;
            this.label = 1;
            obj = kqv.KWHzl(advancedQuoteUiData, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
