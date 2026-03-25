package com.okinc.business.trade.features.home.advanced.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQV;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$bindDelegateCallbacks$5 extends SuspendLambda implements Function2<Boolean, Continuation<? super InterfaceC30595leC>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$bindDelegateCallbacks$5(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$bindDelegateCallbacks$5> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderVM$bindDelegateCallbacks$5 advancedPlaceOrderVM$bindDelegateCallbacks$5 = new AdvancedPlaceOrderVM$bindDelegateCallbacks$5(this.this$0, continuation);
        advancedPlaceOrderVM$bindDelegateCallbacks$5.Z$0 = ((Boolean) obj).booleanValue();
        return advancedPlaceOrderVM$bindDelegateCallbacks$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super InterfaceC30595leC> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super InterfaceC30595leC> continuation) {
        return ((AdvancedPlaceOrderVM$bindDelegateCallbacks$5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            kQV kqv = this.this$0.ORxRYg;
            this.label = 1;
            obj = kqv.AEQbTJ(z, this);
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
