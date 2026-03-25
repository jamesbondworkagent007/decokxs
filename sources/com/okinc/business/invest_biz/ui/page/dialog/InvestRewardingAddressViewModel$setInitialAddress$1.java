package com.okinc.business.invest_biz.ui.page.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRewardingAddressViewModel$setInitialAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    Object L$0;
    int label;
    final /* synthetic */ InvestRewardingAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRewardingAddressViewModel$setInitialAddress$1(InvestRewardingAddressViewModel investRewardingAddressViewModel, String str, Continuation<? super InvestRewardingAddressViewModel$setInitialAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = investRewardingAddressViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRewardingAddressViewModel$setInitialAddress$1(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRewardingAddressViewModel$setInitialAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestRewardingAddressViewModel investRewardingAddressViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestRewardingAddressViewModel investRewardingAddressViewModel2 = this.this$0;
            this.L$0 = investRewardingAddressViewModel2;
            this.label = 1;
            Object objCopydefault2 = investRewardingAddressViewModel2.copydefault((Continuation<? super String>) this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            investRewardingAddressViewModel = investRewardingAddressViewModel2;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investRewardingAddressViewModel = (InvestRewardingAddressViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        investRewardingAddressViewModel.KWHzl = (String) obj;
        InvestRewardingAddressViewModel investRewardingAddressViewModel3 = this.this$0;
        String str = this.$address;
        if (str == null) {
            str = investRewardingAddressViewModel3.KWHzl;
        }
        investRewardingAddressViewModel3.copydefault = str;
        InvestRewardingAddressViewModel investRewardingAddressViewModel4 = this.this$0;
        investRewardingAddressViewModel4.EZpvd(investRewardingAddressViewModel4.copydefault, true);
        return Unit.INSTANCE;
    }
}
