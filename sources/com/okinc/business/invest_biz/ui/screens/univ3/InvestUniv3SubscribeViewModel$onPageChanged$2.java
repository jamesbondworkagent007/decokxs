package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$onPageChanged$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$onPageChanged$2(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, Continuation<? super InvestUniv3SubscribeViewModel$onPageChanged$2> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$onPageChanged$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeViewModel$onPageChanged$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.this$0;
            this.L$0 = investUniv3SubscribeViewModel;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            ResponseState responseStateAuCTel = investUniv3SubscribeViewModel.AuCTel();
            Intrinsics.copydefault(responseStateAuCTel);
            Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pairFetchVPNInfo = investUniv3SubscribeViewModel.fetchVPNInfo();
            Intrinsics.copydefault(pairFetchVPNInfo);
            investUniv3SubscribeViewModel.OLrzqt(responseStateAuCTel, (Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) pairFetchVPNInfo, (Continuation<? super Unit>) cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (result == objCopydefault) {
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
