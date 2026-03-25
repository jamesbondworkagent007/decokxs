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
public final class InvestUniv3SubscribeViewModel$onPageChanged$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$onPageChanged$4(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, Continuation<? super InvestUniv3SubscribeViewModel$onPageChanged$4> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$onPageChanged$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeViewModel$onPageChanged$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ResponseState responseStateValues = investUniv3SubscribeViewModel.values();
            Intrinsics.copydefault(responseStateValues);
            Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pairDbNXlk = investUniv3SubscribeViewModel.DbNXlk();
            Intrinsics.copydefault(pairDbNXlk);
            investUniv3SubscribeViewModel.OLrzqt(responseStateValues, (Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) pairDbNXlk, (Continuation<? super Unit>) cancellableContinuationImpl);
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
