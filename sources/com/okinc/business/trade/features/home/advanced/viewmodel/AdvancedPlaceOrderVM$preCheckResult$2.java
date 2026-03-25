package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.PreCheckBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$preCheckResult$2 extends SuspendLambda implements Function2<PreCheckBean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$preCheckResult$2(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$preCheckResult$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderVM$preCheckResult$2 advancedPlaceOrderVM$preCheckResult$2 = new AdvancedPlaceOrderVM$preCheckResult$2(this.this$0, continuation);
        advancedPlaceOrderVM$preCheckResult$2.L$0 = obj;
        return advancedPlaceOrderVM$preCheckResult$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PreCheckBean preCheckBean, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$preCheckResult$2) create(preCheckBean, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PreCheckBean preCheckBean = (PreCheckBean) this.L$0;
            if (preCheckBean != null && !preCheckBean.isSupportQuote()) {
                AdvancedPlaceOrderVM.stopCheckingQuote$default(this.this$0, false, false, 3, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
