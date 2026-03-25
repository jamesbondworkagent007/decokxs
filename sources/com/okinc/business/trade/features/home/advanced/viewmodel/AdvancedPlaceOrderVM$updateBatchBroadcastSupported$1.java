package com.okinc.business.trade.features.home.advanced.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC30595leC;
import o.kQV;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $supported;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, boolean z, Continuation<? super AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$supported = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1(this.this$0, this.$supported, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AdvancedPlaceOrderVM advancedPlaceOrderVM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.djBIcL.setValue(C56443yFo.KWHzl(this.$supported));
            AdvancedPlaceOrderVM advancedPlaceOrderVM2 = this.this$0;
            kQV kqv = advancedPlaceOrderVM2.ORxRYg;
            boolean z = this.$supported;
            this.L$0 = advancedPlaceOrderVM2;
            this.label = 1;
            Object objKWHzl = kqv.KWHzl(z, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            advancedPlaceOrderVM = advancedPlaceOrderVM2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            advancedPlaceOrderVM = (AdvancedPlaceOrderVM) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        advancedPlaceOrderVM.EZpvd((InterfaceC30595leC) obj);
        return Unit.INSTANCE;
    }
}
