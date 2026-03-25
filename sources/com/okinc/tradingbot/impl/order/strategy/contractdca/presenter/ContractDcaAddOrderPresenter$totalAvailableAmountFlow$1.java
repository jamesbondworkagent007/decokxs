package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.uLP;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1 extends SuspendLambda implements yHO<uLP, uLP, Continuation<? super uLP>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ContractDcaAddOrderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1(ContractDcaAddOrderPresenter contractDcaAddOrderPresenter, Continuation<? super ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = contractDcaAddOrderPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(uLP ulp, uLP ulp2, Continuation<? super uLP> continuation) {
        uLP ulp3 = ulp;
        uLP ulp4 = ulp2;
        return m7091invoke6izwzig(ulp3 != null ? ulp3.OLrzqt() : null, ulp4 != null ? ulp4.OLrzqt() : null, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-6izwzig, reason: not valid java name */
    public final Object m7091invoke6izwzig(Pair<? extends String, ? extends String> pair, Pair<? extends String, ? extends String> pair2, Continuation<? super uLP> continuation) {
        ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1 contractDcaAddOrderPresenter$totalAvailableAmountFlow$1 = new ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1(this.this$0, continuation);
        contractDcaAddOrderPresenter$totalAvailableAmountFlow$1.L$0 = pair != null ? uLP.copydefault(pair) : null;
        contractDcaAddOrderPresenter$totalAvailableAmountFlow$1.L$1 = pair2 != null ? uLP.copydefault(pair2) : null;
        return contractDcaAddOrderPresenter$totalAvailableAmountFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            uLP ulp = (uLP) this.L$0;
            Pair pairOLrzqt = ulp != null ? ulp.OLrzqt() : null;
            uLP ulp2 = (uLP) this.L$1;
            String strGEmmrt = C33129mqd.gEmmrt(C33129mqd.EZpvd(uLP.KWHzl(pairOLrzqt)).add(C33129mqd.EZpvd(uLP.KWHzl(ulp2 != null ? ulp2.OLrzqt() : null))));
            return uLP.copydefault(uLP.EZpvd(this.this$0.OLrzqt(strGEmmrt), strGEmmrt));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
