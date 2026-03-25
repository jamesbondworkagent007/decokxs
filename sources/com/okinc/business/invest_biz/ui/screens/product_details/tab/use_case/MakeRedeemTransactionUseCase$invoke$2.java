package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C25476ixT;
import o.C26548jeR;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26561jee;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeRedeemTransactionUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC26561jee>, Object> {
    final /* synthetic */ C25476ixT $details;
    int label;
    final /* synthetic */ C26548jeR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeRedeemTransactionUseCase$invoke$2(C26548jeR c26548jeR, C25476ixT c25476ixT, Continuation<? super MakeRedeemTransactionUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26548jeR;
        this.$details = c25476ixT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MakeRedeemTransactionUseCase$invoke$2(this.this$0, this.$details, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC26561jee> continuation) {
        return ((MakeRedeemTransactionUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26548jeR c26548jeR = this.this$0;
            C25476ixT c25476ixT = this.$details;
            this.label = 1;
            obj = c26548jeR.OLrzqt(c25476ixT, this);
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
