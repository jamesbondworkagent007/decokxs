package com.okinc.business.invest_biz.mln.vm;

import com.okinc.business.invest_biz.data.contants.PaymentOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26550jeT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniProductDetailTabViewModel$setPreferredPaymentOption$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isInvesting;
    final /* synthetic */ PaymentOption $preferredOption;
    int label;
    final /* synthetic */ DeFiMiniProductDetailTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniProductDetailTabViewModel$setPreferredPaymentOption$1(DeFiMiniProductDetailTabViewModel deFiMiniProductDetailTabViewModel, boolean z, PaymentOption paymentOption, Continuation<? super DeFiMiniProductDetailTabViewModel$setPreferredPaymentOption$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiMiniProductDetailTabViewModel;
        this.$isInvesting = z;
        this.$preferredOption = paymentOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiMiniProductDetailTabViewModel$setPreferredPaymentOption$1(this.this$0, this.$isInvesting, this.$preferredOption, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiMiniProductDetailTabViewModel$setPreferredPaymentOption$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26550jeT c26550jeT = this.this$0.gEmmrt;
            boolean z = this.$isInvesting;
            PaymentOption paymentOption = this.$preferredOption;
            this.label = 1;
            if (c26550jeT.OLrzqt(z, paymentOption, this) == objCopydefault) {
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
