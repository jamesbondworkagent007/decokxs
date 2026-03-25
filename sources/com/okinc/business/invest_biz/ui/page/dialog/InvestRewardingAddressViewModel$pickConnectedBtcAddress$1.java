package com.okinc.business.invest_biz.ui.page.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRewardingAddressViewModel$pickConnectedBtcAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestRewardingAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRewardingAddressViewModel$pickConnectedBtcAddress$1(InvestRewardingAddressViewModel investRewardingAddressViewModel, Continuation<? super InvestRewardingAddressViewModel$pickConnectedBtcAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = investRewardingAddressViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRewardingAddressViewModel$pickConnectedBtcAddress$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRewardingAddressViewModel$pickConnectedBtcAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestRewardingAddressViewModel investRewardingAddressViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            investRewardingAddressViewModel = this.this$0;
            this.L$0 = investRewardingAddressViewModel;
            this.label = 1;
            obj = investRewardingAddressViewModel.copydefault((Continuation<? super String>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            investRewardingAddressViewModel = (InvestRewardingAddressViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        investRewardingAddressViewModel.KWHzl = (String) obj;
        String str = this.this$0.KWHzl;
        if (str == null || str.length() == 0) {
            MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        InvestRewardingAddressViewModel investRewardingAddressViewModel2 = this.this$0;
        investRewardingAddressViewModel2.EZpvd(investRewardingAddressViewModel2.KWHzl, true);
        return Unit.INSTANCE;
    }
}
